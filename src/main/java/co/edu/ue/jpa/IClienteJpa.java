package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.Cliente;

public interface IClienteJpa extends JpaRepository<Cliente, Integer>{

}
