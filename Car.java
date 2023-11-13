public class Car {
    int fullspeed;
    String horn;
    String fullthrottle;

    public Car(){
        setCar(fullspeed, horn, fullthrottle);
    }

    public void setCar(int fullspeed, String horn, String fullthrottle){
        this.fullspeed = fullspeed;
        this.horn= horn;
        this.fullthrottle = fullthrottle;
    }

    public void fullspeed(int fullspeed){
        System.out.println("The fullspeed is :"+ fullspeed);
    }

    public void horn(){
        System.out.println(horn);
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

}
