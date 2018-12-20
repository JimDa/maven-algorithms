import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Event> events = new ArrayList<Event>() {{
            add(new Event());
            add(new Event());
        }};
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i + 1).time - events.get(i).time < 2 || events.get(i).time - events.get(i + 1).time < 2) {
                events.get(i + 1).time = events.get(i).time + 2;
                if (i == indexes.get(indexes.size() - 1)) {
                    events.get(i + 1).tag = true;
                } else {
                    indexes.add(i);
                    indexes.add(i + 1);
                }
            }
        }
        indexes.clear();
         List<Event> eventList = events.stream().filter(v -> v.tag == false).collect(Collectors.toList());

    }


    public static class Event {
        private String message;
        private Long time;
        private boolean tag = false;
    }
}
