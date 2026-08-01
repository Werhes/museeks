package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۦٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3762e extends AbstractC0014e {
    public final InterfaceC2995e ad;

    public C3762e(InterfaceC2995e interfaceC2995e) {
        this.ad = interfaceC2995e;
    }

    public static boolean amazon(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!AbstractC7890e.billing(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.AbstractC0014e
    public final List billing(String str, List list) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) AbstractC17861e.mopub(1, arrayList);
            X509Certificate ad = this.ad.ad(x509Certificate);
            if (ad == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (amazon(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(ad)) {
                arrayList.add(ad);
            }
            if (amazon(ad, ad, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C3762e) && AbstractC7890e.billing(((C3762e) obj).ad, this.ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
