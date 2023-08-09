
package com.mycompany.proyecto2_progra;

public class ConfiguracionLogica {
    private int Dificultad=0;
    private int ModoDeJuego=0;
    

    public void Alineamientos(int Dificultad,int ModoDeJuego){
        this.Dificultad=Dificultad;
        this.ModoDeJuego=ModoDeJuego;
    }
    
    public int Dificultad(){
        if (Dificultad==0){
            return 4;
        }else if(Dificultad==1){
            return 2;
        }else if(Dificultad==2){
            return 1;
        }
        return 0;
    }
    
    public boolean ModoDeJuego(){
        if(ModoDeJuego==0){
            return false;
        }else if(ModoDeJuego==1){
            return true;
        }
        return false;
    }
}
