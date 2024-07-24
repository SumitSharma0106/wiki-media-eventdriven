package com.wikimedia.consumer.repository;

import com.wikimedia.consumer.model.Wikimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaRepository extends JpaRepository<Wikimedia,Long> {
}
