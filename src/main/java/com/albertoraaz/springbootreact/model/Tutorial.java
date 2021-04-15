package com.albertoraaz.springbootreact.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Tutorial.
 */
@Entity
@Table(name = "tutorials")
public class Tutorial {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	/** The title. */
	@Column(name = "title")
	private String title;

	/** The description. */
	@Column(name = "description")
	private String description;

	/** The published. */
	@Column(name = "published")
	private boolean published;

	public Tutorial() {

	}

	/**
	 * Instantiates a new tutorial.
	 *
	 * @param id          the id
	 * @param title       the title
	 * @param description the description
	 * @param published   the published
	 */
	public Tutorial(long id, String title, String description, boolean published) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.published = published;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Checks if is published.
	 *
	 * @return true, if is published
	 */
	public boolean isPublished() {
		return published;
	}

	/**
	 * Sets the published.
	 *
	 * @param published the new published
	 */
	public void setPublished(boolean published) {
		this.published = published;
	}

}
