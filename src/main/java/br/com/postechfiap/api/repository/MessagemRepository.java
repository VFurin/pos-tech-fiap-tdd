package br.com.postechfiap.api.repository;

import br.com.postechfiap.api.model.Menssagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MessagemRepository extends JpaRepository<Menssagem, UUID> {
}
