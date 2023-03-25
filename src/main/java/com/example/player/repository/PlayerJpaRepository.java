package com.example.player.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.player.model.*;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerJpaRepository extends JpaRepository<Player,Integer>{

}