import { Link } from 'react-router-dom';

function Navbar() {
    return (
    <div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <Link to = "/">
                <div class="navbar-brand">Veebipood</div>
            </Link>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <Link to = "lisa">
                        <div class="nav-link">Lisa toode</div>
                    </Link>
                    <Link to = "halda">
                        <div class="nav-link" >Halda tooteid</div>
                    </Link>
                    <Link to = "ostukorv">
                        <div class="nav-link disabled">Ostukorv</div>
                    </Link>
                </div>
            </div>
        </nav>
    </div>
  );

}

export default Navbar;