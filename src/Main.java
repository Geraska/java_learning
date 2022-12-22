import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.displayInfo();

        Person bob = new Person("Bob");
        bob.displayInfo();

        Person sam = new Person("Sam", 32);
        sam.displayInfo();
        Collection<String> collectionA = Arrays.asList("S", "T");
        Collection<String> collectionB = Arrays.asList("U", "V");
        System.out.println(collectionA.addAll(collectionB));
    }
}

class Person {
    String name;
    int age;
    {
        name = "Undefined";
        age = 18;
    }
    Person()
    {
    }
    Person(String name)
    {
        this(name, 18);
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name %s \tAge %d\n", name, age);
    }
}