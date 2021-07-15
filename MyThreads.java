class MyThreads extends Thread {
    public MyThreads(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                String threadName = Thread.currentThread().getName();
                Thread.sleep(1000);
                System.out.println("Всем привет! Я " + threadName);
            }
        } catch (InterruptedException err) {
            System.out.println("Поток спит, не буди");
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
