package github.ybqdren.gof.javagoftest.iterator;

import github.ybqdren.gof.javagoftest.intertor.Book;
import github.ybqdren.gof.javagoftest.intertor.BookShelf;
import github.ybqdren.gof.javagoftest.intertor.Iterator;
import org.junit.jupiter.api.Test;

/**
 * Created by Zhao Wen on 2021/1/21
 */

public class TestInteratorModel {
    /**
     * 制作一个小书架
     */
    @Test
    public void testmodel(){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("《Java编程思想》"));
        bookShelf.appendBook(new Book("《Go语言圣经》"));
        bookShelf.appendBook(new Book("《Docker入门指南》"));
        bookShelf.appendBook(new Book("Deep Leaning 从入门到放弃"));

        Iterator iterator = (Iterator) bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
