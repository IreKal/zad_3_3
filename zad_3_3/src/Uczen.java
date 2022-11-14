public class Uczen {
    public int id;
    public String imie;
    public String nazwisko;
    public String miejscowosc;
    public String pesel;
    public int klasa;

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", pesel='" + pesel + '\'' +
                ", klasa='" + klasa + '\'' +
                '}';
    }

    public  Uczen(int id,String imie, String nazwisko,String miejscowosc, String pesel,int klasa){
        this.id = id;
        this.imie=imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.pesel = pesel;
        this.klasa = klasa;


    }


}


