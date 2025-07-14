package assignment5;

public class Reverse {
    int number; // instance variable

   
    Reverse(int number) {
        this.number = number; // assigning value to instance variable
        System.out.println("Finding reverse");

        // Calling another constructor from here
        //findReverse();
    }

    // Method to calculate reverse (used internally)
    void findReverse() {
        int reverse = 0;
        int num = number; // use instance variable for logic

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse of number = " + reverse);
    }

    public static void main(String[] args) {
        // Only one constructor is called here
        Reverse obj = new Reverse(1234);
        obj.findReverse();
    }
}