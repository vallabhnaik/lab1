package lab1;

public class todolist {
	
	private String id;
	private String name;
	private String date;
	private String removeDate;
	
	public todolist(String id,String name,String date,String removeDate){
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.removeDate=removeDate;
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
	
	public String getRemoveDate() {
		return removeDate;
	}

	public void setRemoveDate(String removeDate) {
		this.removeDate = removeDate;
	}

	
}
