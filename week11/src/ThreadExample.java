public class ThreadExample {
    private static void printTask(String name){
        System.out.println(name +  " 시작");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " 완료");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Thread 클래스 상속
        Thread t1 = new Thread(){
            public void run(){
                printTask("상속 쓰레드");
            }
        };

        // Runnable 인터페이스 구현
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                printTask("Runnable 쓰레드");
            }
        });

        // 람다식
        Thread t3 = new Thread(()->printTask("람다 쓰레드"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long duration = System.currentTimeMillis() - startTime;
        System.out.println("병렬 처리 총 시간 : " + duration + "ms");
    }
}
