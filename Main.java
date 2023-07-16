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




/*
This is a Java program that plays an audio file named "Hologram.wav" using the Java Sound API.

The program uses the Scanner class to take input from the user.

The AudioInputStream class is used to read the audio file and the Clip class is used to play the audio.

The program displays a menu for the user to choose from: P=Play, S=Stop, R=Reset, Q=Quit.

The program uses a switch statement to execute the user's choice.

If the user chooses "P", the audio starts playing. If the user chooses "S", the audio stops playing. If the user chooses "R", the audio is reset to the beginning. If the user chooses "Q", the program exits.

If the user enters an invalid response, the program displays "Not a valid Response".

Once the user chooses "Q", the program displays "Bye Player!!" and exits.


*/
