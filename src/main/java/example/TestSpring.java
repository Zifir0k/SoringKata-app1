package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

//test
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        Music rockMusic =context.getBean("someRockMusic", RockMusic.class);
//        MusicPlayer musicPlayerRock = new MusicPlayer(rockMusic);
//
//        Music classicalMusic = context.getBean("someClassicalMusic", ClassicalMusic.class);
//        MusicPlayer musicPlayerClassical =new MusicPlayer(classicalMusic);
//
//        musicPlayerClassical.playMusic();
//        musicPlayerRock.playMusic();
//
//        MusicPlayer musicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
