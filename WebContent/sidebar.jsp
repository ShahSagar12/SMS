<!-- start side bar -->
<div id="sidebar">
	<a href="#" class="visible-phone"><i class="icon icon-home"></i>
		Dashboard</a>
	<ul>
		<li class="active"><a href="index.jsp"><i
				class="fas fa-columns"></i><span>Dashboard</span></a></li>
		<li class="submenu"><a href="#"><i class="fas fa-user"></i> <span>Student</span>
				<span class="label label-important">3</span></a>
			<ul>
				<li><a href="addstudent.jsp">Add Student</a></li>
				<li><a href="liststudent.jsp">Student List</a></li>
				<li><a href="studentaccount.jsp">Student Account</a></li>
			</ul></li>
		<li class="submenu"><a href="#"><i class="fas fa-user-tie"></i>
				<span>Employee</span> <span class="label label-important">5</span></a>
			<ul>
				<li><a href="addemployee.jsp">Add Employee</a></li>
				<li><a href="listemployee.jsp">Employee List</a></li>
				<li><a href="employeeaccount.jsp">Employee Account</a></li>
			</ul></li>
		<li class="submenu"><a href="#"><i class="fas fa-users"></i>
				<span>Attendance</span></a>
			<ul>
				<li><a href="employeeattendance.jsp">Employee Attendance</a></li>
				<li><a href="studentattendance.jsp">Student Attendance</a></li>
			</ul></li>
		<li class="submenu"><a href="#"><i class="fas fa-book-open"></i>
				<span>Courses</span></a>
			<ul>
				<li><a href="faculty.jsp">Faculty</a></li>
				<li><a href="program.jsp">Program</a></li>
				<li><a href="subject.jsp">Subject</a></li>
			</ul></li>
		<li class="submenu"><a href="#"><i class="fas fa-book"></i> <span>Assignments</span>
				<span class="label label-important">5</span></a>
			<ul>
				<li><a href="createassignment.jsp">Create Assignment</a></li>
				<li><a href="findassignment.html">Find Assignment</a></li>
			</ul></li>
		<li class="submenu"><a href="#"><i class="fas fa-book-reader"></i>
				<span>Exam</span></a>
			<ul>
				<li><a href="viewmarks.jsp">View Marks</a></li>
				<li><a href="addmarks.jsp">ADD Marks</a></li>
				<li><a href="onlineexam.html">Online Exam</a></li>
				<li><a href="offlineexam.html">Offline Exam</a></li>
				<li><a href="seatplanning.html">Seat planning</a></li>
			</ul></li>
		<li><a href="routine.jsp"><i class="far fa-calendar-alt"></i><span>Routine</span></a></li>
		<li><a href="messages.jsp"><i class="fas fa-envelope"></i><span>Mail/SMS</span></a></li>
		<li><a href="events.jsp"><i class="fas fa-calendar"></i><span>Events</span></a></li>
		<li class="submenu"><a href="#"><i class="fas fa-book"></i><span>Library</span></a>
			<ul>
				<li><a href="addbook.jsp">ADD Book</a></li>
				<li><a href="issuebook.jsp">Issue Books</a></li>
				<li><a href="findbook.jsp">Find Books</a></li>
			</ul></li>
		<li class="submenu"><a href="#"><i class="fas fa-bus-alt"></i><span>Vehicle</span></a>
			<ul>
				<li><a href="tracevehicle.jsp">Trace</a></li>
				<li><a href="route.jsp">Route</a></li>
			</ul></li>
		<li class="content"><span>Yearly Fee Transactions</span>
			<div
				class="progress progress-mini progress-danger active progress-striped">
				<div style="width: 77%;" class="bar"></div>
			</div> <span class="percent">77%</span>
			<div class="stat">21419.94 / 14000 MB</div></li>
		<li class="content"><span>Disk Space Usage</span>
			<div class="progress progress-mini active progress-striped">
				<div style="width: 87%;" class="bar"></div>
			</div> <span class="percent">87%</span>
			<div class="stat">604.44 / 4000 MB</div></li>
	</ul>
</div>
<!-- end side bar -->

<script src="assets/js/excanvas.min.js"></script>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.ui.custom.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.flot.min.js"></script>
<script src="assets/js/jquery.flot.resize.min.js"></script>
<script src="assets/js/jquery.peity.min.js"></script>
<script src="assets/js/fullcalendar.min.js"></script>
<script src="assets/js/matrix.js"></script>
<script src="assets/js/matrix.dashboard.js"></script>
<script src="assets/js/jquery.gritter.min.js"></script>
<script src="assets/js/matrix.interface.js"></script>
<script src="assets/js/matrix.chat.js"></script>
<script src="assets/js/jquery.validate.js"></script>
<script src="assets/js/matrix.form_validation.js"></script>
<script src="assets/js/jquery.wizard.js"></script>
<script src="assets/js/jquery.uniform.js"></script>
<script src="assets/js/select2.min.js"></script>
<script src="assets/js/jquery.dataTables.min.js"></script>
<script src="assets/js/matrix.tables.js"></script>

<script type="text/javascript">
	// This function is called from the pop-up menus to transfer to
	// a different page. Ignore if the value returned is a null string:
	function goPage(newURL) {

		// if url is empty, skip the menu dividers and reset the menu selection to default
		if (newURL != "") {

			// if url is "-", it is this page -- reset the menu:
			if (newURL == "-") {
				resetMenu();
			}
			// else, send page to designated URL            
			else {
				document.location.href = newURL;
			}
		}
	}

	// resets the menu selection upon entry to this page:
	function resetMenu() {
		document.gomenu.selector.selectedIndex = 2;
	}
</script>