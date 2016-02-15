package io.egen.rentalflix;

/**
 * JUnit test cases for MovieService
 */
import java.util.*;
public class MovieServiceTest {
    public static void main(String[] args) {
        MovieService ms = new MovieService();
        Movie m1 = new Movie();
        m1.setId(1);
        m1.setTitle("Avengers");
        m1.setYear("2014");
        m1.setLanguage("English");
        Movie m2 = new Movie();
        m2.setId(2);
        m2.setTitle("The Finest Hours");
        m2.setYear("2016");
        m2.setLanguage("English");
        List<Movie> list = new ArrayList<Movie>();
        list.add(m1);
        list.add(m2);


        //ms.delete(1);

        System.out.println(m2.getId()+" "+m2.getTitle());

    }
}
