import com.zeta.test.Customer;
import com.zeta.test.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCustomerProduct {
    Customer customer;
    Product product;

    @BeforeEach
    void setup() {
        customer = new Customer(1,"Alice","alice@gmail.com");
        product = new Product(101,"Laptop",1200.0);
        System.out.println("Set up Complete");
    }

    @Test
    void invalidCustomerID() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Customer(-1,"alice","alice@gmail.com"));
        String expectedMessage = "Invalid ID";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void invalidProductID() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Product(-1,"Laptop",20000.0));
        String expectedMessage = "Invalid ID";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void invalidProductName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> customer.setEmail("a"));
        String expectedMessage = "Invalid Email";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);

    }
}
