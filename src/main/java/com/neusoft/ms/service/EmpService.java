package com.neusoft.ms.service;

import com.neusoft.ms.po.Emp;

public interface EmpService {
    public Emp getEmpById(int empno);

    public int transferAccounts(Emp emp1, Emp emp2);
}