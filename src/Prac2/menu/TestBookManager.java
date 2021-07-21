package Prac2.menu;

import Prac2.controller.BookManager;
import Prac2.model.vo.Book;

import java.util.Scanner;

public class TestBookManager {

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        BookManager bm = new BookManager();

        do {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 도서 정보 저장하기");
            System.out.println("7. 도서 정보 불러오기");
            System.out.println("8. 끝내기");
            System.out.print("메뉴 선택 : ");

            int menu = sc.nextInt();

            switch(menu) {
                case 1:	bm.addBook(inputBook());
                    break;
                case 2:	bm.printBookList(bm.sortedBookList());
                    break;
                case 3: System.out.println("삭제할 도서의 인덱스를 입력해 주세요");
                    int index = sc.nextInt();
                    bm.deleteBook(index);
                    break;
                case 4:	bm.printBook(bm.searchBook(inputBookTitle()));
                    break;
                case 5: bm.displayAll();
                    break;
                case 6: bm.saveBooks();
                    break;
                case 7: bm.loadBooks();
                    break;
                case 8:
                    System.out.print("정말 끝내시겠습니까? (y/n) : ");
                    char answer = sc.next().toUpperCase().charAt(0);

                    if(answer == 'Y') {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    } else System.out.println("메뉴를 다시 불러옵니다.");

                    break;
                default : System.out.println("잘못 입력하셨습니다.");
            }
        }while(true);
    }

    public static Book inputBook() {
        Scanner sc = new Scanner(System.in);

        System.out.println("내용을 입력하세요.");
        System.out.print("도서번호(ISBN) : ");
        String bNo = sc.next();
        System.out.print("카테고리 (1.인문/2.자연과학/3.의료/4.기타) : ");
        int category = sc.nextInt();
        System.out.print("책제목 : ");
        String bTitle = sc.next();
        System.out.print("저자 : ");
        String author = sc.next();

        return new Book(bNo, category, bTitle, author);
    }

    public static String inputBookTitle() {
        Scanner sc = new Scanner(System.in);

        System.out.println("확인할 도서명을 입력해주세요.");
        System.out.print("책제목 : ");
        return sc.next();
    }
}
