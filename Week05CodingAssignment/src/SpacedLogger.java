


public class SpacedLogger implements Logger {

 @Override
 public void log(String log) {
   
   
   
   for (int i = 0; i < log.length(); i++) {
     System.out.print(log.charAt(i) + " ");
   }
   System.out.println();
  
   
 }

 @Override
 public void error(String error) {
   System.out.print("Error.");
   for (int j = 0; j < error.length(); j++) {
     System.out.print( error.charAt(j) + " ");
   }
   System.out.println();
 }
}
 