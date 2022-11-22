package four; 
 
public class Main { 
    public static void main(String[] args) { 
        Book b = new Book("Introduction to INIAD", 1000); 
        System.out.println(b.getTitle()); 
        System.out.println(b.getPrice()); 
    } 
} 