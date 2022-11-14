public class Nauczyciel {

    public int id;
    public String imie;
    public String nazwisko;
    public String miejscowosc;
    public String pesel;

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    public  Nauczyciel(int id, String imie, String nazwisko, String pesel){
        this.id = id;
        this.imie=imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.pesel = pesel;



    }


}
