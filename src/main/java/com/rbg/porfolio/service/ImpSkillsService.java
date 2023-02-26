
package com.rbg.porfolio.service;

import com.rbg.porfolio.entity.Skills;
import com.rbg.porfolio.interfaces.ISkillsService;
import com.rbg.porfolio.repository.ISkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkillsService implements ISkillsService{
    @Autowired ISkillsRepository iskillsRepository;

    @Override
    public List<Skills> getSkills() {
        List<Skills> pers = iskillsRepository.findAll();
        return pers;
    }

    @Override
    public void saveSkills(Skills skill) {
        iskillsRepository.save(skill);
    }

    @Override
    public void deleteSkills(Long id_sk) {
        iskillsRepository.deleteById(id_sk);
    }

    @Override
    public Skills findSkills(Long id_sk) {
        Skills pers = iskillsRepository.findById(id_sk).orElse(null);
        return pers;
    }
    
}
