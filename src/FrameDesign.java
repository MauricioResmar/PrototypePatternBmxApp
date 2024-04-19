import java.util.Scanner;
public class FrameDesign {
    int sizeWheel;
    float sizeTubeSup;
    String weightFrame;
    String color;
    String boxType;
    String material;
    Scanner scanner = new Scanner(System.in);

    //Interfaz Welcome
    public void PrintWelcome(){
        System.out.println("Hola! Bienvenido al sistema de creación de tickets para marcos de Bmx");
        System.out.println("\nEn el podrás seleccionar las caracteristicas necesarias para generar el" +
                " modelo que desees crear \ny luego de ello se clonara el prototypo cuantas veces se requiera." +
                " Para ello el sistema asignara\nun id diferente a cada clon del prototipo con el fin" +
                " de identificarlos posteriormente por separado.");

        System.out.println("                            ,-.");
        System.out.println("                           ( o )_,  ,-.");
        System.out.println("                            `-`./\\ ( o )");
        System.out.println("                               /`.\\ /-'");
        System.out.println("    ;--.                       \\=+'  ,--.");
        System.out.println("   /  /|                        O   /  /|");
        System.out.println("  /  / |                           /  / |");
        System.out.println(" ,--:  \\-                         .--:  |");
        System.out.println(" |  | ,-:                         |  |  |");
        System.out.println(" |  |( o-);-.                     |  |  |");
        System.out.println(" | \\ `-'/\\_ \\_O                 ,'/  |  |");
        System.out.println(" |  \\  '\\-\\`--'__          __,-' /   |  |");
        System.out.println(" |   `.( o')     ``------''    ,'    |  |");
        System.out.println(" |     `:-'                  ,'      |  |");
        System.out.println(" |       `-.__          __,-'        | /");
        System.out.println(" |            ``------''         Bmx |/");
        System.out.println(" `-----------------------------------'");
    }

        // 1. Set Wheel Size:
        public int GetWheelSize() {
            System.out.println("Por favor ingresa la medida de la rueda, ejemplo 14, 16, 18, 20, 22, 24, 26 etc: ");
            sizeWheel = scanner.nextInt();
            return sizeWheel;
        }

        // 2 . Set Size Superior Tube:
        public float GetTubeSupSize() {
            System.out.println("Ingrese la medida del tubo superior para el frame por favor! ej: 21, 21.5, 22 etc: ");
            sizeTubeSup = scanner.nextFloat();
            return sizeTubeSup;
        }

        // 3. Set Weight frame:
        public String GetWeightFrame() {
            System.out.println("Ingrese el Peso deseado entre: liviano, medio y pesado: ");
            weightFrame = scanner.next();
            return weightFrame;
        }

        // 4. Set Color frame:
        public String GetColorFrame() {
            System.out.println("Ingrese el Color deseado por favor: ");
            color = scanner.next();
            return color;
        }

        // 5. Set TypeBox frame:
        public String GetBoxType() {
            System.out.println("Ingrese el tipo de Caja para el frame entre: Mid, Spanish o Grande: ");
            boxType = scanner.next();
            return boxType;
        }

        // 6. Set Material Frame:
        public String GetFrameMaterial() {
            System.out.println("Ingrese el material deseado para la construcción del frame por favor, ej: Aluminio, Cromoly 4130, Carbono, Titanio: ");
            material = scanner.next();
            return material;
        }
}
