package pet.store.entity;

public @interface ManyToMany {

	String cascade();

	String mappedBy();

}
