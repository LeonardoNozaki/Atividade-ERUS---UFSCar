import React from 'react';
import Button from 'react-bootstrap/Button';
import MyNavbar from './Navbar';
import Footer from './Footer'
export default class App extends React.Component{
  render(){
    return (
      <div>
        <MyNavbar />
        <Footer />
      </div>
    );
  }
}
