package basiclibrary;


import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testRoll(){
        Library rollClassUnderTest = new Library();
        int rollArray= rollClassUnderTest.roll(4);
        System.out.println(Library.roll(rollArray));
    }
    @Test
    public void testContainsDuplicates() {

        Library containsDuplicatesTest = new Library();
        int []arr={1,2,1};
        assertTrue("the array has duplicate elements 'true'",containsDuplicatesTest.containsDuplicates(arr));

    }//end testcontainsDuplicates()

    @Test
    public void testAvg(){
        int[] calculateTheAverageOfMe = {0, 1, 5, 3, 3};
        System.out.println(Library.calculateAverage(calculateTheAverageOfMe));
    }
    public void testLowestWeatherAverage(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 52}
        };
        int[] expect ={65, 56, 55, 52, 55, 62, 52};
        assertArrayEquals("expects {65, 56, 55, 52, 55, 62, 52}" ,expect
                ,Library.lowestWeatherAverage(weeklyMonthTemperatures));

    }



}

