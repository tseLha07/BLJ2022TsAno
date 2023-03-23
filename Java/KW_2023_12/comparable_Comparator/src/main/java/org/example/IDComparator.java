package org.example;

import java.util.Comparator;

public class IDComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        if(b1.getId() == b2.getId()){
            return 0;
        }else if(b1.getId() > b2.getId()){
            return 1;
        }else{
            return -1;
        }
    }
}
