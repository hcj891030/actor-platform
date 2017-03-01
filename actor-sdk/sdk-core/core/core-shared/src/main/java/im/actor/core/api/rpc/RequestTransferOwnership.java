package im.actor.core.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import im.actor.core.api.*;

public class RequestTransferOwnership extends Request<ResponseSeqDate> {

    public static final int HEADER = 0xae5;
    public static RequestTransferOwnership fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestTransferOwnership(), data);
    }

    private ApiGroupOutPeer groupPeer;
    private ApiUserOutPeer newOwner;

    public RequestTransferOwnership(@NotNull ApiGroupOutPeer groupPeer, @NotNull ApiUserOutPeer newOwner) {
        this.groupPeer = groupPeer;
        this.newOwner = newOwner;
    }

    public RequestTransferOwnership() {

    }

    @NotNull
    public ApiGroupOutPeer getGroupPeer() {
        return this.groupPeer;
    }

    @NotNull
    public ApiUserOutPeer getNewOwner() {
        return this.newOwner;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.groupPeer = values.getObj(1, new ApiGroupOutPeer());
        this.newOwner = values.getObj(2, new ApiUserOutPeer());
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.groupPeer == null) {
            throw new IOException();
        }
        writer.writeObject(1, this.groupPeer);
        if (this.newOwner == null) {
            throw new IOException();
        }
        writer.writeObject(2, this.newOwner);
    }

    @Override
    public String toString() {
        String res = "rpc TransferOwnership{";
        res += "groupPeer=" + this.groupPeer;
        res += ", newOwner=" + this.newOwner;
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
