package baek;

public class Instance1 {

    public static void main(String[] args) {
        Person person = new Person("lee", 20); //제약
        System.out.println(person.name + " " + person.age);

//        person.name = "lee";
//        person.age = 20;

    }

//    public static void getPerson(Person person, String name, int age) {//객체 지향 프로그래밍에 어긋난다.
//        person.name = name;
//        person.age = age;
//    }
}
