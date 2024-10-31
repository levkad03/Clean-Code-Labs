public class DatePicker extends Component {
    private String selectedDate;

    public void selectDate(String date) {
        this.selectedDate = date;
        notifyMediator("dateChanged");
    }

    public String getSelectedDate() {
        return selectedDate;
    }
}
