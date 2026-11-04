package Java_Basic_Program_For_Interview;

public class Armstrong_Number {

    public static void main(String[] args) {

        int num = 153;
        int org_num = num;
        int remainder;
        int sum = 0;

        int digits = String.valueOf(num).length();
        while (num > 0) {
            remainder = num % 10;
            sum = sum + (int) Math.pow(remainder, digits);
            num = num / 10;
        }

        if (org_num == sum) {
            System.out.println("it is Armstrong number: " + org_num);
        } else {
            System.out.println("It is not an Armstrong number." + org_num);
        }

    }
}
