package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16211e implements InterfaceC9112e {
    public final X509TrustManager ad;
    public final SSLSocketFactory vip;

    public C16211e() {
        AbstractC18303e abstractC18303e = AbstractC18303e.ad;
        AbstractC18303e.ad.getClass();
        X509TrustManager amazon = AbstractC18303e.amazon();
        this.ad = amazon;
        this.vip = AbstractC18303e.ad.smaato(amazon);
    }

    @Override // defpackage.InterfaceC9112e
    public final HostnameVerifier ad() {
        return C6249e.ad;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.ad.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.ad.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.ad.getAcceptedIssuers();
    }

    @Override // defpackage.InterfaceC9112e
    public final SSLSocketFactory vip() {
        return this.vip;
    }
}
