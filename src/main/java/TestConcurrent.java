import java.util.ArrayList;

public class TestConcurrent {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> events = new ArrayList<>();
        ArrayList<Integer> elements = new ArrayList<>();
        Thread listenerThread = new Thread() {
            int eventId = 0;

            @Override
            public void run() {
                while ((System.currentTimeMillis() - startTime) / (1000 * 120) < 1) {
                    if (((System.currentTimeMillis() - startTime) % 1000) == 0) {
                        events.add(eventId++);
                        System.out.println("加入事件:" + eventId);
                        System.out.println(events.size());

                    }
                }
            }
        };
        Thread containerThread = new Thread() {
            int count = 0;

            @Override
            public void run() {
                while ((System.currentTimeMillis() - startTime) / (1000 * 120) < 1) {
                    if ((System.currentTimeMillis() - startTime) % (1000 * 5) == 0) {
                        elements.addAll(events);
                        count++;
                        System.out.println("第" + count + "次获取新事件");
                    }
                }
            }
        };
        listenerThread.start();
        System.out.println("监听线程开始运行");
        containerThread.start();
        System.out.println("容器线程开始运行");
    }
}
