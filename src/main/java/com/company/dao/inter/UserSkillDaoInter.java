package main.company.dao.inter;


import main.company.entity.UserSkill;
import java.util.List;



public interface UserSkillDaoInter {

    public List<UserSkill>getAllSkillByUserId(int userId);

    public boolean insertUserSkill(UserSkill u);

    public boolean removeUserSkill(int id);

    public boolean updateUserSkill(UserSkill u);

}