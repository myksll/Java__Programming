package practices.day08_practices;

public class ChooseLanguage {
    public static void main(String[] args) {


        //1.solution ternary

         int num =34;

        String result="Invalid Number";

        if(num>=1 && num<=5){

            result=(num==1) ? "Hello, thank for your call" :(num==2) ? "Hola, gracias para llamar"
                    :(num==3)? "Merhaba, aradiginiz icin tesekkurler" :(num==4)? "Privet, spasibo za vash zvonok"
                    : "Merci ,pour votre appel";
        }

        System.out.println(result);

        System.out.println("-------------------------------------------------------------------------------------");

           //2.solution switch

          switch(num){
              case 1:
                  result="Hello, thank for your call";
                  break;
              case 2:
                  result= "Hola, gracias para llamar";
                  break;
              case 3:
                  result= "Merhaba, aradiginiz icin tesekkurler";
                  break;
              case 4:
                  result="Privet, spasibo za vash zvonok";
                  break;
              case 5:
                  result= "Merci ,pour votre appel";
                  break;
              default:
                  result= "invalid";


          }

        System.out.println(result);













    }
}
