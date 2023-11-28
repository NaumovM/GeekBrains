package TravelApp;

public class Person {
    private int id;
    private String fio;
    private int cardNumber;
    private int hashPass;
    private String login;

    public Person(int id, String fio, int cardNumber, int hashPass, String login) {
        this.id = id;
        this.fio = fio;
        this.cardNumber = cardNumber;
        this.hashPass = hashPass;
        this.login = login;
    }

    public int getId() {
        return this.id;
    }

    public String getFio() {
        return this.fio;
    }

    public String getLogin() {
        return this.login;
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public int getHashPass() {
        return this.hashPass;
    }

    public void setHashPass(int hashPass) {
        this.hashPass = hashPass;
    }
}
