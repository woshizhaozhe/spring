package com.neusoft.ms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.neusoft.ms.mapper.EmpMapper;
import com.neusoft.ms.po.Emp;
import com.neusoft.ms.service.EmpService;

@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp getEmpById(int empno) {
        return empMapper.getEmpById(empno);
    }

    @Override
    @Transactional
    public int transferAccounts(Emp emp1, Emp emp2) {
        empMapper.updateEmp(emp1);
//int num = 10/0;
        empMapper.updateEmp(emp2);
        return 0;
    }
}