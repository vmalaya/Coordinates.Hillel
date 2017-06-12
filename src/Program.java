import java.util.Scanner;

public class Program {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int[] SetOfX = new int[2];
        int[] SetOfY = new int[2];
        System.out.println("Please, enter upper-left x coordinate");
        int first_x = scanner.nextInt();
        System.out.println("Please, enter upper-left y coordinate");
        int first_y = scanner.nextInt();
        System.out.println("Please, enter lower-right x coordinate");
        int second_x= scanner.nextInt();
        System.out.println("Please, enter lower-right y coordinate");
        int second_y = scanner.nextInt();
        SetOfX[0]= first_x;
        SetOfX[1] = second_x;
        SetOfY[0] = first_y;
        SetOfY[1] = second_y;
        System.out.println("Sought x ");
        int x = scanner.nextInt();
        System.out.println("Sought y ");
        int y = scanner.nextInt();

        boolean flag = function(SetOfX, SetOfX, x, y);
        if (flag){
            System.out.println("Point belongs.");
        }
        else {
            System.out.println("Point does not belong.");
        }

    }
    private  static  boolean function( int[] arrayX, int[] arrayY, int x, int y)
    {
        if(x > arrayX[0] && x< arrayX[1] && y > arrayY[1] && y < arrayY[0]){
            return true;
        }
        return  false;
    }
}
