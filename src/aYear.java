
public class aYear implements iYear{

   protected int century = 0;
   protected String leapYear = "";

    /**
     * Takes in a year and determines the century
     * and if it was a leap year.
     *
     * @param theYear
     */
    @Override
    public void computeYearInfo(int theYear) {

        /* Algorithm for leap year. */
        if (theYear % 4 != 0) leapYear = "No.";
        else if (theYear % 100 != 0) leapYear = "Yes.";
        else if (theYear % 400 != 0) leapYear = "No.";
        else leapYear = "Yes.";

        /* Algorithm for century. */
        if (theYear % 100 == 0) century += theYear/100;
        else century += 1 +(theYear / 100);
    }
}
