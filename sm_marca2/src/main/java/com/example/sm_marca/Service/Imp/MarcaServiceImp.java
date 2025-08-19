package com.example.sm_marca.Service.Imp;

import com.example.sm_marca.Entity.Marca;
import com.example.sm_marca.Repository.MarcaRepository;
import com.example.sm_marca.Service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImp implements MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public List<Marca> listar() {
        return marcaRepository.findAll();
    }

    @Override
    public Optional<Marca> buscarPorId(Integer id) {
        return marcaRepository.findById(id);
    }

    @Override
    public Marca guardar(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public Marca actualizar(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public void borrarPorId(Integer id) {
        marcaRepository.deleteById(id);
    }
}
