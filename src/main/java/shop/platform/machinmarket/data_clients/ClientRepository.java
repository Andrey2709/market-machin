package shop.platform.machinmarket.data_clients;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    Optional<Client> findById(Integer id);
    List<Client> findAll();
    void deleteById (Integer id);

}
