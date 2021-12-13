package model.repository.impl;

import model.bean.Product;
import model.repository.IProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private DBConnection dbConnection = new DBConnection();
    private static final String SELECT_ALL_PRODUCT = "select * from product";
    private static final String INSERT_PRODUCT = "insert into product(name,price,quanlity,color,notes,product_category)" + "values(?,?,?,?,?,?,?)";
    private static final String UPDATE_PRODUCT = "update product set name=?,price=?,quanlity=?,color=?,notes=?,product_category=? where id=?";
    private static final String DELETE_PRODUCT = "delete from product where id=?";

    @Override
    public List<Product> listProduct() {
        List<Product> list=new ArrayList<>();
        Connection connection = null;
        connection = dbConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                float price=resultSet.getFloat("price");
                float quanlity=resultSet.getFloat("quanlity");
                String color=resultSet.getString("color");
                String notes=resultSet.getString("notes");
                int product_category=resultSet.getInt("product_category");
                Product newProduct=new Product(name,price,quanlity,color,notes,product_category);
                list.add(newProduct);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;

}


    @Override
    public boolean addProduct(Product product) {
        boolean wasAddProduct=false;
        Connection connection=null;
        connection=dbConnection.getConnection();

        try {
            PreparedStatement preparedStatement=connection.prepareStatement(INSERT_PRODUCT);
            preparedStatement.setString(1,product.getName());
            preparedStatement.setFloat(2,product.getPrice());
            preparedStatement.setFloat(3,product.getQuality());
            preparedStatement.setString(4,product.getColor());
            preparedStatement.setString(5,product.getNotes());
            preparedStatement.setInt(5,product.getCategoryId());
            preparedStatement.setInt(6,product.getId());
            wasAddProduct=preparedStatement.executeUpdate()>0;

            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return wasAddProduct;
    }

    @Override
    public boolean editProduct() {
        return false;
    }

    @Override
    public boolean deleteProduct() {
        return false;
    }

    @Override
    public boolean searchProduct(String name) {
        return false;
    }
}
