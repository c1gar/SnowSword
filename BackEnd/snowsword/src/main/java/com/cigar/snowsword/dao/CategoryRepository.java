package com.cigar.snowsword.dao;

import com.cigar.snowsword.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
