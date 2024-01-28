package classroom.entity;

public @interface JoinTable {

	String name();

	JoinColumn joinColumns();

	JoinColumn inverseJoinColumns();

}
