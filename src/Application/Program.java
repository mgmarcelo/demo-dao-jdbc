package Application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(8, "Marcelo", "marcelo@gmail.com", new Date(),15000.0, obj);
		
		
		System.out.println(seller);
	}

}
