package com.cigar.snowsword.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cigar.snowsword.model.DatabaseConf;

import java.util.List;

public interface DatabaseConfRepository extends JpaRepository<DatabaseConf, Integer> {
    public List<DatabaseConf> findDatabaseConfsByWebshell_Id(int id);
}
