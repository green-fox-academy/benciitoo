package com.greenfoxacademy.trialexam.service;


import com.greenfoxacademy.trialexam.models.Alias;
import com.greenfoxacademy.trialexam.repository.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AliasService {

    private boolean isExists = false;
    private boolean success = false;
    private AliasRepository aliasRepository;

    @Autowired
    public AliasService(AliasRepository aliasRepository){
        this.aliasRepository = aliasRepository;
    }


    public void saveAlias(Alias alias){
        aliasRepository.save(alias);
    }


    public boolean containsAlias (String alias){

        List<Alias> aliases = new ArrayList<>();
        aliasRepository.findAll().forEach(aliases::add);
            Alias exist = aliases.stream().filter(a -> a.getAlias().equals(alias)).findAny().orElse(null);

            return exist != null;

    }
}