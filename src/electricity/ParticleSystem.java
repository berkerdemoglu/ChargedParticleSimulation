package electricity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class ParticleSystem {
	private final ArrayList<Particle> particles;

	public ParticleSystem() {
		this(new ArrayList<>());
	}

	public ParticleSystem(final ArrayList<Particle> particles) {
		this.particles = particles;
	}

	public double getPotentialEnergy() {
		final HashSet<HashSet<Particle>> combinations = new HashSet<>();

		for (final Particle p: particles) {
			for (final Particle particle : particles) {
				final HashSet<Particle> combination = new HashSet<>();
				if (particle != p) {
					combination.add(p);
					combination.add(particle);
					combinations.add(combination);
				}
			}
		}


		double totalPotentialEnergy = 0;

		for (final HashSet<Particle> interaction: combinations) {
			final Iterator<Particle> iterator = interaction.iterator();
			final Particle p1 = iterator.next();
			final Particle p2 = iterator.next();
			final double potentialEnergy = (Particle.CONSTANT_K * p1.getCharge() * p2.getCharge()) / (Utils.calcDistance(p1, p2));
			totalPotentialEnergy += potentialEnergy;
		}

		return totalPotentialEnergy;
	}

	public void addParticle(final Particle particle) {

		if (this.checkSameLocation(particle)) {
			return;
		}

		particles.add(particle);
	}

	// Check if particle is being placed on the same location as another particle.
	private boolean checkSameLocation(final Particle particle) {
		// Check particle's x and y coordinates.
		for (final Particle p: particles) {
			if (!(p.getX() != particle.getX() || p.getY() != particle.getY())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return particles.toString();
	}
}