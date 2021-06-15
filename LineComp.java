import java.util.Scanner;

class linecomp{

    public static void main (String args[]){
        System.out.println("Welcome to line computation problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x coordinate of first point");
        int x1 = sc.nextInt();
        System.out.println("Enter the y coordinate of first point");
        int y1 = sc.nextInt();
        System.out.println("Enter the x coordinate of second point");
        int x2 =  sc.nextInt();
        System.out.println("Enter the y coordinate of second point");
        int y2 = sc.nextInt();
        double len = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Enter the x coordinate of first point for second line");
        int X1 = sc.nextInt();
        System.out.println("Enter the y coordinate of first point for second line");
        int Y1 = sc.nextInt();
        System.out.println("Enter the x coordinate of second point for second line");
        int X2 =  sc.nextInt();
        System.out.println("Enter the y coordinate of second point for second line");
        int Y2 = sc.nextInt();
        double len2 = Math.sqrt(Math.pow((X2-X1),2) + Math.pow((Y2-Y1),2));
        String length1 = Double.toString(len);
        String length2 = Double.toString(len2);
        if(length1.equals(length2)){
            System.out.println("Length of the lines is equal");
        }
        else if(length1.compareTo(length2)>0){
            System.out.println("Line 1 is greater than line 2");
        }
        else{
            System.out.println("Line2 is greater than line1");
        }
    }
}
