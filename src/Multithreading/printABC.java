package Multithreading;

public class printABC {
        private final Object obj = new Object();
        private volatile char currentChar = 'A';

        public static void main(String[] args) {
            final printABC w = new printABC();
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    w.printsA();
                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    w.printsB();
                }
            });
            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    w.printsC();
                }
            });
            t1.start();
            t2.start();
            t3.start();
        }

        public void printsA() {
            synchronized (obj) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (currentChar != 'A') {
                            obj.wait();
                        }
                        System.out.print("A ");
                        currentChar = 'B';
                        obj.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printsB() {
            synchronized (obj) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (currentChar != 'B') {
                            obj.wait();
                        }
                        System.out.print("B ");
                        currentChar = 'C';
                        obj.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void printsC() {
            synchronized (obj) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (currentChar != 'C') {
                            obj.wait();
                        }
                        System.out.println("C ");
                        currentChar = 'A';
                        obj.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

}
