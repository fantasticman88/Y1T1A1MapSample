import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;



public class Inventory {
    private ArrayList<String> Items = new ArrayList<>();
    private int randomW, randomH;
    final int MAX_ITEMS = 10;
    List<int[]> objectAddress;
    private int countO,countRemoveO;

    //门
    private int randomWD, randomHD;

    private int H,W;
    private int TH1,TH2,TH3,TH4;
    private int TW1,TW2,TW3,TW4;
    private int countT;



    public void addItem(String item){
        Items.add(item);
    }
    public int hasItem(String item){
        if(Items.contains(item)){
            return Items.indexOf(item);
        }else{
            return -1;
        }
    }
    public void removeItem(String item){
        Items.remove(item);
    }

    //
    public String displayInventory(){
        String output = "";
        for(int i = 0; i<Items.size(); i++){
            output += Items.get(i) + " ";
        }
        return output;
    }

    public void placeItem (Map maps, char item, int count){

        this.countO = count;
        for (int i = 0; i < count; i++) {
            randomW = (int) (maps.width * Math.random());
            randomH = (int) (maps.height * Math.random());
            maps.map[randomH][randomW]=item;
            objectAddress.add(new int[]{randomH, randomW});
            W=randomW;
            H=randomH;
        }

    }

    public void resetAddress(){
        objectAddress = new ArrayList<>();
    }


    public void removeItemInMap(Map maps,Position pos, String item){
        maps.map[pos.y][pos.x]='#';
        this.countRemoveO++;
        int[] target={pos.y,pos.x};
        this.objectAddress.removeIf(subarray -> Arrays.equals(subarray, target));
    }


    public void setDoor(Map maps){
        randomWD = (int) (maps.width * Math.random());
        randomHD = (int) (maps.height * Math.random());
        maps.map[randomHD][randomWD]='D';


    }



}
