package org.smart4j.chapter1.Service;


import org.smart4j.chapter1.Model.Customer;
import org.smart4j.chapter1.helper.DataBaseHelper;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public class CustomerService {
    /**
     * 获取客户列表
     * @return
     */
    public List<Customer> getCustomerList() {
        Connection conn= DataBaseHelper.getConnection();
        String sql="SELECT * FROM customer";
        return DataBaseHelper.queryEntityList(Customer.class,sql,conn);
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id){
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String,Object> fieldMap){
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        return false;
    }

}
