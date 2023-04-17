<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<style>
nav {
	margin-bottom: 10px;
	float: right;
}
</style>
<meta charset="UTF-8">
<title>스마트 쇼핑몰</title>
</head>
<body>
	<div class="w3-content w3-container w3-margin-top">
		<div class="w3-container w3-card-4">
			<div class="w3-center w3-large w3-margin-top">
				<h3>로그인</h3>
			</div>
			<nav id="tab-button-nav">
				<div class="btn-group">
					<button type="button" class="btn btn-info tab-button"
						data-tab-section="tab-section-1">일반 회원 로그인</button>
					<button type="button" class="btn btn-info tab-button"
						data-tab-section="tab-section-2">기업 회원 로그인</button>
				</div>
			</nav>
			<section id="tab-section-1" class="tab-section">
				<div>
					<form action="join/login" method="post">
						<p>
							<label>아이디</label> <input name="C_id" id="C_id" class="w3-input"
								required> <span id="id_check" class="w3-text-red"></span>
						</p>
						<p>
							<label>패스워드</label> <input name="C_pass" id="C_pass"
								class="w3-input" type="password" required>
						</p>
						<p class="w3-center">
							<button type="submit" id="join_button"
								class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-round">로그인</button>
						</p>
					</form>

				</div>
			</section>
			<section id="tab-section-2" class="tab-section" hidden>
				<div>
					<form action="join/login_M" method="post">
						<p>
							<label>기업 아이디</label> <input name="M_id" id="M_id"
								class="w3-input" required> <span id="id_Mcheck"
								class="w3-text-red"></span>
						</p>
						<p>
							<label>패스워드</label> <input name="M_pass" id="M_pass"
								class="w3-input" type="password" required>
						</p>
						<p class="w3-center">
							<button type="submit" id="join_button"
								class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-round">로그인</button>
						</p>
					</form>
				</div>
			</section>
			<div>
				<button type="button" onclick="location.href='./join/join'"
					class="w3-button w3-block w3-black w3-ripple w3-margin-top w3-margin-bottom w3-round">
					아이디가 없다면 회원가입!</button>
			</div>
		</div>
	</div>
	<script>
    const $nav = document.querySelector('#tab-button-nav')
    const $sections = document.querySelectorAll('.tab-section');

    $nav.addEventListener('click', (e) => {
      if (!e.target.classList.contains('tab-button')) {
        return;
      }
          
      const focusedTabId = e.target.dataset.tabSection;

      $sections.forEach(($section) => {
        if ($section.id === focusedTabId) {
          $section.removeAttribute('hidden');
        } else {
          $section.setAttribute('hidden', true);
        }
      });
    });
  </script>

</body>
</html>
