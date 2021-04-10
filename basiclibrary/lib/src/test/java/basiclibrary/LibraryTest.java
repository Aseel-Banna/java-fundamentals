package basiclibrary;


import java.util.ArrayList;
import java.util.List;

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
   @Test public void testLowestWeatherAverage(){
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


    @Test
    public void testTally(){
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String winner = Library.tally(votes);
        System.out.println(winner);
    }

    @Test public void testMinAndMaxTemperature() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expected="High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n";
        Library.minAndMaxTemperature(weeklyMonthTemperatures);
        System.out.print(Library.minAndMaxTemperature(weeklyMonthTemperatures));
        assertEquals("Result",expected, Library.minAndMaxTemperature(weeklyMonthTemperatures));
    }


}

