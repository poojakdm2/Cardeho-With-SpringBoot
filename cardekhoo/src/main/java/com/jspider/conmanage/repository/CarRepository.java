package com.jspider.conmanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jspider.conmanage.pojo.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

	Car findCarByBrand(String brand);

}
