import java.util.ArrayList;
import java.util.List;

public class TimeSlotPicker extends Component {

    private List<String> availableTimeSlots = new ArrayList<>();

    public void setAvailableTimeSlots(List<String> timeSlots) {
        this.availableTimeSlots = timeSlots;
    }

    public List<String> getAvailableTimeSlots() {
        return availableTimeSlots;
    }

}
