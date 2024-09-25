public class Person {

    //Attribute
    private String name = "tobi";
    private int age = 15;

    //Referenzen

    //Konstruktor
    public Person() { // = "Peter"
        helloSagen();
        helloSagen(); //= 15

    }
    //Methoden
    public void helloSagen(){
        System.out.println("Hi, my name is "+name);
        System.out.println("and I am "+age );
    }
}
