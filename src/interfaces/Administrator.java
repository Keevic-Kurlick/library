package interfaces;

public interface Administrator extends Users {

    void setDueToReturn(int dueToReturn);

    void findBook(String name, int amount);

    int getDueToReturn();

    void giveBook(String name, Reader reader, int getDueToReturn);

    void checkDue(String name, Reader reader, int dueToReturn, int actualDue);
}
