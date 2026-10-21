package InterviewJavaCodePractice;

public class SwappingNumbers {


    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swapping Numbers Are: " + a + " " + b);

        //Logic-1 Third variable
        int c = a; //10
        a=b; //20
        b=c; //10
        System.out.println("After Swapping Numbers Are: " + a +" " + b);

        //Logic-2 use + & - without third variable
        a = a+b; //10+20 = 30
        b = a-b; //30-20 = 10
        a = a-b; //30-10 = 20
        System.out.println("After Swapping Numbers Are: " + a +" " + b);

      //Logic 3- use * & / without using third variable
      //here a & b values should not be zero

        a = a*b; //10*20 = 200
        b = a/b; //200/20 = 10
        a = a/b; //200/10 = 20
        System.out.println("After Swapping Numbers Are: " + a +" " + b);

        //Logic 4- bitwise XOR(^)
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping Numbers Are: " + a +" " + b);

        //Logic 5- Single statement
        b=a+b-(a=b);
    }
}
