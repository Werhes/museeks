package defpackage;

import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.Date;

/* renamed from: e٘ۖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17934e {
    public final C6107e ad;
    public final X509Certificate appmetrica;
    public final int license;
    public final CertPath metrica;
    public final PublicKey purchase;
    public final Date vip;

    public C17934e(C6107e c6107e, Date date, CertPath certPath, int i, X509Certificate x509Certificate, PublicKey publicKey) {
        this.ad = c6107e;
        this.vip = date;
        this.metrica = certPath;
        this.license = i;
        this.appmetrica = x509Certificate;
        this.purchase = publicKey;
    }

    public final Date ad() {
        return new Date(this.vip.getTime());
    }
}
