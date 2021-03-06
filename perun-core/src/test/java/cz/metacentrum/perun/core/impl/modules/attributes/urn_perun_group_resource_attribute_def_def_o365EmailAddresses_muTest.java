package cz.metacentrum.perun.core.impl.modules.attributes;

import cz.metacentrum.perun.core.api.Attribute;
import cz.metacentrum.perun.core.api.Group;
import cz.metacentrum.perun.core.api.Member;
import cz.metacentrum.perun.core.api.Resource;
import cz.metacentrum.perun.core.api.User;
import cz.metacentrum.perun.core.api.exceptions.WrongAttributeValueException;
import cz.metacentrum.perun.core.impl.PerunSessionImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static cz.metacentrum.perun.core.impl.modules.attributes.urn_perun_group_resource_attribute_def_def_o365EmailAddresses_mu.ADNAME_ATTRIBUTE;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests attribute module.
 *
 * @author Martin Kuba makub@ics.muni.cz
 */
public class urn_perun_group_resource_attribute_def_def_o365EmailAddresses_muTest {

	private urn_perun_group_resource_attribute_def_def_o365EmailAddresses_mu classInstance;
	private PerunSessionImpl session;
	private Attribute attributeToCheck;
	private Resource resource = new Resource();
	private Group group = new Group();
	private String adName = "aaaaa";

	@Before
	public void setUp() {
		classInstance = new urn_perun_group_resource_attribute_def_def_o365EmailAddresses_mu();
		session = mock(PerunSessionImpl.class, RETURNS_DEEP_STUBS);
		attributeToCheck = new Attribute();
		resource.setId(1);
		group.setId(10);
	}

	@Test
	public void fillAttribute() throws Exception {
		System.out.println("fillAttribute()");
		when(session.getPerunBl().getAttributesManagerBl().getAttribute(session, resource, group, ADNAME_ATTRIBUTE).getValue())
				.thenReturn(adName);
		Attribute attribute = classInstance.fillAttribute(session, resource, group, classInstance.getAttributeDefinition());
		Object attributeValue = attribute.getValue();
		assertThat(attributeValue, is(notNullValue()));
		List<String> expectedValue = new ArrayList<>();
		expectedValue.add(adName + "@group.muni.cz");
		assertThat(attributeValue, equalTo(expectedValue));

		//check that value generated by fillAttribute() is acceptable for checkAttributeValue()
		classInstance.checkAttributeValue(session, resource, group, attribute);
	}


	@Test(expected = WrongAttributeValueException.class)
	public void testCheckType() throws Exception {
		System.out.println("testCheckType()");
		attributeToCheck.setValue("AAA");
		classInstance.checkAttributeValue(session, resource, group, attributeToCheck);
	}

	@Test(expected = WrongAttributeValueException.class)
	public void testCheckEmailSyntax() throws Exception {
		System.out.println("testCheckEmailSyntax()");
		attributeToCheck.setValue(Arrays.asList("my@example.com", "a/-+"));
		classInstance.checkAttributeValue(session, resource, group, attributeToCheck);
	}

	@Test(expected = WrongAttributeValueException.class)
	public void testCheckDuplicates() throws Exception {
		System.out.println("testCheckDuplicates()");
		attributeToCheck.setValue(Arrays.asList("my@example.com", "aaa@bbb.com", "my@example.com"));
		classInstance.checkAttributeValue(session, resource, group, attributeToCheck);
	}

	@Test(expected = WrongAttributeValueException.class)
	public void testCheckValueExistIfAdNameSetWithNull() throws Exception {
		System.out.println("testCheckValueExistIfAdNameSetWithNull()");
		attributeToCheck.setValue(null);
		when(session.getPerunBl().getAttributesManagerBl().getAttribute(session, resource, group, ADNAME_ATTRIBUTE).getValue())
				.thenReturn(adName);
		classInstance.checkAttributeValue(session, resource, group, attributeToCheck);
	}

	@Test
	public void testCheckNullForNullAdName() throws Exception {
		System.out.println("testCheckNullForNullAdName()");
		attributeToCheck.setValue(null);
		when(session.getPerunBl().getAttributesManagerBl().getAttribute(session, resource, group, ADNAME_ATTRIBUTE).getValue())
				.thenReturn(null);
		classInstance.checkAttributeValue(session, resource, group, attributeToCheck);
	}


	@Test(expected = WrongAttributeValueException.class)
	public void testCheckValueExistIfAdNameSet() throws Exception {
		System.out.println("testCheckValueExistIfAdNameSet()");
		attributeToCheck.setValue(Collections.emptyList());
		when(session.getPerunBl().getAttributesManagerBl().getAttribute(session, resource, group, ADNAME_ATTRIBUTE).getValue())
				.thenReturn(adName);
		classInstance.checkAttributeValue(session, resource, group, attributeToCheck);
	}

	@Test
	public void testCorrect() throws Exception {
		System.out.println("testCorrect");

		when(session.getPerunBl().getAttributesManagerBl().getAttribute(session, resource, group, ADNAME_ATTRIBUTE).getValue())
				.thenReturn(null);
		attributeToCheck.setValue(Collections.emptyList());
		classInstance.checkAttributeValue(session, resource, group, attributeToCheck);
		attributeToCheck.setValue(Collections.singletonList("my@example.com"));
		classInstance.checkAttributeValue(session, resource, group, attributeToCheck);

	}
}
