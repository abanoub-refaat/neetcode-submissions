class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for(String str : strs){
            encodedString += str.length() + "#" + str;
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        // 5#hello5#world
        List<String> decode = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int startIndex = str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i, startIndex));
            decode.add(str.substring(startIndex + 1, startIndex + 1 + len));
            i = startIndex + 1 + len;
        }
        return decode;
    }
}
