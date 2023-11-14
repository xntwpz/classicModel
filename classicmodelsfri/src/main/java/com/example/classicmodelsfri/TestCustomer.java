package com.example.classicmodelsfri;

import com.example.classicmodelsfri.entities.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer");
        EntityManager em = emf.createEntityManager();
        System.out.print("Find customer : ");
        String x = new Scanner(System.in).next();
        Customer customer = em.find(Customer.class,x);
        if(customer==null){
            System.out.println("Dont have this customer");
        } else {
            System.out.println(customer);
        }
        emf.close();
        em.close();
    }
}
