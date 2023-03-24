package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//test
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

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
