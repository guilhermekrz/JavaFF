package javaff.data.preference;

import java.util.HashSet;
import java.util.Set;

public class AndPreference {

	private Set<Preference> preferences = new HashSet<>();

	public void add(Preference preference) {
		preferences.add(preference);
	}

	public Set<Preference> getPreferences() {
		return preferences;
	}
}
