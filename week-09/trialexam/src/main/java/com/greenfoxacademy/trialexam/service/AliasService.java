package com.greenfoxacademy.trialexam.service;

import com.greenfoxacademy.trialexam.models.Alias;
import com.greenfoxacademy.trialexam.models.ServiceHelper;
import com.greenfoxacademy.trialexam.repository.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AliasService {

    private Alias tempAlias;
    private AliasRepository aliasRepository;
    private ServiceHelper serviceHelper;


    @Autowired
    public AliasService(AliasRepository aliasRepository){
        this.aliasRepository = aliasRepository;
        this.serviceHelper = new ServiceHelper(false,false,false);
    }


    public void saveNewAlias(Alias alias){
        tempAlias = null;
        if(aliasRepository.findByAlias(alias.getAlias()) == null) {
            serviceHelper.setSuccess(true);
            serviceHelper.setRedirected(true);
            save(alias);
            tempAlias = alias;
            System.out.println("Alias not found in repo");
        } else {
            serviceHelper.setExists(true);
            serviceHelper.setRedirected(true);
            tempAlias = alias;
        }
    }


    public boolean containsAlias(String aliasToFind){
        boolean exists = false;
        if (aliasRepository.findByAlias(aliasToFind) == null){
            return exists = false;
        } else {
            return true;
        }
    }


    public Alias findAlias(String alias){
        tempAlias = null;
        try {
            tempAlias = aliasRepository.findByAlias(alias);
        } catch (RuntimeException ex) {
            System.out.println("There is no Alias found by this alias.");
        }
        return tempAlias;
    }


    public void save(Alias alias){
        aliasRepository.save(alias);
    }


    public Alias getTempAlias() {
        return tempAlias;
    }

    public void setTempAlias(Alias tempAlias) {
        this.tempAlias = tempAlias;
    }

    public ServiceHelper getServiceHelper() {
        return serviceHelper;
    }

    public void setServiceHelper(ServiceHelper serviceHelper) {
        this.serviceHelper = serviceHelper;
    }


    /* public boolean containsAlias (String alias){
        List<Alias> aliases = new ArrayList<>();
        aliasRepository.findAll().forEach(aliases::add);
            Alias exist = aliases.stream().filter(a -> a.getAlias().equals(alias)).findAny().orElse(null);
            return exist != null;
    }*/
}