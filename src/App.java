import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String contentBlock = "Nova Scotia Community College is transforming our province. Through our network of 14 campuses, we provide Nova Scotians with inclusive and flexible access to education and the specialized, industry-driven training essential for today and tomorrow's workforce. We believe the future lies in the power of learning, which is why we care about the success of every student - in education, in career and in life. We work with businesses, industry and community partners to provide the talent needed to grow the Nova Scotia economy. We are leaders in applied research, innovation and entrepreneurship. We are Nova Scotia's college.";

        // get the word to search for from the user
        String searchString = JOptionPane.showInputDialog(null, "Enter a word to search:");

        int count = 0;
        int index = 0;

        contentBlock = contentBlock.toLowerCase();
        searchString = searchString.toLowerCase();

        while (index != -1) {
            index = contentBlock.indexOf(searchString, index);
            if (index != -1){
                count++;
                // index = index + searchString.length();
                index += searchString.length();
            }
        }


        // JOptionPane.showMessageDialog(null, contentBlock);
        // System.out.println(count);
        // System.out.println("The word '" + searchString + "' is present in the content! \nIt is found " + count + " times.");

        if (contentBlock.contains(searchString)){
            System.out.println(String.format("The word '%s' is present in the content! \nIt is found %d times.", searchString, count));
        } else {
            System.out.println(String.format("The word '%s' is NOT present in the content!", searchString));

        }

    }
}
