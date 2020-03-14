/*
@author unobatbayar
Testing  for loop vs. for each loop */
class ForEachLoop{
    public static void main(String[] args){
        setNullError();
    }

    private static void setNullError(){
        String[] inputFields = new String[]{"inputLocalityName", "inputTown", "inputPremiseName", "inputBuildingLevel"};

        for (int i = 0; i < inputFields.length; i++) {
            print(inputFields[i]);
        }
        for( String data: inputFields){
            print(data);
        }
    }

    private static void print(String message){
        System.out.println(message);
    }
}