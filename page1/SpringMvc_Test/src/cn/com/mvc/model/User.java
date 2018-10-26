package cn.com.mvc.model;

public class User {
	private int id;
	private String username;
	private String password;
	private String gender;
	private String city;
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPasswod(){
		return password;
	}
	public void setPasswod(String password){
		this.password = password;
	}
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city = city;
	}
}
