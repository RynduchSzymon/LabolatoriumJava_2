//import java.util.Scanner;
//class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Deklaracja zmiennych różnych typów danych
//        int intVariable;
//        double doubleVariable;
//        char charVariable;
//        boolean booleanVariable;
//
//        // Przypisanie wartości za pomocą Scanner
//        System.out.print("Podaj wartość dla zmiennej int: ");
//        intVariable = scanner.nextInt();
//
//        System.out.print("Podaj wartość dla zmiennej double: ");
//        doubleVariable = scanner.nextDouble();
//
//        System.out.print("Podaj wartość dla zmiennej char: ");
//        charVariable = scanner.next().charAt(0);
//
//        System.out.print("Podaj wartość dla zmiennej boolean (true/false): ");
//        booleanVariable = scanner.nextBoolean();
//
//        // Konwersje i wyświetlenie wyników
//        System.out.println("Konwersja double -> int: " + (int) doubleVariable);
//        System.out.println("Konwersja int -> double: " + (double) intVariable);
//        System.out.println("Konwersja char -> int: " + (int) charVariable);
//        System.out.println("Konwersja boolean -> string: " + Boolean.toString(booleanVariable));
//    }
//}
////Zadanie 4
//class Ksiazka {
//    private String tytul;
//    private String autor;
//    private int rokWydania;
//
//    // Konstruktor
//    public Ksiazka(String tytul, String autor, int rokWydania) {
//        this.tytul = tytul;
//        this.autor = autor;
//        this.rokWydania = rokWydania;
//    }
//
//    // Metoda do wyświetlania informacji o książce
//    public void wyswietlInformacje() {
//        System.out.println("Tytuł: " + tytul);
//        System.out.println("Autor: " + autor);
//        System.out.println("Rok wydania: " + rokWydania);
//    }
//
//    // Przykładowe użycie klasy
//    public static void main(String[] args) {
//        Ksiazka mojaKsiazka = new Ksiazka("Harry Potter", "J.K. Rowling", 1997);
//        mojaKsiazka.wyswietlInformacje();
//    }
//}
//
//
//
//

//ZADANIE 5
//class Ksiazka {
//    private String tytul;
//    private String autor;
//    private int rokWydania;
//
//    // Konstruktor
//    public Ksiazka(String tytul, String autor, int rokWydania) {
//        this.tytul = tytul;
//        this.autor = autor;
//        this.rokWydania = rokWydania;
//    }
//
//    // Metoda do wyświetlania informacji o książce
//    public void wyswietlInformacje() {
//        System.out.println("Tytuł: " + tytul);
//        System.out.println("Autor: " + autor);
//        System.out.println("Rok wydani    a: " + rokWydania);
//    }
//
//    // Metoda main jako przykład użycia klasy
//    public static void main(String[] args) {
//        Ksiazka mojaKsiazka = new Ksiazka("Harry Potter", "J.K. Rowling", 1997);
//        mojaKsiazka.wyswietlInformacje();
//    }
//}


//ZADANIE 3
import java.util.Arrays;

class Main{
    public static void main(String[]args){
        //Inicjalizacja tablic
        int [] tablica1 = {1,2,3,4,5};
        int [] tablica2 = {5,4,3,2,1};
        //obliczenie całkowitej wartosci kazdej tablicy
        int suma = Arrays.stream(tablica1).sum();
        int suma1 = Arrays.stream(tablica2).sum();
        // Wyswietlenie wyniku
        System.out.println("Wartosc tablicy 1 wynosi: "+ suma);
        System.out.println("Wartosc tablicy 2 wynosi: "+ suma1);

        //Najwieksza i najmniejsza liczba w obu tabelach
        int maksymalna_talibca1 = Arrays.stream(tablica1).max().getAsInt();
        int minimalna_talibca1 = Arrays.stream(tablica1).min().getAsInt();
        int maksymalna_talibca2 = Arrays.stream(tablica2).max().getAsInt();
        int minimalna_talibca2 = Arrays.stream(tablica2).min().getAsInt();

        //Wyswietlenie wyniku
        System.out.println("\n\nNajwieksza wartosc tablicy 1 wynosi: "+ maksymalna_talibca1 + "najmniejsza wartosc tablicy 1 wynsi " + minimalna_talibca1);
        System.out.println("Najwieksza wartosc tablicy 2 wynosi: "+ maksymalna_talibca2 + "Najmniejsza wartosc tablicy 2 wynsi " + minimalna_talibca2);

        //obliczanie średniej

        Double srednia = Arrays.stream(tablica1).average().getAsDouble();
        Double srednia_z_tablicy_2 = Arrays.stream(tablica2).average().getAsDouble();


        //Wyswietlenie wyniku
        System.out.println("\n\nśrednia tablei 1 wynosi " + srednia);
        System.out.println("średnia tablei 2 wynosi " + srednia_z_tablicy_2);

        //kopiowanie tablicy
        int [] kopia_tablica1 =Arrays.copyOf(tablica1, tablica1.length);
        int [] kopia_tablica2 =Arrays.copyOf(tablica2, tablica2.length);

        //Wyswetlenie wyniku
        System.out.println("\n\nwyswietlam skopiowana tablice: " + Arrays.toString(kopia_tablica1));
        System.out.println("wyswietlam skopiowana tablice: " + Arrays.toString(kopia_tablica2));

        //Wybor pewnej liczby
        int wartosc = 3;
        int []przefiltrowanie_tablicy = Arrays.stream(tablica1).filter(element -> element > wartosc).toArray();
        int []przefiltrowanie_tablicy2 = Arrays.stream(tablica2).filter(element->element > wartosc).toArray();
        //Wyswietlenie wyniku
        System.out.println("\n\nPrzefiltrowana tablica 1 :" + Arrays.toString(przefiltrowanie_tablicy));
        System.out.println("Przefiltrowana tablica 2 :" + Arrays.toString(przefiltrowanie_tablicy2));

        //Usuwanie elementu z tablicy oraz tworzenie nowej tablicy

        int element_do_usunięcia = 3;
        int [] nowaTablica = Arrays.stream(tablica1).filter(element ->element != element_do_usunięcia).toArray();
        int [] nowaTablica2 = Arrays.stream(tablica2).filter(element ->element != element_do_usunięcia).toArray();

        // wyswietlenie wyniku
        System.out.println("\n\nNowa pierwsza tablica: " + Arrays.toString(nowaTablica));
        System.out.println("Nowa druga tablica: " + Arrays.toString(nowaTablica2));


        //łączenie tablic oraz wyswietlenie jej jako jedna tablica

        int []polaczona_tablica = Arrays.copyOfRange(tablica1,0 ,tablica1.length + tablica2.length);
        System.arraycopy(tablica2, 0, polaczona_tablica, tablica1.length, tablica2.length);

        //wyswietlenie wyniku
        System.out.println("\n\nNowa tabela " + Arrays.toString(polaczona_tablica));

        //Zliczenie wystąpień dabej liczby

        int wartosc_liczby = 2;
        long liczbaWystapien = Arrays.stream(tablica1).filter(element -> element  == wartosc_liczby).count();

        // wyswietlenie wyniku;
        System.out.println("\n\nLczba 2 pojawia sie :" + liczbaWystapien + " razy");







    }
}
































