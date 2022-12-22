import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books = new ArrayList<>();

    //Egy könyv beszúrása. Bekér minden adatot, ami egy könyvnek kell, de a típusadatokat a factoryn keresztül kezeljük.
    public void storeBook(String name,
                     double price,
                     String type,
                     String distributor,
                     String otherData){
        BookType bookType = BookFactory.getBookType(type, distributor, otherData);
        books.add(new Book(name, price, bookType));
    }
}
