module org.codefx.demo.advent.calendar {
	// list the required modules
	requires public org.codefx.demo.advent.surprise;
	// list the packages that will be publicly accessible
		exports org.codefx.demo.advent.calendar;

	//cyclic dependency
	requires org.codefx.demo.advent;
}
