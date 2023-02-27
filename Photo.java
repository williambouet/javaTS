public class Photo {

    private String _url;
    private String _filename;
    private int _width;
    private int _height;

    public Photo(String url, String filename, int width, int height) {
        this._url = url;
        this._filename = filename;
        this._width = width;
        this._height = height;
    }

    public String get_url() {
        return _url;
    }

    public void set_url(String _url) {
        this._url = _url;
    }

    public String get_filename() {
        return _filename;
    }

    public void set_filename(String _filename) {
        this._filename = _filename;
    }

    public int get_width() {
        return _width;
    }

    public void set_width(int _width) {
        this._width = _width;
    }

    public int get_height() {
        return _height;
    }

    public void set_height(int _height) {
        this._height = _height;
    }

}
