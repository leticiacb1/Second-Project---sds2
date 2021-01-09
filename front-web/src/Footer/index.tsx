import './styles.css'
import {ReactComponent as YoutubeIcon} from './youtube.svg';
import {ReactComponent as LinkdinIcon} from './linkedin.svg';
import {ReactComponent as InstagramIcon} from './instagram.svg';

function Footer(){
    return(
        <footer className="main-footer">
            App desenvolvido durante a 2° ed. do evento Semana DevSuperior
            <div className="footer-icons">
                <a href="https://www.youtube.com/c/DevSuperior" target="new"> <YoutubeIcon/> </a>
                <a href="https://www.linkedin.com/school/devsuperior/" target="new"> <LinkdinIcon/></a>
                <a href="https://www.instagram.com/devsuperior.ig" target="new"><InstagramIcon/></a>
            </div>
        </footer>
    )
}

export default  Footer;