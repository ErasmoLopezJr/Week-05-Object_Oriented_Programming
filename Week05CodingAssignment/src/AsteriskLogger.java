

public class AsteriskLogger implements Logger{

 @Override
 public void log(String log) {
   System.out.println("***" + log + "***");
   
   
 }

 @Override
 public void error(String error) {
   
   String asterisk = "***";
   String word = "";
   
   for (int i = 1; i <= "Error.".length() +error.length(); i++) {
       word += "*";
       }
       System.out.println(asterisk + word +asterisk);
       System.out.println(asterisk + "Error." + error + asterisk);
       System.out.println(asterisk + word +asterisk);

   
 }

}
