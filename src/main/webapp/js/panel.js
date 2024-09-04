document.addEventListener('DOMContentLoaded', function () {
    const userName = document.querySelector('.user-name');
    
    userName.addEventListener('click', function () {
        this.classList.toggle('active');
    });

    document.addEventListener('click', function (e) {
        if (!userName.contains(e.target)) {
            userName.classList.remove('active');
        }
    });
});
