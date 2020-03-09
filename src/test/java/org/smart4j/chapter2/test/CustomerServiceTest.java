package org.smart4j.chapter2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter1.Model.Customer;
import org.smart4j.chapter1.Service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CustomerService的单元测试
 */
public class CustomerServiceTest {
    private final CustomerService service=new CustomerService();

    /**
     * 初始化数据库
     */
    @Before
    public void init() {

    }
    @Test
    public void getCustomerListTest() throws Exception{
        List<Customer> customerList = service.getCustomerList("");
        Assert.assertEquals(2,customerList.size());
    }

    @Test
    public void createCustomerTest(){
        Map<String,Object> map=new HashMap<>();
        map.put("name","customer100");
        map.put("contact","John");
        map.put("telephone","13512345678");
        boolean result = service.createCustomer(map);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest(){
        long id=1;
        boolean result = service.deleteCustomer(id);
        Assert.assertTrue(result);

    }

}
