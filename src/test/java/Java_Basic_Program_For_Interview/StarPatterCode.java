package Java_Basic_Program_For_Interview;

public class StarPatterCode {

    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        //Inverted right angle triangle
        /*for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //pyramid
        /*for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Inverted pyramid
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //Diamond
        // upper half
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
        // lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }


        // solid square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) System.out.print("* ");
            System.out.println();
        }

        // hollow square
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }*/
    }
}
