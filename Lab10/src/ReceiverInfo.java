public class ReceiverInfo extends Component {

    private boolean isOtherPerson;
    private String name;
    private String phone;

    public void setOtherPerson(boolean isOtherPerson) {
        this.isOtherPerson = isOtherPerson;
        notifyMediator("receiverInfoChanged");
    }

    public boolean isOtherPerson() {
        return isOtherPerson;
    }

    public void setName(String name) {
        if (isOtherPerson) {
            this.name = name;
        }
    }

    public void setPhone(String phone) {
        if (isOtherPerson) {
            this.phone = phone;
        }
    }
}
