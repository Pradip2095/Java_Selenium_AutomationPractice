public class TestPractice {


    public static void main(String[] args) {


        String str = "swiss";
        char[] chArray = str.toCharArray();

        for(int i= 0; i<chArray.length; i++){
            boolean repeatable = false;

            for(int j=0; j<chArray.length; j++){

                if(i!=j && str.charAt(i)==str.charAt(j)){
                    repeatable = true;
                    break;
                }
            }
            if(!repeatable){
                System.out.println("Fisrt Repeatable char: " + str.charAt(i));
                return;
            }
        }
        System.out.println("No non repeatable char found.");
    }
}