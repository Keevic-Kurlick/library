import interfaces.Librarian;
import interfaces.Supplier;

public class LocalSupplier extends LocalReader implements Supplier {

    protected String position = "поставщик";

    public LocalSupplier(String name) {
        super(name);
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void bringBook(String name, Librarian librarian) {
        System.out.println(this.position + " " + this.getName() + " привез книгу '" +
                name + "' библиотекарю (" + librarian.getPosition() + ") " + librarian.getName());
    }
}
