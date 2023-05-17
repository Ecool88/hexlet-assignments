package exercise;

import java.util.List;
import java.util.ArrayList;
import exercise.connections.Disconnected;
import exercise.connections.Connection;

// BEGIN
public class TcpConnection {

    private Connection state;
    private String address;
    private int port;
    private List<String> buffer = new ArrayList<>();

    TcpConnection (String address, int port) {
        this.address = address;
        this.port = port;
        this.state = new Disconnected(this);
    }

    public String getCurrentState () {
        return this.state.getName();
    }

    public void connect () {
        state.connect();
    }

    public void disconnect () {
        state.disconnect();
    }

    public void write (String data) {
        state.write(data);
    }

    public void setState(Connection stateObject) {
        state = stateObject;
    }

    public void addToBuffer(String data) {
        buffer.add(data);
    }
}
// END
