public class multilevel {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.name = "anna";
        c1.age = 2;
        c1.colour = "white";
        c1.voice();
        c1.meow();
        c1.barks();
        System.out.println("name=" + c1.name + " age=" + c1.age + "colour= " + c1.colour);
        dog d1 = new dog();
        d1.voice();
        d1.barks();

    }
}

class animal {
    String name;
    int age;
    String colour;

    void voice() {
        System.out.println("animals makes sounds");
    }
}

class dog extends animal {
    void barks() {
        System.out.println("dog barks");
    }
}

class cat extends dog {
    void meow() {
        System.out.println("cats do meow ");
    }
}