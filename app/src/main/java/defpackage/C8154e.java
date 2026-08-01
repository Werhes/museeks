package defpackage;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8154e implements HostnameVerifier {
    public final C7736e ad;
    public final HostnameVerifier metrica;
    public final HostnameVerifier vip;

    public C8154e(C7736e c7736e, HostnameVerifier hostnameVerifier, HostnameVerifier hostnameVerifier2) {
        this.ad = c7736e;
        this.vip = hostnameVerifier;
        this.metrica = hostnameVerifier2;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        return ((Boolean) this.ad.invoke()).booleanValue() ? this.metrica.verify(str, sSLSession) : this.vip.verify(str, sSLSession);
    }
}
