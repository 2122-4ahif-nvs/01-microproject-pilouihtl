package at.htl.cardealer.controller;

import at.htl.cardealer.entity.Car;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class CarRepository {
    @Inject
    EntityManager em;

    public Car save(Car c){
        return em.merge(c);
    }
}
