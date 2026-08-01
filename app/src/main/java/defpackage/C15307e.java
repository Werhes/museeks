package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15307e implements InterfaceC2995e {
    public final X509TrustManager ad;
    public final Method vip;

    public C15307e(X509TrustManager x509TrustManager, Method method) {
        this.ad = x509TrustManager;
        this.vip = method;
    }

    @Override // defpackage.InterfaceC2995e
    public final X509Certificate ad(X509Certificate x509Certificate) {
        try {
            return ((TrustAnchor) this.vip.invoke(this.ad, x509Certificate)).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15307e)) {
            return false;
        }
        C15307e c15307e = (C15307e) obj;
        return AbstractC7890e.billing(this.ad, c15307e.ad) && AbstractC7890e.billing(this.vip, c15307e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.ad + ", findByIssuerAndSignatureMethod=" + this.vip + ')';
    }
}
