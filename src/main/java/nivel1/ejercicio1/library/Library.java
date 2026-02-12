package nivel1.ejercicio1.library;

import java.util.ArrayList;

public class Library {
    ArrayList<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public Boolean addBook (String title) {
        if (!books.contains(title)) {
            books.add(title);
            return true;
        }
        return false;
    }

    public String getBookForPosition (int position) {
        for (int i = 0; i < books.size(); i++) {
            if (position < 0 || position >= books.size()) {
                return null;
            }
            return books.get(position);
        }
        return null;
    }

    public Boolean eraseBook(String title) {
        return books.remove(title);
    }

}
