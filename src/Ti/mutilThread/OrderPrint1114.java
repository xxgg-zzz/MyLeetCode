package Ti.mutilThread;

import util.Foo;

public class OrderPrint1114 {

    public static void main(String[] args) {
        Foo foo = new Foo();

        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                foo.first();
            }
        },"a");
        a.start();
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    a.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                foo.second();
            }
        },"b");
        b.start();
        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    b.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                foo.third();
            }
        },"c");
        c.start();

    }


}
