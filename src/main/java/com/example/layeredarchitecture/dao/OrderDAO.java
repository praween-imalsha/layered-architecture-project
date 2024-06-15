package com.example.layeredarchitecture.dao;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrderDAO {
    public int save(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException ;
    public String generateNewOrderId() throws SQLException, ClassNotFoundException, SQLException ;

    public boolean orderIdExists(String orderId) throws SQLException, ClassNotFoundException ;
}
