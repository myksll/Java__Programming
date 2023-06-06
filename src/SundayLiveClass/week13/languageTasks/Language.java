package SundayLiveClass.week13.languageTasks;

public interface Language {

    //constant variable
    String DEFAULT_ENCODING = "UTF-8";// public static final-->it is not necessary, it is public static final automatically

    //abstract method
     void hello();
     void bye();

     //static method
     static void description(){
         System.out.println( "Languages have the ability to express thoughts and ideas to others using units of sound like words or sentences. There is often rules or syntax for how the words come together");
    }

     default void  translate (Language a,String message){
         System.out.println("Translating " +  message+ " in " + getClass().getSimpleName() + " into " + a.getClass().getSimpleName());
    }

}
