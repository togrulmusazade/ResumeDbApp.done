package main.company.dao.inter;

import main.company.entity.Skill;
import java.util.List;

public interface SkillDaoInter {

    public List<Skill> getAllSkill();

    public Skill getSkillById(int id);

    public boolean updateSkill(Skill s);

    public boolean removeSkill(int id);

    public boolean addSkill(Skill s);

}
