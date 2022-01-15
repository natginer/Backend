public class Test {
    public static void main( String[] args) {
        OfertaAcademica frontEnd=OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        frontEnd.setNombre("FrontEnd");
        frontEnd.setDescripcion("FrontEnd");
        ((Curso)frontEnd).setCargaHoraria(16);
        ((Curso)frontEnd).setValorHora(1000);
        ((Curso)frontEnd).setDuracion(2);

        OfertaAcademica backEnd=OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        backEnd.setNombre("BackEnd");
        backEnd.setDescripcion("BackEnd");
        ((Curso)backEnd).setCargaHoraria(20);
        ((Curso)backEnd).setDuracion(2);
        ((Curso)backEnd).setValorHora(900);

        OfertaAcademica fullStack=OfertaAcademicaFactory.getInstance().crearOfertaAcademica("ProgramaIntensivo");
        fullStack.setNombre("FullStack");
        fullStack.setDescripcion("FullStack-FrontEnd y BackEnd");
        ((ProgramaIntensivo)fullStack).setPorcentajeBonificacion(0.20);

        // agregamos los cursos al listado
        ((ProgramaIntensivo)fullStack).addOfertaAcademica(frontEnd);
        ((ProgramaIntensivo)fullStack).addOfertaAcademica(backEnd);

        Instituto dh= new Instituto("Digital House");
        dh.addOfertaAcademica(frontEnd);
        dh.addOfertaAcademica(backEnd);
        dh.addOfertaAcademica(fullStack);

        System.out.println("Listado de ofertas");
        dh.generarInforme();
    }
}
