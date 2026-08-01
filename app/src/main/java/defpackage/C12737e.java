package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۚۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12737e implements HostnameVerifier {
    public final C11212e ad;

    public C12737e(C11212e c11212e) {
        this.ad = c11212e;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        Certificate[] peerCertificates = sSLSession.getPeerCertificates();
        Iterator it = ((List) this.ad.invoke()).iterator();
        do {
            int i = 0;
            if (!it.hasNext()) {
                if (str.length() != ((int) AbstractC13201e.purchase(str))) {
                    return false;
                }
                try {
                    return C6249e.vip(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
                } catch (SSLException unused) {
                    return false;
                }
            }
            X509Certificate x509Certificate = (X509Certificate) it.next();
            int length = peerCertificates.length;
            while (true) {
                if (i >= length) {
                    certificate = null;
                    break;
                }
                certificate = peerCertificates[i];
                if (AbstractC7890e.billing(certificate, x509Certificate)) {
                    break;
                }
                try {
                    certificate.verify(x509Certificate.getPublicKey());
                    break;
                } catch (Throwable unused2) {
                    i++;
                }
            }
        } while (certificate == null);
        return true;
    }
}
