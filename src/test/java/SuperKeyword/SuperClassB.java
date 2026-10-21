package SuperKeyword;

public class SuperClassB extends SuperClassA{

    //Constructor
    SuperClassB(){
        super();
        System.out.println("classB constructor created");
    }

    //instance variable
    String college = "Symbiosis";

    //method
    public void startBike(){
        System.out.println("Start BMW Bike");
    }

    //check the super keyword with variable
    void collegeTest(){
        System.out.println(super.college);
        System.out.println(college);
    }

    //test the super keyword with method
    void start(){
        super.startBike();
        startBike();
    }


    //Test the functionality of super keyword
    public static void main(String[] args) {
        SuperClassB sup = new SuperClassB();// constructor print the values of SuperClassA & SuperClassB
        sup.collegeTest();//This line print the variable values of class name SuperClassA & SuperClassB
        sup.start();//This line print the method values of SuperClassA & SuperClassB
    }
}
