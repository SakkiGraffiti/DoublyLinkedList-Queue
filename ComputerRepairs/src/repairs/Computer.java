package repairs;

public class Computer {
	
	private int id;
	private String problem;
	private float value;
	
	public Computer() {
		super();
	}
	

	public Computer(int id, String problem, float value) {
		super();
		this.id = id;
		this.problem = problem;
		this.value = value;
	}

	public Computer(Computer computer) {
		super();
		this.id = computer.id;
		this.problem = computer.problem;
		this.value = computer.value;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", problem=" + problem + ", value=" + value + "]";
	}

	
	public void display(){
		System.out.println(toString());
	}	
	
	
}
