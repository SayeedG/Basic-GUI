//Sayeed Gulmahamad
import javax.swing.JOptionPane;

public class Project0 {
    
   private int lowerCase;
   private int upperCase;

   public static void main(String[] args){
        
        String input;
        while(true){ //to loop the JOptionPane menu and its functions if user enters a correct parameter
            input = JOptionPane.showInputDialog(null, "Please enter a sentence:"); //to ask the user to input a sentence
            if (input.equals("Stop")) System.exit(0); //allows the user to close the program by typing "Stop"
            String sentence= input;
            int lowerCase = 0;
            int upperCase = 0;
            int numberCount= 0;
            for(int i=0; i < sentence.length(); i++){
               if (Character.isUpperCase(sentence.charAt(i))){upperCase++;}//Allows program to check each character at position "i" to see if it is a Upper Case character
               if(Character.isLowerCase(sentence.charAt(i))){lowerCase++;}//Allows program to check each character at position "i" to see if it is a Lower Case character
               if(Character.isDigit(sentence.charAt(i))){numberCount++;}//Allows program to check each character at position "i" to see if it is a Digit
            }
            JOptionPane.showMessageDialog(null, "There are " + upperCase + " Upper Case characters, " + lowerCase + " lower case characters and there are " + numberCount + " Digits in the sentence"); //displays how many Upper Case and Lower case letters there are in the sentence as well as the amount of Digits
        }
    }

    public int countletters(String sentence) {
       upperCase = 0;
       lowerCase = 0;
       int numberCount= 0;
      return numberCount;
       
    }
}