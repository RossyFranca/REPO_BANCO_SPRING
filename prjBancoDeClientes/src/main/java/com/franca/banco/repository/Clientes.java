package com.franca.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franca.banco.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
