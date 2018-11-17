
package CDCatalog;

import java.util.Scanner;

/**
 *
 * @author Thien
 */
public class Main {
    // Khai báo  các biến để chút nữa dùng
    int maxCD,  nextCD=0; // biến khai báo tạo giới hạn + biến đếm (để chạy vòng lặp cho mảng CD)
    CDData[] CD; // tạo mảng CD chứa dữ liệu ở class này
    CDData objCD; // tạo obj để gọi các class bên CD.java
    Scanner input; // biến để nhập dữ liệu
    
    public Main(){ 
        // ở đây khai báo maxCD để tạo mảng, cho người dùng nhập hoặc tự mình cho đều được
        input = new Scanner(System.in);
        System.out.print("Enter maximum number of CDs: ");
        maxCD = input.nextInt();
        CD = new CDData[maxCD]; // tạo mảng chứa dữ liệu của CD với max size = biến maxCD
    }

    public static void main(String[] args) {
        // Khai báo các biến cần thiết
        int choice; // biến lựa chọn
        Scanner input = new Scanner(System.in); // biến để nhập dữ liệu
        // khởi tạo obj Main
        Main objM = new Main();
        
        // cho vào vòng lặp để nó tự chạy lại khi xong lệnh
        while(true){
            // Gọi Menu
            new Menu().showMainMenu();
            // Nhập lựa chọn
            System.out.print("Please enter your choice(1-4): ");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    objM.addCD(); //gọi lớp addCD() ở dưới
                    break;
                case 2:
                    objM.searchCD(); // gọi lớp searchCD() ở dưới
                    break;
                case 3:
                    objM.showCD(); // gọi lớp showCD()
                    break;
                case 4: 
                    new Menu().showMsg("Program exit...");
                    System.exit(0); // thoát chương trình
                default:
                    new Menu().showMsg("Wrong choice!"); // báo lỗi khi nhập khác với các lựa chọn trên
                    break;
            }
            
        }
        
    }
    
    
    
    

    
    
    public void addCD(){
        // check coi list có bị đầy chưa
        if(nextCD==maxCD){
            new Menu().showMsg("List is full");
            return; // nếu đầy thì thoát khỏi function này
        }
        
        // nếu chưa thì bắt đầu tạo mới
        objCD = new CDData(); // đưa dữ liệu vào mảng tạm
        CD[nextCD++] = objCD; // sao chép dữ liệu của bên kia thành dữ liệu của Main bên đây
        //nextCD++;   //Nếu kg thích ++ ở trên thì cho xuống đây cũng đc, nhớ xóa ++ ở trên
        new Menu().showMsg("Sucessfully added!"); 
    }
    
    
    public void searchCD(){
        input = new Scanner(System.in);
        String in;
        int choice2;
        boolean check=false;  // tạo biến để check nếu kiếm đc dữ liệu hay kg
        
        //check coi list có dữ liệu hay chưa, nếu chưa thì thoát khỏi function này
        if(nextCD==0){
            new Menu().showMsg("List is empty");
            return;
        }
        
        // nếu có dữ liệu rồi thì tiến hành search
        while(true){
            new Menu().showSearchMenu();
            System.out.print("Enter choice (1-4): ");
            choice2 = input.nextInt();
            input = new Scanner(System.in);
            
            switch(choice2){
                case 1: 
                    //Cho nhập tựa cần tìm
                    System.out.print("Enter title you want to search: ");
                    in = input.nextLine();

                    for (int i = 0; i < nextCD; i++) {
                        if (CD[i].title.equals(in)) {
                            System.out.println(CD[i].showDetail());
                            check = true; // đã thấy dữ liệu nên cho check = true
                        }
                    }  
                    // check = false nghĩa là kg kiếm đc dữ liệu nên đưa ra thông báo
                    if (!check) {
                        new Menu().showMsg("Cannot find CD: "+in);
                    }
                    check=false;
                    break;
                case 2:
                    //Cho nhập thể loại cần tìm
                    do{
                    System.out.print("Enter Collection you want to search(game/movie/music): ");
                    in = input.nextLine();
                        if (!in.equals("game")&&!in.equals("music")&&!in.equals("movie")) {
                            new Menu().showMsg("Wrong Collection name!");
                        }
                    }while(!in.equals("game")&&!in.equals("music")&&!in.equals("movie"));
                    
                    for (int i = 0; i < nextCD; i++) {
                        if (CD[i].colName.equals(in)) {
                            System.out.println(CD[i].showDetail());
                            check = true; // đã thấy dữ liệu nên cho check = true
                        }
                    }  
                    // check = false nghĩa là kg kiếm đc dữ liệu nên đưa ra thông báo
                    if (!check) {
                        new Menu().showMsg("Cannot find CD in collection: "+in);
                    }
                    check=false;
                    break;
                case 3:
                    //Cho nhập loại CD cần tìm
                    do{
                    System.out.print("Enter CD Type you want to search(video/audio): ");
                    in = input.nextLine();
                        if (!in.equals("video")&&!in.equals("audio")) {
                            new Menu().showMsg("Wrong CD Type!");
                        }
                    }while(!in.equals("video")&&!in.equals("audio"));
                    
                    for (int i = 0; i < nextCD; i++) {
                        if (CD[i].CDType.equals(in)) {
                            System.out.println(CD[i].showDetail());
                            check = true; // đã thấy dữ liệu nên cho check = true
                        }
                    }  
                    // check = false nghĩa là kg kiếm đc dữ liệu nên đưa ra thông báo
                    if (!check) {
                        new Menu().showMsg("Cannot find CD with this type: "+in);
                    }
                    check=false;
                    break;
                case 4:
                    return;
                default:
                    new Menu().showMsg("Wrong choice!");
                    break;
            }
        }

    }
    
    
    public void showCD(){
        //check coi list có dữ liệu hay chưa, nếu chưa thì thoát khỏi function này, giống searchCD
        if(nextCD==0){
            new Menu().showMsg("Nothing to show!");
            return;
        }
        
        //System.out.println("id\t\tCollection\t\tType\t\tTitle\t\tPrice\t\tYear of Release");
        for (int i = 0; i < nextCD; i++) {
            System.out.println(CD[i].showDetail());
        }
    }
    
}
