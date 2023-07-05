package spring.chap09_excercise;

// Java modules
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.annotation.PostConstruct;

// Spring modules
import org.springframework.stereotype.Component;


@Component
public class Region {
	
	String[] regions;
	
	// Constructors
	public Region() {
		this.setRegions();
	}

	// Setters / Getters
	public void setRegions() {
		this.regions = this.readData();
	}
	
	public String[] getRegions() {
		return this.regions;
	}

	// utility methods
	private String[] readData() {
		List<String> lines = null;

		try {
			// get the 'bin' directory
			Path codebase = Paths.get(Region.class.getProtectionDomain().getCodeSource().getLocation().toURI());
			// get parent directory
			Path absdir = codebase.getParent().normalize().toAbsolutePath();
			// navigate to file
			String txtFilePath = absdir.resolve("src/spring/chap09_excercise/regions.txt").toString();

			// read content of file and write lines to List
        	lines = Files.readAllLines(Path.of(txtFilePath));

		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}

		// return List convertet to String[]
		return lines.toArray(new String[0]);
	}
	
	@PostConstruct
	private void onConstruct() {
		for (String region : this.regions) {
			System.out.println("On construct: " + region);
		}
	}

}
