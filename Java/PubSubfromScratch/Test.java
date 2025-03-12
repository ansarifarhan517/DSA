import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * pubsub
 */
public class Test {
    public static void main(String args[]) throws Exception {

        PubSub order = new PubSub("Order");
        PubSub shopping = new PubSub("Shopping");
        PubSub notification = new PubSub("Notification");
        order.setName("Order");
        order.Subscribe("Notification", Test.class.getMethod("subscribeEventForOrder"));
        shopping.setName("Shopping");
        shopping.Subscribe("Notification", Test.class.getMethod("subscribeEventForShopping"));
        notification.Publish("Hello Bcs");

    }

    public static void subscribeEventForOrder() {
        System.out.println("Subscribe Event Called for Order");
    }

    public static void subscribeEventForShopping() {
        System.out.println("Subscribe Event Called for Shopping");
    }
}

class PubSub {

    private static Map<String, Map<String, Method>> hashmap = new HashMap<>();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PubSub(String name) {
        this.name = name;
    }

    public void Publish(String publishMessage) throws Exception{
        Map<String, Method> obj = hashmap.get(this.name);



        if (obj != null) {
        
                 System.out.println(obj.entrySet() + "Farhan");
        
            for (Map.Entry<String, Method> entry : obj.entrySet()) {
                System.out.println(publishMessage + " Notified to " + entry.getKey());
                // entry.getValue().invoke(null);  // Assuming static methods
            }
        } else {
            System.out.println("No subscribers for event: " + this.name);
        }

    }

    public void Subscribe(String subscribeTo, Method subscribeEvent) {

        hashmap.putIfAbsent(subscribeTo, new HashMap<>());
        hashmap.get(subscribeTo).put(this.name, subscribeEvent);
        System.out.println(this.name + " subscribed to " + subscribeTo);

    }

}
