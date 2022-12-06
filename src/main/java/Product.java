public class Product {

    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public boolean matches(String search) {
        if (name.contains(search)) {
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

   // public String getName() {
     //   return name;
   // }
}