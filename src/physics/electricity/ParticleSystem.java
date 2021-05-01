package physics.electricity;

import physics.Utils;
import physics.Vector;

import java.util.*;

public class ParticleSystem {
	private final ArrayList<Particle> particles;

	public ParticleSystem() {
		particles = new ArrayList<>();
	}

	public ParticleSystem(ArrayList<Particle> particles) {
		this.particles = particles;
	}

	public double getPotentialEnergy() {
		// TODO: Write a better algo.
		double totalPotentialEnergy = 0;
		HashSet<HashSet<Particle>> combinations = new HashSet<>();
		HashSet<Particle> combination;
		Particle otherP;

		for (Particle p: particles) {
			for (int i = 0; i < particles.size(); i++) {
				combination = new HashSet<>();
				otherP = particles.get(i);
				if (otherP != p) {
					combination.add(p);
					combination.add(otherP);
					combinations.add(combination);
				}
			}
		}

		Particle p1;
		Particle p2;
		Iterator<Particle> iterator;
		double potentialEnergy;
		for (HashSet<Particle> interaction: combinations) {
			iterator = interaction.iterator();
			p1 = iterator.next();
			p2 = iterator.next();
			potentialEnergy = (Particle.K * p1.getCharge() * p2.getCharge()) / (Utils.calcDistance(p1, p2));
			totalPotentialEnergy += potentialEnergy;
		}

		return totalPotentialEnergy;
	}

	public Vector getElectricField(double x, double y) {
		Vector[] vectors = new Vector[particles.size()];

		Particle p;
		double m, alpha, distance, fieldStrength, top, bottom;
		Vector fieldVector;

		// Calculate the force vectors of each particle.
		for (int i = 0; i < particles.size(); i++) {
			// Get the particle at the index.
			p = particles.get(i);
			// Find the slope of the line crossing the particle and the wanted point.
			top = y - p.getY();
			bottom = x - p.getX();
			m = top / bottom;
			// Find the angle the line makes with the x-axis.
			alpha = Math.atan(m);
			// Find the distance between the two points.
			distance = Utils.calcDistance(x, y, p.getX(), p.getY());
			// Find the strength of the electric field caused by the particle.
			fieldStrength = Particle.K * p.getCharge() / Math.pow(distance, 2);
			// Calculate the resultant force vector and add it to the list of vectors.
			if (top < 0 && bottom < 0) {
				/* If top and bottom are both negative, add 180 degrees to the angle to indicate that the vector is
				pointing towards the 3rd quadrant. */
				alpha += Math.PI;
			}
			fieldVector = new Vector(fieldStrength * Math.cos(alpha), fieldStrength * Math.sin(alpha));
			vectors[i] = fieldVector;
		}

		Vector resultant = new Vector(0, 0);
		// Add the force vectors and return the resultant vector.
		for (Vector vector: vectors) {
			resultant = Vector.addVectors(resultant, vector);
		}

		return resultant;
	}

	public boolean addParticle(Particle particle) {
		// Declare a variable that checks if particle is being placed on the same location as another particle.
		boolean unique = true;

		// Check particle's x and y coordinates.
		for (Particle p: particles) {
			unique = (p.getX() != particle.getX() || p.getY() != particle.getY());
			if (!unique) {
				break;
			}
		}

		if (unique) {
			particles.add(particle);
		}
		return unique; // return true if particle was added, else return false.
	}

	public String toString() {
		return particles.toString();
	}

	public ArrayList<Particle> getParticles() {
		return particles;
	}
}
