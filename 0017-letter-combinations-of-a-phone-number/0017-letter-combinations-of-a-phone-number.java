class Solution
{
    public List<String> letterCombinations(String digits) 
    {
    String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        if(digits.length()==0 || digits== null)
        {
            return result;
        }
        generate(digits,result,keypad,"");
        return result;
    }
    public void generate(String digits,List<String> result,String keypad[],String ans)
    {
        if(digits.length()==0)
        {
            result.add(ans);
            return;
        }
        int a = digits.charAt(0)-'0';
        String s = keypad[a];
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            generate(digits.substring(1),result,keypad,ans+ch);
        }
    }}
    

    
        