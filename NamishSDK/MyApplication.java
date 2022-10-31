// Welcome to your Sample NamishJava application
// Built using NamishJava
// You are using NamishJava here!

// This application has been Pre-compiled to MyApplication.class
// To run, use javac MyApplication.java and then java MyApplication
// As this has been Pre-Compiled, Simply run java MyApplication
// You can see the output on your Terminal Window
import in.namishkumar.namishjava.*;;

public class MyApplication {
    public static void main(String[] args) {
        // TODO
        Terminal.writeLine("Welcome to NamishJava. Let's see how this Application works!");

        // Asks for the User name
        Object BasicUserName = NamishInput.readLine(InputTypes.String(), "May I know your name?");

        // Converts the UserName in Object to String
        String UserName = String.valueOf(BasicUserName);

        // Repiles back to the User
        Terminal.writeLine("Welcome to NamishJava, Dear " + UserName);

        // Now, NamishJava shows its potential
        Terminal.writeLine("\nLet me now show you my Potential.");

        // Asks for a text to be looped
        String MainText = String
                .valueOf(NamishInput.readLine(InputTypes.String(), "\nWhat is the text that you want to be looped?"));

        // Loops the text
        Terminal.writeLine("\nAlright! Your text will be looped 5 times.");
        Terminal.writeLoop(5, MainText);

        // Thanks the user
        Terminal.writeLine("\nAnd that's what I can do. Thank you and have a nice day!");
    }
}

// For Docs, Please go to https://docs.namishjava.namishkumar.in/
// Thank you!

// Latest Update on 31 October 2022
// On 5:05 PM