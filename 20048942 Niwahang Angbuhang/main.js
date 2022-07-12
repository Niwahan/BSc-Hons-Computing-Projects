var a = 0; //setting a to 0
show(a); //show image having var a
change_auto();

function change(n) {
  a += n; //add or subtract 1 to a
  show(a); //show image having var a
}

function change_auto() {
  a++; //increment a
  show(a); //show image having var a
  setTimeout(change_auto, 5000); //Change image every 5 seconds
}

function show(n) {
  var x = document.getElementsByClassName("Slide"); //gets elements having class name "Slide" and puts in an array

  if (n > x.length - 1) {
    a = 0; //if n is greater than the indexes of the array then set a to 0
  }
  if (n < 0) {
    a = x.length - 1; //if n is less than 0 then set a to the last index of the array
  }
  for (var i = 0; i < x.length; i++) {
    x[i].style.display = "none"; //set display none to all
  }

  x[a].style.display = "block"; //set display block to element with var a
}

function toggle1() {
  var p1 = document.getElementById("1"); //1st image
  var p2 = document.getElementById("11"); //2nd image

  if (p1.style.display == "none") {
    // if 1st image is hidden
    p1.style.display = "block"; // display 1st image
    p2.style.display = "none"; // hide 2nd image
  } else {
    p1.style.display = "none"; // hide 1st image
    p2.style.display = "block"; // display 2nd image
  }
}

function toggle2() {
  var q1 = document.getElementById("2");
  var q2 = document.getElementById("22");

  if (q1.style.display == "none") {
    q1.style.display = "block";
    q2.style.display = "none";
  } else {
    q1.style.display = "none";
    q2.style.display = "block";
  }
}

function toggle3() {
  var r1 = document.getElementById("3");
  var r2 = document.getElementById("33");

  if (r1.style.display == "none") {
    r1.style.display = "block";
    r2.style.display = "none";
  } else {
    r1.style.display = "none";
    r2.style.display = "block";
  }
}

function toggle4() {
  var s1 = document.getElementById("4");
  var s2 = document.getElementById("44");
  if (s1.style.display == "none") {
    s1.style.display = "block";
    s2.style.display = "none";
  } else {
    s1.style.display = "none";
    s2.style.display = "block";
  }
}

function toggle5() {
  var t1 = document.getElementById("5");
  var t2 = document.getElementById("55");

  if (t1.style.display == "none") {
    t1.style.display = "block";
    t2.style.display = "none";
  } else {
    t1.style.display = "none";
    t2.style.display = "block";
  }
}
