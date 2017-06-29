package service;

import dataStructures.AbstractQueue;

public class Console {
    public enum Command {
        PRINT, PUT, MULTIPRINT, GET, PEEK
    }

    AbstractQueue<String> queue;

    public void setQueue(AbstractQueue<String> queue) {
        this.queue = queue;
    }

    public void execute(Command command, String... args) {
        switch (command) {
            case PRINT:
                queue.print();
                break;
            case PUT:
                queue.put(args[1]);
                break;
            case MULTIPRINT:
                for (int i = 1; i < args.length; i++) {
                    queue.put(args[i]);
                    break;
                }
            case GET:
                queue.get();
                break;
            case PEEK:
                queue.peek();
            default:
                throw new IllegalArgumentException("No functionality for command ");

        }
    }
}

/*

        }

        public void enterConsole() {
            System.out.println("You've entered console mode. Valid commands are: " + Command.getAllCommands());
            Scanner inputReader = new Scanner(System.in);
            while(true) {
                System.out.print("> ");
                String[] input = inputReader.nextLine().split(" ");
                Command command = Command.parseCommandString(input[0]);
                if (command == null) {
                    System.out.println("Invalid command was specified. Supported commands are: " + Command.getAllCommands());
                } else if (command.equals(Command.EXIT)) {
                    System.out.println("You've exited console mode.");
                    break;
                } else {
                    execute(command, input);
                }
            }
        }

        public static enum Command {
            EXIT("exit"), PRINT("print"), PUT("put"), MULTIPUT("multiput"), GET("get"), PEEK("peek");

            private String commandString;

            private Command(String commandString) {
                this.commandString = commandString;
            }

            public String getCommandString() {
                return commandString;
            }

            public static String getAllCommands() {
                StringBuilder commandList = new StringBuilder();
                for (Command command: values()) {
                    commandList.append(command.getCommandString() + ", ");
                }
                return commandList.substring(0, commandList.lastIndexOf(","));
            }

            public static Command parseCommandString(String commandString) {
                for (Command command : values()) {
                    if (command.getCommandString().equals(commandString.toLowerCase())) {
                        return command;
                    }
                }
                return null;
            }
        }

    }
*/

