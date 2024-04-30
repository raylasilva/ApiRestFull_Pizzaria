package com.soulcode.ApiRestFull.Repositories;

import com.soulcode.ApiRestFull.Models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
