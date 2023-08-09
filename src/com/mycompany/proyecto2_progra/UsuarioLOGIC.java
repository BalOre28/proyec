/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_progra;



public class UsuarioLOGIC {
    private String usuario;
    private static UsuarioDAO usuariodao = new UsuarioDAO();
    
    private String usuarionombre(Usuario usuario){
        this.usuario=usuario.getUsuario();
        return this.usuario;
    }
    
    
    public static boolean autentificar(String usuario, String contra){
        if(obtener (usuario)!= null){
            Usuario usuarioConsulta = obtener(usuario);
            
            if(usuarioConsulta.getUsuario().equals(usuario)&& usuarioConsulta.getContra().equals(contra)){
                return true;
                
            }else{
                return false;
            }
            
        }else{
            return false;
        }
    }
    
    public static boolean insertar (Usuario usuario){
       return usuariodao.insertar(usuario);         
    }
    public static boolean modificar(Usuario usuario){
         return usuariodao.modificar(usuario);
        
    }
    public static boolean eliminar(String usuario){
         return usuariodao.eliminar(usuario);
        
    }
    
    public static Usuario obtener(String usuario){
         return usuariodao.obtener(usuario);
        
    }
    
    
    
}
