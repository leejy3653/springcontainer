package mixingconfig.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import config.videosystem.DVDConfig;
import config.videosystem.DVDPlayerConfig02;

@Configuration // 지금같은 경우는 클래스를 명시하기 때문에 필요없지만 그래도 쓰는것이 좋다.
@Import({DVDConfig.class, DVDPlayerConfig02.class})
public class VideoSystemConfig01 {
}
