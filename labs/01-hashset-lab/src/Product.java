import java.util.Objects;

public class Product {
    private final String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Product product) {
            return Objects.equals(this.productName, product.productName);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
