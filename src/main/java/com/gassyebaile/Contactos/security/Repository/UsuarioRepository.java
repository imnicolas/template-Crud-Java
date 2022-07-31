
package com.gassyebaile.Contactos.security.Repository;

import com.gassyebaile.Contactos.security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
boolean existsByNombreUsuario(String nombreUsuario);
boolean existsByEmail(String email);
}
