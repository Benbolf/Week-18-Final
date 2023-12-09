package pet.store.entity;

import org.springframework.boot.SpringApplication;



@ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)
public class Customer {
   public static void main(String[] args) {
	SpringApplication.run(Customer.class, args);
 } 

}
