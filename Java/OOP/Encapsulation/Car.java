package OOP.Encapsulation;

import java.util.Date;

public class Car {
    private String color;
    private String model;
    private Date year;
    private Boolean is4into4;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Boolean getIs4into4() {
        return is4into4;
    }

    public void setIs4into4(Boolean is4into4) {
        this.is4into4 = is4into4;
    }

}
