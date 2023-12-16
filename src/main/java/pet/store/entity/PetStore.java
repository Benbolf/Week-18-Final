package pet.store.entity;

import java.util.Set;
import java.util.HashSet;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import pet.store.entity.ContributorData.PetStoreResponse;


@Entity
@Data
public class PetStore {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long petStoreId;
	private String petStoreName;
	private String petStoreAdresss;
	private String petStoreCity;
	private String petStoreZip;
	private String petStoreState;
	private String petStorePhone;
	
@ManyToMany (cascade = CascadeType.PERSIST)
@JoinTable(name = "pet_store_customer",
      joinColumns = @JoinColumn(name = "pet_store_id"),
      inverseJoinColumns = @JoinColumn(name = "customer_id"))
      @EqualsAndHashCode.Exclude
      @ToString.Exclude
      private Set<Customer> customers = new HashSet<>(); 

@OneToMany(mappedBy= "petStore", cascade = CascadeType.ALL,
        orphanRemoval = true)
@EqualsAndHashCode.Exclude
@ToString.Exclude
private Set<Employee> employees = new HashSet<>();

public void add(PetStoreResponse petStoreResponse) {
	// TODO Auto-generated method stub
	
}

public Long getPetStoreId() {
	// TODO Auto-generated method stub
	return null;
}

public String getStoreName() {
	// TODO Auto-generated method stub
	return null;
}

public String getDirections() {
	// TODO Auto-generated method stub
	return null;
}

public String getStateOrProvince() {
	// TODO Auto-generated method stub
	return null;
}

public String getCountry() {
	// TODO Auto-generated method stub
	return null;
}

public Object getGeoLocation() {
	// TODO Auto-generated method stub
	return null;
}


}

