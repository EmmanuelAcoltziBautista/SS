/*
Creado por Emmanuel Acoltzi Bautista
Fecha de creacion: 20/05/2023
Correo electronico: basedeemma@gmail.com
*/
import java.io.*;
import javax.swing.*;
public class Shutdown extends JFrame{
public static void main(String args[]){
	try{

	ProcessBuilder pb=new ProcessBuilder();
	pb.command("cmd","/c","shutdown /p");
	//ejecuta el siguiente comando en el CMD
	pb.start();
	}catch(Exception E){}
	}
}