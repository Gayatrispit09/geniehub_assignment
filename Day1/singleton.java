public class singleton {
    private static singleton instance;

    private singleton() {
        System.out.println("Singleton instance created.");
    }

    public static singleton getInstance() {
        return (instance == null) ? new singleton() : instance;
    }

    public static void main(String[] args) {
        singleton singleton1 = singleton.getInstance();
        singleton singleton2 = singleton.getInstance();

        System.out.println("Are both references pointing to the same instance? " + (singleton1 == singleton2));
    }
}
