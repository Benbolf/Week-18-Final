package classroom.entity;

import java.util.Set;

import classroom.dao.Teacher;
import classroom.entity.ContributorData.PetStoreResponse;

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


@Entity
@Data
public class Class {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classroomId;
	@SuppressWarnings("unused")
	private String classroomName;
	@SuppressWarnings("unused")
	private String classroomPhone;
	
@ManyToMany (cascade = CascadeType.PERSIST)
@JoinTable(name = "classroom_student",
      joinColumns = @JoinColumn(name = "classroom_id"),
      inverseJoinColumns = @JoinColumn(name = "student_id"))
      @EqualsAndHashCode.Exclude
      @ToString.Exclude
      private Set<Student> students = new HashSet<>(); 

@OneToMany(mappedBy= "classroom", cascade = CascadeType.ALL,
        orphanRemoval = true)
@EqualsAndHashCode.Exclude
@ToString.Exclude
private Set<Teacher> teacher = new HashSet<>();

public void add(ClassroomResponse classroomResponse) {
	// TODO Auto-generated method stub
	
}

public Long getClassroomId() {
	// TODO Auto-generated method stub
	return null;
}

public String getClassName() {
	// TODO Auto-generated method stub
	return null;
}






public Object getGeoLocation() {
	// TODO Auto-generated method stub
	return null;
}


}

