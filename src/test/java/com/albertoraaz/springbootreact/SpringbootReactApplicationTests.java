package com.albertoraaz.springbootreact;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.albertoraaz.springbootreact.model.Tutorial;
import com.albertoraaz.springbootreact.repository.TutorialRepository;

/**
 * The Class SpringbootReactApplicationTests.
 */
@SpringBootTest
class SpringbootReactApplicationTests {

	/** The tutorial repository. */
	@MockBean
	private TutorialRepository tutorialRepository;

	/**
	 * Context loads.
	 */
	@Test
	void contextLoads() {
	}

	/**
	 * Gets the all tutorials test.
	 *
	 * @return the all tutorials test
	 */
	@Test
	public void getAllTutorialsTest() {

		when(tutorialRepository.findAll())
				.thenReturn(Stream.of(new Tutorial(1, "cien años de soledad", "novela colombiana", Boolean.TRUE))
						.collect(Collectors.toList()));

		assertEquals(1, tutorialRepository.findAll().size());

	}

	/**
	 * Creates the tutorial test.
	 */
	@Test
	public void createTutorialTest() {

		Tutorial tutorial = new Tutorial(2, "quien se llevo mi queso", "novela", Boolean.TRUE);
		when(tutorialRepository.save(tutorial)).thenReturn(tutorial);

		assertEquals(tutorial, tutorialRepository.save(tutorial));
	}

	/**
	 * Delete tutorial test.
	 */
	@Test
	public void deleteTutorialTest() {
		Tutorial tutorial = new Tutorial(2, "quien se llevo mi queso", "novela", Boolean.TRUE);

		tutorialRepository.delete(tutorial);

		verify(tutorialRepository, times(1)).delete(tutorial);

	}

}
