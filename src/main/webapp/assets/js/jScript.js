var webSocket = new WebSocket("ws://localhost:80/messagendpoint")

webSocket.onopen= function(message){console.log("Open")};
webSocket.onclose= function(message){console.log("Close")};
webSocket.onmessage= function(message){
    console.log("Message")
};
webSocket.onerror= function(message){console.log("Error")};