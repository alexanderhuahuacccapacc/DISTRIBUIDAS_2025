package com.example.webcontabilidad.Service.Imp;

import com.example.webcontabilidad.Repository.ICrudGenericoRepository;
import com.example.webcontabilidad.Service.ICrudGenericoService;
import com.example.webcontabilidad.excepcion.CustomResponse;
import com.example.webcontabilidad.excepcion.ModelNotFoundException;

import java.time.LocalDateTime;
import java.util.List;

public abstract class CrudGenericoServiceImp<T,ID> implements
        ICrudGenericoService<T,ID> {
    protected abstract ICrudGenericoRepository<T,ID> getRepo();
    @Override
    public T save(T t) {
        return getRepo().save(t);
    }
    @Override
    public T update(ID id, T t) {
        getRepo().findById(id).orElseThrow(() -> new
                ModelNotFoundException("ID NOT FOUND: " + id));
        return getRepo().save(t);
    }
    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }
    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElseThrow(() -> new
                ModelNotFoundException("ID NOT FOUND: " + id));
    }
    @Override
    public CustomResponse delete(ID id) {
        getRepo().findById(id).orElseThrow(() -> new ModelNotFoundException("ID NOT FOUND: " + id));
        getRepo().deleteById(id);
        CustomResponse cer=new CustomResponse();
        cer.setStatusCode(200);
        cer.setDatetime(LocalDateTime.now());
        cer.setMessage("true");
        cer.setDetails("Todo Ok");
        return cer;
    }

}
