import in.namishkumar.namishjava.*;

public class sample_console {
     public static void main(String[] args) {
          Terminal.writeLine("Wow! Welcome to NamishJava!");
          Terminal.writeLine(Namish.Version);
          Object UserNumber = NamishInput.readLine(InputTypes.Number(), "Please enter a number.");
          Terminal.writeLine("The Square of your number is "
                    + NamishMath.findSquare(Double.valueOf(String.valueOf(UserNumber))));
     }
}
