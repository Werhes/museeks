package defpackage;

import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRLSelector;

/* renamed from: eْۡۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13569e extends X509CRLSelector {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16968e f26877e;

    public C13569e(C16968e c16968e) {
        this.f26877e = c16968e;
        CRLSelector cRLSelector = c16968e.f33224e;
        if (cRLSelector instanceof X509CRLSelector) {
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            setCertificateChecking(x509CRLSelector.getCertificateChecking());
            setDateAndTime(x509CRLSelector.getDateAndTime());
            setIssuers(x509CRLSelector.getIssuers());
            setMinCRLNumber(x509CRLSelector.getMinCRL());
            setMaxCRLNumber(x509CRLSelector.getMaxCRL());
        }
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
    public final boolean match(CRL crl) {
        C16968e c16968e = this.f26877e;
        return c16968e == null ? crl != null : c16968e.advert(crl);
    }
}
