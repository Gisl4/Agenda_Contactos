package glr.contactos.servicio;

import glr.contactos.modelo.Contacto;
import java.util.List;

public interface IContactoServicio {
    public List<Contacto> listarContactos();

    public Contacto buscarContactoPorId(Integer idContacto);

    public void guardarContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);
}
