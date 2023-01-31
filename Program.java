import java.util.Scanner;

//make a program to convert integer numbers to their binary representation. 
public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}
//Create a Converter class with a static toBinary() method
//returns the binary version of its argument.
public class Converter {
  public static String toBinary(int num) {
        String binary = "";
        while(num > 0) {
            binary = (num % 2) + binary;
            num /= 2;

        }
        return binary;
  }
}
