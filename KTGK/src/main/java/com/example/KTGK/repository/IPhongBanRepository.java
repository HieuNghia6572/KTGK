package com.example.KTGK.repository;

import com.example.KTGK.entity.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongBanRepository extends JpaRepository<PhongBan,Long> {
}
