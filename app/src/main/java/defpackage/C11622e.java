package defpackage;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11622e implements InterfaceC9112e {
    public final C11212e ad;
    public final C12737e license;
    public final SSLSocketFactory metrica;
    public final X509TrustManager vip;

    public C11622e(C11212e c11212e) {
        this.ad = c11212e;
        AbstractC18303e abstractC18303e = AbstractC18303e.ad;
        AbstractC18303e.ad.getClass();
        this.vip = AbstractC18303e.amazon();
        this.metrica = AbstractC18303e.ad.smaato(this);
        this.license = new C12737e(c11212e);
    }

    @Override // defpackage.InterfaceC9112e
    public final HostnameVerifier ad() {
        return this.license;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.vip.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        List list = (List) this.ad.invoke();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC7890e.billing(x509Certificate, (X509Certificate) it.next())) {
                    return;
                }
            }
        }
        this.vip.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        Object[] array = ((Collection) this.ad.invoke()).toArray(new X509Certificate[0]);
        X509Certificate[] acceptedIssuers = this.vip.getAcceptedIssuers();
        int length = array.length;
        int length2 = acceptedIssuers.length;
        Object[] copyOf = Arrays.copyOf(array, length + length2);
        System.arraycopy(acceptedIssuers, 0, copyOf, length, length2);
        return (X509Certificate[]) copyOf;
    }

    @Override // defpackage.InterfaceC9112e
    public final SSLSocketFactory vip() {
        return this.metrica;
    }
}
