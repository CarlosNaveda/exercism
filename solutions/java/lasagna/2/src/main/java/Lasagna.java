public class Lasagna {
    
    int expectedTime=40;
        
    public int expectedMinutesInOven(){
        return expectedTime;
    }

    public int remainingMinutesInOven(int actualMinutesInOven){
        return expectedMinutesInOven() - actualMinutesInOven;
    }
    
    public int preparationTimeInMinutes(int numberLayers){
        return numberLayers*2;
    }

    public int totalTimeInMinutes(int numberLayers,int actualMinutesInOven){
        return preparationTimeInMinutes(numberLayers) + actualMinutesInOven;
    }
}
