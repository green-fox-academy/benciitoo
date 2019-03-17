package com.greenfox.services;

import com.greenfox.models.Assignee;
import com.greenfox.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeService {

    private AssigneeRepository assigneeRepository;
    private Assignee tempAssignee;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }


    public Assignee getTempAssignee() {
        return tempAssignee;
    }

    public void setTempAssignee(Assignee tempAssignee) {
        this.tempAssignee = tempAssignee;
    }

    public List<Assignee> findAll() {
        return assigneeRepository.findAll();
    }

    public List<Assignee> findAllAssignees() {
        return assigneeRepository.findAllAssignees();
    }

    public void saveAssignee(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public void deleteAssignee(long id) {
        assigneeRepository.deleteById(id);
    }

    public Assignee findAssigneeById(long id) {
        return assigneeRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    public void saveEditedNamedAssignee(String editedName) {
        tempAssignee.setName(editedName);
        saveAssignee(tempAssignee);
    }
}