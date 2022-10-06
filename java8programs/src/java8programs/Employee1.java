package java8programs;

public class Employee1 {
	
	private int id;
	private int age;
	private String name;
	private Address address;
	
	
	
	public Employee1() {
		
	}
	public Employee1(int id, int age, String name, Address address) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
