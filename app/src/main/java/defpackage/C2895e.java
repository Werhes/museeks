package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ۟ٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2895e {
    public final EnumC17692e ad;
    public final C5363e license;
    public final List metrica;
    public final C6893e vip;

    public C2895e(EnumC17692e enumC17692e, C6893e c6893e, List list, Function0 function0) {
        this.ad = enumC17692e;
        this.vip = c6893e;
        this.metrica = list;
        this.license = new C5363e(new C1319e(4, function0));
    }

    public final List ad() {
        return (List) this.license.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2895e)) {
            return false;
        }
        C2895e c2895e = (C2895e) obj;
        return c2895e.ad == this.ad && AbstractC7890e.billing(c2895e.vip, this.vip) && AbstractC7890e.billing(c2895e.ad(), ad()) && AbstractC7890e.billing(c2895e.metrica, this.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((ad().hashCode() + ((this.vip.hashCode() + ((this.ad.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> ad = ad();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(ad, 10));
        for (Certificate certificate : ad) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.ad);
        sb.append(" cipherSuite=");
        sb.append(this.vip);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.metrica;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
