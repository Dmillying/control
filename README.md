# control
entity를 대상으로 이벤트를 제어합니다.

`plugin/control/config.yml` 에서 이벤트를 제어할 수 있으며, 모든 기본값은 false입니다.

## usage 🎫

config.yml에서 제어하고 싶은 이벤트의 value을 true로 변경 후 저장해주세요.  
그 후 서버 리로드를 해주시면 적용이 됩니다.  
~~**craftItem, entityDamage, entityDamageByEntity 제외 모든 이벤트는 op가 아닐시에만 제어됩니다.**~~   
개발 종료되었습니다. 작동은 정상적으로 되니 그대로 사용하셔도 상관 없으십니다.

## list 📂

blockPlace | 블록 설치  
blockBreak | 블록 파괴  
playerInteract | 플레이어 상호작용  
playerMove | 플레이어 음직임  
playerPortal | 다른 월드 이동  
asyncChat | 채팅  
inventoryOpen | 인벤토리 열기  
playerJoinMessage | 입장 메시지  
playerQuitMessage | 퇴장 메시지  
craftItem | 아이템 제작  
entityDamage | 때리기  
entityDamageByEntity | entity가 플레이어를 공격  
playerCommandPreprcess | 명령어  

## 그 외.. 🙄

추가하고 싶은 제어 이벤트가 있으시면 issues 탭에 남겨주세요!  
풀리퀘도 환영입니다 :D  
