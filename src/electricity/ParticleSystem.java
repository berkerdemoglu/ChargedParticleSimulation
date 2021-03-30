package electricity;

import java.util.ArrayList;
import java.util.HashSet;

public class ParticleSystem {
	private ArrayList<Particle> particles;

	public ParticleSystem() {
		particles = new ArrayList<>();
	}

	public ParticleSystem(ArrayList<Particle> particles) {
		this.particles = particles;
	}

	public double getPotentialEnergy() {
		double potentialEnergy;


//		for (int i = 0; i < particles.size(); i++) {
//			combination = new HashSet<>();
//
//			// comb(n, 2)
//			ele = particles.get(i);
//			otherEle = particles.get(i + 1);
//			combination.add(ele);
//			combination.add(otherEle);
//
//			combinations.add(combination);
//		}

		return potentialEnergy;
	}

	public boolean addParticle(Particle particle) {
		// Check if particle is being placed on the same location as another particle.
		boolean unique = true;

		// Check particle's x and y coordinates.
		for (Particle p: particles) {
			unique = (p.getX() != particle.getX() && p.getY() != particle.getY());
			if (!unique) {
				break;
			}
		}

		if (unique) {
			particles.add(particle);
		}
		return unique;
	}

	public String toString() {
		return particles.toString();
	}

	public ArrayList<Particle> getParticles() {
		return particles;
	}
}
