package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Mainusecase8 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	//creating an empty list and adding objects to them
			List<Usecase8>address=new ArrayList<>();
			address.add(new Usecase8("Aaru","Johnson","T-street","M.P","Indore",89070,89563874,"aaru@gmmail.com"));
			address.add(new Usecase8("Aarul","John","f-street","M.H","Mumbai",89074,99563874,"aarul@gmmail.com"));
			address.add(new Usecase8("Ritu","Jaiswal","link road","M.P","Indore",89050,29563874,"ritu@gmmail.com"));
			//grouping by state and city
			Map<String, Map<String, Long>> multipleFieldsMap = address.stream()
					.collect(
							Collectors.groupingBy(Usecase8::getcity, 
									Collectors.groupingBy(Usecase8::getstate, 
											Collectors.counting())));
			// printing the count based on the city and state.
			System.out.println("Group by on multiple properties" + multipleFieldsMap);
		}
}


