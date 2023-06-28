import java.util.Scanner;
public class MCBday{
    public static void main(String []args){
        Scanner myscanner = new Scanner(System.in);
        int classsize = myscanner.nextInt();
        int matches = myscanner.nextInt();
        double trials = 100000;
        double successes = 0;

        myscanner.close();

        for(int i=0; i < trials; i++){
          int []days = new int [365];
          // create an array that stores the days of the year.

          for(int j = 0; j < classsize; j++){
            int birthday = (int) (Math.random() * 365);
            days[birthday]++;
            if(days[birthday] >= matches){
                successes++;
                break;
                //if x people are born on this day, terminate trial
            }
          }
        }
        System.out.println(Math.round(successes * 100/trials) + "%");
    }
}

  




