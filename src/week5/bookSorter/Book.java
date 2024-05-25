package week5.bookSorter;

public class Book {
    String bookName;
    int pageNumber;
    String writer;
    int releaseDate;

    public Book(String bookName, int pageNumber, String writer, int releaseDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.writer = writer;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
