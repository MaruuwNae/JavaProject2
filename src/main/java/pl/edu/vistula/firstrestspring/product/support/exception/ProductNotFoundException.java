package pl.edu.vistula.firstrestspring.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(long id) {
        super(String.format("Product with id" + id + "not found"));
    }
}