package net.javaguides.springboot_dto_tutorial.repository;

import net.javaguides.springboot_dto_tutorial.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
