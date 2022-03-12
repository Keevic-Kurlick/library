import interfaces.Administrator;
import interfaces.Reader;

public class Main {
    public static void main(String[] args) {
        String book = "Коты-воители";
        String book1 = "Гарри Поттер";
        LocalAdministrator admin = new LocalAdministrator("Иванова");
        LocalReader reader = new LocalReader("Петров");
        LocalSupplier supplier = new LocalSupplier("Сидоров");
        LocalLibrarian librarian = new LocalLibrarian("Гвоздикин");
        Reader readerSup = new LocalSupplier("Корыгина");
        Administrator adminLibrarian = new LibrarianAdministrator("Топорова");
        Reader readerAdmin = new LocalAdministrator("Кириллова");

        readerAdmin.getBook(book1, adminLibrarian);
        librarian.orderBooks(book, supplier);
        supplier.bringBook(book, librarian);
        reader.getBook(book, admin);
        admin.findBook(book, 10);
        admin.setDueToReturn(100);
        admin.giveBook(book, reader, admin.getDueToReturn());
        reader.setActualDue(120);
        reader.returnBook(book, reader.getActualDue(), admin);
        admin.checkDue(book, reader, admin.getDueToReturn(), reader.getActualDue());
        System.out.println("Different interfaces and classes");
        readerSup.getBook(book1, adminLibrarian);
        adminLibrarian.findBook(book1, 12);
        adminLibrarian.setDueToReturn(150);
        adminLibrarian.giveBook(book1, readerSup, adminLibrarian.getDueToReturn());
        readerSup.setActualDue(160);
        readerSup.returnBook(book1, readerSup.getActualDue(), adminLibrarian);
        adminLibrarian.checkDue(book1, readerSup, adminLibrarian.getDueToReturn(), readerSup.getActualDue());
    }
}
