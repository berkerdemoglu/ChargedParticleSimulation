package electricity;

public class Main {
	public static void main(String[] args) {
		ParticleSystem system = new ParticleSystem();
		system.addParticle(new Particle());
		system.addParticle(new Particle(-2.0, 6, 8));
		system.addParticle(new Particle(3.0, 5, 12));
		system.addParticle(new Particle(2, 6, 0));
		System.out.println(system);
		System.out.println(system.getPotentialEnergy());
	}
}
