* {
    margin: 0;
    box-sizing: border-box;
}

body{
    font-family: sans-serif;
    padding: 90px 20px 0;
}
.header {
    background-color: #076AF0;
    height: 80px;
    position: fixed;
    top: 0;
    left: 0;
    width: 100%
}
.nav {
    display: flex;
    justify-content: space-between;
    max-width: 992px;
    margin: 0 auto;
}

.nav-link {
    color: white;
    text-decoration: none;
}
.logo {
    font-size: 30px;
    font-weight: bold;
    padding: 0 40px;
    line-height: 80px;
}
.nav-menu {
    display: flex;
    margin-right: 40px;
    list-style: none;
}
.nav-menu-item {
    font-size: 18px;
    margin: 0 10px;
    line-height: 80px;
    width: max-content;
}
.nav-menu-link {
    padding: 8px 12px;
    border-radius: 8px;
}
.nav-menu-link:hover {
    background-color: #024070;
    transition: 0.8s;
}

