public class methodoverride {
    int a;
    int b;

    public static void main(String[] args) {
        methodoverride m2 = new methodoverride();
        m2.add(7, 8);
        calc c3 = new calc();
        c3.add(8, 9);
    }

    int add(int a, int b) {
        System.out.println(a + b);
        return 0;
    }
}

class calc {
    int add(int a, int b) {
        System.out.println(a + b);
        return 0;
    }
}
