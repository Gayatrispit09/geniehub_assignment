public class exceptionhandling {
    public static void main(String args[]) {
        trycatch a1 = new trycatch();
        a1.demo();
    }

}

class trycatch {
    void demo() {
        int arr[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(arr[8]);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}