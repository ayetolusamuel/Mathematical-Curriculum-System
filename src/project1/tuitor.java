package project1;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class tuitor {

	//public static void main(String[] args) {
	tuitor(){
		File clap=new File("C:/workspace/workspace/StudentCUrriculum/sound//opening.wav");
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
