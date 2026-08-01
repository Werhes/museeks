package defpackage;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؐۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0762e implements InterfaceC9815e {
    @Override // defpackage.InterfaceC9815e
    public final boolean ad() {
        AbstractC18303e abstractC18303e = AbstractC18303e.ad;
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.InterfaceC9815e
    public final boolean license(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // defpackage.InterfaceC9815e
    public final void metrica(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            AbstractC18303e abstractC18303e = AbstractC18303e.ad;
            sSLParameters.setApplicationProtocols((String[]) C10914e.license(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // defpackage.InterfaceC9815e
    public final String vip(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals(BuildConfig.FLAVOR)) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
