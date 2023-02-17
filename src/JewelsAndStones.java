public class JewelsAndStones {

    /**
     * You're given strings jewels representing the types of stones that are jewels,
     * and stones representing the stones you have. Each character in stones is a
     * type of stone you have. You want to know how many of the stones you have are
     * also jewels.
     * <p>
     * Letters are case sensitive, so "a" is considered a different type of stone from "A".
     */

    public static int numJewelsInStones(String jewels, String stones) {
        int numOfJewelsInStone = 0;
        for(int i = 0;i < stones.length();i++){
            if(jewels.contains(stones.substring(i, i + 1))){
                numOfJewelsInStone++;
            }
        }
        return numOfJewelsInStone;
    }
}
