package pet.store.entity;

import org.springframework.boot.autoconfigure.cache.CacheType;

public class PetStore {
	@ManyToMany(cascade = CacheType.PERSIST, mappedBy = "")

	@JoinTable(name = "pet_store_customer", joinColumns = @JoinColumn(name = "pet_store_id"), inverseJoinColumns = @JoinColumn(name = "customer_id")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
