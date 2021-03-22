public class Module {
	
	private int year;
	
	private byte term;

	private ModuleDescriptor module;
	
	private StudentRecord[] records;
	
	private double finalAverageGrade;

	/**
	 * Constructor method.
	 * @param newYear - Year of a module.
	 * @param newTerm - Term of a module.
	 * @param newModule - The specific module.
	 */
	public Module(int newYear, byte newTerm, ModuleDescriptor newModule) {
		this.year = newYear;
		this.term = newTerm;
		this.module = newModule;
	}

	public double[] getContinuousAssignmentWeights() {
		return this.module.getContinuousAssignmentWeights();
	}

	public int getYear(){
		return this.year;
	}

	public byte getTerm(){
		return this.term;
	}

	public String getCode(){
		return this.module.getCode();
	}

	public void setRecords(StudentRecord[] records) {
		this.records = records;
	}

	/**
	 * Function that computes the final average grade.
	 */
	public void updateFinalAverageGrade(){
		double average = 0;
		double count = 0;
		for(StudentRecord i:this.records){
			average = average + i.getFinalScore();
			count++;
		}
		this.finalAverageGrade = average/count;
	}

	public double getFinalAverageGrade() {
		return this.finalAverageGrade;
	}
}
