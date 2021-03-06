package com.usecase.hr.service.retry;

import com.usecase.exception.HRServieException;
import com.usecase.hr.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = DEFINED_PORT)
public class RetryableHRServiceTest {

    @Autowired
    private RetryableService retryableService;

    @Test
    public void findEmployee() throws HRServieException {
        Employee employee = retryableService.find(10000);

        assertNotNull(employee);
        System.out.println(employee);

        assertEquals(true, employee.getId() == 10000);
    }

    @Test
    public void findEmployeeInvalidID() throws HRServieException {
        Employee employee = retryableService.find(-1);

        assertNotNull(employee);
        System.out.println(employee);

        assertEquals(true, employee.getId() == 0);
    }
}