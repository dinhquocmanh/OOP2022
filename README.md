# Code môn OOP 2022

Đề bài trong file DeBai300.txt
Bài làm trong file BaiLam600.txt

# Snippets
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

Ví dụ sử dụng HashMap:
```
 public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<String, KhachHang> khachHangMap = new HashMap<>();
        Map<String, MatHang> matHangMap = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i)
        {
            KhachHang tmp = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            khachHangMap.put(tmp.getMaKH(), tmp);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i)
        {
            MatHang tmp = new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            matHangMap.put(tmp.getMaMH(), tmp);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i)
        {
            HoaDon tmp = new HoaDon(i, khachHangMap.get(sc.next()), matHangMap.get(sc.next()), sc.nextInt());
            System.out.println(tmp);
        }
    }
```