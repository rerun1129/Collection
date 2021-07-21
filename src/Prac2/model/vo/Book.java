package Prac2.model.vo;

import java.io.Serializable;
import java.util.Comparator;

public class Book implements Serializable {

    private String bNo;
    private int category;           //도서분류코드(1.인문/2.자연과학/3.의료/4.기타)
    private String title;
    private String author;



    public static class AscCategory implements Comparator<Book> {
        @Override
        public int compare(Book b1, Book b2) {


            int result;

            if (b1.getCategory() > b2.getCategory()) {
                result = 1;
            } else {
                result = -1;
            }
            return result;
        }
    }




    public static class DescCategory implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {

            Book b1 = (Book) o1;
            Book b2 = (Book) o2;

            int result;

            if (b1.getCategory() > b2.getCategory()) {
                result = -1;
            } else {
                result = 1;
            }
            return result;
        }
    }




    public Book() {
    }

    public Book(String bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public String getbNo() {
        return bNo;
    }

    public void setbNo(String bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bNo='" + bNo + '\'' +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
