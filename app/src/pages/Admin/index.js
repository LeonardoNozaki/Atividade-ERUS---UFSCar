import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import './styles.css';
import Login from '../../components/Login/index';

export default class Admin extends React.Component{
    render(){
        return (
          <div>
            <div>
              <Login/>
            </div>
          </div>
        );
      }

}
