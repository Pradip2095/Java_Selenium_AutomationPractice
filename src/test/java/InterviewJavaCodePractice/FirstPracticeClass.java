package InterviewJavaCodePractice;

import org.testng.annotations.Test;
/*
1.Setup - Open
2.Login
3.Close
*/
public class FirstPracticeClass {

    @Test(priority = 1)
    public void setup(){
        System.out.println("This is setup method.");
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("This is login method.");
    }

    @Test(priority = 3)
    public void tearDown(){
        System.out.println("This is closing method.");
    }
}
