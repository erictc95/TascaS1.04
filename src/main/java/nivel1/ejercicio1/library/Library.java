package nivel1.ejercicio1.library;

import java.util.ArrayList;

public class Library {
    ArrayList<String> books = new ArrayList<>();

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook (String title) {
        books.add(title);
    }

    public void getBookForPosition (int position) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(position));
        }
    }

}
