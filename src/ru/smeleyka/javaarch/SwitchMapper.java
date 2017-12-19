package ru.smeleyka.javaarch;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * Created by smeleyka on 19.12.17.
 */
public class SwitchMapper {
    private Connection connection;

    public SwitchMapper(Connection connection) {
        this.connection = connection;
    }

//    public Switch findById(int id){
//        return new Switch();
//    }

    public ArrayList<Switch> findByVendor(String vendor){
        return new ArrayList<Switch>();
    }

    public ArrayList<Switch> findByLocation(String vendor){
        return new ArrayList<Switch>();
    }

    public void insert(Switch item){

    }

    public void update(Switch item){

    }

    public void delete(Switch item){

    }

}
