package com.b0ve.simuladores.sucutucuengine.componentes.puertas;

import com.b0ve.simuladores.sucutucuengine.Componente;

public class PuertaXNOR extends Componente {
    
    public PuertaXNOR(long id) {
        super(id, new String[]{"x1", "x2"}, new String[]{"y1"});
    }
    
    @Override
    public void generarSalidas() {
        escribir("y1", (leer("x1") == leer("x2")));
    }
    
}
