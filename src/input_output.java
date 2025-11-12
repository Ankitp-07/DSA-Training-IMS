import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();             //string lega till new line character

        System.out.print("Enter your age: ");
        int age = sc.nextInt();   //taking input till enter pressed

        //has.Next() -->> iterate over when next element is avaible only

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}