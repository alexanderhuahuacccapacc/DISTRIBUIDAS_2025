package com.example.webcontabilidad.Service;

import com.example.webcontabilidad.excepcion.CustomResponse;

import java.util.List;

public interface ICrudGenericoService<T,ID> {
    T save(T t);
    T update(ID id, T t);
    List<T> findAll();
    T findById(ID id);
    CustomResponse delete(ID id);

}
