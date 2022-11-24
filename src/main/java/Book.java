public class Book extends Product{
    private String auther;

    public Book(int id, String name, int price, String auther) {
        super(id, name, price);
        this.auther = auther;
    }

    //@Override


    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }


}
