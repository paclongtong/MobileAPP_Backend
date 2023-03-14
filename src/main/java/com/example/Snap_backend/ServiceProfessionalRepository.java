package com.example.Snap_backend;

import retrofit2.http.Query;

import java.util.List;

public interface ServiceProfessionalRepository extends JpaRepository<ServiceProfessional, Long> {
    @Query("SELECT s FROM ServiceProfessional s WHERE s.serviceSubcategory = :subCategory")
    List<ServiceProfessional> findByServiceSubcategory(@Param("subCategory") String subCategory);
}


