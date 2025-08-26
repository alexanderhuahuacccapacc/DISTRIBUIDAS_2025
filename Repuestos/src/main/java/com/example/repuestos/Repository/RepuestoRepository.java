package com.example.repuestos.Repository;

import com.example.repuestos.Entity.Repuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepuestoRepository extends JpaRepository<Repuesto, Integer> {
}
