package com.greenfox.error.repository;

import com.greenfox.error.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FinderRepository extends JpaRepository<User, Long> {
    public List<User> findAllByOrderByIdAsc();
}
