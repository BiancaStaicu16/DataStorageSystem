public class ModuleDescriptor {
	
	private String code;

	private String name;
	
	private double[] continuousAssignmentWeights;

	/**
	 *
	 * @param newCode - Code of a module.
	 * @param newName - Name of a module.
	 * @param newContinuousAssignmentWeights - Continuous assignment weights for that module.
	 */
	public ModuleDescriptor(String newCode, String newName, double[] newContinuousAssignmentWeights) {
		this.code = newCode;
		this.name = newName;
		this.continuousAssignmentWeights = newContinuousAssignmentWeights;
	}

	public double[] getContinuousAssignmentWeights() {
		return this.continuousAssignmentWeights;
	}

	public String getCode() {
		return this.code;
	}


}