import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException,IOException,LineUnavailableException,LineUnavailableException
	
	{
		Scanner sc=new Scanner(System.in);
		
		File file=new File("Hologram.wav");
		AudioInputStream audio=AudioSystem.getAudioInputStream(file);
		Clip clip=AudioSystem.getClip();
		clip.open(audio);
		
		String response="";	
		
		while(!response.equals("Q"))
		{
			System.out.println("P=Play,S=Stop,R=Reset,Q=Quit");
			System.out.println("Enter your choice: ");
			
			response=sc.next();
			response=response.toUpperCase();	
			
			switch(response)
			{
			case("P"): clip.start();
			break;
			
			case("S"): clip.stop();
			break;
			
			case("R"): clip.setMicrosecondPosition(0);
			break;
			
			case("Q"): clip.close(); break;
			default:System.out.println("Not a valid Response");
			
			}
					
		}
		System.out.println("Bye Player!!");
}
}
