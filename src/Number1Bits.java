import java.util.Scanner;

public class Number1Bits {
    public static int numberOfBits(int number){
        int count = 0;
        while (number > 0){
            count += ((number & 1) == 0) ? 0 : 1;
            number = number >> 1 ;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(numberOfBits(num));
    }
}
