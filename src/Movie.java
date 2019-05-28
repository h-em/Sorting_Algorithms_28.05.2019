public class Movie{

    public Long id;
    public String name;
    public Integer duration;
    public String type;
    public String genere;
    public Double score;
    public Integer year;


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", type='" + type + '\'' +
                ", genere='" + genere + '\'' +
                ", score=" + score +
                ", year=" + year +
                '}';
    }
}
