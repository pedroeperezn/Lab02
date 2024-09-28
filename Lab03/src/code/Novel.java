/**
 * Models the information of a novel
 * @author Minh & Pedro
 * @version 1.0
 */
class Novel
{
    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructs a Novel object
     * @param title -> Title of the novel (String)
     * @param authorName -> Name of the novel's author (String)
     * @param yearPublished -> Year of publishing (int)
     */
    Novel(String title, String authorName, int yearPublished)
    {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }


    /**
     * Retrieves the title of the novel
     * @return -> title of the novel (String)
     */
    String getTitle()
    {
        return this.title;
    }

    /**
     * Retrieves the author name of the current novel
     * @return -> author's name (String)
     */
    String getAuthorName()
    {
        return this.authorName;
    }

    /**
     * Retrieves the year in which the novel was published
     * @return -> year of publishing (int)
     */
    int getYearPublished()
    {
        return this.yearPublished;
    }
}
