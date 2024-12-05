package lldChainResponsibility;

public class InfoLogProcessor extends Logprocessor {
  InfoLogProcessor(Logprocessor nextLogProcessor){
      super(nextLogProcessor);
  }
  public void log(int logLevel,String message){
      if(logLevel==INFO){
          System.out.println("INFO"+ message);
      }
      else {
          super.log(logLevel,message);
      }
  }
}
