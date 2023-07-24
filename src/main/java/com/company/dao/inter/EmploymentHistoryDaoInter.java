package main.company.dao.inter;

import main.company.entity.EmploymentHistory;

import java.util.List;

public interface EmploymentHistoryDaoInter {

    public List<EmploymentHistory>getAllEmploymentHistoryByUserId(int userId);



}