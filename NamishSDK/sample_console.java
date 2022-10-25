import in.namishkumar.namishjava.*;

public class sample_console {
     public static void main(String[] args) {
          for (int x = 0; x < NamishMath.PythagoreamTriplet.FindAll(4).length; x++) {
               Terminal.writeLine(NamishMath.PythagoreamTriplet.FindAll(4)[x]);
          }
     }
}
