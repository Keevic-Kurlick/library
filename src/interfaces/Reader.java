package interfaces;

public interface Reader extends Users {
    int getActualDue();

    void setActualDue(int actualDue);

    void getBook(String name, Administrator administrator);

    void returnBook(String name, int actualDue, Administrator administrator);

}
