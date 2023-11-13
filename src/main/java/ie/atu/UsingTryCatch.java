package ie.atu;
import java.util.Scanner;
public class UsingTryCatch {
    public static void main(String[] args){
        Scanner myscan = new Scanner(System.in);

        int check = 0;
        while(check == 0) { //allows the user to keep entering values
            System.out.println("Please enter a number between 0 - 9:");
            try {
                //read user input as a sting
                String input = myscan.nextLine();

                //Parse the input to an integer
                int myNum= Integer.parseInt(input);

                //check if the number is between 0 and 9
                if (myNum>= 0 && myNum<=9){
                    System.out.println("You entered " + myNum);
                    check = 1; //ends the loop if a valid number is inputted
                }
                else{
                    System.out.println("Not a valid number");
                }
            }
            catch (NumberFormatException w) {
                System.out.println("not a valid input");
            }
        }
    }
}