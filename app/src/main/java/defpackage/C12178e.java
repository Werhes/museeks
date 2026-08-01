package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

/* renamed from: eّٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12178e extends X509CertSelector implements InterfaceC14659e {
    @Override // defpackage.InterfaceC14659e
    public final boolean advert(Object obj) {
        if (obj instanceof X509Certificate) {
            return super.match((X509Certificate) obj);
        }
        return false;
    }

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public final Object clone() {
        return (C12178e) super.clone();
    }

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public final boolean match(Certificate certificate) {
        return advert(certificate);
    }
}
