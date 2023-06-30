package spring.chap08_excercise;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.nio.file.Path;

public class RandomRegion implements Region {
	private String region;

	// Constructors
	public RandomRegion() {
		String[] data = this.readData();
		Random random = new Random();
		int len = data.length;
		this.region = data[random.nextInt(len)];
	}

	// Setters / Getters
	@Override
	public String getRegion() {
		return this.region;
	}
	
	// utility methods
	private String[] readData() {
		List<String> lines = null;

		try {
			// get the 'bin' directory
			Path codebase = Paths.get(RandomRegion.class.getProtectionDomain().getCodeSource().getLocation().toURI());
			System.out.println(RandomRegion.class.getProtectionDomain().getCodeSource());
			// get parent directory
			Path absdir = codebase.getParent().normalize().toAbsolutePath();
			// navigate to file
			String txtFilePath = absdir.resolve("src/spring/chap08_excercise/regions.txt").toString();

			// read content of file and write lines to List
        	lines = Files.readAllLines(Path.of(txtFilePath));

		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}

		// return List convertet to String[]
		return lines.toArray(new String[0]);
	}

}
