class Solution 
{
    public ArrayList<Character> reverseString(ArrayList<Character> s)
    {
        return sum(s, 0);
    }

    public ArrayList<Character> sum(ArrayList<Character> s, int index)
    {
        if(index >= s.size() / 2)
        {
            return s;
        }

        char temp = s.get(index);
        s.set(index, s.get(s.size() - 1 - index));
        s.set(s.size() - 1 - index, temp);

        return sum(s, index + 1);
    }
}