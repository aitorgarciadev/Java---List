import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysOfWeekManager {

    private List<String> daysOfWeek;

    public DaysOfWeekManager() {
        this.daysOfWeek = new ArrayList<>();
    }

    public void createDaysOfWeek() {
        daysOfWeek.clear();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
    }

    public List<String> getDaysOfWeek() {
        return new ArrayList<>(daysOfWeek);
    }

    public int getDaysOfWeekSize() {
        return daysOfWeek.size();
    }

    public boolean removeDayOfWeek(String day) {
        return daysOfWeek.remove(day);
    }

    public String getDayOfWeek(int index) {
        if (index >= 0 && index < daysOfWeek.size()) {
            return daysOfWeek.get(index);
        }
        return null;
    }

    public boolean containsDayOfWeek(String day) {
        return daysOfWeek.contains(day);
    }

    public void sortDaysOfWeek() {
        Collections.sort(daysOfWeek);
    }

    public void clearDaysOfWeek() {
        daysOfWeek.clear();
    }
}
