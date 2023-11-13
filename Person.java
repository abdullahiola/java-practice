public class Person {
    private String name;
    private int age;

    public Person(){
        name = "John";
        age = 20;    
    }

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        name = this.name;
    }

    public void setAge(int age){
        age = this.age;
    }

    public void Fulldetails(){
        String Fulldetails = "My name is " + name + " i am " + age + "Years";

        System.out.println(Fulldetails);
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        Person me = new Person();
        me.name = "Abdullahi";
        me.age = 25;

        me.Fulldetails();
        
        System.out.println(me.age);
    }
}
