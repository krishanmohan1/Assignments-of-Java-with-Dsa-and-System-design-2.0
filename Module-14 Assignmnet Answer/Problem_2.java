public class Problem_2 {




    public static void main(String[] args) {

        mohan object = new mohan();
        object.method();
        System.out.println("My NAME is "+ object.name);
        System.out.println("My age is " +object.age);


    }

}
class mohan{

    int age = 21;
    String name = "Mohan BABA";

    void method(){
        System.out.println("Hiii  I am learning Java ");

    }
}
