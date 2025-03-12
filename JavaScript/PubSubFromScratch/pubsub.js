// =================> class BAsed

// class PuSub {

//     static hashmap = new Map();

//     publish(publishMessage) {
//         // console.log(`${publishMessage} Notified from ${this.name} to: ${PuSub.hashmap.get(this.name)}`);
//         let obj = PuSub.hashmap.get(this.name)
//         Object.keys(obj).forEach(key => {
//             obj[key](publishMessage);
//         })
//     }

//     subscribe(subscribeTo, subscribeEvent) {
//         let obj = PuSub.hashmap.get(subscribeTo) || {};
//         obj[this.name] = subscribeEvent

//         PuSub.hashmap.set(subscribeTo, obj);
//     }
// }


// const order = new PuSub()
// const shopping = new PuSub()
// const notification = new PuSub()
// order.name = "Order"
// shopping.name = "shopping"
// notification.name = "Notification"
// order.subscribe("Notification", (event) => {
//     console.log("Order subscribeEvent Called")
//     console.log(`Message Received ${event}`)

// })
// shopping.subscribe("Notification", (event) => {
//     console.log("Shopping subscribeEvent Called")

//     console.log(`Message Received ${event}`)
// })
// notification.publish("Hello Mcs")


// ===============> Function BAsed

let hashmap = new Map();

const publish = (publishFrom, publishMessage) => {
    let obj = hashmap.get(publishFrom);
    Object.keys(obj).forEach(key => {
        obj[key](publishMessage);
    })
}

const subscribe = (susbcribeTo, name, event) => {

    let obj = hashmap.get(susbcribeTo)

    if (obj != null) {

        obj[name] = obj[name] || {};
        obj[name] = event

        hashmap.set(susbcribeTo, obj)
    } else {

        hashmap.set(susbcribeTo, {
            [name]: event
        });
    }


}

const unsubscribe = (name, unsubscribeTo) => {
    let obj = hashmap.get(unsubscribeTo)
    delete obj[name];

    hashmap.set(unsubscribeTo, obj)
    console.log(hashmap)

}

subscribe("notification", "order", (event) => console.log(`Subscribe Event for Order ${event}`))
subscribe("notification", "shopping", (event) => console.log(`Subscribe Event for Shopping ${event}`))
subscribe("notification", "cart", (event) => console.log(`Subscribe Event for Cart ${event}`))
publish("notification", "Hello From Notification")

unsubscribe("order", "notification")

publish("notification", "Hello From Notification")



