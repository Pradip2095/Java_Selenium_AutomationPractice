package ThisKeyword;

public class ThisKeywordPractice {

    int number;
    String name;
    float fee;

    ThisKeywordPractice(int num, String name, float fee){
        this.number = num;
        this.name = name;
        this.fee = fee;
    }

    void show(){
        System.out.println(number + " " + name + " "+ fee);
    }


    public static void main(String[] args) {
        ThisKeywordPractice thisPra = new ThisKeywordPractice(45, "pradip", 45.52f);
        ThisKeywordPractice thisPra1 = new ThisKeywordPractice(50, "John", 99.99f);

        thisPra.show();
        thisPra1.show();
    }
}
