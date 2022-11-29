import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();

    //  ProductRepository repo = Mockito.mock(ProductRepository.class);
    ProductManager manager = new ProductManager(repo);

    Product item1 = new Book(1, "Шантарам", 300, "Грегори Дэвид Робертс");
    Product item2 = new Book(2, "Фауст", 600, "Иоганн Вольфганг Гете");
    Product item3 = new Book(3, "Маленький принц", 400, "Антуан де Сент-Экзюпери");
    Product item4 = new Book(4, "Шантарам 2", 350, "Грегори Дэвид Робертс");
    Product item5 = new Smartphone(5, "s22", 20000, "Samsung");
    Product item6 = new Smartphone(6, "p50", 30000, "Huawei");
    Product item7 = new Smartphone(7, "x5", 40000, "Xiaomi");
    Product item8 = new Smartphone(8, "Watch", 50000, "Apple");

    @BeforeEach
    public void setup() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
    }

    @Test
    public void searchBy() {

        Product[] expected = {item1, item4};
        Product[] actual = manager.searchBy("Шантарам");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void add() {

        Product[] expected = {item1, item2, item3, item4, item5, item6, item7, item8};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }




}
