package defpackage;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

/* renamed from: eؗۡۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5213e implements CertSelector, InterfaceC14659e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15592e f11117e;

    public C5213e(Ccatch ccatch) {
        this.f11117e = C15592e.loadAd(ccatch);
    }

    public static boolean metrica(C3639e c3639e, C9120e c9120e) {
        C5547e[] Signature = c9120e.Signature();
        for (int i = 0; i != Signature.length; i++) {
            C5547e c5547e = Signature[i];
            if (c5547e.f11877e == 4) {
                try {
                    try {
                        if (new C16624e(Ccatch.m168class(new Cgoto(c5547e.f11878e.billing().getEncoded()).Signature())).equals(c3639e)) {
                            return true;
                        }
                    } catch (IllegalArgumentException e) {
                        throw new IOException("not an ASN.1 Sequence: " + e);
                        break;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public static Principal[] vip(C9120e c9120e) {
        C5547e[] Signature = c9120e.Signature();
        ArrayList arrayList = new ArrayList(Signature.length);
        for (int i = 0; i != Signature.length; i++) {
            if (Signature[i].f11877e == 4) {
                try {
                    arrayList.add(new X500Principal(Signature[i].f11878e.billing().getEncoded()));
                } catch (IOException unused) {
                    throw new RuntimeException("badly formed Name object");
                }
            }
        }
        Object[] array = arrayList.toArray(new Object[arrayList.size()]);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 != array.length; i2++) {
            Object obj = array[i2];
            if (obj instanceof Principal) {
                arrayList2.add(obj);
            }
        }
        return (Principal[]) arrayList2.toArray(new Principal[arrayList2.size()]);
    }

    public final Principal[] ad() {
        C9120e c9120e = this.f11117e.f30766e;
        if (c9120e != null) {
            return vip(c9120e);
        }
        return null;
    }

    @Override // defpackage.InterfaceC14659e
    public final boolean advert(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    @Override // java.security.cert.CertSelector
    public final Object clone() {
        return new C5213e((Ccatch) this.f11117e.billing());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5213e) {
            return this.f11117e.equals(((C5213e) obj).f11117e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11117e.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
    
        if (metrica(new defpackage.C3639e(defpackage.C16624e.admob(defpackage.C7806e.loadAd(defpackage.Cdefault.inmobi(r1.getTBSCertificate())).f15813e)), r4) != false) goto L22;
     */
    @Override // java.security.cert.CertSelector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean match(java.security.cert.Certificate r8) {
        /*
            r7 = this;
            eٕٜۛ r0 = r7.f11117e
            boolean r1 = r8 instanceof java.security.cert.X509Certificate
            r2 = 0
            if (r1 != 0) goto L9
            goto Lbc
        L9:
            r1 = r8
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            eٕؕۨ r3 = r0.f30768e     // Catch: java.lang.Throwable -> Lbc
            eٌۦٖ r4 = r0.f30766e
            eؖۚۚ r5 = r0.f30765e
            r6 = 1
            if (r3 == 0) goto L4e
            this r8 = r3.f8388e     // Catch: java.lang.Throwable -> Lbc
            java.math.BigInteger r3 = r1.getSerialNumber()     // Catch: java.lang.Throwable -> Lbc
            boolean r8 = r8.m4665interface(r3)     // Catch: java.lang.Throwable -> Lbc
            if (r8 == 0) goto Lbc
            byte[] r8 = r1.getTBSCertificate()     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            default r8 = defpackage.Cdefault.inmobi(r8)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            eًًۡ r8 = defpackage.C7806e.loadAd(r8)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            eؕۜؖ r1 = new eؕۜؖ     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            eٕٔٛ r8 = r8.f15814e     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            eٖۥَ r8 = defpackage.C16624e.admob(r8)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            r1.<init>(r8)     // Catch: java.io.IOException -> L43 java.lang.Throwable -> Lbc
            eٕؕۨ r8 = r0.f30768e     // Catch: java.lang.Throwable -> Lbc
            eٌۦٖ r8 = r8.f8389e     // Catch: java.lang.Throwable -> Lbc
            boolean r8 = metrica(r1, r8)     // Catch: java.lang.Throwable -> Lbc
            if (r8 == 0) goto Lbc
            goto L6d
        L43:
            r8 = move-exception
            java.security.cert.CertificateEncodingException r0 = new java.security.cert.CertificateEncodingException     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        L4e:
            if (r4 == 0) goto L79
            byte[] r0 = r1.getTBSCertificate()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            default r0 = defpackage.Cdefault.inmobi(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            eًًۡ r0 = defpackage.C7806e.loadAd(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            eؕۜؖ r1 = new eؕۜؖ     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            eٕٔٛ r0 = r0.f15813e     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            eٖۥَ r0 = defpackage.C16624e.admob(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            r1.<init>(r0)     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lbc
            boolean r0 = metrica(r1, r4)     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L79
        L6d:
            return r6
        L6e:
            r8 = move-exception
            java.security.cert.CertificateEncodingException r0 = new java.security.cert.CertificateEncodingException     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r8)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        L79:
            if (r5 == 0) goto Lbc
            eٖ۟ r0 = r5.f9498e
            try r0 = r0.f32408e
            java.lang.String r0 = r0.m4673class()
            java.lang.String r1 = "BC"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0, r1)
            if (r5 == 0) goto L92
            firebase r1 = r5.f9501e     // Catch: java.lang.Throwable -> Lbc
            int r1 = r1.firebase()     // Catch: java.lang.Throwable -> Lbc
            goto L93
        L92:
            r1 = -1
        L93:
            if (r1 == 0) goto La0
            if (r1 == r6) goto L98
            goto Lab
        L98:
            byte[] r8 = r8.getEncoded()     // Catch: java.lang.Throwable -> Lbc
            r0.update(r8)     // Catch: java.lang.Throwable -> Lbc
            goto Lab
        La0:
            java.security.PublicKey r8 = r8.getPublicKey()     // Catch: java.lang.Throwable -> Lbc
            byte[] r8 = r8.getEncoded()     // Catch: java.lang.Throwable -> Lbc
            r0.update(r8)     // Catch: java.lang.Throwable -> Lbc
        Lab:
            byte[] r8 = r0.digest()     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto Lb8
            isPro r0 = r5.f9500e     // Catch: java.lang.Throwable -> Lbc
            byte[] r0 = r0.crashlytics()     // Catch: java.lang.Throwable -> Lbc
            goto Lb9
        Lb8:
            r0 = 0
        Lb9:
            java.util.Arrays.equals(r8, r0)     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5213e.match(java.security.cert.Certificate):boolean");
    }
}
