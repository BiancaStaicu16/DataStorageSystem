public class StudentRecord {

	private Student student;
	
	private Module module;
	
	private double[] marks;

	private double finalScore;

	private Boolean isAboveAverage;

	/**
	 * Constructor method.
	 * @param newStudent - Instance of Student.
	 * @param newModule - Instance of Module.
	 * @param newMarks - Marks of a student for that module.
	 * @param newFinalScore - Final score obtained.
	 */
	public StudentRecord(Student newStudent, Module newModule, double[] newMarks, double newFinalScore){
		this.student = newStudent;
		this.module= newModule;
		this.marks = newMarks;
		this.finalScore = newFinalScore;
	}

	public double getFinalScore() {
		return this.finalScore;
	}

	public int getId(){
		return this.student.getId();
	}

	public int getYear(){
		return this.module.getYear();
	}

	public byte getTerm(){
		return this.module.getTerm();
	}

	public String getCode(){
		return this.module.getCode();
	}

	/**
	 * Function that updates the truth value of the variable isAboveAverage.
	 */
	public void updateIsAboveAverage(){
		this.isAboveAverage = this.finalScore > this.module.getFinalAverageGrade();
	}
}

