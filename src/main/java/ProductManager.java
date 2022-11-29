import org.example.AlreadyExistsException;

public class ProductManager {

    private ProductRepository repo;

    public ProductManager(ProductRepository repo) {
        this.repo = repo;
    }

    public void add(Product product) {
        repo.save(product);
    }

    public void removeById(int id) {
        repo.removeById(id);
    }

    public void saveById(int id) {
        repo.saveById(id);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product item : repo.findAll()) {
            if (matches(item, text)) {
                // "добавляем в конец" массива result продукт product
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[result.length] = item;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        if (product.matches(search)) {
            return true;
        } else {
            return false;
        }
    }

    // метод определения соответствия товара product запросу search
    //public boolean matches(Product item, String search) {
    //   if (item.getName().contains(search)) {
    //   return true;
    // } else {
    //    return false;
    // }
    // или в одну строку:
    // return product.getName().contains(search);
    // }
}
