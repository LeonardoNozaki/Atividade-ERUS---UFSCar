import React from 'react';
import { Card } from 'react-bootstrap';

export default class Footer extends React.Component{
    render(){
        return (
            <footer class="text-muted fixed-bottom shadow">
                <div class="container">
                    <p class="float-right">
                        <a href="#">Voltar ao topo</a>
                    </p>
                    <p>ONG Edi Freitas - Rua Três, 12, Sorocaba, Brazil 18071-303.</p>
                    <p className="copyright pull-right">
                        &copy; {new Date().getFullYear()}{" "}
                    </p>
                </div>
           </footer>
    );
    }
}
