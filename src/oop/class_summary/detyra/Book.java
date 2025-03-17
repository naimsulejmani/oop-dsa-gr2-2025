package oop.class_summary.detyra;

public class Book {
    private String title;
    private String author;
    private int pageNumber = 1;

    public Book() {
    }

    public Book(String title, String author, int pageNumber) {
        setTitle(title);
        setAuthor(author);
        setPageNumber(pageNumber);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.trim().length() > 100) {
            System.out.println("Title is too long");
            return;
        } else if (title.isBlank()) {
            System.out.println("Title is blank");
            return;

        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        if (pageNumber < 1) {
            System.out.println("Page number must be greater than 0");
            return;
        }
        this.pageNumber = pageNumber;

    }

    public boolean isBookLong (){
        return pageNumber > 300;
    }


}











