import java.util.Date;

class User {

    private int _numberOfPhotos = 5;

    private Date _birthdate;
    private int _size;
    private Photo[] _photos = new Photo[(int) this.get_numberOfPhotos()];
    private Address _address;

    public User(Date birthdate, int size, Photo[] photos, Address address) {
        this._birthdate = birthdate;
        this._size = size;
        this._photos = photos;
        this._address = address;
    }

    public int get_numberOfPhotos() {
        return _numberOfPhotos;
    }

    public void set_numberOfPhotos(int _numberOfPhotos) {
        this._numberOfPhotos = _numberOfPhotos;
    }

    public int get_size() {
        return _size;
    }

    public void set_size(int _size) {
        this._size = _size;
    }

    public Photo[] get_photos() {
        return _photos;
    }

    public void set_photos(Photo[] _photos) {
        this._photos = _photos;
    }

    public Address get_address() {
        return _address;
    }

    public void set_address(Address _address) {
        this._address = _address;
    }

    public Date get_birthdate() {
        return _birthdate;
    }

    public void set_birthdate(Date _birthdate) {
        this._birthdate = _birthdate;
    }
}