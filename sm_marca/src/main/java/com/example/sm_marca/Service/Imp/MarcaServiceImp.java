package com.example.sm_marca.Service.Imp;

import com.example.sm_marca.Dto.CategoriaDto;
import com.example.sm_marca.Dto.MarcaDto;
import com.example.sm_marca.Entity.Marca;
import com.example.sm_marca.Repository.MarcaRepository;
import com.example.sm_marca.Service.MarcaService;
import com.example.sm_marca.fegin.CatalogoFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImp implements MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;
    @Autowired
    private CatalogoFegin catalogoFegin;
    @Override
    public List<Marca> listar() {
        return marcaRepository.findAll();
    }

    @Override
    public MarcaDto buscarPorId(Integer id) {
        Marca marca = marcaRepository.findById(id).get();
        CategoriaDto categoriaDto = catalogoFegin.buscarPorId(marca.getIdCategoria());
        MarcaDto marcaDto = new MarcaDto();
        marcaDto.setId(marca.getId());
        marcaDto.setNombre(marca.getNombre());
        marcaDto.setDescripcion(marca.getDescripcion());
        marcaDto.setCatagoria(categoriaDto);
        return marcaDto;
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
