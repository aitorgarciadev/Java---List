    import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DaysOfWeekManagerTest {

    private DaysOfWeekManager manager;

    @BeforeEach
    public void setUp() {
        manager = new DaysOfWeekManager();
        manager.createDaysOfWeek();
    }

    @Test
    public void testCreateDaysOfWeek() {
        List<String> days = manager.getDaysOfWeek();
        assertEquals(7, days.size());
        assertTrue(days.contains("Monday"));
        assertTrue(days.contains("Sunday"));
    }

    @Test
    public void testGetDaysOfWeek() {
        List<String> days = manager.getDaysOfWeek();
        assertNotNull(days);
        assertEquals(7, days.size());
    }

    @Test
    public void testGetDaysOfWeekSize() {
        assertEquals(7, manager.getDaysOfWeekSize());
    }

    @Test
    public void testRemoveDayOfWeek() {
        assertTrue(manager.removeDayOfWeek("Monday"));
        assertFalse(manager.containsDayOfWeek("Monday"));
        assertEquals(6, manager.getDaysOfWeekSize());
    }

    @Test
    public void testGetDayOfWeek() {
        assertEquals("Monday", manager.getDayOfWeek(0));
        assertNull(manager.getDayOfWeek(7));
    }

    @Test
    public void testContainsDayOfWeek() {
        assertTrue(manager.containsDayOfWeek("Tuesday"));
        assertFalse(manager.containsDayOfWeek("Funday"));
    }

    @Test
    public void testSortDaysOfWeek() {
        manager.sortDaysOfWeek();
        List<String> days = manager.getDaysOfWeek();
        assertEquals("Friday", days.get(0));
        assertEquals("Monday", days.get(1));
        assertEquals("Saturday", days.get(2));
        assertEquals("Sunday", days.get(3));
        assertEquals("Thursday", days.get(4));
        assertEquals("Tuesday", days.get(5));
        assertEquals("Wednesday", days.get(6));
    }

    @Test
    public void testClearDaysOfWeek() {
        manager.clearDaysOfWeek();
        assertTrue(manager.getDaysOfWeek().isEmpty());
        assertEquals(0, manager.getDaysOfWeekSize());
    }
}
