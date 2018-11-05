<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 로그인 정보 확인 -->
<!-- <script type="text/javascript">
	$(document).ready(function () {
		if( "${memberVo }"  == "" ) {
			location.href = "/login";
		}
	});
</script> -->

<!-- navbar -->
<div class="navbar navbar-expand-lg fixed-top navbar-dark bg-primary">
      <div class="container">
        <a href="${uri }/" class="navbar-brand">Bootswatch</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav">
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" id="themes">Themes <span class="caret"></span></a>
              
              <div class="dropdown-menu" aria-labelledby="themes">
                <a class="dropdown-item" href="${uri }/default/">Default</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="${uri }/cerulean/">Cerulean</a>
                <a class="dropdown-item" href="${uri }/cosmo/">Cosmo</a>
                <a class="dropdown-item" href="${uri }/cyborg/">Cyborg</a>			
                <a class="dropdown-item" href="${uri }/darkly/">Darkly</a>
                <a class="dropdown-item" href="${uri }/flatly/">Flatly</a>
                <a class="dropdown-item" href="${uri }/journal/">Journal</a>
                <a class="dropdown-item" href="${uri }/litera/">Litera</a>
                <a class="dropdown-item" href="${uri }/lumen/">Lumen</a>
                <a class="dropdown-item" href="${uri }/lux/">Lux</a>
                <a class="dropdown-item" href="${uri }/materia/">Materia</a>
                <a class="dropdown-item" href="${uri }/minty/">Minty</a>
                <a class="dropdown-item" href="${uri }/pulse/">Pulse</a>
                <a class="dropdown-item" href="${uri }/sandstone/">Sandstone</a>
                <a class="dropdown-item" href="${uri }/simplex/">Simplex</a>
                <a class="dropdown-item" href="${uri }/sketchy/">Sketchy</a>
                <a class="dropdown-item" href="${uri }/slate/">Slate</a>
                <a class="dropdown-item" href="${uri }/solar/">Solar</a>
                <a class="dropdown-item" href="${uri }/spacelab/">Spacelab</a>
                <a class="dropdown-item" href="${uri }/superhero/">Superhero</a>
                <a class="dropdown-item" href="${uri }/united/">United</a>
                <a class="dropdown-item" href="${uri }/yeti/">Yeti</a>
              </div>
              
            </li>
            <li class="nav-item">
              <a class="nav-link" href="${uri }/help/">Help</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="http://blog.bootswatch.com">Blog</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" id="download">Cosmo <span class="caret"></span></a>
              <div class="dropdown-menu" aria-labelledby="download">
                <a class="dropdown-item" href="https://jsfiddle.net/bootswatch/h3fgn55j/">Open in JSFiddle</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="${uri }/4/cosmo/bootstrap.min.css">bootstrap.min.css</a>
                <a class="dropdown-item" href="${uri }/4/cosmo/bootstrap.css">bootstrap.css</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="${uri }/4/cosmo/_variables.scss">_variables.scss</a>
                <a class="dropdown-item" href="${uri }/4/cosmo/_bootswatch.scss">_bootswatch.scss</a>
              </div>
            </li>
          </ul>
          <ul class="nav navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="http://builtwithbootstrap.com/" target="_blank">Built With Bootstrap</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="https://wrapbootstrap.com/?ref=bsw" target="_blank">WrapBootstrap</a>
            </li>
          </ul>
		</div>
		
	</div>
</div>