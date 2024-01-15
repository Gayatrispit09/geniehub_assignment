public class inheritance {
    public static void main(String[] args) {
        bmw b1 = new bmw();
        b1.name = "bmw";
        b1.price = 1004;
        b1.runs();
        b1.speed();
        System.out.println(b1.name + " " + b1.price + " ");
    }
}

class Car {
    String name;
    int price;

    void runs() {
        System.out.println(name + " runs on road");
    }

}

class bmw extends Car {

    void speed() {
        System.out.println("speed of bmw is 1000");
    }
}
