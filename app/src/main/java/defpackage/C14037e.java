package defpackage;

import org.bouncycastle.jce.provider.X509CertificateObject;

/* renamed from: eٓ٘ؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14037e {
    public X509CertificateObject ad;
    public X509CertificateObject vip;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14037e)) {
            C14037e c14037e = (C14037e) obj;
            X509CertificateObject x509CertificateObject = c14037e.vip;
            X509CertificateObject x509CertificateObject2 = c14037e.ad;
            X509CertificateObject x509CertificateObject3 = this.ad;
            boolean equals = x509CertificateObject3 != null ? x509CertificateObject3.equals(x509CertificateObject2) : x509CertificateObject2 == null;
            X509CertificateObject x509CertificateObject4 = this.vip;
            boolean equals2 = x509CertificateObject4 != null ? x509CertificateObject4.equals(x509CertificateObject) : x509CertificateObject == null;
            if (equals && equals2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        X509CertificateObject x509CertificateObject = this.ad;
        int hashCode = x509CertificateObject != null ? (-1) ^ x509CertificateObject.hashCode() : -1;
        X509CertificateObject x509CertificateObject2 = this.vip;
        if (x509CertificateObject2 != null) {
            return x509CertificateObject2.hashCode() ^ (hashCode * 17);
        }
        return hashCode;
    }
}
