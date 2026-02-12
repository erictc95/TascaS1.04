package nivel1.ejercicio1.library;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
    ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public boolean addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            return true;
        }
        return false;
    }

    public ArrayList<String> getAllBooks() {
        return new ArrayList<>(books);
    }

    public String getBookForPosition(int position) {
        for (int i = 0; i < books.size(); i++) {
            if (position < 0 || position >= books.size()) {
                return null;
            }
            return books.get(position);
        }
        return null;
    }

    public boolean eraseBook(String title) {
        return books.remove(title);
    }

    public boolean addBookInPosition(int position, String title) {
        if (position < 0 || position > books.size()) {
            return false;
        }
        if (books.contains(title)) {
            return false;
        }
        books.add(position, title);
        return true;
    }

    public ArrayList<String> getSortedBooks () {
        ArrayList<String> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks);
        return sortedBooks;
    }

}
