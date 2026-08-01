package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4159e implements InterfaceC9112e {
    public final C7736e ad;
    public final C4426e license = new C4426e(this);
    public final InterfaceC9112e metrica;
    public final InterfaceC9112e vip;

    public C4159e(C7736e c7736e, InterfaceC9112e interfaceC9112e, InterfaceC9112e interfaceC9112e2) {
        this.ad = c7736e;
        this.vip = interfaceC9112e;
        this.metrica = interfaceC9112e2;
    }

    @Override // defpackage.InterfaceC9112e
    public final HostnameVerifier ad() {
        return new C8154e(this.ad, this.vip.ad(), this.metrica.ad());
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        metrica().checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        metrica().checkServerTrusted(x509CertificateArr, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C4159e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C4159e c4159e = (C4159e) obj;
        return AbstractC7890e.billing(this.vip, c4159e.vip) && AbstractC7890e.billing(this.metrica, c4159e.metrica);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return metrica().getAcceptedIssuers();
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (this.vip.hashCode() * 31);
    }

    public final InterfaceC9112e metrica() {
        return ((Boolean) this.ad.invoke()).booleanValue() ? this.metrica : this.vip;
    }

    @Override // defpackage.InterfaceC9112e
    public final SSLSocketFactory vip() {
        return this.license;
    }
}
