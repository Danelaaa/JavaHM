package ge.ibsu.demo.repositories;

import java.util.List;

import ge.ibsu.demo.entities.Actor;

public class ActorRepository extends JpaRepository<Actor, Long> {

    public List<ge.ibsu.demo.dto.Actor> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
    
}
