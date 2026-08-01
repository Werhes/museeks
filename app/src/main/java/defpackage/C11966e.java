package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11966e implements InterfaceC9815e {
    public static final C12153e ad = new Object();
    public static final boolean vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۨٞ, java.lang.Object] */
    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC5418e.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        vip = z;
    }

    @Override // defpackage.InterfaceC9815e
    public final boolean ad() {
        return vip;
    }

    @Override // defpackage.InterfaceC9815e
    public final boolean license(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.InterfaceC9815e
    public final void metrica(SSLSocket sSLSocket, String str, List list) {
        if (license(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC18303e abstractC18303e = AbstractC18303e.ad;
            parameters.setApplicationProtocols((String[]) C10914e.license(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // defpackage.InterfaceC9815e
    public final String vip(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals(BuildConfig.FLAVOR)) {
            return null;
        }
        return applicationProtocol;
    }
}
