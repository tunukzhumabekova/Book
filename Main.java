import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Book book=new Book("Jamilia",25,"Aitmatov");
        Book book1=new Book("Betme bet",25,"Aitmatov");
        Book book2=new Book("Kamelia",96,"Sara");
        Book book3=new Book("Uzak jol",25,"Mukai Elebaev");
        Book book4=new Book("Syngan kylych",41,"Tologon Kasymbekov");
        Book[]books={book,book1,book2,book3};

        Library library=new Library("Osmonov","chui",books);
        System.out.println(library.addABookToTheLibrary(book4));
        System.out.println(Arrays.toString(library.removeBookFromLibrary(book3)));
        System.out.println({library.updateBookByName("Jamilia", 20));
        System.out.println(Arrays.toString(library.getAllBookByAuthor("Aitmatov")));

    }
    }
