package ru.smeleyka.javaarch;

import javax.xml.crypto.Data;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by smeleyka on 19.12.17.
 */
public class Main {
    private final static String FILENAME = "test.db";

    public static void main(String[] args) {
        createNewDatabase(FILENAME);
    }

    public static void createNewDatabase(String filename) {
        File file = new File(FILENAME);
        if (!file.exists()) {
            String url = "jdbc:sqlite:" + filename;
            try (Connection connection = DriverManager.getConnection(url)) {
                if (connection != null) {
                    DatabaseMetaData meta = connection.getMetaData();
                    System.out.println("The Driver name is " + meta.getDriverName());
                    System.out.println("A new database has been created.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.printf("Can't create, DB is exists.");
        }
    }

    public static void deleteDb (String filename){
        File file = new File(FILENAME);
        if (file.delete()){
            System.out.println("DB deleted.");
        }
        else {
            System.out.print("Can't delete DB.");
            if (!file.exists()) {
                System.out.print(" File not exists.");
            }
            System.out.println();
        }
    }

}
