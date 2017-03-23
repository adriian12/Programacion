var dataset = [ {datos: 9}, //alumnos que empiezan
					      {datos: 7}, //alumnos van FTP
                {datos: 6}, //empresas que hay
                {datos: 6}, //empresas reciben gente
                {datos: 5}, // 375€-500€
                {datos: 2}, // 500€-750€
                {datos: 5}, //backend 
                {datos: 2}, //frontend
                ];

var w = 250;
var h = 250;
var outerRadius = w / 2;
var innerRadius = 50;

var arc = d3.svg.arc()
  .innerRadius(innerRadius)
  .outerRadius(outerRadius);
var color;
color = d3.scale.ordinal()
	.domain(dataset)
	.range(["#00CC00", "#FF0000", "#FFD700", "#FC0FC0", "#C0C0C0", "#DEB887", "#4169E1", "#000000"]);
var svg = d3.select("body")
  .append("svg")
  .attr("width", w)
  .attr("height", h);

var pie = d3.layout.pie()
  .sort(null)
  .value(function(d) {
    return d.datos;
  });

/*** 
* Actualizar
***/
function update(data) {
  var arcs = svg.selectAll("g.arc").data(pie(data));
  arcs.exit().remove();
  arcs.enter().append("g")
    .attr("class", "arc")
    .attr("transform", "translate(" + outerRadius + ", " + outerRadius + ")")

  var paths = arcs.selectAll('path').data(function (d, i) {
    d.idx = i;
    return [d];
  })
  paths.enter().append('path');
  paths
		.transition().duration(1000)
  	.attr("fill", function(d) {
      return color(d.idx);
    })
    .attr("d", arc);
  
  var texts = arcs.selectAll('text').data(function (d) {
    return [d];
  })
  texts.enter().append('text');
  texts
		.transition().duration(1000)
		.attr("transform", function(d) {
      return "translate(" + arc.centroid(d) + ")";
    })
    .attr("text-anchor", "middle")
    .attr("font-family", "sans-serif")
		.attr("fill", "white")
    .text(function(d) {
      return d.value;
    });
}
update(dataset);

d3.selectAll('button').on('click', function() {
  var newData;
  if (this.id == 'cursoDos') {
    newData = [{datos: 14}, //alumnos que empiezan
					      {datos: 10}, //alumnos van FTP
                {datos: 10}, //empresas que hay
                {datos: 8}, //empresas reciben gente
                {datos: 8}, // 375€-500€
                {datos: 2}, // 500€-750€
                {datos: 8}, //backend 
                {datos: 2}, //frontend
              ];
		color = d3.scale.ordinal()
			.domain(newData)
			.range(["#00CC00", "#FF0000", "#FFD700", "#FC0FC0", "#C0C0C0", "#DEB887", "#4169E1", "#000000"]);
    update(newData);
  }else if(this.id == 'cursoTres') {
		newData = [{datos: 15}, //alumnos que empiezan
					      {datos: 10}, //alumnos van FTP
                {datos: 10}, //empresas que hay
                {datos: 7}, //empresas reciben gente
                {datos: 6}, // 375€-500€
                {datos: 4}, // 500€-750€
                {datos: 7}, //backend 
                {datos: 3}, //frontend
              ];
		color = d3.scale.ordinal()
			.domain(newData)
			.range(["#00CC00", "#FF0000", "#FFD700", "#FC0FC0", "#C0C0C0", "#DEB887", "#4169E1", "#000000"]);
    update(newData);
  }else if(this.id == 'cursoCuatro'){
		newData = [{datos: 15}, //alumnos que empiezan
					      {datos: 12}, //alumnos van FTP
                {datos: 14}, //empresas que hay
                {datos: 11}, //empresas reciben gente
                {datos: 8}, // 375€-500€
                {datos: 4}, // 500€-750€
                {datos: 10}, //backend 
                {datos: 2}, //frontend
              ];
		color = d3.scale.ordinal()
			.domain(newData)
			.range(["#00CC00", "#FF0000", "#FFD700", "#FC0FC0", "#C0C0C0", "#DEB887", "#4169E1", "#000000"]);
    update(newData);
	}else if(this.id == 'cursoCinco') {
		newData = [{datos: 23}, //alumnos que empiezan
					      {datos: 14}, //alumnos van FTP
                {datos: 16}, //empresas que hay
                {datos: 13}, //empresas reciben gente
                {datos: 9}, // 375€-500€
                {datos: 5}, // 500€-750€
                {datos: 11}, //backend 
                {datos: 4}, //frontend
              ];
		color = d3.scale.ordinal()
			.domain(newData)
			.range(["#00CC00", "#FF0000", "#FFD700", "#FC0FC0", "#C0C0C0", "#DEB887", "#4169E1", "#000000"]);
    update(newData);
  }else {
		newData = [ {datos: 9}, //alumnos que empiezan
					      {datos: 7}, //alumnos van FTP
                {datos: 6}, //empresas que hay
                {datos: 6}, //empresas reciben gente
                {datos: 5}, // 375€-500€
                {datos: 2}, // 500€-750€
                {datos: 5}, //backend 
                {datos: 2}, //frontend
              ];
		color = d3.scale.ordinal()
			.domain(newData)
			.range(["#00CC00", "#FF0000", "#FFD700", "#FC0FC0", "#C0C0C0", "#DEB887", "#4169E1", "#000000"]);
    update(newData);
	}
});
