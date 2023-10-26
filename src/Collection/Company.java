package Collection;

public class Company implements Comparable<Company> {

	private int id;
	private String name;
	private String addres;
	public int getId() {
		return id;
	}
	public Company(int id, String name, String addres) {
		super();
		this.id = id;
		this.name = name;
		this.addres = addres;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", addres=" + addres + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	@Override
	public int compareTo(Company o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
}
