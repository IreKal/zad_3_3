public class Kierunek {
    public int id;
    public String nazwa;
    public String opis;


    @Override
    public String toString() {
        return "Kierunek{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }

    public  Kierunek(int id, String nazwa, String opis) {
        this.id = id;
        this.nazwa = nazwa;
        this.opis = opis;
    }}

