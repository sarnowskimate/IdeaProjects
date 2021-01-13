public class Main {

    public static void main(String[] args) {
	// write your code here

        Owner firstOwner = new Owner("Matesz", "Sarnowski");

        Diploma[] diplomas = new Diploma[5];
        diplomas[0] = new EngDiploma(firstOwner, 1, 101, "S1");
        diplomas[1] = new EngDiploma(new Owner("Monika", "Kwiatkowska"), 2, 102, "S2");
        diplomas[2] = new EngDiploma(new Owner("Błażej", "Ochocki"), 3, 103, "S3");
        diplomas[3] = new Testimonial(new Owner("Katarzyna", "Sarnowska"), 4, 104, "T4");
        diplomas[4] = new Testimonial(new Owner("Jerzy", "Ochocki"), 5, 105, "T5");

        DiplomaRegistry registry = new DiplomaRegistry(diplomas);
        System.out.println(registry);

        registry.diplomaOfOwner(firstOwner);

        registry.ownerOfDiplom(3);


    }
}
