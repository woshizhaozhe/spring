package com.neusoft.ms;

import com.neusoft.ms.po.Emp;
import com.neusoft.ms.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mstest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmpService service = (EmpService) context.getBean("empService");
            Emp emp1 = new Emp();
            emp1.setEmpno(7499);
            emp1.setSal(-500.0);
            Emp emp2 = new Emp();
            emp2.setEmpno(7521);
            emp2.setSal(500.0);
            service.transferAccounts(emp1, emp2);
    }
}
