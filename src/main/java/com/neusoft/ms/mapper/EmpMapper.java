package com.neusoft.ms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.neusoft.ms.po.Emp;

@Mapper
public interface EmpMapper {
    @Select("select * from emp where empno=#{empno}")
    public Emp getEmpById(int empno);

    @Update("update emp set sal=sal+#{sal} where empno=#{empno}")
    public int updateEmp(Emp emp);
}