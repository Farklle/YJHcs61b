
/** Class that determines whether or not a year is a leap year.
 *  @author Farklle
 */
public class LeapYear {

    /** Calls isLeapYear to print correct statement.
     *  @param  year to be analyzed
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }
    /**
     * 
     * @param year 要检查的年份
     * @return 如果给定的年份就是闰年就返回true，否则返回false
     * @source 来源是国际上对闰年的定义标准
     */
    public static boolean isLeapYear(int year){
        if(year%400 ==0){
            return true;
        }
        else if((year % 4==0)&&(year%100!=0)){
            return true;
        }
        else{
            return false;
        }

    }

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
        }
        for (int i = 0; i < args.length; i++) {
            try {
                int year = Integer.parseInt(args[i]);
                checkLeapYear(year);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }
    }
}

