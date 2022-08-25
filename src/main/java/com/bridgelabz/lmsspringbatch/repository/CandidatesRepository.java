package com.bridgelabz.lmsspringbatch.repository;

import com.bridgelabz.lmsspringbatch.entity.Candidates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatesRepository extends JpaRepository<Candidates,Long> {
}