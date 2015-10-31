/**
 * Created by TZ6YSQ on 10/30/2015.
 */
class YearTest extends GroovyTestCase {

    Year testYear;

    void testComputeYearInfo() {


        testYear = new Year();

        testYear.computeYearInfo(1996);
        assertEquals(20, testYear.century);
        assertEquals("Yes.", testYear.leapYear);

        testYear = new Year();
        testYear.computeYearInfo(1900);
        assertEquals(19,testYear.century);
        assertEquals("No.",testYear.leapYear);
    }
}
