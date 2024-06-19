package com.example.KTGK.repository;

import com.example.KTGK.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INhanVienRepository extends JpaRepository<NhanVien, Long> {

}
