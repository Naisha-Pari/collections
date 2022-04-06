package collection;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.lang.*;
public class Usecase7 {
	   int perId;
	    String Name;
	    String Address;
	    public int getPerId() {
	        return perId;
	    }
	    public void setPerId(int PerId) {
	        this.perId = perId;
	    }
	    public String getpName() {
	        return Name;
	    }
	    public void pName(String Name) {
	        this.Name = Name;
	    }
	    public String getAdd(){
	    	return Address;
	    }
	    public void Add(String Address){
	    	this.Address=Address;
	    }
	    public Usecase7(int perId, String Name, String Address) {
	        this.perId = perId;
	        this.Name = Name;
	        this.Address = Address;
	 
}
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Usecase7 addr = (Usecase7) o;
	        return perId == addr.perId &&
	                Name.equals(addr.Name) &&
	                Address.equals(addr.Address);
	    }
	    @Override
	    public int hashCode() {
	        return Objects.hash(perId, Name, Address);
	    }
	 
	   
	    public static void main(String args[]){
	    	 List<Usecase7> people = new ArrayList<>();
	         people.add(new Usecase7(01, "Smith","ttt"));
	         people.add(new Usecase7(02,"John", "Scott"));
	         people.add(new Usecase7(03,"Jack", "First"));
	         people.add(new Usecase7(01,"John", "Walker"));
	         people.add(new Usecase7(05,"Jack", "Black"));
	         people.stream().collect(Collectors.groupingBy(Function.identity(),
	                 Collectors.counting()))
	                 .entrySet().stream()
	                 .filter(e -> e.getValue() > 1L)
	                 .map(e -> e.getKey())
	                 .collect(Collectors.toList())
	                 .forEach(addr -> System.out.println(addr.getPerId()+"==>"+addr.getpName()));
	        	}
	    }

