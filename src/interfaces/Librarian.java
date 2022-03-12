package interfaces;

public interface Librarian extends Users {
    void orderBooks(String name, Supplier supplier);
}
