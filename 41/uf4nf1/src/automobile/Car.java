package automobile;

import java.util.Objects;

/**
 *
 * @author ProvenSoft
 */
public class Car {
    
    private String license;
    
    private String brand;
    private String model;
    private String fuel;
    
    private int numEngines;
    
    private boolean started;
    private double speed;
    private int engine;

    public Car(String license, String brand, String model, String fuel,int numEngines) {
        this.license = license;
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.numEngines = numEngines;
    }


    public Car() {
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean isStarted() {
        return started;
    }

    public double getSpeed() {
        return speed;
    }

    public int getEngine() {
        return engine;
    }

    public int getNumEngines() {
        return numEngines;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.license);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        return Objects.equals(this.license, other.license);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("license=").append(license);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", fuel=").append(fuel);
        sb.append(", started=").append(started);
        sb.append(", speed=").append(speed);
        sb.append(", engine=").append(engine);
        sb.append(", numEngines=").append(numEngines);
        sb.append('}');
        return sb.toString();
    }
    
    /**
     * starts the car
     * @return true if car has been started successfully, false otherwise
     */
    public boolean start() {
        boolean b = false;
        if (!started) {
            started = true;
            b = true;
        }
        return b;
    }
    
    /**
     * stops the car
     * @return true if car has been stopped successfully, false otherwise
     */
    public boolean stop() {
        boolean b = false;
        if (started) {
            started = false;
            b = true;
        }
        return b;
    }  
    
    public boolean accelerate(double deltaSpeed) {
        speed += deltaSpeed;
        return true;
    }
    
    public boolean decelerate(double deltaSpeed) {
        speed -= deltaSpeed;
        if (speed < 0.0) speed = 0.0;
        return true;
    }
    
    public boolean changeEngine(int engine) {
        boolean b = false;
        if ( (engine <= numEngines) && (engine >= -1) ) {
            this.engine = engine;
            b = true;
        } 
        return b;
    }
}
