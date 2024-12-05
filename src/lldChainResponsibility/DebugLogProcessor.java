package lldChainResponsibility;
public class DebugLogProcessor extends Logprocessor{
    DebugLogProcessor(Logprocessor nextLoggerProcessor){
        super(nextLoggerProcessor);
    }
    public void log(int loglevel,String message){
        if(loglevel== DEBUG){
            System.out.println("DEBUG"+ message);
        }
        else{
            super.log(loglevel,message);
        }
    }

}
