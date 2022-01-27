package studentarrays;
import java.util.Scanner;

/** This is a model class
 *
 * @author Saniya 2022
 */
public class StudentArrays
{
   /**
    * @param args the command line arguments
    */
   public static void main (String[] args)
   {
      Student s1 = new Student();
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Student Name:   "); // Taking user input
      s1.setName(input.nextLine());

      System.out.println("name:    " + s1.getName());

      //Student []  studlist = new Student[5];// array of object
   }
}
