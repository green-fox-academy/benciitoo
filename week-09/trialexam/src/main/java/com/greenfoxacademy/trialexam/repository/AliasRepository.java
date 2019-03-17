package com.greenfoxacademy.trialexam.repository;

import com.greenfoxacademy.trialexam.models.Alias;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AliasRepository extends CrudRepository <Alias, Long> {

    Alias findByAlias(String aliasName);


  /*  @Query(value = "SELECT * FROM alias WHERE alias.alias LIKE :alias", nativeQuery = true)
        boolean findAliasByAlias(@Param("alias") String alias);
*/
}