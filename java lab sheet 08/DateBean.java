import java.io.Serializable;
import java.time.LocalDate;

public class DateBean implements Serializable {
    private static final long serialVersionUID = 1L;

    public DateBean() {
    }

    // Read-only property: Only getter provided, no setter
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }
}
