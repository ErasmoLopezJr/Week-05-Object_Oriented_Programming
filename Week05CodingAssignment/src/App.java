public class App {

 public static void main(String[] args) {
   

   Logger asteriskLogger = new AsteriskLogger();
   
   asteriskLogger.log("Saturday");
   asteriskLogger.log("Sunday?");
   
   System.out.println();
   
   asteriskLogger.error("Training day");
   asteriskLogger.error("Campus");
   
   Logger spacedLogger = new SpacedLogger();
   
   spacedLogger.log("Hello");
   spacedLogger.log("Fireplace");
   
   System.out.println();
   
   spacedLogger.error("Elephant");
   spacedLogger.error("Authorization");
   
   
   
   
 }

}