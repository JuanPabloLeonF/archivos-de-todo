package com.mycompany.controlador;

import com.mycompany.conexion.Connection;
import com.mycompany.model.Player;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class PlayerController {
   
    public void create(Player player){
        
        EntityManager entityManager = entityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(player);
            entityManager.getTransaction().commit();
            System.out.println("Player created successfully");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }
    
    public void update(Player player){
        
        EntityManager entityManager = entityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(player);
            entityManager.getTransaction().commit();
            System.out.println("Player updated successfully");
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }
    
    public void delete(int id){
        
        EntityManager entityManager = entityManager();
        try {
            entityManager.getTransaction().begin();
            Player player = entityManager.find(Player.class,id);

            if (player != null) {
                entityManager.remove(player);
                System.out.println("Player deleted successfully");
            }
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    public List<Player> getAllPlayers(){
        
        Query query = entityManager().createQuery("SELECT p FROM Player p");
        System.out.println("List of players: ");
        return query.getResultList();
    }
    
    public List<Player> searchPlayerByName(String name){
        
        Query query = entityManager().createQuery("SELECT p FROM Player p WHERE p.name = :name");
        query.setParameter("name", name);
        System.out.println("Informacion de jugador encontrado por: " + name);
        return query.getResultList();
    }
    
    public List<Player> searchPlayerByGender(String gender){
        
        Query query = entityManager().createQuery("SELECT j FROM Player j WHERE j.gender = :gender");
        query.setParameter("gender", gender);
        System.out.println("Player information found by gender: " + gender);
        return query.getResultList();
    }
    
    public List<Player> searchPlayerByHeightRange(double minHeight, double maxHeight){
        
        Query query = entityManager().createQuery("SELECT j FROM Player j WHERE j.height >= :minHeight AND j.height <= :maxHeight");
        query.setParameter("minHeight", minHeight);
        query.setParameter("maxHeight", maxHeight);
        System.out.println("Player information found between heights: " + minHeight + " y " + maxHeight + ": ");
        return query.getResultList();
    }
    
    public List<Player> searchPlayerByAgeRange(int minAge, int maxAge){
        
        Query query = entityManager().createQuery("SELECT j FROM Player j WHERE j.age >= :minAge AND j.age <= :maxAge");
        query.setParameter("minAge", minAge);
        query.setParameter("maxAge", maxAge);
        System.out.println("Player information found between ages: " + minAge + " y " + maxAge + ": ");
        return query.getResultList();
    }
    
    private EntityManager entityManager(){
        return Connection.getInstancia().getPlayer().createEntityManager();
    }
}
