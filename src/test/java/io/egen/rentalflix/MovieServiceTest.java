package io.egen.rentalflix;

/**
 * JUnit test cases for MovieService
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.*;
public class MovieServiceTest {
       Movie m1 = new Movie();
       Movie m2 = new Movie();
       Movie m3 = new Movie();
       MovieService service = new MovieService();
      // MovieServiceTest mt = new MovieServiceTest();
       //test to check find all method of MovieService
       public void testFindAll(){
        m1.setId(1);
        m1.setTitle("The Finest Hour");
        m1.setYear("2016");
        m1.setLanguage("English");
        service.movieList.add(m1);
        m2.setId(2);
        m2.setTitle("The Avengers");
        m2.setYear("2014");
        m2.setLanguage("English");
        service.movieList.add(m2);
       assertEquals(2, service.movieList);
       }
    //Test to check create method
       public void testCreate(){
           m3.setId(3);
           m3.setTitle("Tanu Weds manu");
           m3.setYear("2015");
           m3.setLanguage("Hindi");
           Movie m4 = service.create(m3);
           assertEquals("Tanu weds Manu",m4);
       }

       //Test to check delete method
        public void testDelete(){
            Movie m = service.delete(2);
            assertEquals("The Finest Hours",m);
        }
    //Test to check findByName method
        public void testFindByName(){
            assertEquals("The Ring", service.movieList);
        }
    //Test to check update method
        public void testUpdate(){
            m1.setId(4);
            m1.setTitle("DeadPool");
            m1.setYear("2016");
            m1.setLanguage("English");
            Movie m = service.update(m1);
            assertEquals(1,m);
        }
    //Test to check rent movie method
    public void testRentmovie(){
        boolean isRented1 = service.rentMovie(1, "Alok");
        assertEquals(1,isRented1);
    }
}
