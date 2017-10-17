package com.alienlab.my.repository;

import com.alienlab.my.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {
    OrderInfo findOrderInfoByUserInfoIdAndLibraryID(String readerId,String libraryId);
    List<OrderInfo> findOrderByUserInfoId(String readerId);
}
