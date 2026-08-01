package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17656e extends AbstractC0014e {
    public final X509TrustManager ad;
    public final X509TrustManagerExtensions vip;

    public C17656e(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.ad = x509TrustManager;
        this.vip = x509TrustManagerExtensions;
    }

    @Override // defpackage.AbstractC0014e
    public final List billing(String str, List list) {
        try {
            return this.vip.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17656e) && ((C17656e) obj).ad == this.ad;
    }

    public final int hashCode() {
        return System.identityHashCode(this.ad);
    }
}
