<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style_header.css">
		<link rel="stylesheet" type="text/css" href="css/style_join02_info_input.css">
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" type="text/css" href="css/style_footer.css">
		<title>회원가입 - 회원정보입력</title>
		<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script>
			$(function(){
				
				$("#zipBtn").click(function(){
				    new daum.Postcode({
				        oncomplete: function(data) {
				        	$("#postal").val(data.zonecode);
				        	$("#addr1").val(data.address);
				        	
				        }//function(data)
				    }).open();
				}) // zipBtn
				
				
			}); // jquery
		</script>
	</head>
	<body>
		<%@ include file="top.jsp" %>
		<section>
			<form name="dojoin.do" method="get" action="dojoin.do">
				<div id="subBanner"></div>
				<div id="locationN">
					<ul>
						<li>HOME</li>
						<li>회원가입</li>
						<li>회원정보입력</li>
					</ul>
				</div>
				
				<div id="sub_top_area">
					<h3>회원가입</h3>
				</div>
				
				<div id="join_step_div">
					<ul>
						<li>
							<span>STEP.1</span>
							<p>약관동의</p>
						</li>
						<li>
							<span>STEP.2</span>
							<p>회원정보</p>
						</li>
						<li>
							<span>STEP.3</span>
							<p>회원가입완료</p>
						</li>
					</ul>
				</div>
				
				<h4>
					필수 정보 입력 
					<span>(* 항목은 필수 항목입니다.)</span>
				</h4>
				<fieldset class="fieldset_class">
					<dl id="join_name_dl">
						<dt>
							<div></div>
							<label for="name">이름</label>
						</dt>
						<dd>
							<input type="text" id="name" name="name"/>
						</dd>
					</dl>
					<dl id="join_id_dl">
						<dt>
							<div></div>
							<label for="id">아이디</label>
						</dt>
						<dd>
							<input type="text" id="id" name="id" />
							<input type="button" value="중복확인"/>
							<span>4~16자리의 영문, 숫자, 특수기호(_)만 사용하실 수 있습니다.</span>
							<span>첫 글자는 영문으로 입력해 주세요.</span>
						</dd>
					</dl>
					<dl id="join_pw1_dl">
						<dt>
							<div></div>
							<label for="pw1">비밀번호</label>
						</dt>
						<dd>
							<input type="password" id="pw1" name="pw1"  />
							<span>영문, 숫자, 특수문자 중 2종류 조합 시 10자리 이상 입력</span>
							<span>영문, 숫자, 특수문자 모두 조합 시 8자리 이상 입력</span>
						</dd>
					</dl>
					<dl id="join_pw2_dl">
						<dt>
							<div></div>
							<label for="pw2">비밀번호 확인</label>
						</dt>
						<dd>
							<input type="password" id="pw2" name="pw2" />
							<span>비밀번호를 다시 한번 입력해 주세요.</span>
						</dd>
					</dl>
					<dl id="join_mail_dl">
						<dt>
							<div></div>
							<label for="mail_id">이메일</label>
						</dt>
						<dd>
							<input type="text" id="mail_id" name="mail_id"  />
							<span>@</span>
							<input type="text" id="main_tail" name="mail_tail"  />
							<select>
								<option selected>직접입력</option>
								<option>지메일</option>
								<option>네이버</option>
								<option>네이트</option>
								<option>핫메일</option>
								<option>파란</option>
								<option>엠팔</option>
								<option>야후</option>
								<option>드림위즈</option>
								<option>한메일(다음)</option>
							</select>
						</dd>
					</dl>
					
					<dl id="join_address_dl">
						<dt> 
							<div></div>
							<label for="">주소</label>
						</dt>
						<dd>
							<input type="text" id="postal" name="postal"  />
							<span></span>
							<input type="hidden" id="l_postal" name="l_postal"  />
							<input type="button" id="zipBtn" value="우편번호"/>
							<input type="text" id="addr1" name="addr1"  />
							<input type="text" id="addr2" name="addr2"  />
						</dd>
						
					</dl>
					
					<dl id="join_tell_dl">
						<dt>
							<div></div>
							<label for="f_tell">휴대전화</label>
						</dt>
						<dd>
							<input type="text" id="f_tell" name="f_tell" />
							<span> - </span>
							<input type="text" id="m_tell" name="m_tell" />
							<span> - </span>
							<input type="text" id="l_tell" name="l_tell" />
						</dd>
					</dl>
					<dl id="join_birth_dl">
						<dt>
							<div></div>
							<label for="birth_year">생년월일</label>
						</dt>
						<dd>
							<select id="b_year" name="b_year" >
								<option selected>선택</option>
								<option value="1988">1988</option>
								<option value="1989">1989</option>
								<option value="1990">1990</option>
								<option value="1991">1991</option>
								<option value="1992">1992</option>
								<option value="1993">1993</option>
								<option value="1994">1994</option>
								<option value="1995">1995</option>
								<option value="1996">1996</option>
								<option value="1997">1997</option>
								<option value="1998">1998</option>
								<option value="1999">1999</option>
								<option value="2000">2000</option>
							</select>
							<span>년</span>
							<select id="b_month" name="b_month" >
								<option selected>선택</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
							</select>
							<span>월</span>
							<select id="b_day" name="b_day" >
								<option selected>선택</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
							</select>
							<span>일</span>
							<div>
								<input type="radio" name="calendar" id="lunar" value="lunar" checked="checked"/>
								<label for="lunar">양력</label>
								<input type="radio" name="calendar" id="solar" value="solar" />
								<label for="solar">음력</label>
							</div>
						</dd>
					</dl>
					<dl id="join_gender_dl">
						<dt>
							<div></div>
							<label for="">성별</label>
						</dt>
						<dd>
							<div>
								<input type="radio" name="gender" id="male" value="male" checked="checked"/>
								<label for="male">남성</label>
								<input type="radio" name="gender" id="female" value="female" />
								<label for="female">여성</label>
							</div>
						</dd>
					</dl>
					<dl id="join_newsletter_dl">
						<dt>
							<div></div>
							<label for="">뉴스레터 수신여부</label>
						</dt>
						<dd>
							<span>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</span>
							<div>
								<input type="radio" name="newletter" id="newletter_y" value="yes" checked="checked"/>
								<label for="newletter_y">예</label>
								<input type="radio" name="newletter" id="newletter_n" value="no" />
								<label for="newletter_n">아니오</label>
							</div>
						</dd>
					</dl>
					<dl id="join_sms_dl">
						<dt>
							<div></div>
							<label for="">SMS 수신여부</label>
						</dt>
						<dd>
							<span>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</span>
							<div>
								<input type="radio" name="sms" id="sms_y" value="yes" checked="checked"/>
								<label for="sms_y">예</label>
								<input type="radio" name="sms" id="sms_n" value="no" />
								<label for="sms_n">아니오</label>
							</div>
						</dd>
					</dl>
				</fieldset>

								
				<h4>
					분양 회원 정보 입력 
					<span>(다구좌 회원일 경우 가지고 계신 카드번호 중 하나를 입력해 주시면 됩니다)</span>
				</h4>
				<fieldset class="fieldset_class">
					<dl id="join_member_number_dl">
						<dt>
							<label for="m_number">회원번호</label>
						</dt>
						<dd>
							<input type="text" name="m_number" id="m_number" />
							<span>하이픈(-)이나 띄어쓰기 없이 입력해 주시기 바랍니다.</span>
						</dd>
					</dl>
					<dl id="join_verification_number_dl">
						<dt>
							<label for="v_number">회원인증번호</label>
						</dt>
						<dd>
							<input type="text" name="v_number" id="v_number" />
							<span>숫자 4자리 입력</span>
						</dd>
					</dl>
				</fieldset>
				
				<h4>
					선택 입력 정보 
				</h4>
				<fieldset class="fieldset_class">
					<dl id="join_job_dl">
						<dt>
							<label for="job">직업</label>
						</dt>
						<dd>
							<select id="job" name="job">
								<option selected>선택</option>
								<option value="worker">회사원</option>
								<option value="slef">자영업자</option>
								<option value="freelancer">프리랜서</option>
								<option value="housewife">전업주부</option>
								<option value="student">학생</option>
								<option value="etc">기타</option>						
							</select>
						</dd>
					</dl>
					<dl id="join_marital_status_dl">
						<dt>
							<label for="">결혼여부</label>
						</dt>
						<dd>
							<input type="radio" name="marital_status" id="marital_status_y" value="yes" />
							<label for="marital_status_y">예</label>
							<input type="radio" name="marital_status" id="marital_status_n" value="no" />
							<label for="marital_status_n">아니오</label>
						</dd>
					</dl>
					<dl id="join_interests_dl">
						<dt>
							<label for="">관심사</label>
						</dt>
						<dd>
							<ul>
								<li>
									<input type="checkbox" name="computer" id="computer" value="computer" />
									<label for="computer">컴퓨터/인터넷</label>
								</li>
								<li>
									<input type="checkbox" name="movie" id="movie" value="movie" />
									<label for="movie">영화/비디오</label>
								</li>
								<li>
									<input type="checkbox" name="music" id="music" value="music" />
									<label for="music">음악</label>
								</li>
								<li>
									<input type="checkbox" name="shopping" id="shopping" value="shopping" />
									<label for="shopping">쇼핑</label>
								</li>
								<li>
									<input type="checkbox" name="game" id="game" value="game" />
									<label for="game">게임</label>
								</li>
								<li>
									<input type="checkbox" name="culture" id="culture" value="culture" />
									<label for="culture">문화/예술</label>
								</li>
								<li>
									<input type="checkbox" name="parenting" id="parenting" value="parenting" />
									<label for="parenting">육아/아동</label>
								</li>
								<li>
									<input type="checkbox" name="cooking" id="cooking" value="cooking" />
									<label for="parenting">요리</label>
								</li>
								<li>
									<input type="checkbox" name="interier" id="interier" value="interier" />
									<label for="interier">인테리어</label>
								</li>
								<li>
									<input type="checkbox" name="leisure" id="leisure" value="leisure" />
									<label for="leisure">레저/여가</label>
								</li>
								<li>
									<input type="checkbox" name="health" id="health" value="health" />
									<label for="health">건강/다이어트</label>
								</li>
								<li>
									<input type="checkbox" name="fashion" id="fashion" value="fashion" />
									<label for="fashion">패션/미용</label>
								</li>
							</ul>
						</dd>
					</dl>
				</fieldset>
				<div id="info_input_button">
					<input type="reset" value="취소하기" />
					<input type="submit" value="가입하기" />
				</div>
				
			</form>
		</section>
		<%@ include file="foot.jsp" %>
	</body>
</html>