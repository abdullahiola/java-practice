public class Persontest {
    // testing the private variable shit see whether its accessible in another class

    public static void main(String[] args){
        Person obj = new Person();
        obj.setName("Chiefo");
        obj.setAge(20);

        // System.out.println(obj.name);
        //wont print because it has a private access


        // use the get method to get the name
        System.out.println(obj.getAge());
    }
}


//Private 
// Static is when you want the method to be for the class instead of the class instance 
// Public is an access modifier -- used to determine the level of access -- private tooo
// void means you dont want it to return a value 
/*  public static void main(){
        Its the jvm that uderstands, yo dont want it to create an instance method thats why you're using static and you want the aceess level to be public plus you dont need it to return any value per say
    
}    
*/ 
// public 