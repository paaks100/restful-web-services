package com.paaks.rest.webservices.restful_web_services.jpa;

import com.paaks.rest.webservices.restful_web_services.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    public List<Todo> findByUsername(String username);
}
