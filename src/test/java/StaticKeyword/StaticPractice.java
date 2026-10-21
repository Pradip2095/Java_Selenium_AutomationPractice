package StaticKeyword;

import org.testng.annotations.Test;

public class StaticPractice {

    static int i = 5;
    static String value = "automation";

    public static void staticDemo(){
        System.out.println("this is static method");
    }

    static{
        System.out.println(i);
    }


    public static void main(String[] args){
        StaticPractice.staticDemo();
        System.out.println(value);
    }
}
