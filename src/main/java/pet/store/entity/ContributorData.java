package pet.store.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import pet.store.entity.Contributor;
import pet.store.entity.Geolocation;


import java.util.HashSet;
import java.util.Set;

import lombok.Data;


@Data
@NoArgsConstructor
public class ContributorData {
	private Long contributorId;
	private String contributorName;
	private String contributorEmail;
	private Set <PetStoreResponse>  petStores =  new HashSet<>();
	
	
	public ContributorData(Contributor save) {
	   contributorId = Contributor.getContributororId();	
	   contributorName = Contributor.getContributorName();
	   contributorEmail = Contributor.getContributorEmail();
	   
	   
	   for(PetStore petStore : Contributor.getPetStore()) {
		   petStore.add(new PetStoreResponse(petStore));
	   }
	}
	
	@Data
	@NoArgsConstructor
	static class PetStoreResponse {
		private Long petStoreId;
		private String storeName;
		private String directions;
		private String stateOrProvince;
		private String country;
	    private GeoLocation geoLocation;
	    private Set<String> amenities = new HashSet<>();
	    
	    PetStoreResponse(PetStore petStore) {
	       petStoreId = petStore.getPetStoreId();
	       storeName = petStore.getStoreName();
	       directions = petStore.getDirections();
	       stateOrProvince = petStore.getStateOrProvince();
	       country = petStore.getCountry();
	       geoLocation = new GeoLocation(petStore.getGeoLocation());
	       
	       
	       for(Amenity amentity : petPark.getAmenities()) {
	    	   amenities.add(amenity.getAmenity());
	       }
	    }
	    
	    
	}
	
	
}