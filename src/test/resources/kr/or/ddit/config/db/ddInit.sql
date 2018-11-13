-- 운영db에는 없는 테이블
select * from NOTEXISTSINPRD;

-- 테스트 코드가 실행되기 전에 Rangers 데이터 삭제
delete from rangers;

--rangers 초기 데이터 3건 입력
insert into rangers values ('brown','브라운');
insert into rangers values ('conny','코니');
insert into rangers values ('moon','문');


-- JSP USER 삭제후 다시 삽입한다.
delete from jspuser;

insert into jspuser values ('test','테스트','pass','세종시','아름동','39419','18/11/12','laswl4090@gmail.com','0448674090','');
insert into jspuser values ('brown','브라운','1','대전 중구 중앙로 76','2층 대덕인재개발원','34940','18/08/08','brown@gmail.com','123123123','/user/profile/moon.png');
insert into jspuser values ('sally','셀리','1','대전광역시 중구 중앙로 76(대흥동)','영민빌딩 2층 대덕인재개발월','34940','18/04/27','brown@gmail.com','123123123','/user/profile/sally.png');
insert into jspuser values ('james','제임스','249bbac706e15fc9f93dba1ba00b5b7cc5a4b6f2a7d57a4a50b944dbd45ecd41','대전광역시 중구 중앙로 76(대흥동)','영민빌딩 2층 대덕인재개발월','34940','18/02/14','brown@gmail.com','123123123','/user/profile/james.png');
insert into jspuser values ('moon','문','003d1c81a2397bb51dface79a897decd50e7f4d8ea7fd547c8506d80e282905e','대전광역시 중구 중앙로 76(대흥동)','영민빌딩 2층 대덕인재개발월','34940','18/10/06','brown@gmail.com','123123123','/user/profile/moon.png');
insert into jspuser values ('cony','코니','9299a16ffb4d721536dddc82d646c9ed3f78971f5a3fcd3439ef223a35903cda','대전광역시 중구 중앙로 76(대흥동)','영민빌딩 2층 대덕인재개발월','34940','18/08/08','brown@gmail.com','123123123','/user/profile/cony.png');
insert into jspuser values ('xxxx1','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx2','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx3','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx4','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx5','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx6','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx7','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx8','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx9','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx10','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx11','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx13','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx14','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx16','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx17','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx19','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx21','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx22','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx24','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx25','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx27','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx28','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx30','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx31','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx33','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx34','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx36','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx37','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx39','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx40','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx42','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx43','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx45','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx46','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx48','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx49','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx51','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx52','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx53','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx54','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx55','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx56','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx57','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx58','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx59','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx60','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx61','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx62','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx63','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx64','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx65','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx66','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx67','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx68','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx69','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx70','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx71','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx72','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx73','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx74','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx75','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx76','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx77','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx78','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx79','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx80','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx81','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx82','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx84','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx85','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx87','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx89','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx90','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx92','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx93','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx95','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx96','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx98','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx99','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('brownc','브라운','6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b','대전 중구 중앙로 76','2층 대덕인재개발원','34940','18/08/08','brown@gmail.com','123123123','C:\Users\pc06\Downloads\샐리.png');
insert into jspuser values ('test2','테스트','pass','세종시','아름동','39419','18/11/12','laswl4090@gmail.com','0448674090','');
insert into jspuser values ('testsd','testUserId','1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발월','34940','18/08/08','newUser@gmail.com','04222288202','/user/profile/sally2.png');
insert into jspuser values ('xxxx12','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx15','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx18','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx20','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx23','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx26','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx29','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx32','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx35','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx38','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx41','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx44','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx47','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx50','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx83','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx86','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx88','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx91','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx94','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx97','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('xxxx100','xxxx','94d791f042c409c0cb2db18bb04c976e405700782417ab966b64f3e942dba48f','대전시 중구 대흥동 76','2층 대덕인재개발원','34940','18/10/10','xxxx@gmail.com','123123123','');
insert into jspuser values ('testabc','testUserId','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','');
insert into jspuser values ('testaaa','testUserId','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','');
insert into jspuser values ('kuinsoo','testUserId','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','');
insert into jspuser values ('kudfasdfsdfsdf','testUserId','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/ryan8.png');
insert into jspuser values ('ryan8','testUserId','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/ryan8.png');
insert into jspuser values ('0998888888888','testUserI','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','');
insert into jspuser values ('testtttttt','testUserId','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/ryan8.png');
insert into jspuser values ('taaaaaaaaaaaaaaa','testUserId','pass1234','대전 중구 중앙로 76','영민빌딩 2층 대덕인재개발원','34940','18/08/08','newUser@gmail.com','0422228202','/profile/noimage.png');


-- 초기화 코드
delete from calendar;


