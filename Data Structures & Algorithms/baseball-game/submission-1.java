class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> score = new ArrayList<>();
        int total =0;
        for(String c : operations){
            if(c.equals("+")){
                //do action
                score.add(score.get(score.size() - 1)+score.get(score.size() - 2));
            }else if(c.equals("C")){
                //do action
                score.remove(score.get(score.size() - 1));
            }else if(c.equals("D")){
                //do action
                score.add(score.get(score.size() - 1)*2);
            }else{
                score.add(Integer.parseInt(c));
            }
        }
        for(int s : score){
            total = total+s;
        }
        return total;
    }
}