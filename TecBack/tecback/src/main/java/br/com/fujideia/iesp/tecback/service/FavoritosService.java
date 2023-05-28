package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Favoritos;
import br.com.fujideia.iesp.tecback.repository.FavoritosRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class FavoritosService {
    @Autowired
    private FavoritosRepository repository;
    public Favoritos salvar(Favoritos favoritos){
        favoritos = repository.save(favoritos);
        return favoritos;
    }
    public Favoritos alterar(Favoritos favoritos){
        if (Objects.nonNull(favoritos.getId())){
            favoritos = repository.save(favoritos);
        }else{
            throw new NotFoundException();
        }
        return favoritos;
    }
    public List<Favoritos> listar(){
        return repository.findAll();
    }
    public Boolean excluir(Integer id){
        try{
            repository.deleteById(id);
        }catch(Exception e){
            log.info("Erro ao tentar excluir : {}", e);
            return false;
        }
        return true;
    }
    public Favoritos consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
