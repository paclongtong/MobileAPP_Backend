package com.example.Snap_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

@Service

public class ServiceProfessionalService {
    @Autowired
    private ApiService apiService;

    public List<ServiceProfessional> getServiceProfessionalsBySubcategory(String subCategory) {
        Call<List<ServiceProfessional>> call = apiService.getServiceProfessionalFromCategory(subCategory);
        try {
            Response<List<ServiceProfessional>> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                throw new RuntimeException(response.message());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
