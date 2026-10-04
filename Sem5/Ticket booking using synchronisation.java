class TicketBooking {
    int tickets = 5;

    synchronized void bookTicket(String name) {
        if (tickets > 0) {
            System.out.println(name + " booked a ticket.");
            tickets--;

            System.out.println("Remaining tickets: " + tickets);
        } else {
            System.out.println(name + " - No tickets available.");
        }
    }
}

class Customer extends Thread {
    TicketBooking booking;
    String name;

    Customer(TicketBooking booking, String name) {
        this.booking = booking;
        this.name = name;
    }

    public void run() {
        booking.bookTicket(name);
    }
}

public class TicketDemo {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Customer c1 = new Customer(booking, "Customer 1");
        Customer c2 = new Customer(booking, "Customer 2");
        Customer c3 = new Customer(booking, "Customer 3");
        Customer c4 = new Customer(booking, "Customer 4");
        Customer c5 = new Customer(booking, "Customer 5");
        Customer c6 = new Customer(booking, "Customer 6");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
    }
}
