public class Timer {
    protected double savedTime;
    
    public Timer(){
        savedTime = System.currentTimeMillis();
    }
    public void startTimer(){
        savedTime = System.currentTimeMillis();
    }
    public double elapsedTime(){
        double etime;
        etime = (System.currentTimeMillis()- savedTime) /1000.;
        return etime;

    }


    
};

