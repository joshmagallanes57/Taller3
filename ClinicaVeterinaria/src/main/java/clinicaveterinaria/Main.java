package clinicaveterinaria;

import clinicaveterinaria.model.*;
import clinicaveterinaria.interfaces.*;


public class Main {
    public static void main(String[] args) {
        Perro Spike = new Perro(10, "Spike");
        Pez Dori = new Pez(11, "Dori");
        Pajaro Zazu = new Pajaro(12, "Zazu");

        Spike.caminar();
        Spike.comer();

        Dori.comer();
        Dori.nadar();

        Cita cita = reservaService.reservarCita(1, mascota, veterinario, LocalDate.now());
        diagnosticoService.diagnosticar(cita, "Paciente estable para tratamiento.");
        Factura factura = facturacionService.generarFactura(1, cita, tratamiento.calcularCostoFinal());
        factura.setPagada(true);

        System.out.println("=== ClinicaVeterinaria funcionando ===");
        System.out.println(mascotaService.obtenerMascota(1));
        System.out.println(cita);
        System.out.println(factura);
        System.out.println("Preparacion: " + tratamientoService.prepararSala(tratamiento));
        System.out.println("Costo con impuestos: " + new CalculadoraCostoTratamiento().calcularConImpuestos(tratamiento));
        System.out.println("Citas Dr. Ruiz: " + reporteService.generarReporteCitasPorVeterinario(1).size());
        System.out.println("Mascotas de Ana Perez: " + reporteService.generarReporteMascotasPorDueno("Ana Perez").size());
        System.out.println("Ingresos del mes: " + reporteService.calcularIngresosMensual());

        demostrarViolacionesSinRomperEjecucion(veterinario, mascota, tratamiento, reservaService, diagnosticoService, null, reporteService);
        new Clinica().agendarConsultaRapida(mascota, veterinario);
        new ServicioClinicaCompleto(baseDatos).calcularTratamiento(tratamiento);
    }

    private static void demostrarViolacionesSinRomperEjecucion(Veterinario veterinario, Mascota mascota, Tratamiento tratamiento, ReservaService reservaService
                                                                ,DiagnosticoService diagnosticoService, FacturaService facturaService, ReporteService reporteService ){
        Cita citaDesdeServicio = reservaService.reservarCita(2, mascota, veterinario, LocalDate.now().plusDays(1));
        diagnosticoService.diagnosticar(citaDesdeServicio, "Ejemplo de SRP violado desde el modelo.");
        System.out.println( "Reporte de citas del veterinario: " + reporteService.generarReporteCitasPorVeterinario(veterinario.getId()));

        Animal pez = new Pez(3, "Nemo");
        pez.nadar();
        System.out.println("El pez heredó caminar() y volar(), aunque no debe usarlos.");
        System.out.println("Tratamiento OCP violado pero funcional: " + tratamiento.obtenerIndicaciones());
    }
}
