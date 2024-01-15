abstract class calc {
    abstract int add(int a, int b);

    void multiply() {
        System.out.println("hh");
    }
}

class D extends calc {
    int add(int a, int b) {
        System.out.println(a + b);
        return 0;
    }
}

class absatraction {

    public static void main(String[] args) {
        D d1 = new D();
        d1.add(6, 9);
        d1.multiply();
    }
}
