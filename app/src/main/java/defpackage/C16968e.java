package defpackage;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.X509CRL;
import java.util.Arrays;

/* renamed from: eّٗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16968e implements InterfaceC14659e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f33220e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f33221e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f33222e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final BigInteger f33223e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final CRLSelector f33224e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f33225e;

    public C16968e(C14815e c14815e) {
        this.f33224e = (CRLSelector) c14815e.f29341e;
        this.f33222e = c14815e.f29337e;
        this.f33221e = c14815e.f29339e;
        this.f33223e = (BigInteger) c14815e.f29340e;
        this.f33220e = (byte[]) c14815e.f29338e;
        this.f33225e = c14815e.f29336e;
    }

    public final Object clone() {
        return this;
    }

    @Override // defpackage.InterfaceC14659e
    /* renamed from: match, reason: merged with bridge method [inline-methods] */
    public final boolean advert(CRL crl) {
        boolean z = crl instanceof X509CRL;
        CRLSelector cRLSelector = this.f33224e;
        if (!z) {
            return cRLSelector.match(crl);
        }
        X509CRL x509crl = (X509CRL) crl;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C1597e.f4502e.m4673class());
            Cthis subs = extensionValue != null ? Cthis.subs(Cprotected.subs(extensionValue).f36449e) : null;
            if (subs == null) {
                if (this.f33222e) {
                    return false;
                }
            } else {
                if (this.f33221e) {
                    return false;
                }
                BigInteger bigInteger = this.f33223e;
                if (bigInteger != null && subs.crashlytics().compareTo(bigInteger) == 1) {
                    return false;
                }
            }
            if (this.f33225e) {
                byte[] extensionValue2 = x509crl.getExtensionValue(C1597e.f4510e.m4673class());
                byte[] bArr = this.f33220e;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!Arrays.equals(extensionValue2, bArr)) {
                    return false;
                }
            }
            return cRLSelector.match(crl);
        } catch (Exception unused) {
            return false;
        }
    }
}
