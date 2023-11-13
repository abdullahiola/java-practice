public class Testtimer {
    public static void main(String[] args){
        double arr[];
        int i, j, k;

        Timer t = new Timer();

        t.startTimer();

        for (i = 1; i <= 10000; i++) {
            for (j = 1; j <= 10000; j++) {
                k = i + j;
            }
        }
        System.out.println("time = " + t.elapsedTime() + " s");

        }
    }