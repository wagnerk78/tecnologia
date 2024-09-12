//package com.supera.tecnologia.repository;
//
//import com.supera.tecnologia.model.Itens;
//import com.supera.tecnologia.model.Listas;
//import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.List;
//
//public interface ItensRepository extends JpaRepository<Itens, Long> {
//    List<Itens> findByLista(Listas lista);
//}
package com.supera.tecnologia.repository;

import com.supera.tecnologia.model.Itens;
import com.supera.tecnologia.model.Listas;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface ItensRepository extends JpaRepository<Itens, UUID> {
    List<Itens> findByLista(Listas lista);
}
