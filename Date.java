public class Date {
  
  public static void main(String[] args){
    String day = "Wednesday";
    String month = "May";
    int date = 9;
    int year = 2018;
    
    printAmerican(day,date,month,year);
    printEuropean(day,date,month,year);    

  }
  
  public static void printAmerican(String day, int date, String month, int year){
    //prints a date in American format
    System.out.println("American format: "  + day + ", " + month + " " + date + ", " + year + ".");
  }
    
  public static void printEuropean(String day, int date, String month, int year){
    //prints a date in European format
    System.out.println("European format: "  + day + " " + date + " " + month + " " + year + "."); 
  }

}