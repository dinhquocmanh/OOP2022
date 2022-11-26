# Code môn OOP 2022

Snippets
```
DateFormatExample:
String format = "hh:mm";
Date giovao = new SimpleDateFormat(format).parse(sc.nextLine());
```
```
ArraylistObject:

// read
ArrayList<GameThu> ListGT = new ArrayList<>();
GameThu gt = new GameThu(manguoichoi, tennguoichoi, giovao, giora);
ListGT.add(gt);

//sort
Collections.sort(ListGT, (gt1,gt2) -> {return gt2.compareTo(gt1);});

//printout
for(GameThu gt: ListGT){
System.out.println(gt);
}
```