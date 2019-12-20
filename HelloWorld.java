import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = scan.nextInt();
        System.out.println(input + " + 3 is " + (input + 3));
        scan.close();
    }
}