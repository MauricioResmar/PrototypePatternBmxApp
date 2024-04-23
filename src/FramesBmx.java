public class FramesBmx implements Cloneable {
    int sizeWheel;
    float sizeTubeSup;
    String weightFrame;
    String color;
    String typeBox;
    String material;

    public FramesBmx(){}
    public FramesBmx clonar() throws CloneNotSupportedException {
        return(FramesBmx)this.clone();
    }
}
