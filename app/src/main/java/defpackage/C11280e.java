package defpackage;

import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11280e implements InterfaceC9112e {
    public final SSLSocketFactory ad;
    public final X509TrustManager metrica;
    public final C8697e vip;

    public C11280e(List list, KeyStore keyStore) {
        Object c12763e;
        TrustManagerFactory trustManagerFactory;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new TrustManager[]{this}, null);
        sSLContext.getClientSessionContext().setSessionCacheSize(0);
        sSLContext.getClientSessionContext().setSessionTimeout(900);
        this.ad = sSLContext.getSocketFactory();
        this.vip = new C8697e(list);
        try {
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        if (trustManagerFactory.getTrustManagers().length != 1 || !(AbstractC1660e.applovin(trustManagerFactory.getTrustManagers()) instanceof X509TrustManager)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c12763e = (X509TrustManager) AbstractC1660e.applovin(trustManagerFactory.getTrustManagers());
        this.metrica = (X509TrustManager) (c12763e instanceof C12763e ? null : c12763e);
    }

    @Override // defpackage.InterfaceC9112e
    public final HostnameVerifier ad() {
        return this.vip;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        X509TrustManager x509TrustManager = this.metrica;
        if (x509TrustManager != null) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        X509TrustManager x509TrustManager = this.metrica;
        if (x509TrustManager != null) {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers;
        X509TrustManager x509TrustManager = this.metrica;
        return (x509TrustManager == null || (acceptedIssuers = x509TrustManager.getAcceptedIssuers()) == null) ? new X509Certificate[0] : acceptedIssuers;
    }

    @Override // defpackage.InterfaceC9112e
    public final SSLSocketFactory vip() {
        return this.ad;
    }
}
