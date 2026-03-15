//1. two strings are isomorphic if characters in the first string can be replaced to get
// the second string with one-toone mapping

//2.Each character must map to only one character
//input= s="egg",t="add"
//output; true

//i/p; s="foo",t="bar"
//o/p; false

//i/p; s="paper",t="title"
//op: true

public class isomorphic_string
{
    public static void main(String[] args) {
        String s="egg";
        String t="add";
        if(s.length()!=t.length())
        {
            System.out.println(false);
            return;
        }
        int[] map1=new int[256];
        int[] map2=new int[256];
        boolean isIsomorphic=true;
        for (int i = 0; i < s.length(); i++) {
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
            {
                  isIsomorphic=false;
                  break;
            }
            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        System.out.println(isIsomorphic);


    }
}