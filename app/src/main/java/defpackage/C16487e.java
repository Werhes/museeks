package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16487e implements InterfaceC9815e {
    public final InterfaceC1323e ad;
    public InterfaceC9815e vip;

    public C16487e(InterfaceC1323e interfaceC1323e) {
        this.ad = interfaceC1323e;
    }

    @Override // defpackage.InterfaceC9815e
    public final boolean ad() {
        return true;
    }

    public final synchronized InterfaceC9815e appmetrica(SSLSocket sSLSocket) {
        try {
            if (this.vip == null && this.ad.license(sSLSocket)) {
                this.vip = this.ad.admob(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.vip;
    }

    @Override // defpackage.InterfaceC9815e
    public final boolean license(SSLSocket sSLSocket) {
        return this.ad.license(sSLSocket);
    }

    @Override // defpackage.InterfaceC9815e
    public final void metrica(SSLSocket sSLSocket, String str, List list) {
        InterfaceC9815e appmetrica = appmetrica(sSLSocket);
        if (appmetrica != null) {
            appmetrica.metrica(sSLSocket, str, list);
        }
    }

    @Override // defpackage.InterfaceC9815e
    public final String vip(SSLSocket sSLSocket) {
        InterfaceC9815e appmetrica = appmetrica(sSLSocket);
        if (appmetrica != null) {
            return appmetrica.vip(sSLSocket);
        }
        return null;
    }
}
