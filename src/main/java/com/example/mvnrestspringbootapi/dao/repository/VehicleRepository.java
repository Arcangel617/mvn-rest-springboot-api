package com.example.mvnrestspringbootapi.dao.repository;

import com.example.mvnrestspringbootapi.dao.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
