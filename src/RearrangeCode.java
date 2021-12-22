import java.util.Collection;
import java.util.Objects;

public class RearrangeCode {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String notes;
    private Collection<Order> ordersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        int newID = 1;
        System.out.println(newID);
        this.id = id;
    }

    @Override
    public String toString() {
        return "RearrangeCode{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", notes='" + notes + '\'' +
                ", ordersById=" + ordersById +
                '}';
    }

    private void privateHelperMethod() {
        // does something in here
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RearrangeCode that = (RearrangeCode) o;
        return id == that.id &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(middleName, that.middleName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(ordersById, that.ordersById);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, phone, notes, ordersById);
    }

    public Collection<Order> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Order> ordersById) {
        this.ordersById = ordersById;
    }
}

