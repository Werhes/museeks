package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12345e extends C7332e {
    public final Socket amazon;

    public C12345e(Socket socket) {
        this.amazon = socket;
    }

    @Override // defpackage.C7332e
    public final IOException adcel(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.C7332e
    public final void mopub() {
        Socket socket = this.amazon;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!AbstractC17793e.ad(e)) {
                throw e;
            }
            AbstractC17793e.ad.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC17793e.ad.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
