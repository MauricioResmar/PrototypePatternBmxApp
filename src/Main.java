public class Main {
    public static void main(String[] args) {

        int sizeWheel;
        float sizeTubeSup;
        String weightFrame;
        String color;
        String typeBox;
        String material;

    FrameDesign frameDesign = new FrameDesign();
    frameDesign.PrintWelcome();

    sizeWheel = frameDesign.GetWheelSize();
    sizeTubeSup = frameDesign.GetTubeSupSize();
    weightFrame = frameDesign.GetWeightFrame();
    color = frameDesign.GetColorFrame();
    typeBox = frameDesign.GetBoxType();
    material = frameDesign.GetFrameMaterial();

    System.out.println("\n Se ha generado con exito el prototypo original para el Frame con las siguientes caracteristicas:");
        System.out.println("\n****Size Wheel:" + sizeWheel);
        System.out.println("****Size Superior Tube:" + sizeTubeSup);
        System.out.println("****Weight Frame:" + weightFrame);
        System.out.println("****Color Frame:" + color);
        System.out.println("****Box Type Frame:" + typeBox);
        System.out.println("****Material Frame:" + material);

    }
}