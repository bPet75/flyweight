public class BookType {
    //Itt tároljuk azokat az adatokat, amik sok könyv esetében azonosak.
    public String type;
    public String distributor;
    public String OtherData;
    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        OtherData = otherData;
    }
}
