package classroom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import classroom.entity.Contributor;

public interface ContributorDao extends JpaRepository<Contributor, Long> {

}
