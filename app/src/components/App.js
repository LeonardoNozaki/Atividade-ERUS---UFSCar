import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import MyNavbar from './Navbar/index';
import Footer from './Footer/index'
import MyCarousel from './MyCarrousel/index';

export default class App extends React.Component{
  render(){
    return (
      <div>
        <div>
          <MyNavbar />
        </div>
        <div>
          <MyCarousel />
        </div>
        <div>
<MyCarousel />  
        </div>
        <Footer />
      </div>
    );
  }
}
