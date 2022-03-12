import interfaces.Librarian;
import interfaces.Supplier;

public class LocalLibrarian extends LocalReader implements Librarian {

    protected String position = "библиотекарь";

    public LocalLibrarian(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void orderBooks(String name, Supplier supplier) {
        System.out.println(this.position + " " + this.getName() +
                " заказал книгу '" + name + "' у поставщика (" + supplier.getPosition() + ") " + supplier.getName());
    }
}


