import java.time.LocalDate;

public class Supervisor extends Employee {

	public Supervisor(int id, String name, String surname, LocalDate dateOfBirth, String gender, String nationality,
			String jobTitle, String department, double moneyPerHour, int[] hoursInMonth, LocalDate hireDate,
			boolean isActive) {
		super(id, name, surname, dateOfBirth, gender, nationality, jobTitle, department, moneyPerHour, hoursInMonth, hireDate,
				isActive);
		// TODO Auto-generated constructor stub
	}

}
