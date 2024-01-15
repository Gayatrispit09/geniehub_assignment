public class methodoverload {
    int a;
    int b;
    int c;

    public static void main(String[] args) {
        methodoverload m1 = new methodoverload();
        m1.add(5, 8, 9);

    }

    int add(int a, int b) {
        System.out.println(a + b);
        return 0;
    }

    int add(int a, int b, int c) {
        System.out.println(a + b + c);
        return 0;
    }

    int add(float a, float b) {
        System.out.println(a + b);
        return 0;
    }
}
