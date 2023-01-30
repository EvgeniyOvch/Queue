import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queuePassengers = new <Person>LinkedList(generateClients());
        while (!queuePassengers.isEmpty()) {
            Person nextPassenger = queuePassengers.poll();
            System.out.println(nextPassenger + " прокатился на аттракционе");
            int ticketCount = nextPassenger.getTickets();
            if (ticketCount > 1) {
                queuePassengers.offer(nextPassenger);
                nextPassenger.setTickets(ticketCount - 1);
            }
        }
    }
    public static List<Person> generateClients() {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Иванов", "Максим", 3));
        personList.add(new Person("Петров", "Дмитрий", 15));
        personList.add(new Person("Тельнов", "Илья", 1));
        personList.add(new Person("Фролов", "Павел", 3));
        personList.add(new Person("Гульнов", "Александр", 2));
        return (personList);
    }
}
