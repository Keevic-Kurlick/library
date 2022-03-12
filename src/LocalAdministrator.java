import interfaces.Administrator;
import interfaces.Reader;

public class LocalAdministrator extends LocalReader implements Administrator {
    int dueToReturn;
    protected String position = "администратор";

    public LocalAdministrator(String name) {
        super(name);
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void findBook(String name, int amount) {
        System.out.println(this.position + " " + this.getName() +
                " ищет книгу " + name + ". Книг осталось: " + amount);
    }

    @Override
    public void setDueToReturn(int dueToReturn) {
        this.dueToReturn = dueToReturn;
    }

    @Override
    public int getDueToReturn() {
        return dueToReturn;
    }

    @Override
    public void giveBook(String name, Reader reader, int dueToReturn) {
        System.out.println(this.getPosition() + " " + this.getName() +
                " отдает книгу '" + name + "' читателю (" + reader.getPosition() + ") " +
                reader.getName() + " на " + dueToReturn + " дней.");
    }

    @Override
    public void checkDue(String name, Reader reader, int dueToReturn, int actualDue) {
        if (dueToReturn >= actualDue) {
            System.out.println("администратор (" + this.getPosition() + ") " + this.getName() +
                    " проверил: возврат книги '" + name + "' читателя (" + reader.getPosition()
                    + ") " + reader.getName() + " не просрочен");
        } else {
            System.out.println("администратор (" + this.getPosition() + ") " + this.getName() +
                    " проверил: возврат книги '" + name + "' читателя (" + reader.getPosition()
                    + ") " + reader.getName() + " просрочен на " + (actualDue - dueToReturn) + " дней");
        }
    }
}
