package gec.scf.training.restapi.order.repository;

import org.springframework.data.repository.CrudRepository;

import gec.scf.training.restapi.order.domain.Order;

public interface OrderRepository extends CrudRepository<Order, String> {

}
