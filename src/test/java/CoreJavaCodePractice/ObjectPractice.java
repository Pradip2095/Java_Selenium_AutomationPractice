package CoreJavaCodePractice;

public class ObjectPractice {


    int a;
    int b;
    int result;


    public void add() {
        result = a + b;
    }
}
 class DemoObject{
    DemoObject(){

    }
    public static void main(String[] args) {
        ObjectPractice op = new ObjectPractice();
        op.a = 45;
        op.b = 45;
        op.add();
        System.out.println(op.result);
    }
}
