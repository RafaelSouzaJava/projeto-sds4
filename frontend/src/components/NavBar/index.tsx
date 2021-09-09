import Logo from 'assets/img/logo.jpeg';

const NavBar = () => {
    return (

        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
            <div className="container">
                <nav className="my-2 my-md-0 mr-md-3">
                    <img  src={Logo} alt="DevSuperior" width="200" height="15" />
                </nav>
            </div>
        </div>
    );
}

export default NavBar;