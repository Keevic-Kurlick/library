import interfaces.Librarian;
import interfaces.Supplier;

public class LibrarianAdministrator extends LocalAdministrator implements Librarian {
    protected String position = "библиотекарь";

    public LibrarianAdministrator(String name) {
        super(name);
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void orderBooks(String name, Supplier supplier) {
        System.out.println(this.getPosition() + " " + this.getName() +
               " заказал книгу '" + name + "' у поставщика (" + supplier.getPosition() + ") " + supplier.getName());
        }
    }

