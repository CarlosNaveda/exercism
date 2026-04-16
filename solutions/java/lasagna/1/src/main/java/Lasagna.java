public class Lasagna {
    
    int expectedTime=40;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return expectedTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven){
        return expectedTime-actualMinutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberLayers){
        return numberLayers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberLayers,int actualMinutesInOven){
        return preparationTimeInMinutes(numberLayers) + actualMinutesInOven;
    }
}
