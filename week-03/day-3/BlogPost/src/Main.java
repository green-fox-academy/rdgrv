public class Main {
  public static void main(String[] args) {
    BlogPost loremIpsum = new BlogPost();
    loremIpsum.title = "Lorem Ipsum";
    loremIpsum.authorName = "John Doe";
    loremIpsum.publicationDate = "04.03.2000";
    loremIpsum.text = "Lorem ipsum dolor sit amet.";

    BlogPost waitButWhy = new BlogPost();
    loremIpsum.title = "Wait but why";
    loremIpsum.authorName = "Tim Urban";
    loremIpsum.publicationDate = "10.10.2010";
    loremIpsum.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost oneEngineer = new BlogPost();
    loremIpsum.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    loremIpsum.authorName = "William Turton";
    loremIpsum.publicationDate = "28.03.2017";
    loremIpsum.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
  }
}