import physics.Vector;
import physics.electricity.Particle;
import physics.electricity.ParticleSystem;

public class Main {
	public static void main(String[] args) {
		ParticleSystem system = new ParticleSystem();
//		system.addParticle(new Particle());
//		system.addParticle(new Particle(-2.0, 6, 8));
//		system.addParticle(new Particle(3.0, 5, 12));
//		system.addParticle(new Particle(2, 6, 0));
//		System.out.println(system);
//		System.out.println(system.getPotentialEnergy());
		Vector v1 = new Vector(3, 0);
		Vector v2 = new Vector(0, 4);

		Vector r = Vector.addVectors(v1, v2);

		System.out.println(r);
		System.out.println(r.getVectorLength());

		system.addParticle(new Particle(0 ,0));
		system.addParticle(new Particle(-6, -8));
		Vector electricFieldVector = system.getElectricField(-6,-8);
		System.out.println(electricFieldVector);
		System.out.println(electricFieldVector.getVectorLength());
	}
}
