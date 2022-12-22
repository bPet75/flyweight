import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookFactory {
    //Itt tároljuk az egyes típusadatokat.
    public static Map<String, BookType> bookTypes = new HashMap<>();

    //Egy típusadatot csak akkor hozunk létre, ha a type, mint könyvjelző még nem létezik. A végén vagy az új adatot, vagy egy létezőt adunk vissza a könyvjelző alapján.
    public static BookType getBookType(String type, String distributor, String otherData){
        if(bookTypes.get(type) == null){
            bookTypes.put(type, new BookType(type, distributor, otherData));
        }
        return bookTypes.get(type);
    }
}
