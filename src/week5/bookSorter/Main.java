package week5.bookSorter;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // TreeSet<Book> books = new TreeSet<>(new PageNumberComparator()); //sayfa sayısına göre sıralama

        TreeSet<Book> books = new TreeSet<>(new NameComparator()); //isme göre sıralama

        books.add(new Book("Saatleri ayarlama enstitüsü",392,"ahmet hamdi",1961));
        books.add(new Book("Kürk mantolu madonna",160,"Sabahattin Ali",1943));
        books.add(new Book("Tutunamayanlar",724,"Oğuz Atay",1971));
        books.add(new Book("Masumiyet Müzesi",592,"Orhan Pamuk",2008));
        books.add(new Book("İnce Memed",436,"Yaşar Kemal",1955));

        for (Book b : books){
            System.out.println(b.getBookName());
        }
    }
}
