module org.codefx.demo.advent {
	// list the required modules
	requires org.codefx.demo.advent.calendar.v1;
	requires org.codefx.demo.advent.calendar.v2;
	// list the used services
	uses org.codefx.demo.advent.surprise.SurpriseFactory;
	// exports no functionality
}
