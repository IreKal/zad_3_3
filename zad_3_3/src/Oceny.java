public class Oceny {
    public int id;
    public int ocena;
    public String komentarz;


    @Override
    public String toString() {
        return "Oceny{" +
                "id=" + id +
                ", ocena='" + ocena + '\'' +
                ", komentarz='" + komentarz + '\'' +
                '}';
    }

    public  Oceny(int id, int ocena, String komentarz) {
        this.id = id;
        this.ocena = ocena;
        this.komentarz = komentarz;
    }}

