public class SingleThreadExample {
    private static void runTask(String name){
        for(int i = 1; i<=5; i++){
            System.out.println(name + "thread" + i);
            try {
                Thread.sleep(500); // 0.5sec wait
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        long startTime =  System.currentTimeMillis(); //record project starting time
        runTask("first");
        runTask("second");

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("total time: " + duration + "ms");

    }
}