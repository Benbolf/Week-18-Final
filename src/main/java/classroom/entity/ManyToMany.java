package classroom.entity;

public @interface ManyToMany {

	String cascade();

	String mappedBy();

}
