package lldChainResponsibility;

public abstract class Logprocessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public  static  int ERROR= 3;
    Logprocessor nextLoggerProcessor;
    Logprocessor(Logprocessor logprocessor){
        this.nextLoggerProcessor = logprocessor;
    }
    public void log(int logLevel,String message){
        if(nextLoggerProcessor !=null){
            nextLoggerProcessor.log(logLevel,message);
        }
    }
}
