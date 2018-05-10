import java.util.Scanner;

/**
 * Converts seconds into hours, minutes, seconds
 */ 
public class SecondsConverter{  
  
  public static void main(String[] args){
    int seconds;
    Scanner in = new Scanner(System.in);    
    //user inputs amount of seconds
    System.out.print("Amount of seconds to convert: ");
    seconds = in.nextInt();
    //conversions for seconds into minutes, seconds, hours
    final int HOURS = (seconds / 3600);
    final int MINUTES_REMAINDER = (seconds % 3600);
    final int MINUTES = (MINUTES_REMAINDER / 60);
    final int SECONDS = (MINUTES_REMAINDER % 60);
    //displays seconds into hours, minutes, seconds
    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", seconds, HOURS, MINUTES, SECONDS);
  }
}
