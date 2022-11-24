import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    ProductRepository repo = new ProductRepository();

    Product item1 = new Book(1, "Шантарам", 300, "Грегори Дэвид Робертс");
    Product item2 = new Book(2, "Фауст", 600, "Иоганн Вольфганг Гете");
    Product item3 = new Book(3, "Маленький принц", 400, "Антуан де Сент-Экзюпери");
    Product item4 = new Book(4, "Тень горы", 350, "Грегори Дэвид Робертс");
    Product item5 = new Smartphone(5, "s22", 20000, "Samsung");
    Product item6 = new Smartphone(6, "p50", 30000, "Huawei");
    Product item7 = new Smartphone(7, "x5", 40000, "Xiaomi");
    Product item8 = new Smartphone(8, "Watch", 50000, "Apple");




    @Test
    public void SaveProduct() {

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);

        Product[] expected = {item1, item2, item3, item4, item5, item6, item7, item8};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeBiId() {

        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        repo.save(item5);
        repo.save(item6);
        repo.save(item7);
        repo.save(item8);
        repo.removeById(item2.getId());

        Product[] expected = {item1, item3, item4, item5, item6, item7, item8};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }


}
