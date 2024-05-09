package com.weavus.api.credit.dao;

import com.weavus.api.credit.dto.CreditInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditInfoDao extends JpaRepository<CreditInfo, String> {
}
