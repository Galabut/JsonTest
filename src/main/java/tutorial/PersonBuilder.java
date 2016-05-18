package tutorial;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Julia Galabut on 18.05.2016.
 */
public class PersonBuilder {
    public static void main(String[] args) {
        AddressBookProtos.Person jonh = AddressBookProtos.Person.newBuilder()
                .setId(1)
                .setEmail("john@gmail.com")
                .addPhone(AddressBookProtos
                        .Person.PhoneNumber.newBuilder()
                        .setNumber("1231-546")
                        .setType(AddressBookProtos
                                .Person.PhoneType.HOME))
                .addPhone(AddressBookProtos.Person.PhoneNumber.newBuilder()
                        .setNumber("21212121")
                        .setType(AddressBookProtos
                                .Person.PhoneType.MOBILE))
                .setName("John Doe").build();

        AddressBookProtos.Person mary = AddressBookProtos.Person.newBuilder()
                .setId(1)
                .setEmail("mary@gmail.com")
                .addPhone(AddressBookProtos
                        .Person.PhoneNumber.newBuilder()
                        .setNumber("1231-546")
                        .setType(AddressBookProtos
                                .Person.PhoneType.HOME))
                .setName("Mary Doe").build();

        List<AddressBookProtos.Person> persons = Arrays.asList(jonh, mary);

        AddressBookProtos.AddressBook book = AddressBookProtos.AddressBook.newBuilder().addAllPerson(persons).build();

        System.out.println(jonh.toString());


        String personMessege = "person {\n" +
                "  name: \"Mary2 Doe\"\n" +
                "  id: 1\n" +
                "  email: \"mary@gmail.com\"\n" +
                "  phone {\n" +
                "    number: \"1231-546\"\n" +
                "    type: HOME\n" +
                "  }\n";
        try {
            AddressBookProtos.Person person = AddressBookProtos.Person.parseFrom(ByteString.copyFromUtf8(personMessege));
            book.newBuilderForType().addPerson(person).build();
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        System.out.println(book.toString());
    }
}
