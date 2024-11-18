package com.geraforca.api;

import com.geraforca.models.Cliente;
import com.geraforca.models.Oferta;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Body;

public interface ApiService {
    @GET("clientes")
    Call<List<Cliente>> getClientes();

    @POST("clientes")
    Call<Cliente> addCliente(@Body Cliente cliente);

    @GET("ofertas")
    Call<List<Oferta>> getOfertas();

    @POST("ofertas")
    Call<Oferta> addOferta(@Body Oferta oferta);
}