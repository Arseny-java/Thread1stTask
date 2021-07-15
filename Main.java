public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("Main Group");

        Thread myThreads1 = new MyThreads(mainGroup,"Поток 1");
        Thread myThreads2 = new MyThreads(mainGroup,"Поток 2");
        Thread myThreads3 = new MyThreads(mainGroup,"Поток 3");
        Thread myThreads4 = new MyThreads(mainGroup,"Поток 4");

        myThreads1.start();
        myThreads2.start();
        myThreads3.start();
        myThreads4.start();

        Thread.sleep(10000);
        mainGroup.interrupt();


    }
}
