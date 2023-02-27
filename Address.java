public class Address {

    private String _number;
    private String _street;
    private String _city;
    private String _country;

    public Address(String number, String street, String city, String country) {
        this._number = number;
        this._street = street;
        this._city = city;
        this._country = country;
    }

    public String get_country() {
        return _country;
    }

    public void set_country(String _country) {
        this._country = _country;
    }

    public String get_city() {
        return _city;
    }

    public void set_city(String _city) {
        this._city = _city;
    }

    public String get_street() {
        return _street;
    }

    public void set_street(String _street) {
        this._street = _street;
    }

    public String get_number() {
        return _number;
    }

    public void set_number(String _number) {
        this._number = _number;
    }

}
