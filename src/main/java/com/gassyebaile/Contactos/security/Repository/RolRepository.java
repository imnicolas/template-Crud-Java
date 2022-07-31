
package com.gassyebaile.Contactos.security.Repository;

import com.gassyebaile.Contactos.security.Entity.Rol;
import com.gassyebaile.Contactos.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
