package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

    public void SaveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public void UpdateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public boolean exitCustomer(String id) throws SQLException, ClassNotFoundException;

    public void DeleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public ArrayList<CustomerDTO> getCustomerIds() throws SQLException, ClassNotFoundException;

    public String nextId() throws SQLException, ClassNotFoundException;


}

