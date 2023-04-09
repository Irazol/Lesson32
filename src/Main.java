import entity.Book;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        BookHelper bh = new BookHelper();
        Map<String, Integer> books = new LinkedHashMap<>();
        books.put("The Lord of the Rings",2);
        books.put("Harry Potter",3);
        books.put("Game of Thrones",1);

        for (Map.Entry<String, Integer> bk : books.entrySet()) {
                Book book = new Book();
                book.setName(bk.getKey());
                book.setAuthor_id(bk.getValue());
                bh.addBook(book);
        }
        Book book = new Book();
        book.setName("Fight Club");
        book.setAuthor_id(4);
        bh.addBook(book);


        List<Book> bookList = bh.getBookList();

        for (Book b : bookList) {
            System.out.println(b);
        }

        Book b = bh.getBookById(3);
        System.out.println(b);
    }
}
