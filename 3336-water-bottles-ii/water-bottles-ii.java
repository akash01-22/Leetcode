class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottle=numBottles;
        int drunkenBottle=numBottles;
        while(drunkenBottle>=numExchange){
            drunkenBottle-=numExchange;
            numExchange++;
            bottle++;
            drunkenBottle++;
        }
        return bottle;
    }
}