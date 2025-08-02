public class MusicBook {
    private int bookId;
    private String description;

    public MusicBook(int bookId, String description) {
        this.bookId = bookId;
        this.description = description;
    }

    public String toString() {
        return "Book ID: " + bookId + ", Desc: " + description;
    }
}