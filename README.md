# jetbrains全家桶license生成工具

## 使用方法

1. 下载[ja-netfilter](https://gitee.com/ja-netfilter/ja-netfilter)
2. 在url.conf中添加

```
PREFIX,https://account.jetbrains.com/lservice/rpc/validateKey.action
PREFIX,https://account.jetbrains.com.cn/lservice/rpc/validateKey.action
```

3. 在power.conf中result标签下添加

```
EQUAL,615928410721573063778471215301909902248274601591711943276731703956458094171616138894070948493601226184037184174222838984781288556002613680414877832950890741286635997281489098451099748193480587487504072783935908702183674216818966606257038244820950628238432510582209466823099234288613034335782977366601175863383573732532653117104434174671137483687911892786799826442564005195759267483361227111554984272423997190985331244262225182564870752994084089108520993166663358375400511370745224232703366137222256046407473631756200002552414409305133063172546206460742853097176376383033150730034774529341905751460074207081281356921909382996509265843658544007184648966342067157423655925220989495674344389061464002926289921063916088236180807878777019038948283780328623842333941359371823460533476263879922153245948202658502774852360629208965273615884063868205582339769138784259128229936123162570059732112866083385354123981751737286881463541764059770714410813455121538326511745432499084033285269811393170273616433146509102500669997824091604012231517957437461077653796229771713635481546669932948976068785962801515991586337587884379451589946951659837671471890001909086614066805946506625211166509917333341671926968089808008696654271111151475410167554819575,65537,860106576952879101192782278876319243486072481962999610484027161162448933268423045647258145695082284265933019120714643752088997312766689988016808929265129401027490891810902278465065056686129972085119605237470899952751915070244375173428976413406363879128531449407795115913715863867259163957682164040613505040314747660800424242248055421184038777878268502955477482203711835548014501087778959157112423823275878824729132393281517778742463067583320091009916141454657614089600126948087954465055321987012989937065785013284988096504657892738536613208311013047138019418152103262155848541574327484510025594166239784429845180875774012229784878903603491426732347994359380330103328705981064044872334790365894924494923595382470094461546336020961505275530597716457288511366082299255537762891238136381924520749228412559219346777184174219999640906007205260040707839706131662149325151230558316068068139406816080119906833578907759960298749494098180107991752250725928647349597506532778539709852254478061194098069801549845163358315116260915270480057699929968468068015735162890213859113563672040630687357054902747438421559817252127187138838514773245413540030800888215961904267348727206110582505606182944023582459006406137831940959195566364811905585377246353->31872219281407242025505148642475109331663948030010491344733687844358944945421064967310388547820970408352359213697487269225694990179009814674781374751323403257628081559561462351695605167675284372388551941279783515209238245831229026662363729380633136520288327292047232179909791526492877475417113579821717193807584807644097527647305469671333646868883650312280989663788656507661713409911267085806708237966730821529702498972114194166091819277582149433578383639532136271637219758962252614390071122773223025154710411681628917523557526099053858210363406122853294409830276270946292893988830514538950951686480580886602618927728470029090747400687617046511462665469446846624685614084264191213318074804549715573780408305977947238915527798680393538207482620648181504876534152430149355791756374642327623133843473947861771150672096834149014464956451480803326284417202116346454345929350148770746553056995922154382822307758515805142704373984019252210715650875853634697920708113806880196144197384637328982263167395073688501517286678083973976140696077590122053014085412828620051470085033364773099146103525313018873319293728800442101520384088109603555959893639842091339193863344549461810475201283183564954344242061075799024102066437349360257864745155
```

4. 重新启动软件输入license

```
00000000-eyJsaWNlbnNlSWQiOiIwMDAwMDAwMCIsImxpY2Vuc2VlTmFtZSI6ImR4MW5neSIsImFzc2lnbmVlTmFtZSI6ImR4MW5neSIsImFzc2lnbmVlRW1haWwiOiIiLCJsaWNlbnNlUmVzdHJpY3Rpb24iOiIiLCJjaGVja0NvbmN1cnJlbnRVc2UiOmZhbHNlLCJwcm9kdWN0cyI6W3siY29kZSI6IllURCIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlFER08iLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJNRiIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IkRHIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUFMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJRQSIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IklJRSIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IllUV0UiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJGTFMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJETEUiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJSRlUiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJQUFMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJQQ1dNUCIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IklJIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiVENDIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUlNVIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUENDIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUkMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJQQ0UiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJGTElKIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiVEJBIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiREwiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJTUFAiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJRRENMRCIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlNQQSIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IkRNQ0xQIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUFNXIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiR1ciLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJQU0kiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJJSVUiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJETVUiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJQV1MiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJIQiIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IldTIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUENQIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiS1QiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJEQ0NMVCIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlJTQ0xUIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiV1JTIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUlNDIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUlJEIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiVEMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJJSUMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJRRFBZIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiRFBLIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiREMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJQREIiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJEUFBTIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUURQSFAiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJHTyIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IkhDQyIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlJEQ1BQUCIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlFESlZNQyIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IkNMIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiRE0iLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJDV01MIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiRkxMIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUlIiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJRREpTIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUlMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJSTSIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IkRTIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiTVBTIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiRFBOIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiVVMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJDTE4iLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJEUENMVCIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlJTViIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6Ik1QU0lJUCIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IkRCIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUURBTkRDIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiQUMiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJRREpWTSIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlBSQiIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlJEIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiQ1dNUiIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlNQIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUlMwIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiRFAiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJSU0YiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJQR08iLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJRRFBZQyIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlBQQyIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlBDIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiRUhTIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiUlNDSEIiLCJmYWxsYmFja0RhdGUiOiIyMDMwLTEyLTMxIiwicGFpZFVwVG8iOiIyMDMwLTEyLTMxIiwiZXh0ZW5kZWQiOmZhbHNlfSx7ImNvZGUiOiJGTCIsImZhbGxiYWNrRGF0ZSI6IjIwMzAtMTItMzEiLCJwYWlkVXBUbyI6IjIwMzAtMTItMzEiLCJleHRlbmRlZCI6ZmFsc2V9LHsiY29kZSI6IlFETkVUIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX0seyJjb2RlIjoiSkNEIiwiZmFsbGJhY2tEYXRlIjoiMjAzMC0xMi0zMSIsInBhaWRVcFRvIjoiMjAzMC0xMi0zMSIsImV4dGVuZGVkIjpmYWxzZX1dLCJtZXRhZGF0YSI6IjAxMjAyMzAxMDJQUEFBMDEzMDA5IiwiaGFzaCI6IjQxNDcyOTYxLzA6MTU2MzYwOTQ1MSIsImdyYWNlUGVyaW9kRGF5cyI6NywiYXV0b1Byb2xvbmdhdGVkIjp0cnVlLCJpc0F1dG9Qcm9sb25nYXRlZCI6dHJ1ZX0=-P/Iit/RumHIiWyFYY750IDjE4RuPWTfAHXPnUSUVZTdkf2eWY5Wpt+NO20yk0fOpjdZSWBhNwp6xQ3F/ymqW/6iJrIi9lrKwibdCZvdWki+Ac5r8lobMElkQfPxYyjLGnp+1RIx2EKKfNGNw9goxG60rrgT8zLws5Nqqk6m3fswVuWLV+/kGjauDlcXxVOT+uloQh9niNTQ8V5/Cf81qsb6kF/T+jwxtXQJ9ZBpU/tZY6cVdckTePjQTkdBE8Dm55b0dL71J2DJ0raO9IpDgkydXYr3dw8U+VGZUF7Cfi+gQkPAJ2/Sah4zZaruEwS3YLh34YVwkqS+WYurXuIOjjst/W0QbsfELyO6lTR4Z1W7gGVW5OBPo/zGNAktNkdm30vavH5u0Z4TdTA6fwplG1Vv3HxLLvbe3tI8v0p9On5/Btvg399YlY3o+hJB3TnmKA16cxyV0yY7phXkJ19MPN8b0bWw/3x+tSxZ/Hujp5uzG70sNgS5U0a5Ogj7KbuxAh1SBreugpUIAQ25UybPgQTyPr1oGGuqQKWme16DC3nwuT6gYNgElDMoCgbm7NB1YjWVACw00cg20vWeaNLb6l+hmMHgEIPam4Y4hAedVEB4YVwud9PvqWjH1Da74zSDv6xhdHIvl/3gm4b+qgUmuBesVK8Hi8CPlF+D2iIpZGuk=-MIIEqjCCApKgAwIBAgIGAZbmkKCqMA0GCSqGSIb3DQEBCwUAMBgxFjAUBgNVBAMMDUpldFByb2ZpbGUgQ0EwHhcNMjUwNTE4MDMyMjQwWhcNMzUwNTE3MDMyMjQwWjAUMRIwEAYDVQQDDAlEeDFuZ3kgQ0EwggIiMA0GCSqGSIb3DQEBAQUAA4ICDwAwggIKAoICAQCkKnBcCyKV7GcSsAdaEzjIxVpA4rhnxAEvvHWfGzc7j9XH9p8WgkmsdxpiZN1Mq+4ldQv5kWZdJJnKsghwvKNjNzcczJyxq4hMe3+xepV9nxqxetNvtwqyPrCH7iHPpY9YICReeWEajDvuLpvyH20qZPNBzqo6ZzSlU5J+6BxAC8iOWZi43vTYY4un3KvIVluTSP/OkiDCgsu+yD2qqmiSkErT166c6ChZSwMuLwTlv45ukhgdr64NBnwDrtgi/Gu26T75kwvfl3Uwkt3Za+E+NFz4Wp1f7wHcuJm/kb0FZr5uFgTGhgd7H1kJ0ya7hccXfr3bsSYKbBxFP3QEsLMlIrAMGtT+vCF8iO/7+Y53V1OHw35cUqA0EcSxyYDEyP5zBV53x30lnoYPPDYBbQT24FesSQbhIxbuZOt+ByfJpxLOMoYBm0fG2hnhksgzAXMpQk40gr8vPIdDfHFaLdTs9Ft1UDS42c0Iio1Wmz0O0qjL7bPlkW95sUy5R1suingkeBugjWTHzZ9UdYUNJKgCp6/Gil8KxDQN+nuIAKHyoF072/vbMtDMR1/8aoh2VAs+lVxuUj+AZHXmOCieuUnoFw1QyrB+1cpspvv/6q0BfZQOmIl03ls5TfhZNg9hskp6mVDjOVpxE3KEnXqdqpDLrtbQibmuHUlgIm5rDmBILQIDAQABMA0GCSqGSIb3DQEBCwUAA4ICAQCW+dw6FT+8gMQJgbTuJS9B3tnGfjo9+BojYifJ8mY0pP5l1bkeuSe7Kqua0dKbKhClgxi7EwDFSdXycueoqLG5nIVHfSMncXSYol3IgDezJ8aCdWwaoroHcuYcZ2Kq1BAPif1/LEsZbR96IYDCj5cHoL5G3UMrv+lZBlcZtxDUTrehwtWjEOq5mfgltwpRszgRo7RkAJ57btnvc2IrYG7hypAXJWI3pWKro6ePAtI4oH2SXD5C1bid7EMvVaKiT1UVYT9f5WWq0YTAxsJXp1A1jZUwO0SytH6BNiP3cdY2Chd2M5ytJ4HW1+nN3nJhOQS1L3gJsRYc0SyfTG2tvReelPzgstPGSfIDPcC3twGXizZ8WGLKutUMV5Twl3oPTaVbqjYbLUf2RzGo1WLj16OdNUH2IHFWQUe1vJ8eb/yAtQVIE3WLg+uHNtHj1+v+1kml2Futeuwn+Y/PB4ntmQ6a7sDSexWp/0aEL4VfeaXAtuPefSPa/uHhoqgxJBTURE3tzZk5rtVryLvLbRO89Cghlk39MN9kqHMpTZDEcgrFVQq2yOYIh0dtk5LYhQbYdsFToRwmsXJyPUKrCYsLjVOtcZbarZQ8OT57SecRndSdQeLm6SpnI/ptV7FSwbIIq1kxdS5gsS/mP0juDacN1UTKd6WlJDveq6lT0FEeshLF9w==
```

## 原理

jetbrains提供了一个校验付费插件的代码[CheckLicense](https://github.com/JetBrains/marketplace-makemecoffee-plugin/blob/master/src/main/java/com/company/license/CheckLicense.java)
```
private static boolean isKeyValid(String key) {
    String[] licenseParts = key.split("-");
    if (licenseParts.length !=  4) {
      return false; // invalid format
    }

    final String licenseId = licenseParts[0];
    final String licensePartBase64 = licenseParts[1];
    final String signatureBase64 = licenseParts[2];
    final String certBase64 = licenseParts[3];

    try {
      final Signature sig = Signature.getInstance("SHA1withRSA");
      // the last parameter of 'createCertificate()' set to 'false' switches off certificate expiration checks.
      // This might be the case if the key is at the same time a perpetual fallback license for older IDE versions.
      // Here it is only important that the key was signed with an authentic JetBrains certificate.
      sig.initVerify(createCertificate(
        Base64.getMimeDecoder().decode(certBase64.getBytes(StandardCharsets.UTF_8)), Collections.emptySet(), false
      ));
      final byte[] licenseBytes = Base64.getMimeDecoder().decode(licensePartBase64.getBytes(StandardCharsets.UTF_8));
      sig.update(licenseBytes);
      if (!sig.verify(Base64.getMimeDecoder().decode(signatureBase64.getBytes(StandardCharsets.UTF_8)))) {
        return false;
      }
      // Optional additional check: the licenseId corresponds to the licenseId encoded in the signed license data
      // The following is a 'least-effort' code. It would be more accurate to parse json and then find there the value of the attribute "licenseId"
      final String licenseData = new String(licenseBytes, StandardCharsets.UTF_8);
      return licenseData.contains("\"licenseId\":\"" + licenseId + "\"");
    }
    catch (Throwable e) {
      e.printStackTrace(); // For debug purposes only. Normally you will not want to print exception's trace to console
    }
    return false;
  }
```
分析代码发现license由4部分组成licenseId、licensePartBase64、signatureBase64、certBase64
1. licenseId就是一个唯一id
2. licensePartBase64可以在网上找个license解析一下发现是用户购买信息的json字符串
3. signatureBase64是对licensePartBase64的签名值使用SHA1withRSA算法
4. certBase64是用户证书  

可以推测出用户购买license后，首先根据软件内置的根证书签发一个用户证书（certBase64），再使用用户证书（certBase64）将购买信息（licensePartBase64）签名（signatureBase64），最后将上面的信息组成一个license。
校验证书过程为当用户输入license后，先解析license成4部分，然后验证用户证书（certBase64）是不是软件内置根证书签发的（就是证书链的验证，通过用户证书的签名信息、签名值、根证书的公钥来验证用户证书是否是根证书签发的），
最后再校验用户购买信息（licensePartBase64）和签名（signatureBase64）是否一致。   
证书链验证代码
```
private static X509Certificate createCertificate(byte[] certBytes, Collection<byte[]> intermediateCertsBytes, boolean checkValidityAtCurrentDate) throws Exception {
    final CertificateFactory x509factory = CertificateFactory.getInstance("X.509");
    final X509Certificate cert = (X509Certificate) x509factory.generateCertificate(new ByteArrayInputStream(certBytes));

    final Collection<Certificate> allCerts = new HashSet<>();
    allCerts.add(cert);
    for (byte[] bytes : intermediateCertsBytes) {
      allCerts.add(x509factory.generateCertificate(new ByteArrayInputStream(bytes)));
    }

    try {
      // Create the selector that specifies the starting certificate
      final X509CertSelector selector = new X509CertSelector();
      selector.setCertificate(cert);
      // Configure the PKIX certificate builder algorithm parameters
      final Set<TrustAnchor> trustAchors = new HashSet<>();
      for (String rc : ROOT_CERTIFICATES) {
        trustAchors.add(new TrustAnchor(
          (X509Certificate) x509factory.generateCertificate(new ByteArrayInputStream(rc.getBytes(StandardCharsets.UTF_8))), null
        ));
      }

      final PKIXBuilderParameters pkixParams = new PKIXBuilderParameters(trustAchors, selector);
      pkixParams.setRevocationEnabled(false);
      if (!checkValidityAtCurrentDate) {
        // deliberately check validity on the start date of cert validity period, so that we do not depend on
        // the actual moment when the check is performed
        pkixParams.setDate(cert.getNotBefore());
      }
      pkixParams.addCertStore(
        CertStore.getInstance("Collection", new CollectionCertStoreParameters(allCerts))
      );
      // Build and verify the certification chain
      final CertPath path = CertPathBuilder.getInstance("PKIX").build(pkixParams).getCertPath();
      if (path != null) {
        CertPathValidator.getInstance("PKIX").validate(path, pkixParams);
        return cert;
      }
    }
    catch (Exception e) {
      // debug the reason here
    }
    throw new Exception ("Certificate used to sign the license is not signed by JetBrains root certificate");
  }
```
接下来可以根据上面的规则生成一个自己license
```
//1. 生成密钥对
KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
keyGen.initialize(4096);
KeyPair keyPair = keyGen.generateKeyPair();
//2. 生成自己的证书
X500Name issuer = new X500Name("CN=JetProfile CA");
X500Name subject = new X500Name("CN=Dx1ngy CA");
BigInteger serial = BigInteger.valueOf(System.currentTimeMillis());
Date notBefore = new Date(System.currentTimeMillis() - 86400000);
Date notAfter = new Date(System.currentTimeMillis() + 3650 * 86400000L);
X509v3CertificateBuilder certBuilder =
        new JcaX509v3CertificateBuilder(issuer, serial, notBefore, notAfter, subject, keyPair.getPublic());
ContentSigner signer = new JcaContentSignerBuilder("SHA256WithRSA")
        .build(keyPair.getPrivate());
X509CertificateHolder certHolder = certBuilder.build(signer);
X509Certificate cert = new JcaX509CertificateConverter().getCertificate(certHolder);
//3. 生成license
String licenseId = "00000000";
String licensePart = "{\"licenseId\":\"00000000\",\"licenseeName\":\"dx1ngy\",\"assigneeName\":\"dx1ngy\",\"assigneeEmail\":\"\",\"licenseRestriction\":\"\",\"checkConcurrentUse\":false,\"products\":[{\"code\":\"YTD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDGO\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"MF\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DG\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QA\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"IIE\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"YTWE\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"FLS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DLE\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RFU\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PPS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PCWMP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"II\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"TCC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSU\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PCC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PCE\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"FLIJ\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"TBA\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DL\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"SPP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDCLD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"SPA\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DMCLP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PSW\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"GW\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PSI\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"IIU\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DMU\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PWS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"HB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"WS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PCP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"KT\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DCCLT\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSCLT\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"WRS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RRD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"TC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"IIC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDPY\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DPK\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PDB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DPPS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDPHP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"GO\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"HCC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RDCPPP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDJVMC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"CL\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DM\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"CWML\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"FLL\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RR\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDJS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RM\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"MPS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DPN\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"US\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"CLN\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DPCLT\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSV\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"MPSIIP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDANDC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"AC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDJVM\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PRB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"CWMR\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"SP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RS0\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"DP\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSF\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PGO\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDPYC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PPC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"PC\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"EHS\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"RSCHB\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"FL\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"QDNET\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false},{\"code\":\"JCD\",\"fallbackDate\":\"2030-12-31\",\"paidUpTo\":\"2030-12-31\",\"extended\":false}],\"metadata\":\"0120250101AAAA000000\",\"hash\":\"0\",\"gracePeriodDays\":7,\"autoProlongated\":true,\"isAutoProlongated\":true}";
byte[] licensePartBytes = licensePart.getBytes();
String licensePartBase64 = Base64.getEncoder().encodeToString(licensePartBytes);
Signature signature = Signature.getInstance("SHA1withRSA");
signature.initSign(keyPair.getPrivate());
signature.update(licensePartBytes);
byte[] sign = signature.sign();
String sigResultsBase64 = Base64.getEncoder().encodeToString(sign);
String certBase64 = Base64.getEncoder().encodeToString(cert.getEncoded());
String key = licenseId + "-" + licensePartBase64 + "-" + sigResultsBase64 + "-" + certBase64;
System.out.println(key);
```
只生成license是不够的，因为该license是通过自己的证书生成的，我们需要的是通过软件内置的根证书签发的用户证书来生成license，这样才能通过证书链校验，由于无法获取根证书的私钥，所有无法使用根证书签发用户证书，这时就需要使用ja-netfilter的power.jar插件。
该插件其核心就是hook了BigInteger.oddModPow方法（rsa的核心），通过修改参数和返回值的方式达到证书链验证通过。

sun.security.rsa.RSASignature类中签名方法
```
protected byte[] engineSign() throws SignatureException {
    if (privateKey == null) {
        throw new SignatureException("Missing private key");
    }
    byte[] digest = getDigestValue();
    try {
        byte[] encoded = encodeSignature(digestOID, digest);
        byte[] padded = padding.pad(encoded);
        if (padded != null) {
            return RSACore.rsa(padded, privateKey, true);
        }
    } catch (GeneralSecurityException e) {
        throw new SignatureException("Could not sign data", e);
    } catch (IOException e) {
        throw new SignatureException("Could not encode data", e);
    }
    throw new SignatureException("Could not sign data");
}
```
sun.security.rsa.RSASignature类中验证方法
```
protected boolean engineVerify(byte[] sigBytes) throws SignatureException {
    if (publicKey == null) {
        throw new SignatureException("Missing public key");
    }
    try {
        if (sigBytes.length != RSACore.getByteLength(publicKey)) {
            throw new SignatureException("Bad signature length: got " +
                sigBytes.length + " but was expecting " +
                RSACore.getByteLength(publicKey));
        }

        // https://www.rfc-editor.org/rfc/rfc8017.html#section-8.2.2
        // Step 4 suggests comparing the encoded message
        byte[] decrypted = RSACore.rsa(sigBytes, publicKey);

        byte[] digest = getDigestValue();

        byte[] encoded = encodeSignature(digestOID, digest);
        byte[] padded = padding.pad(encoded);
        if (MessageDigest.isEqual(padded, decrypted)) {
            return true;
        }

        // Some vendors might omit the NULL params in digest algorithm
        // identifier. Try again.
        encoded = encodeSignatureWithoutNULL(digestOID, digest);
        padded = padding.pad(encoded);
        return MessageDigest.isEqual(padded, decrypted);
    } catch (javax.crypto.BadPaddingException e) {
        return false;
    } catch (IOException e) {
        throw new SignatureException("Signature encoding error", e);
    } finally {
        resetDigest();
    }
}
```
```
private static byte[] crypt(byte[] msg, BigInteger n, BigInteger exp)
            throws BadPaddingException {
    BigInteger m = parseMsg(msg, n);
    BigInteger c = m.modPow(exp, n);
    return toByteArray(c, getByteLength(n));
}
```
通过上面的方法可以发现，engineVerify就是engineSign的逆过程，并且两个方法都调用了RSACore.rsa方法，power插件就是通过修改RSACore.rsa（内部调用了crypt方法）的返回值从而影响engineVerify方法的结果。
接下来的关键就是确定BigInteger c = m.modPow(exp, n)中的c、m、exp、n。   
证书链的验证通过用户证书的签名信息、签名值、根证书的公钥来验证用户证书是否是根证书签发的，通过上面的代码可以分析出exp和n是根证书的exp和n，m是用户证书的签名值，c是用户证书签名信息的摘要、编码、填充之后的值就是padded
```
byte[] digest = getDigestValue();
byte[] encoded = encodeSignature(digestOID, digest);
byte[] padded = padding.pad(encoded);
```
m exp n
```
BigInteger m = new BigInteger(1, cert.getSignature());
BigInteger exp = rootPublicKey.getPublicExponent();
BigInteger n = rootPublicKey.getModulus();
```
用户证书的签名信息是cert.getTBSCertificate()，摘要（对应上面的getDigestValue()方法）过后是digest
```
MessageDigest md = MessageDigest.getInstance("SHA-256");
md.update(cert.getTBSCertificate());
byte[] digest = md.digest();
```
编码成DER格式（对应上面的encodeSignature()方法）
```
ASN1EncodableVector algId = new ASN1EncodableVector();
algId.add(new ASN1ObjectIdentifier("2.16.840.1.101.3.4.2.1")); // SHA-256 OID
algId.add(DERNull.INSTANCE); // 参数为 NULL
ASN1Sequence algorithmIdentifier = new DERSequence(algId);
ASN1EncodableVector digestInfo = new ASN1EncodableVector();
digestInfo.add(algorithmIdentifier);
digestInfo.add(new DEROctetString(digest)); // 摘要值
ASN1Sequence digestInfoSeq = new DERSequence(digestInfo);
byte[] encoded = digestInfoSeq.getEncoded(ASN1Encoding.DER);
```
PKCS#1 v1.5进行填充（对应上面的pad()方法），这个padded就是c
```
int modulusLength = (((RSAPublicKey) cert.getPublicKey()).getModulus().bitLength() + 7) / 8;
byte[] padded = new byte[modulusLength];
padded[0] = 0x00;
padded[1] = 0x01;
int psLength = modulusLength - 3 - encoded.length;
Arrays.fill(padded, 2, 2 + psLength, (byte) 0xFF);
padded[2 + psLength] = 0x00;
System.arraycopy(encoded, 0, padded, 3 + psLength, encoded.length);
```
当然也可以直接用jdk的源码确定c值，跟进上面的那几个方法（getDigestValue，encodeSignature，pad）里看一下如何实现的。

最后根据上面确定的c、m、exp、n的值，构造出power插件所需要的结构即可（EQUAL,m,exp,n->c）


## 参考资料
https://www.cnblogs.com/feng9exe/p/8075447.html
https://zh.wikipedia.org/wiki/RSA%E5%8A%A0%E5%AF%86%E6%BC%94%E7%AE%97%E6%B3%95
https://zhuanlan.zhihu.com/p/606755714
https://blog.csdn.net/sky8336/article/details/113696551
https://zhuanlan.zhihu.com/p/668667982
https://blog.novitechie.com/archives/idea-cracking







