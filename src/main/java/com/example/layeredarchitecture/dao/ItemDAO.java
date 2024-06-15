package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    public void SaveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    public void UpdateItem (ItemDTO itemDTO) throws SQLException,ClassNotFoundException;
    public void DeleteItem (String code) throws SQLException,ClassNotFoundException;
    public boolean exitItem (String code) throws SQLException,ClassNotFoundException;
    public ItemDTO findItem (String code) throws SQLException ,ClassNotFoundException;
    public String nextId() throws SQLException, ClassNotFoundException;
    public ItemDTO getAllItems(String newItemCode) throws SQLException, ClassNotFoundException;
    public ArrayList<ItemDTO> getAllItemIds() throws SQLException, ClassNotFoundException;
}
