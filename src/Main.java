public class Main {
    public static void main(String[] args) {
        // referencia polimórfica
        System.out.println("polimorfismo");
        Animal[] animales = {
                new Perro("Firulais", 3, "Carlos", "Labrador"),
                new Gato("Michi", 2, "Ana", true),
                new Ave("Piolín", 1, "Luisa", 50.0)
        };

        for (Animal a : animales) {
            a.imprimirFicha();
        }

        // Vacunar los que aplican
        System.out.println("prueba de vacuna");
        Perro miPerro = new Perro("Max", 4, "Sofía", "Pastor Alemán");
        Gato miGato = new Gato("Luna", 5, "Pedro", false);

        miPerro.registrarVacuna("Rabia");
        miPerro.registrarVacuna("Parvovirus");
        miGato.registrarVacuna("Triple Felina");

        System.out.println("Vacunas de " + miPerro.nombre + ": " + miPerro.getVacunasAplicadas());
        System.out.println("Vacunas de " + miGato.nombre + ": " + miGato.getVacunasAplicadas());

        //  calculo de polizas )
        System.out.println("prueba de polizas");
        Clinica miClinica = new Clinica("mundoAnimal", "Calle 80 # 50 - 42 ");

        Asegurable[] asegurables = {
                miPerro,
                miGato,
                miClinica
        };

        for (Asegurable aseg : asegurables) {
            System.out.println("Póliza: " + aseg.obtenerNumeroPoliza() + " | Prima Anual: $" + aseg.calcularPrimaSeguro());
        }

    }
}