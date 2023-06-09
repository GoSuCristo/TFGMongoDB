package com.gosucristo.TFG.repository;

import com.gosucristo.TFG.entities.Socio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ISocioRepository extends MongoRepository<Socio, String> {

}
