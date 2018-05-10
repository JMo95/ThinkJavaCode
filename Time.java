public class Time {
    public static void main(String[] args) {
      //time when i started this code
      int hour = 2;
      int minute = 53;
      int second = 12;
      //time when i finished this code
      int newHour = 3;
      int newMinute = 10;
      int newSecond = 13;
      int secondsPerDay = (24 * 3600);
      int secondsSinceMidnight = (hour * 3600) + (minute * 60) + second;
      int newSecondsSinceMidnight = (newHour * 3600) + (newMinute * 60) + newSecond;
      double secondsPerDayDbl = (24 * 3600);
      double secondsSinceMidnightDbl = (hour * 3600) + (minute * 60) + second;
      double percentagePassed = (secondsSinceMidnightDbl / secondsPerDayDbl);            
      
      //displays how many seconds have passed since midnight
      System.out.println("There have been " + secondsSinceMidnight + " seconds since midnight");
      //displays how many seconds left in a day
      System.out.println("There are " + (secondsPerDay - secondsSinceMidnight) + " seconds left in this day.");
      //displays the percentage of the day that has passed
      System.out.println(percentagePassed + "% of the day has passed.");
      //displays time that has passed since I started programming this
      System.out.println((newSecondsSinceMidnight - secondsSinceMidnight) + 
                         " seconds have passed since you wrote this code");
      
    }
}
