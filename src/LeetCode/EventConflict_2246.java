package LeetCode;

public class EventConflict_2246 {
    public static void main(String[] args) {
        String event1[] = {"10:15", "11:00"};
        String event2[] = {"14:20", "15:00"};
        System.out.println(new EventConflict_2246().haveConflict(event1, event2));
    }

    public boolean haveConflict(String[] e1, String[] e2) {
        return e1[0].compareTo(e2[1]) <= 0 && e2[0].compareTo(e1[1]) <= 0;
    }
}
