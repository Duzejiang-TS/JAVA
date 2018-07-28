package ThreadDemo;

/**
 *目的：建立三个线程，A线程打印10次A，B线程打印10次B,C线程打印10次C，要求线程同时运行，交替打印10次ABC。
 *过程：首先启动第一个线程，打印一个A，唤醒A锁，count--，（c.wait():释放C锁，第一个线程在循环中等待）
        其次启动第二个线程，打印一个B，唤醒B锁，count--，（a.wait():释放A锁，第二个线程在循环中等待）
        最后启动第三个线程，打印一个C，唤醒C锁，count--，（b.wait():释放B锁，第三个线程在循环中等待）
        由于第三个线程在循环中唤醒C锁，其执行完之后，会唤醒持有C锁等待的第一个线程，然后第一个线程执
        行完之后再唤醒循环中持有B锁的第二个线程，同理，依次执行唤醒操作
 *结果：ABCABCABCABCABCABCABCABCABCABC
 */
public class ABC {
    public static void main(String[] args){
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadPrint ta = new ThreadPrint("A",c,a);
        ThreadPrint tb = new ThreadPrint("B",a,b);
        ThreadPrint tc = new ThreadPrint("C",b,c);

        new Thread(ta).start();
        new Thread(tb).start();
        new Thread(tc).start();
    }

    public static class ThreadPrint implements Runnable{

        private String name;
        private Object prev;
        private Object self;

        private ThreadPrint(String name,Object prev,Object self){
            this.name = name;
            this.prev = prev;
            this.self = self;
        }

        @Override
        public void run() {
            int count = 10;
            while(count>0){
                synchronized (prev){
                    synchronized (self){
                        System.out.print(name);
                        count--;
                        self.notify();
                    }
                    try {
                        prev.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
