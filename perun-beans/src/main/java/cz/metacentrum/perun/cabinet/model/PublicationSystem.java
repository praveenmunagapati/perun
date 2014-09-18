package cz.metacentrum.perun.cabinet.model;

import java.io.Serializable;

/**
 * Class represents a publication system, i.e. prezentator.
 * Holds information necessary to work with it (connection url etc).
 *
 * TODO Zjednodus pouziti domenovych objektu a strategii na jedno misto!
 * Property type is supposed to hold full qualified class name of appropriate
 * business strategy class (i.e. prezentator strategy).
 *
 * @author Jiri Harazim <harazim@mail.muni.cz>
 * @author Pavel Zlamal <256627@mail.muni.cz>
 */
public class PublicationSystem implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column PUBLICATION_SYSTEM.id
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column PUBLICATION_SYSTEM.friendlyName
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	private String friendlyName;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column PUBLICATION_SYSTEM.url
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	private String url;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column PUBLICATION_SYSTEM.username
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	private String username;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column PUBLICATION_SYSTEM.password
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	private String password;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column PUBLICATION_SYSTEM.loginNamespace
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	private String loginNamespace;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column PUBLICATION_SYSTEM.type
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	private String type;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column PUBLICATION_SYSTEM.id
	 *
	 * @return the value of PUBLICATION_SYSTEM.id
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column PUBLICATION_SYSTEM.id
	 *
	 * @param id the value for PUBLICATION_SYSTEM.id
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column PUBLICATION_SYSTEM.friendlyName
	 *
	 * @return the value of PUBLICATION_SYSTEM.friendlyName
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public String getFriendlyName() {
		return friendlyName;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column PUBLICATION_SYSTEM.friendlyName
	 *
	 * @param friendlyName the value for PUBLICATION_SYSTEM.friendlyName
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName == null ? null : friendlyName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column PUBLICATION_SYSTEM.url
	 *
	 * @return the value of PUBLICATION_SYSTEM.url
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column PUBLICATION_SYSTEM.url
	 *
	 * @param url the value for PUBLICATION_SYSTEM.url
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column PUBLICATION_SYSTEM.username
	 *
	 * @return the value of PUBLICATION_SYSTEM.username
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column PUBLICATION_SYSTEM.username
	 *
	 * @param username the value for PUBLICATION_SYSTEM.username
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column PUBLICATION_SYSTEM.password
	 *
	 * @return the value of PUBLICATION_SYSTEM.password
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column PUBLICATION_SYSTEM.password
	 *
	 * @param password the value for PUBLICATION_SYSTEM.password
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column PUBLICATION_SYSTEM.loginNamespace
	 *
	 * @return the value of PUBLICATION_SYSTEM.loginNamespace
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public String getLoginNamespace() {
		return loginNamespace;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column PUBLICATION_SYSTEM.loginNamespace
	 *
	 * @param loginNamespace the value for PUBLICATION_SYSTEM.loginNamespace
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public void setLoginNamespace(String loginNamespace) {
		this.loginNamespace = loginNamespace == null ? null : loginNamespace.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column PUBLICATION_SYSTEM.type
	 *
	 * @return the value of PUBLICATION_SYSTEM.type
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column PUBLICATION_SYSTEM.type
	 *
	 * @param type the value for PUBLICATION_SYSTEM.type
	 *
	 * @mbggenerated Tue Aug 09 16:18:52 CEST 2011
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public String getBeanName() {
		return this.getClass().getSimpleName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * Two publication systems are equal iff ther id property is equal (and not null).
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PublicationSystem other = (PublicationSystem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();

		return str.append(getClass().getSimpleName()).append(":[id=").append(this.getId()).append(", friendlyName=").append(this.getFriendlyName()).append(", loginNamespace=").append(this.getLoginNamespace()).append(", username=").append(this.getUsername()).append(", password=").append(this.getPassword()).append(", type=").append(this.getType()).append(", url=").append(this.getUrl()).append("]").toString();
	}

}
