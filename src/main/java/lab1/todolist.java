package lab1;

public class todolist {
	
	private String id;
	private String name;
	private String date;
	private String operation;
	
	public todolist(String id,String name,String date,String operation){
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.operation = operation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	
}
