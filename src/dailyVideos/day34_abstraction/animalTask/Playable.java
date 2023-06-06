package dailyVideos.day34_abstraction.animalTask;

public  interface Playable {

    boolean isFriendly= true;  //static & final  = public static final boolean isFriendly= true; -->we dont need to write that again


/*  how can i prove it that the variable is static?
    open a main method ,write the datatype. and if it is seen , that is static.main is static method , so static main accepts only the other static
      isFriendly=false --> it gives compiler , because it is final

    private static void main(String[] args) { //static method can be used in interface
        System.out.println(isFriendly);
    }

    public void method1(){  //in interface ,instance method is not allowed
    }

    default void method1(){  //in interface ,default method is allowed
    }
 */


    void play();  //interface should have abstract method-->=public abstract void playable();--<public abstract is optional





}
