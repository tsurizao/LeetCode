public class DefangingAnIPAddress {

//    Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//    A defanged IP address replaces every period "." with "[.]".

    public static String defangIPaddr(String address) {
        StringBuilder defanged = new StringBuilder();
        for(int i = 0;i < address.length();i++){
            if(address.charAt(i) == '.'){
                defanged.append("[.]");
                continue;
            }
            defanged.append(address.charAt(i));
        }
        return defanged.toString();
    }
}
