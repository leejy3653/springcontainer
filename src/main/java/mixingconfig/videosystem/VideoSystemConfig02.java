package mixingconfig.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import kr.co.itcen.springcontainer.videosystem.DVDPlayer;

@Configuration
@Import({ DVDPlayer.class })
@ImportResource({ "classpath:config/videosystem/DVDConfig.xml" })
public class VideoSystemConfig02 {

}
