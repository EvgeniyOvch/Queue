public class Person {

    private String name;
    private String surname;
    private int tickets;

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public Person(String surname, String name, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public String toString() {
        return name + " " + surname;
    }
}

