package org.software.iris.rest;

import org.software.iris.rest.models.Especies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@SpringBootApplication
public class IrisApplication {

    static final int PUERTO = 8081;

	public static void main(String[] args){

		SpringApplication.run(IrisApplication.class, args);

//        try{
//
//            System.out.println("Iniciando Servidor...");
//            ServerSocket socket_servidor = new ServerSocket(PUERTO);
//            System.out.println("Escucho al puerto: " + PUERTO);
//            System.out.println("Esperando conexiones de los clientes...");
//
//            for(int i=0; i<5; i++){
//
//                Especies datos = new Especies();
//                double dato_sl = datos.getSl();
//                double dato_sw = datos.getSw();
//                double dato_pl = datos.getPl();
//                double dato_pw = datos.getPw();
//            /*String sl_dato = String.valueOf(dato_sl);
//            String sw_dato = String.valueOf(dato_sw);
//            String pl_dato = String.valueOf(dato_pl);
//            String pw_dato = String.valueOf(dato_pw);*/
//
//                String parametros = "{'sl':" + dato_sl + ", 'sw':" + dato_sw + ", 'pl':" + dato_pl + ", 'pw':" + dato_pw +"}" ;
//
//                Socket socket_cliente = socket_servidor.accept();
//                System.out.println("--------------------------------------------------");
//                System.out.println("El puerto de comunicación: " +  socket_cliente.getPort());
//                OutputStream mensajeParaCliente = socket_cliente.getOutputStream();
//                DataOutputStream flujoSecuencial = new DataOutputStream(mensajeParaCliente);
//                flujoSecuencial.writeUTF(parametros);
//                InputStream is = socket_cliente.getInputStream();
//                BufferedReader buf =new BufferedReader(new InputStreamReader(is));
//                String mensaje = buf.readLine();
//                System.out.println("El cliente dice --> " + mensaje);
//            }
//
//        }catch(Exception e){
//
//            System.out.println(e.getMessage());
//
//        }


    }

}