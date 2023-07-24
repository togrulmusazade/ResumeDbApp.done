package main.company.main;

import main.company.dao.impl.CountryDaoImpl;
import main.company.dao.impl.EmploymentHistoryDaoImpl;
import main.company.dao.impl.SkillDaoImpl;
import main.company.dao.impl.UserDaoImpl;
import main.company.dao.impl.UserSkillDaoImpl;
import main.company.dao.inter.CountryDaoInter;
import main.company.dao.inter.EmploymentHistoryDaoInter;
import main.company.dao.inter.SkillDaoInter;
import main.company.dao.inter.UserDaoInter;
import main.company.dao.inter.UserSkillDaoInter;



public class Context {
    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }

    public static CountryDaoInter instanceCountryDao(){
        return new CountryDaoImpl();
    }
    public static SkillDaoInter instanceSkillDao(){
        return new SkillDaoImpl();
    }
    public static EmploymentHistoryDaoInter instanceEmploymentHistoryDao(){
        return new EmploymentHistoryDaoImpl();
    }
    public static UserSkillDaoInter instanceUserSkillDao(){
        return new UserSkillDaoImpl();
    }

}
