package it.academy.course.hw10.task4;

public class Pet {
    String nickName;
    String type;
    double price;

    public Pet(String nickName, String type, double price) {
        this.nickName = nickName;
        this.type = type;
        this.price = price;
    }

    public String getNickName(){
        return nickName;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickName='" + nickName + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
