package lldChainResponsibility;

public class ErrorLogProcessor extends Logprocessor {
    ErrorLogProcessor(Logprocessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public  void log(int loglevel,String message){

       if(loglevel==ERROR) {
           System.out.println("ERROR" + message);
       }
       else {
           super.log(loglevel,message);
       }
    }
}
