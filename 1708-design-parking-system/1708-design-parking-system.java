class ParkingSystem {

    private int bigSlot;
    private int mediumSlot;
    private int smallSlot;
    public ParkingSystem(int big, int medium, int small) {
        bigSlot=big;
        mediumSlot=medium;
        smallSlot=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(bigSlot==0) return false;
            bigSlot--;
            return true;
            
        }else if(carType==2){
            if(mediumSlot==0) return false;
            mediumSlot--;
            return true;

        }else{
            if(smallSlot==0) return false;
            smallSlot--;
            return true;

        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */