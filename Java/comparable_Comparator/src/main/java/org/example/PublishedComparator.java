package org.example;

public class PublishedComparator implements java.util.Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        if(b1.getPublished() == b2.getPublished()){
            return 0;
        }else if(b1.getPublished().isAfter(b2.getPublished())){
            return 1;
        }else{
            return -1;
        }
    }
}
