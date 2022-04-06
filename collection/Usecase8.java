package collection;

public class Usecase8 {
	private String firstname;
	private String lastname;
	private String address;
	private String state;
	private String city;
	private int zip;
	private int phonenumber;
	private String emailid;
	//generating getter and setter method;
	public String getfirstname(){
		return firstname;
	}
	public void setfirstname(String firstname){
		this.firstname=firstname;
	}
	public String getlastname(){
		return lastname;
	}
	public void setlastname(String lastname){
		this.lastname=lastname;
	}
	public String getaddress(){
		return address;
	}
	public void setaddress(String address){
		this.address=address;
	}
	public String getstate(){
		return state;
	}
	public void setstate(String state){
		this.state=state;
	}
	public String getcity(){
		return city;
	}
	public void setcity(String city){
		this.city=city;
	}
	public int getzip(){
		return zip;
	}
	public void setzip(int zip){
		this.zip=zip;
	}
	public int getphonenumber(){
		return phonenumber;
	}
	public void setphonenumber(int phonenumber){
		this.phonenumber=phonenumber;
	}
	public String getemailid(){
		return emailid;
	}
	public void setemailid(String emailid){
		this.emailid=emailid;
	}
	//creating default Constructor
	public Usecase8()
	{
		super();
	}
	//creating a parameterized constructor for my class
	public Usecase8(String firstname,String lastname,String address,String state,String city,int zip,int phonenumber,String emailid)
	{
		super();
		this.firstname=firstname;
		this.lastname=lastname;
		this.address=address;
		this.state=state;
		this.city=city;
		this.zip=zip;
		this.phonenumber=phonenumber;
		this.emailid=emailid;
	}
	}
