package nivel1.ejercicio1.library;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
    private ArrayList<String> books;

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
        if (position < 0 || position >= books.size()) {
            return null;
        }
        return books.get(position);
    }

    public boolean eraseBook(String title) {
        if (books.contains(title)) {
            books.remove(title);
            return true;
        }
        return false;
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

    public ArrayList<String> getSortedBooks() {
        ArrayList<String> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks);
        return sortedBooks;
    }

}
