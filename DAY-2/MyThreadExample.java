public class MyThreadExample {
    public static void main(String[] args) {
        MyThreadExample.MyThread t = new MyThreadExample.MyThread("My first thread");
        t.start();
        String str = t.getName();
        System.out.println(str);
    }

    static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        public void run() {
            System.out.println("Thread running: " + Thread.currentThread().getName());
        }
    }
}
