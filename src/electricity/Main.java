package electricity;

public final class Main {
	public static void main(final String[] args) {
		final ParticleSystem particleSystem = new ParticleSystem();
		particleSystem.addParticle(new Particle());
		particleSystem.addParticle(new Particle(-2.0, 6, 8));
		particleSystem.addParticle(new Particle(3.0, 5, 12));
		particleSystem.addParticle(new Particle(2, 6, 0));
		System.out.println(particleSystem);
		System.out.println(particleSystem.getPotentialEnergy());
	}
}