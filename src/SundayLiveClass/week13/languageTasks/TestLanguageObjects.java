package SundayLiveClass.week13.languageTasks;

public class TestLanguageObjects {
    public static void main(String[] args) {

        //Language language = new Language(); //Language has abstract method, it can not have object, can not be instantiated an interface

        English english = new English();
        english.bye();
        english.hello();
        System.out.println(english.DEFAULT_ENCODING);
        //   english.translate("English", "Wie geht es dir?");
        //   english.description();


        Spanish spanish = new Spanish();
        spanish.bye();
        spanish.hello();
        System.out.println(spanish.DEFAULT_ENCODING);//this works but
        System.out.println(Language.DEFAULT_ENCODING);//this is correct way to access
        //  spanish.description(); static method can not be inherited from interface.

         Language.description();


         english.translate(spanish,"Hello, How are you?" );
         spanish.translate(english,"Hola");







    }
}
