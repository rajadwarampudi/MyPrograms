
public class Solution {
	public char findTheDifference(String s, String t) 
    {
        
		int n = t.length();
		char c = t.charAt(n - 1);
		for (int i = 0; i < n - 1; ++i) {
			c ^= s.charAt(i);
			c ^= t.charAt(i);
		}
		return c;

		/*
		 * initial version
		int[] sChars = new int[26];
        int[] tChars = new int[26];
        for(int i = 0 ; i < 26; i++)
        {
            sChars[i] = 0;
            tChars[i] = 0;
        }
        for(int i = 0 ; i < s.length(); i++)
        {
            sChars[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0 ; i < t.length(); i++)
        {
            tChars[t.charAt(i) - 'a'] += 1;
        }
        for(int i = 0 ; i < 26; i++)
        {
            if(sChars[i] < tChars[i])
            {
                return (char) (i + 97);
            }
        }
        
        return '0'; */
        
    }

}
