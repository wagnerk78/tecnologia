package com.supera.tecnologia.repository;

import com.supera.tecnologia.model.Listas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ListasRepository extends JpaRepository<Listas, UUID> {
}
