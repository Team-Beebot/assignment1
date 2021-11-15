import java.util.Scanner;

public class AnswerNumber1 {
    public static void main(String[] args){
        float length,  breadth, area_of_rectangle;
        System.out.println("Put the value of length:");
        Scanner len = new Scanner(System.in);
        length = len.nextFloat();

        System.out.println("Put the value of breadth:");
        Scanner bed = new Scanner(System.in);
        breadth = bed.nextFloat();

       if(length == breadth ){
          float perfect_square = length * breadth;
           System.out.printf("This is a perfect square and the final value is: %d", perfect_square);
       }
       else{
           System.out.println("This is not a perfect square");
       }






    }

}
