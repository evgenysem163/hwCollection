package col.collectionOne.oneCollection.data;
import java.util.Objects;
    public class Employee {
        private final String lastName;
        private final String firstName;
        public Employee(String lastName, String firstName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getFirstName() {return firstName;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return lastName.equals(employee.lastName) && firstName.equals(employee.firstName);
        }
        @Override
        public int hashCode() {
            return Objects.hash(lastName, firstName);
        }
        @Override
        public String toString() {
            return (lastName + " " + firstName);
        }
    }


