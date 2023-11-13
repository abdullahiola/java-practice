public class Date {
    private int year;
    private int month;
    private int day;

    // default constructor 
    public Date(){
        year = 1980;
        day = 26;
        month = 9;
    }

    // constructor // method overloading
    public Date(int day,int month,int year){
        setDate(day, month, year);
    }

    // method to set date
    public void setDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year= year;

    }
    public int getDate(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;

    }
}
