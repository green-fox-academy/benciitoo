package com.greenfox.repository;

import com.greenfox.models.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends JpaRepository<Assignee, Long> {

    //List<Assignee> findAllByOrderByName(); UGYANAZ, MINT A KÖVETKEZŐ

    @Query(
            value = "SELECT * FROM assignee ORDER BY name",
            nativeQuery = true)
    List<Assignee> findAllAssignees();
}
