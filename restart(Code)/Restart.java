import java.io.*;
import javax.swing.*;
public class Restart extends JFrame{
public static void main(String args[]){
	try{
	ProcessBuilder pb=new ProcessBuilder();
	pb.command("cmd","/c","shutdown /r");
	pb.start();
	}catch(Exception E){}
	}
}