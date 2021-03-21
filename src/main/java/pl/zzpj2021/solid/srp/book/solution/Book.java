package pl.zzpj2021.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {

    private final Map<Integer, String> pages = new HashMap<>();
    private String libraryRoomName;
    private String rowLocator;
    private final String author;
    private final String title;
    private int indexOnShelf;

    public Book(String libraryRoomName, String rowLocator, String author, String title, int indexOnShelf) {
        this.libraryRoomName = libraryRoomName;
        this.rowLocator = rowLocator;
        this.author = author;
        this.title = title;
        this.indexOnShelf = indexOnShelf;
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    /**
     * Gives the library name
     *
     * @return
     */
    public String libraryRoomName() {
        return libraryRoomName;
    }

    /**
     * Gives the row location of the book.
     * @return
     */
    public String getLocationRowLocator() {
        return rowLocator;
    }

    /**
     * Gives the number from shelf.
     * @return
     */
    public int getIndexOnShelf() {
        return indexOnShelf;
    }
}
