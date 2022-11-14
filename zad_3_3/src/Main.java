public class Main {
    public static void main(String[] args) {

        Nauczyciel Nauczyciel = new Nauczyciel(23,"Malgorzata","Koziel","86052378965");
        System.out.println(Nauczyciel.toString());

        Uczen Uczen = new Uczen(12,"Jurek","Adamski","Kielce","69021436985",2);
        System.out.println(Uczen.toString());

        Uczelnia Uczelnia = new Uczelnia(100,"TEB EDU","Kielce","Szkola zaoczna");
        System.out.println(Uczelnia.toString());

        Kierunek Kierunek = new Kierunek(456,"Java","Programowanie");
        System.out.println(Kierunek.toString());

        Oceny Oceny = new Oceny(43,3,"Dostateczna");
        System.out.println(Oceny.toString());



    }
}