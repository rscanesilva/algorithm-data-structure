package algoritmos.util;

public class Utils {

    public static final String LOREM_IPSUM_BASE = """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse a arcu a nisi consequat gravida. Aenean lacinia maximus semper. Vestibulum placerat velit id risus tempus, eget interdum lorem consequat. Sed venenatis accumsan ipsum, vel facilisis dui commodo nec. Fusce eu egestas diam. Cras cursus pellentesque mi in accumsan. Nulla placerat vestibulum lorem ut molestie. Vestibulum eget urna vel felis viverra rutrum a ut sapien.
            In hac habitasse platea dictumst. Cras gravida a lectus ut egestas. Cras mauris neque, posuere eget semper vitae, tincidunt in lacus. Morbi felis nulla, sodales in laoreet eu, mollis eget urna. Phasellus in magna at erat facilisis pharetra. Nam ac vulputate elit, ac mattis erat. Maecenas at neque ipsum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nulla porta mi arcu, nec tristique felis commodo vel. Maecenas eget quam finibus, iaculis nulla ut, semper massa. Aliquam iaculis maximus metus quis condimentum. Sed semper mollis lacus id suscipit.
            Suspendisse pellentesque, felis vel condimentum egestas, nisi libero viverra lacus, in pellentesque quam augue eget quam. Aliquam erat volutpat. Mauris quam mi, elementum vitae dolor non, maximus lacinia erat. Mauris ac purus id velit dictum aliquet vitae et nisl. Quisque gravida auctor mauris, ac dictum massa. Morbi lorem tellus, fermentum vitae laoreet non, rutrum ac est. Sed mattis eros erat, a cursus augue egestas non. Duis interdum ultricies auctor. Maecenas pellentesque blandit consectetur. Quisque nisi justo, consectetur ac metus vitae, vestibulum suscipit magna. Proin feugiat ipsum et metus aliquet, vitae vulputate erat interdum. Quisque nunc erat, interdum nec varius quis, fermentum eget leo. Phasellus posuere maximus augue, non fringilla ex tincidunt eget.
            Proin pellentesque porta nunc lacinia gravida. Phasellus aliquam vel nisi ac tristique. Quisque vel rutrum nisl, vel commodo augue. Cras semper odio in magna eleifend, a volutpat neque viverra. Cras at tortor commodo, euismod ante ac, vehicula lectus. Morbi ac egestas nisl. Maecenas tortor enim, dapibus vitae finibus vel, luctus vel felis. In sodales ante sed fringilla placerat. Integer congue commodo ex vitae mattis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Cras sagittis at massa vel facilisis. Proin ante magna, finibus nec leo vel, venenatis dignissim arcu. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nam vel fringilla nunc. Sed id sodales mi, pharetra cursus dolor.
            Donec aliquam congue vehicula. Pellentesque vitae porta erat, sed imperdiet tellus. Sed tempus gravida purus, eu tristique mauris fermentum sed. Suspendisse venenatis tempus finibus. Donec lobortis leo nec mauris varius finibus. Maecenas ut sapien quis odio consectetur porttitor. Nam egestas quis justo luctus placerat. Aenean bibendum est quis tortor fermentum aliquam. Duis nec nisl molestie, aliquet felis vel, ornare sapien. Ut blandit feugiat sem et ultricies. Nam bibendum iaculis sodales. Donec ullamcorper pretium imperdiet. Sed finibus nibh arcu, a faucibus augue cursus a.
            """;

    public static String getLoremIpsum(int length) {
        String loremIpsum = "";
        for(var x=0; x<length; x++) {
            loremIpsum += LOREM_IPSUM_BASE;
        }
        return loremIpsum;
    }
}
