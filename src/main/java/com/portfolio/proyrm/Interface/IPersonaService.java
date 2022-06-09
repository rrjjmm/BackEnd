
package com.portfolio.proyrm.Interface;

import com.portfolio.proyrm.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getpersona();
    public void savePersona(Persona persona);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
    
}
