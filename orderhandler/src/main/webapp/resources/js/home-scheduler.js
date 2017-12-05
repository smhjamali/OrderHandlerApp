$(function() { // dom ready

	var todayDate = moment().startOf('day');
	var YESTERDAY = todayDate.clone().subtract(1, 'day').format('YYYY-MM-DD');
	var TODAY = todayDate.format('YYYY-MM-DD');
	var TOMORROW = todayDate.clone().add(1, 'day').format('YYYY-MM-DD');

	$('#calendar').fullCalendar({
		resourceAreaWidth: 230,
		editable: true,
		aspectRatio: 1.5,
		scrollTime: '00:00',
		header: {
			left: 'promptResource today prev,next',
			center: 'title',
			right: 'timelineDay,timelineThreeDays,agendaWeek,month'
		},
		customButtons: {
			promptResource: {
				text: '+ room',
				click: function() {
					var title = prompt('Room name');
					if (title) {
						$('#calendar').fullCalendar(
							'addResource',
							{ title: title },
							true // scroll to the new resource?
						);
					}
				}
			}
		},
		defaultView: 'timelineDay',
		views: {
			timelineThreeDays: {
				type: 'timeline',
				duration: { days: 3 }
			}
		},
		resourceLabelText: 'Rooms',
		resources: [
			{ id: 'a', title: 'Auditorium A' },
			{ id: 'b', title: 'Auditorium B', eventColor: 'green' },
			{ id: 'c', title: 'Auditorium C', eventColor: 'orange' },
			{ id: 'd', title: 'Auditorium D', children: [
				{ id: 'd1', title: 'Room D1' },
				{ id: 'd2', title: 'Room D2' }
			] },
			{ id: 'e', title: 'Auditorium E' },
			{ id: 'f', title: 'Auditorium F', eventColor: 'red' },
			{ id: 'g', title: 'Auditorium G' },
			{ id: 'h', title: 'Auditorium H' },
			{ id: 'i', title: 'Auditorium I' },
			{ id: 'j', title: 'Auditorium J' },
			{ id: 'k', title: 'Auditorium K' },
			{ id: 'l', title: 'Auditorium L' },
			{ id: 'm', title: 'Auditorium M' },
			{ id: 'n', title: 'Auditorium N' },
			{ id: 'o', title: 'Auditorium O' },
			{ id: 'p', title: 'Auditorium P' },
			{ id: 'q', title: 'Auditorium Q' },
			{ id: 'r', title: 'Auditorium R' },
			{ id: 's', title: 'Auditorium S' },
			{ id: 't', title: 'Auditorium T' },
			{ id: 'u', title: 'Auditorium U' },
			{ id: 'v', title: 'Auditorium V' },
			{ id: 'w', title: 'Auditorium W' },
			{ id: 'x', title: 'Auditorium X' },
			{ id: 'y', title: 'Auditorium Y' },
			{ id: 'z', title: 'Auditorium Z' }
		],
		events: [
			{ id: '1', resourceId: 'b', start: TODAY + 'T02:00:00', end: TODAY + 'T07:00:00', title: 'event 1' },
			{ id: '2', resourceId: 'c', start: TODAY + 'T05:00:00', end: TODAY + 'T22:00:00', title: 'event 2' },
			{ id: '3', resourceId: 'd', start: YESTERDAY, end: TOMORROW, title: 'event 3' },
			{ id: '4', resourceId: 'e', start: TODAY + 'T03:00:00', end: TODAY + 'T08:00:00', title: 'event 4' },
			{ id: '5', resourceId: 'f', start: TODAY + 'T00:30:00', end: TODAY + 'T02:30:00', title: 'event 5' }
		]
	});

});

// readjust sizing after font load
$(window).on('load', function() {
	$('#calendar').fullCalendar('render');
});
