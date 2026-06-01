class Solution {

    public String encode(List<String> strs) {
        // if this string is empty we want to return a empty string
        if(strs.isEmpty()) return"";
        // We will now use the string builder class
        StringBuilder  res = new StringBuilder();
        // create an array list to store the size of the strings that are being used
        List<Integer> sizes = new ArrayList<>();
        // sdd the lenght of the strings in to the new array
        for (String str : strs){
            sizes.add(str.length());
        }
        for (int size : sizes){
            res.append(size).append(',');
            //this will append a comma to the end of all the sizes and creat a string from it
            // eg strings hi abc yes = "2,3,3"
        }
        //this will append a # on to the end of the res string to know when the encoding ends
        res.append('#');
        // it will now become "2,3,3#"
        for(String str : strs){
            res.append(str);
        }

        return res.toString();
    }

    public List<String> decode(String str) {
        //now check again if the length is 0
        if(str.length() == 0 ){
            return new ArrayList<>();
        }
        // create 2 new lists, 1 for the answer and one for the size of the substrings
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        // endlessly loop through until you find the end of the encoding which is #
        while (str.charAt(i) != '#'){
            StringBuilder cur = new StringBuilder();
            // while you are looping through this look for the , seperating the lenght of the string digits
            while( str.charAt(i) != ','){
                cur.append(str.charAt(i));
                //move past the ','
                i++;
            }
            //convert the found number in to an integer. This int will be the lenght of the specific string
            sizes.add(Integer.parseInt(cur.toString()));
            //move past the '#'
            i++;
        }
        i++;
        //loop thorugh the strings and take the substrings of the sizes of the strings in the size array
        for( int size : sizes){
            res.add(str.substring(i,i+size));
            i += size;
        }
        return res;
    }
}
