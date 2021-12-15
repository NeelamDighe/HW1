package edu.northeastern.neelam;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    Netflix netflix;

    public Main(){
        netflix = createNetflix();
    }

    public void addClassic(){
        netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> {
                    Date date = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
                    if (movie.getReleaseDate().before(date)) {
                        System.out.println(movie.getTitle() + "(Classic)");
                    }
                });
    }


    public void getLatestThreeMovies(){

        List<Movie> latestThreeMovies = netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .sorted((movie1, movie2) -> movie2.getReleaseDate().compareTo(movie1.getReleaseDate()))
                .limit(3)
                .collect(Collectors.toList());

        for(Movie movie: latestThreeMovies){
            Date date = movie.getReleaseDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(movie.getTitle() + ": " + calendar.get(Calendar.YEAR));
        }

    }


    public void setPredicate(){


        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date ninteenNinty = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Predicate<Movie> befor2000 = movie -> movie.getReleaseDate().before(twoThousand);
        Predicate<Movie> after1990 = movie -> movie.getReleaseDate().after(ninteenNinty);

        netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> {
                    if(befor2000.and(after1990).test(movie)){
                        System.out.println(movie.getTitle() + ": "
                                + movie.getReleaseDate().toGMTString()
                        );
                    }
                });
    }


    public void addReleaseYearToTitle(){

        List<Genre> list= netflix.genreList.stream()
                .map(genre -> {
                    genre.addReleaseYearToTitle();
                    return genre;
                })
                .collect(Collectors.toList());

        netflix.setGenreList(list);

        for(Genre genre: netflix.getGenreList()){
            for(Movie movie: genre.getMovieList()){
                System.out.println(movie.getTitle());
            }
        }
    }


    public void sortUseComparator(){
        Comparator<Movie> movieTitleComparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };


        List<Movie> list = netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .sorted(movieTitleComparator)
                .collect(Collectors.toList());

        for(Movie movie: list){
            System.out.println(movie.getTitle());
        }
    }

    public Netflix createNetflix(){
        Netflix netflix = new Netflix();
        netflix.setGenreList(generateGenres());
        generateMoviesForFiction(netflix.getGenreList().get(0));
        generateMoviesForNonFiction(netflix.getGenreList().get(1));

        return netflix;
    }

    public ArrayList<Genre> generateGenres(){
        Genre fiction = new Genre();
        Genre nonFiction = new Genre();

        ArrayList<Genre> list = new ArrayList<>();
        list.add(fiction);
        list.add(nonFiction);

        return list;
    }

    public void generateMoviesForFiction(Genre fiction){

        Date date1 = new GregorianCalendar(2012, Calendar.DECEMBER, 31).getTime();
        Movie Friends = new Movie("Friends", date1);
        Date date2 = new GregorianCalendar(1988, Calendar.FEBRUARY, 22).getTime();
        Movie Bigbangthoery = new Movie("Big bang theory", date2);
        Date date3 = new GregorianCalendar(1991, Calendar.MARCH, 14).getTime();
        Movie Twilight = new Movie("Twilight", date3);
        Date date4 = new GregorianCalendar(2005, Calendar.MARCH, 31).getTime();
        Movie Twilightsaga = new Movie("Twilight saga", date4);
        Date date5 = new GregorianCalendar(2018, Calendar.SEPTEMBER, 01).getTime();
        Movie Angelhasfallen = new Movie("Angel has Fallen", date5);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(Friends);
        list.add(Bigbangthoery);
        list.add(Twilight);
        list.add(Twilightsaga);
        list.add(Angelhasfallen);

        fiction.setMovieList(list);
    }

    public void generateMoviesForNonFiction(Genre nonFiction){

        Date date1 = new GregorianCalendar(2001, Calendar.AUGUST, 31).getTime();
        Movie Hellobrother = new Movie("Hellobrother", date1);
        Date date2 = new GregorianCalendar(1994, Calendar.OCTOBER, 23).getTime();
        Movie Swadesh = new Movie("Swadesh", date2);
        Date date3 = new GregorianCalendar(1968, Calendar.JUNE, 1).getTime();
        Movie Chakde = new Movie("Chakde", date3);


        ArrayList<Movie> list = new ArrayList<>();
        list.add(Hellobrother);
        list.add(Swadesh);
        list.add(Chakde);

        nonFiction.setMovieList(list);
    }

    public static void main(String[] args){

        System.out.println("Q4: Netflix");
        Main q4 = new Main();

        System.out.println("(1) add Classic, and then print out");
        q4.addClassic();
        System.out.println();

        
        System.out.println("(2) get latest three movies");
        q4.getLatestThreeMovies();
        System.out.println();

        //(3)
        System.out.println("(3) set predicate");
        q4.setPredicate();
        System.out.println();

        //(4)
        System.out.println("(4) add release year to title");
        q4.addReleaseYearToTitle();
        System.out.println();

        //(5)
        System.out.println("(5) sort use comparator");
        System.out.println("Sort by title");
        q4.sortUseComparator();
        System.out.println();
    }
}
