package Ti;

public class LongTimePress {
    /**
     *
     你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，
        按键可能会被长按，而字符可能被输入 1 次或多次。
     你将会检查键盘输入的字符 typed。
        如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
     "vtkgn"
     "vttkgnn"

     */
    public static void main(String[] args) {
        String name = "vtkgn";
        String typed = "vttkgnn";
        boolean b = new LongTimePress().isLongPressedName(name,typed);
        System.out.println(b);

    }

    public boolean isLongPressedName(String name, String typed) {
        int n = 0;
        int t = 0;

        for (int j = 0; j < name.length();) {
            for (int i = 0; i < typed.length();) {
                if(name.charAt(j) == typed.charAt(i)){
                    j++;
                    i++;
                }else{
                    i++;
                }
                if(i == typed.length()-1 && j<name.length()-1){
                    return false;
                }
            }
        }
        return true;
    }
}
