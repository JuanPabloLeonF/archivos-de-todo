package com.mycompany.conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Connection {

    private static Connection instance = new Connection();
    private EntityManagerFactory player;

    private Connection(){
        player = Persistence.createEntityManagerFactory("com.mycompany_main_jar_1.0-SNAPSHOTPU");
    }

    public static Connection getInstancia() {
        return instance;
    }

    public EntityManagerFactory getPlayer() {
        return player;
    }
}

