public class Book {
//Közvetlenül az osztályban csak azokat az adatokat tároljuk, amik minden esetben egyediek. Mellettük a típusadatokat egy beinjektált osztály tartalmazza.
    public Book(String name, double price, BookType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    private String name;
    private double price;
    private BookType type;

}
