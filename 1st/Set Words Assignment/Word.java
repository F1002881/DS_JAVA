public class Word {
    private String word;

    public Word(){this.word="";}

    public Word(String word){this.word=word;}

    public String getWord(){return word;}

    public void setWord(String word){this.word=word;}

    public int getLength()
    {return word.length();}

    public int compareTo(Word other)
    {
        if(getLength() > other.getLength())
            return -1;
        else if(getLength() < other.getLength())
            return 1;
        return word.compareTo(other.word);
    }
    public String toString()
    {
        return word;
    }
}
