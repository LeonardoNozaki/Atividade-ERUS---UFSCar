import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import MyNavbar from './Navbar/index';
import Footer from './Footer/index'

export default class App extends React.Component{
  render(){
    return (
      <div>
        <MyNavbar initActive={0}/>
        <Footer />
      </div>
    );
  }
}
