
package computer;

/**
 *
 * @author ProvenSoft
 */
public class Computer {
    //attributes
    private String processor;
    private int memory;
    private int hardDisk;
    private String screen;
    //TODO add more components
    private boolean on;
    private boolean screenSaverOn;
    
    //constructors
    public Computer(
            String processor,
            int memory,
            int hardDisk,
            String screen) {
        this.processor = processor;
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.screen = screen;
        this.on = false;
        this.screenSaverOn = false;
    }

    public Computer() {
    }
    
    //accessors    
    
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public boolean isScreenSaverOn() {
        return screenSaverOn;
    }

    public void setScreenSaverOn(boolean screenSaverOn) {    
        this.screenSaverOn = screenSaverOn;
    }

    public boolean isOn() {
        return on;
    }
    
    public void setOn(boolean on) {
        this.on = on;
    }
    
    //methods
    
    public void start() {
        on = true;
        screenSaverOn = true;
    }
    
    public void close() {
        on = false;
    }
     
    public void executeProgram(String program) {
        if (isOn() && !isScreenSaverOn()) {
            System.out.format("Program %s is nou executing%n", program);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer{");
        sb.append("processor=").append(processor);
        sb.append(", memory=").append(memory);
        sb.append(", hardDisk=").append(hardDisk);
        sb.append(", screen=").append(screen);
        sb.append(", on=").append(on);
        sb.append(", screenSaverOn=").append(screenSaverOn);
        sb.append('}');
        return sb.toString();
    }
    
    
}
