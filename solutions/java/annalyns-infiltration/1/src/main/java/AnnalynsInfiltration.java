class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        if(knightIsAwake){
            return false;
        }
        else{
            return true;
        }    
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake){
            return true;
        }
        else if(archerIsAwake){
            return true;
        }
        else if(prisonerIsAwake){
            return true;
        }
        else{
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(prisonerIsAwake){
            if(archerIsAwake){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent){
            if(archerIsAwake){
                return false;
            }
            else{
                return true;
            }      
        }
        else{
            if(prisonerIsAwake){
                if(knightIsAwake || archerIsAwake){
                    return false;
                }
                else{
                    return true;
                }
            }
            else{
                return false;
            }
        }
    }
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    
    
   /* public static boolean canFastAttack(boolean knightIsAwake){
        if(knightIsAwake){
            return false;
        }
        else{
            return true;
        }    
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
        if(knightIsAwake){
            return true;
        }
        else if(archerIsAwake){
            return true;
        }
        else if(prisonerIsAwake){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake){
        if(prisonerIsAwake){
            if(archerIsAwake){
                return false;
            }
            else{
                return true;
            }
        }
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent){
        if(petDogIsPresent){
            if(archerIsAwake){
                return false;
            }
            else{
                return true;
            }      
        }
        else{
            if(prisonerIsAwake){
                if(knightIsAwake || archerIsAwake){
                    return false;
                }
                else{
                    return true;
                }
            }
            else{
                return false;
            }
        }
    }*/
}
