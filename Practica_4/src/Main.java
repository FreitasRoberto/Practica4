public class Main {
    public static void main(String[] args) {
        var hoy_es = "SABADO";
        switch (hoy_es) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("hoy NO es laborable");
                break;
            default:

                System.out.println("hoy NO es laborable");
        }
    }
}