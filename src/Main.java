public class Main {
    public static void main(String[] args) {

        FramesBmx framesBmx = new FramesBmx();
        FrameDesign frameDesign = new FrameDesign();
        int id = 1;

        framesBmx.sizeWheel = frameDesign.GetWheelSize();
        framesBmx.sizeTubeSup = frameDesign.GetTubeSupSize();
        framesBmx.weightFrame = frameDesign.GetWeightFrame();
        framesBmx.color = frameDesign.GetColorFrame();
        framesBmx.typeBox = frameDesign.GetBoxType();
        framesBmx.material = frameDesign.GetFrameMaterial();
        int numClones = frameDesign.GetNumClones();

    frameDesign.PrintWelcome();

    System.out.println("\n Se ha generado con exito el prototypo original para el Frame con las siguientes caracteristicas:");

        System.out.println("\n****Id Object Frame Mem Ram:" + framesBmx);
        System.out.println("\n****Id Frame:" + id);
        System.out.println("****Size Wheel:" + framesBmx.sizeWheel);
        System.out.println("****Size Superior Tube:" + framesBmx.sizeTubeSup);
        System.out.println("****Weight Frame:" + framesBmx.weightFrame);
        System.out.println("****Color Frame:" + framesBmx.color);
        System.out.println("****Box Type Frame:" + framesBmx.typeBox);
        System.out.println("****Material Frame:" + framesBmx.material);
        System.out.println("****Number Clones:" + numClones);

        do {
            try {
                FramesBmx clonado = framesBmx.clonar();
                id = id + 1;
                System.out.println("\nid Clone: " + id + "\nId Memoria Ram Object: " + clonado + "\nClone Size Frame clone: " + clonado.sizeWheel + "\nSize Superior tube: " + clonado.sizeTubeSup + "\nWeight Frame Clone: " + clonado.weightFrame + "\nType Box Frame Clone: " + clonado.typeBox + "\nClone Frame Color: " + clonado.color + "\nMaterial Clone Frame: " + clonado.material + "\nClone number: " + numClones);
                numClones --;
            } catch (CloneNotSupportedException e){
                System.out.println("El objeto no se puede Clonal: " + e.getMessage());
            }
        } while (numClones > 0);
    }
}