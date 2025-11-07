//feedback

/*
Great work boaz!
*/

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                // Replace this comment with your code
                String cheersName = args[0];
                int cheersSum = Integer.parseInt(args[1]);
                String nameUpperCase = cheersName.toUpperCase();
                int nameLength = cheersName.length();
                int currntChar = 0;
                int cheersRun = 0;
                String check = "AEFHILMNORSX";
                while (currntChar < nameLength) {
                        char letter = nameUpperCase.charAt(currntChar);
                        if (check.indexOf(letter) != -1) {
                                System.out.println("Give me an  " + letter + ": " + letter + "!");
                        } else {
                                System.out.println("Give me a  " + letter + ": " + letter + "!");
                        }
                        currntChar++;
                }
                System.out.println("What does that spell?");
                while (cheersRun < cheersSum) {
                        System.out.println(nameUpperCase + "!!!");
                        cheersRun++;
                }

        }
}
