package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsvendas.entinties.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>{

}
