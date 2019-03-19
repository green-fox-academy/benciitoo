package com.greenfoxacademy.trialexam.repository;

import com.greenfoxacademy.trialexam.models.Alias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliasRepository extends CrudRepository <Alias, Long> {

    Alias findByAlias(String aliasName);

    boolean existsById(long id);

  /*  @Query(value = "SELECT * FROM links WHERE alias = :alias;", nativeQuery = true)
        public int[] searchByAlias(@Param("alias") String alias);
*/
}