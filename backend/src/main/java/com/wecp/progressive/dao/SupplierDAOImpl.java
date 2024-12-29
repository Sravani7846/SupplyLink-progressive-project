package com.wecp.progressive.dao;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.wecp.progressive.entity.Supplier;

public class SupplierDAOImpl implements SupplierDAO{
    private Connection connection;
    public SupplierDAOImpl() throws IOException, SQLException{
        this.connection = DatabaseConnectionManager.getConnection();
    }
    @Override
    public void addSupplier(Supplier supplier){
        String sql = "INSERT INTO Supplier (supplierName, contactEmail, contactPhone, address, role)VALUES(?,?,?,?,?)";
        try(PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setString(1,supplier.getSupplierName());
            stmt.setString(2,supplier.getContactEmail());
            stmt.setString(3,supplier.getContactPhone());
            stmt.setString(4,supplier.getAddress());
            stmt.setString(4,supplier.getRole());
        }
    }
}
