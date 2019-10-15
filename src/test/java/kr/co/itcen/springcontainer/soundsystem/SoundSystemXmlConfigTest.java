package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Auto Configuration - xml Config(Annotation Scan)
 * Component Scanning ( @Component, @Named, @Autowired, @Inject)
 * 					    @Service
 * 					    @Controller
 *					    @Repository
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/soundsystem/SoundSystemConfig.xml"})
public class SoundSystemXmlConfigTest {
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();	
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void testCDPlayer() {
		assertNotNull(cdPlayer);	
	}
	// @Ignore 테스트를 잠시 안할 때
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("Playing 붕붕 by 김하온", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
}
