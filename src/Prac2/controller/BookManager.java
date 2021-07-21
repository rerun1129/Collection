package Prac2.controller;

import Prac2.model.vo.*;

import java.io.*;
import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public BookManager(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book) {                        //done
        bookList.add(book);
    }

    public void deleteBook(int index) {                     //done
        bookList.remove(index);
    }

    public int searchBook(String bTitle) {                      //done
        int result = -1;

        for (int i = 0; i < bookList.size(); i++) {
            if (bTitle.equals((bookList.get(i)).getTitle())) {
                result = i;
                break;
            }
        }
        return result;
    }
    public void printBook ( int index){                       //done

        System.out.println(bookList.get(index));
    }

    public void displayAll () {                             //done

        for (Object o : bookList) System.out.println(o);

    }

    public Book[] sortedBookList () {
        bookList.sort(new Book.AscCategory());

        return bookList.toArray(new Book[bookList.size()]);
    }

    public void printBookList (Book[] br){
        for (Book value : br) {
            System.out.println(value);
        }
    }
    public void saveBooks() {
        // 책 저장용 메소드
        try(ObjectOutputStream oo = new ObjectOutputStream(
                new FileOutputStream("books.dat"))){

            for(int i = 0 ; i < bookList.size(); i ++) {
                oo.writeObject(bookList.get(i));
            }

            System.out.println("파일 저장 완료!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadBooks() {

        bookList.removeAll(bookList); //list 내용 전부 삭제

        try(ObjectInputStream oi = new ObjectInputStream(
                new FileInputStream("books.dat"))){

            Book bk = null;
            while((bk = (Book)oi.readObject()) != null) {
                bookList.add(bk);
            }
        } catch (EOFException e) {

            System.out.println("파일 읽기 완료!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
