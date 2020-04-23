/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Muhamad Nur Alim
 */
public class Koneksi {
    public static Connection sambungDB() {
        String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
        String Username = "root";
        String host = "localhost";
        String port = "3306";
        String Password = "";
        String dbName = "alim";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName+"?useTimezone=true&serverTimezone=UTC";
        Connection kon = null;
        try {
            Class.forName(JDBC_DRIVER_CLASS).newInstance();
            kon= DriverManager.getConnection(url, Username, Password);

            System.out.println("finaly, koneksi berhasil");

            return kon;

        } catch (ClassNotFoundException | IllegalAccessException
                | InstantiationException | SQLException e) {
            System.err.println("Error: " + e.getMessage());

            System.exit(0);

        }
        return null;
    }
}

 