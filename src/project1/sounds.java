package project1;


import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sounds {

	//public static void main(String[] args) {
	sounds(){
		File clap=new File("C:/workspace/workspace/StudentCUrriculum/sound//speech1.wav");
		playsound(clap);
	//}
	}
	static void playsound(File Sound){
		try{
			Clip clip=AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
		}
	
	catch(Exception e){
		System.out.println(e.getMessage());
		}
	}
}
