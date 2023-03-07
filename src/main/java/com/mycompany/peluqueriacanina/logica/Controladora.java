package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String areaObservaciones, String alergico, String atencionEspecial, String nombreDuenio, String cel) {

        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(cel);

        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setAtencion_Especial(atencionEspecial);
        masco.setObservaciones(areaObservaciones);
        masco.setUnDuenio(duenio);

        controlPersis.guardar(duenio, masco);

    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascotas(int num_cliente) {
        controlPersis.borrarMascotas(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String areaObservaciones, String alergico, String atencionEspecial, String nombreDuenio, String cel) {
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(areaObservaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_Especial(atencionEspecial);

        //modifico a la moscota
        controlPersis.modificarMascota(masco);
        //aca seteo valores del dueno
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_Duenio());
        dueno.setCelDuenio(cel);
        dueno.setNombre(nombreDuenio);
        
        //llamar al modificar Dueño
        this.modificarDuenio(dueno);

    }

    private Duenio buscarDuenio(int id_Duenio) {
        return controlPersis.traerDuenio(id_Duenio);
       
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
}
