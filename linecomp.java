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
        System.out.println("Length of line is: "+len);

    }
}
