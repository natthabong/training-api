package gec.scf.training.restapi.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gec.scf.training.restapi.product.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
