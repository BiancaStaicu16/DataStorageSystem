public class Student {
	
	private int id;
	
	private String name;
	
	private char gender;

	private double gpa;

	private StudentRecord[] records;

	/**
	 * Transcript function.
	 * @return The transcript of a student.
	 */
	public  String printTranscript() {
		String id = "ID: " + this.id;
		String name = "Name: " + this.name;
		String gpa = "GPA: " + this.gpa;
		StringBuilder studentRecordsTranscript = new StringBuilder();
		for(StudentRecord i:this.records){
			studentRecordsTranscript.append("| ").append(String.valueOf(i.getYear())).append(" | ")
					.append(String.valueOf(i.getTerm())).append(" | ").append(i.getCode()).append(" | ")
					.append(i.getFinalScore()).append(" |\n");
		}
		return "\n\n"+ id + '\n' + name + '\n' + gpa + "\n\n" + studentRecordsTranscript;
	}

	/**
	 * Constructor method.
	 * @param newId - Id of a student.
	 * @param newName - Name of a student.
	 * @param newGender - Gender of a student.
	 */
	public Student(int newId, String newName, char newGender) {
		this.id = newId;
		this.name = newName;
		this.gender = newGender;
	}

	public int getId(){
		return this.id;
	}

	public double getGpa(){
		return this.gpa;
	}

	public void setRecord(StudentRecord[] records) {
		this.records = records;
	}

	/**
	 * Function that computes the gpa of a student.
	 */
	public void updateGpa(){
		double average = 0;
		double count = 0;
		for(StudentRecord i:this.records){
			average = average + i.getFinalScore();
			count++;
		}
		this.gpa = average/count;
	}

}
