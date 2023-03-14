package com.example.Snap_backend;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
public interface ApiService {
    @Headers("Accept-Language: en-SE")
    @GET("serviceProfessionals")
    Call<List<ServiceProfessional>> getServiceProfessionalFromCategory(@Query("service_subcategory") String subCategory);
}
