class Solution {
    public String interpret(String command) {
        command.replace("()","o");
        System.out.println(command.replace("()","o").replace("(al)","al"));
        return command.replace("()","o").replace("(al)","al");
    }
}