class LifeCycle extends Thread {
    public void run() {
        try {
            System.out.println("Thread is Running");

            Thread.sleep(2000);

            System.out.println("Thread completed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        LifeCycle t = new LifeCycle();

        System.out.println("Thread Created - New State");

        t.start();

        t.join();

        System.out.println("Thread Terminated");
    }
}
