package ex03;
import java.util.ArrayList;
public class User {
	private static String id;
	private static String pw;
	private String name;
	private int age;
	private int grade;
	private String address;
	private String gender;
	
	private static ArrayList<ArrayList<String>>arrlist=new ArrayList<>();
	
	public static ArrayList<ArrayList<String>>getArrList(){
		return arrlist;
	}
	public static void setArrList(ArrayList<ArrayList<String>>arrList) {
		User.arrlist=arrList;
	}
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		User.id=id;
	}
	public static String getPw() {
		return pw;
	}
	public static void setPw(String pw) {
		User.pw=pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void getGrade(){
		return grade;

	}
	public void setGrade(int grade){
		User.grade=grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}

}
