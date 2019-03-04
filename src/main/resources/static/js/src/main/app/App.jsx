import React from "react";
import ReactDom from "react-dom";

class App extends React.Component {

    render() {
        return <label>Hello, World!</label>
    }
}
ReactDOM.render(<App />, document.getElementById("react"))