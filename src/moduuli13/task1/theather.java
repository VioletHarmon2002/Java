package moduuli13.task1;

import java.util.concurrent.locks.*;

class Theater {
    private int totalSeats;
    private int availableSeats;
    private final Lock lock = new ReentrantLock();

    public Theater(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public boolean reserveSeats(int numSeats, int customerId) {
        lock.lock();
        try {
            if (availableSeats >= numSeats) {
                availableSeats -= numSeats;
                System.out.println("Customer " + customerId + " reserved " + numSeats + " tickets.");
                return true;
            } else {
                System.out.println("Customer " + customerId + " couldn't reserve " + numSeats + " tickets.");
                return false;
            }
        } finally {
            lock.unlock();
        }
    }
}

class Customer extends Thread {
    private static int customerIdCount = 1;
    private Theater theater;
    private int customerId;

    public Customer(Theater theater) {
        this.theater = theater;
        this.customerId = customerIdCount++;
    }

    @Override
    public void run() {
        int numSeats = (int) (Math.random() * 5) + 1; // Randomly choose number of seats to reserve
        theater.reserveSeats(numSeats, customerId);
    }
}

class TicketReservationSystem {
    public static void main(String[] args) {
        final int totalSeats = 20;
        Theater theater = new Theater(totalSeats);

        final int numCustomers = 15;
        Customer[] customers = new Customer[numCustomers];

        for (int i = 0; i < numCustomers; i++) {
            customers[i] = new Customer(theater);
            customers[i].start();
        }

        for (Customer customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
