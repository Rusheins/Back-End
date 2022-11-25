package BackEnd.Agus.security.Service;

import BackEnd.Agus.security.Entity.Usuario;
import BackEnd.Agus.security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
   @Autowired
   IUsuarioRepository IusuarioRepository;
   
   public Optional<Usuario> getByNombreUsuario(String NombreUsuario){
       return IusuarioRepository.findByNombreUsuario(NombreUsuario);
   }
   public boolean existsByNombreUsuario (String nombreUsuario){
      return IusuarioRepository.existsByNombreUsuario(nombreUsuario);
   }
    public boolean existsByEmail (String email){
      return IusuarioRepository.existsByEmail(email);
   }
    public void save(Usuario usuario){
            IusuarioRepository.save(usuario);
    }
}