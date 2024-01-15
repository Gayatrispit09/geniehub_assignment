public class hierarchical {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.name = "anna";
        c1.sound();
        dog d1 = new dog();
        d1.name = "moti";
        d1.sound();
        d1.barks();
    }
}

class animal {
    String name;

    void sound() {
        System.out.println("hiiiiiiiiiii from" + name);
    }
}

class dog extends animal {

    void barks() {
        System.out.println(name + " sooo  goood");
    }
}

class cat extends animal {

    void meow() {
        System.out.println(name + "cats do meow");
    }
}
