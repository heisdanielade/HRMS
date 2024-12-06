import java.time.LocalDate;

public class Employee {
	private int id;
	private String name;
	private String surname;
	private LocalDate dateOfBirth;
	private String gender;
	private String nationality;
	private String jobTitle;
	private String department;
	private double salaryPerHour;
	private int[] hoursInMonth = new int[12]; // 12 months in a year
	private LocalDate hireDate;
	private boolean isActive;
	public static final int max_hours = 168; // Max number of work hours in a month in Poland
	
	
	// GETTERS & SETTERS FOR EMPLOYEE DATA
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getHoursInMonth() {
		return hoursInMonth;
	}

	public void setHoursInMonth(int[] hoursInMonth) {
		this.hoursInMonth = hoursInMonth;
	}

	public static int getMaxHours() {
		return max_hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(double salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	// CONSTRUCTOR
	public Employee(int id, String name, String surname, LocalDate dateOfBirth, String gender, String nationality,
			String jobTitle, String department, double moneyPerHour, int[] hoursInMonth, LocalDate hireDate, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.nationality = nationality;
		this.jobTitle = jobTitle;
		this.department = department;
		this.salaryPerHour = moneyPerHour;
		this.setHoursInMonth(hoursInMonth);
		this.hireDate = hireDate;
		this.isActive = isActive;
	}
	
	
	// VALIDATIONS
	
	// check if month is valid
	private static boolean isCorrectMonth(int month) {
		if (month >= 1 && month <= 12) {
			return true;
		} else {
			return false;
		}
	}

	// ensure employee has valid and legal work hours
	private static boolean areCorrectHours(int hours) {
		if (hours < 0 && hours > max_hours) {
			throw new IllegalArgumentException("(i) Exceeded working hours limit.");
		} else {
			return true;
		}
	}
	
	
	
	
	
}
