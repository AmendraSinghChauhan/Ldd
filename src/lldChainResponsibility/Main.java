package  lldChainResponsibility;
public class Main {
    public static void main(String[] args) {
Logprocessor logObject= new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
logObject.log(Logprocessor.ERROR,"exception happens");
logObject.log(Logprocessor.DEBUG,"need to debug this");
logObject.log(Logprocessor.INFO,"just for info");
    }
    
}
