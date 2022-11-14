public class Uczelnia {
    public int id;
    public String nazwa;
    public String miejscowosc;
    public String opis;


    @Override
    public String toString() {
        return "Uczelnia{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }

    public  Uczelnia(int id, String nazwa,String miejscowosc, String opis){
        this.id = id;
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
        this.opis = opis;



    }

}
