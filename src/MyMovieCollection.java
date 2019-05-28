import java.io.File;
import java.util.Scanner;

public class MyMovieCollection {

    public static final Integer DEFAUL_SEGMENT_SIZE = 16;
    public Movie[] movies;
    public int size;


    public MyMovieCollection(){
        movies = new Movie[DEFAUL_SEGMENT_SIZE];
        size = 0;
    }

    public void readMoviesFromFile(String filePath){
        File file = new File(filePath);
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] split = line.split(",");
                Movie movie = new Movie();
                movie.id = Long.valueOf(split[0]);
                movie.name=split[1];
                movie.duration = Integer.valueOf(split[2]);
                movie.type = split[3];
                movie.genere= split[4];
                movie.score = Double.valueOf(split[5]);
                movie.year = Integer.valueOf(split[6]);
                add(movie);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void add(Movie movie){
        this.movies[size]  = movie;
        size++;
    }

    public void showMovie(){
        for(int i=0; i<size ; i++){
            System.out.println(movies[i]);
        }
    }

    public static void sort(Movie[] a) {
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for (int j = 0; j < a.length-1; j++) {
                if (a[j].year > a[j + 1].year) {

                    Movie aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                    sorted = false;
                }
            }
        }
    }

    public void sortMoviesByYear(){
    }

    public void sortMoviesByDuration(){

    }

    public void sortMoviesByScore(){

    }

}
