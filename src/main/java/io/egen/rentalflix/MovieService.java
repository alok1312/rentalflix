package io.egen.rentalflix;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {

    List<Movie> movieList = new ArrayList<Movie>();

    public List<Movie> findAll(){
        return movieList;
    }

    public List<Movie> findByName(String name) {
        List<Movie> searchedList = new ArrayList<Movie>();
        for(Movie movie: movieList){
            if(movie.getTitle().contains(name)){
                searchedList.add(movie);
            }
        }
        return searchedList;
    }
    public Movie create (Movie movie){
        if(!movieList.contains(movie)){
            movie.setId(movie.getId());
            movie.setTitle(movie.getTitle());
            movie.setYear(movie.getYear());
            movie.setLanguage(movie.getLanguage());
        }
        return movie;
    }
    public Movie update (Movie movie){
        movieList.set(3, movie);
        return movie;
    };

    public Movie delete (int id){
        Iterator<Movie> itr = movieList.iterator();
        while(itr.hasNext()) {
            Movie mov = itr.next();
            if (mov.getId() == id) {
                movieList.remove(mov);
                return mov;
            }
        }
        throw new IllegalArgumentException("id not found");
    }

    public boolean rentMovie (int movieId, String user){
        for(Movie movie: movieList) {
            if(movie.getId() == movieId){
                if(movie.isRented == false){
                    movie.isRented = true;
                    return true;
                }
            }
        }
        throw new IllegalArgumentException("false");
    }

}
