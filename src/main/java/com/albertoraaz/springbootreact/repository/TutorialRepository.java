package com.albertoraaz.springbootreact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.albertoraaz.springbootreact.model.Tutorial;

/**
 * The Interface TutorialRepository.
 */
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

	/**
	 * Find by published.
	 *
	 * @param published the published
	 * @return the list
	 */
	List<Tutorial> findByPublished(boolean published);

	/**
	 * Find by title containing.
	 *
	 * @param title the title
	 * @return the list
	 */
	List<Tutorial> findByTitleContaining(String title);
}