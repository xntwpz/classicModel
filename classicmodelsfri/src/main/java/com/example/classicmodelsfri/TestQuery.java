package com.example.classicmodelsfri;

import com.example.classicmodelsfri.entities.Office;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class TestQuery {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("OFFICE.FIND_ALL");
        List<Office> officeList = query.getResultList();
        for (Office o : officeList) {
            System.out.printf("%-2s %-25s %-12s %-10s\n",
                    o.getOfficeCode(), o.getAddressLine1(), o.getCity(), o.getCountry());
        }
        em.close();
    }
}
