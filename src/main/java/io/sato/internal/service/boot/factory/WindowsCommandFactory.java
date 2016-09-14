package io.sato.internal.service.boot.factory;

import io.sato.internal.command.Command;
import io.sato.internal.command.GenericCommand;

public class WindowsCommandFactory extends BootCommandFactory {

    @Override
    public Command getRebootCommand() {
        return new GenericCommand("shutdown -r -f -t 0");
    }

    @Override
    public Command getShutdownCommand() {
        return new GenericCommand("shutdown -s -f -t 0");
    }

}
