/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author David
 */
public class AsignaturaServiceImpl implements  AsignaturaService{
public List<Asignatura> asiganturaList;
    @Override
    public void crear(Asignatura asignatura) {
        this.asiganturaList.add(asignatura);
    }

    @Override
    public List<Asignatura> listar() {
        return this.asiganturaList;
    }
    
}
