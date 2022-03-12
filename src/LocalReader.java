import interfaces.Administrator;
import interfaces.Reader;

public class LocalReader implements Reader {

    String name;

    protected String position = "читатель";

    int actualDue;

    public String getPosition() {
        return position;
    }

    public void setActualDue(int days) {
        actualDue = days;
    }

    public int getActualDue() {
        return actualDue;
    }

    public LocalReader(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getBook(String name, Administrator administrator) {
        System.out.println(this.getPosition() + " " + this.getName() +
                " берет книгу '" + name + "' у администратора (" + administrator.getPosition() + ") " + administrator.getName());
    }

    @Override
    public void returnBook(String name, int actualDue, Administrator administrator) {
        System.out.println(this.getPosition() + " " + this.getName() +
                " возвращает книгу " + name + ", которую читал " +
                actualDue + " дней,  администратору (" + administrator.getPosition() + ") " + administrator.getName());
    }
}
