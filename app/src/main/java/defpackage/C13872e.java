package defpackage;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;

/* renamed from: eٌٓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13872e extends X509CertSelector {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5300e f27481e;

    public C13872e(C5300e c5300e) {
        this.f27481e = c5300e;
        CertSelector certSelector = c5300e.f11387e;
        if (certSelector instanceof X509CertSelector) {
            X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
            setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
            setBasicConstraints(x509CertSelector.getBasicConstraints());
            setCertificate(x509CertSelector.getCertificate());
            setCertificateValid(x509CertSelector.getCertificateValid());
            setKeyUsage(x509CertSelector.getKeyUsage());
            setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
            setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
            setSerialNumber(x509CertSelector.getSerialNumber());
            setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
            setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
            try {
                setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                setIssuer(x509CertSelector.getIssuerAsBytes());
                setNameConstraints(x509CertSelector.getNameConstraints());
                setPathToNames(x509CertSelector.getPathToNames());
                setPolicy(x509CertSelector.getPolicy());
                setSubject(x509CertSelector.getSubjectAsBytes());
                setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
            } catch (IOException e) {
                throw new IllegalStateException(AbstractC8703e.admob(e, new StringBuilder("base selector invalid: ")), e);
            }
        }
    }

    @Override // java.security.cert.X509CertSelector, java.security.cert.CertSelector
    public final boolean match(Certificate certificate) {
        C5300e c5300e = this.f27481e;
        return c5300e == null ? certificate != null : c5300e.f11387e.match(certificate);
    }
}
