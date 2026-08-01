package defpackage;

import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8697e implements HostnameVerifier {
    public final List ad;
    public final CopyOnWriteArrayList vip = new CopyOnWriteArrayList();

    public C8697e(List list) {
        this.ad = list;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        Certificate certificate2;
        for (X509Certificate x509Certificate : sSLSession.getPeerCertificateChain()) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.vip;
            Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                certificate = null;
                if (!it.hasNext()) {
                    certificate2 = null;
                    break;
                }
                certificate2 = (Certificate) it.next();
                try {
                    x509Certificate.verify(certificate2.getPublicKey());
                    break;
                } catch (Throwable unused) {
                }
            }
            if (certificate2 != null) {
                return true;
            }
            Iterator it2 = this.ad.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Certificate certificate3 = (Certificate) it2.next();
                try {
                    x509Certificate.verify(certificate3.getPublicKey());
                    certificate = certificate3;
                    break;
                } catch (Throwable unused2) {
                }
            }
            if (certificate != null) {
                copyOnWriteArrayList.add(certificate);
                return true;
            }
        }
        if (str.length() != ((int) AbstractC13201e.purchase(str))) {
            return false;
        }
        try {
            return C6249e.vip(str, (java.security.cert.X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused3) {
            return false;
        }
    }
}
