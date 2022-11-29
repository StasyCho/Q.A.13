public class Book extends Product {
    private String auther;

    public Book(int id, String name, int price, String auther) {
        super(id, name, price);
        this.auther = auther;
    }

    @Override
    // ваши поля, конструкторы, методы
    public boolean matches(String search) {
        if (super.matches(search)) { // вызов метода matches в версии описанной в Product
            return true;
        }
        if (auther.contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
