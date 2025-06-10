package com.hojeonde.hoje.repositories;

import com.hojeonde.hoje.models.Local.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends JpaRepository<Local, String> {
}
