package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderdetailDAO {
    public boolean addOrderDetails(String orderId, OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException, SQLException ;
}
