// nhớ sửa ở file persitance.xml, pom.xml 
package model;

import jakarta.persistence.*;

import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("model");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<KhachHang> query = entityManager.createQuery("Select s from KhachHang s", KhachHang.class);
        List<KhachHang> list = query.getResultList();
        for (KhachHang khachHang : list) {
            System.out.println(khachHang.getDiaChi());
        }
    }
}
