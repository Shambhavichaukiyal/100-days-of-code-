class Solution
{
    public List<String> letterCombinations(String digits) 
    {
       List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        String[] keypad = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        generate("", digits, keypad, result);
        return result;
    }
        
   public void generate(String current, String digits, String[] keypad, List<String> result) {
        if (digits.length() == 0) {
            result.add(current);
            return;
        }
        char digit = digits.charAt(0);
        String letters = keypad[digit - '0'];
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            generate(current + letter, digits.substring(1), keypad, result);
        }
    }}
