package defpackage;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertSelector;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.security.auth.x500.X500Principal;

/* renamed from: eؚؗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4636e implements CertSelector, InterfaceC14659e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cextends f9967e;

    public C4636e(C7087e c7087e) {
        this.f9967e = c7087e.f14543e;
    }

    public static boolean vip(X500Principal x500Principal, C9120e c9120e) {
        C5547e[] Signature = c9120e.Signature();
        for (int i = 0; i != Signature.length; i++) {
            C5547e c5547e = Signature[i];
            if (c5547e.f11877e == 4) {
                try {
                    if (new X500Principal(c5547e.f11878e.billing().getEncoded()).equals(x500Principal)) {
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final Principal[] ad() {
        Cextends cextends = this.f9967e;
        C5547e[] Signature = (cextends instanceof C6767e ? ((C6767e) cextends).f13972e : (C9120e) cextends).Signature();
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

    @Override // defpackage.InterfaceC14659e
    public final boolean advert(Object obj) {
        if (obj instanceof X509Certificate) {
            return match((Certificate) obj);
        }
        return false;
    }

    @Override // java.security.cert.CertSelector
    public final Object clone() {
        return new C4636e(C7087e.loadAd(this.f9967e));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4636e) {
            return this.f9967e.equals(((C4636e) obj).f9967e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9967e.hashCode();
    }

    @Override // java.security.cert.CertSelector
    public final boolean match(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        X509Certificate x509Certificate = (X509Certificate) certificate;
        Cextends cextends = this.f9967e;
        if (!(cextends instanceof C6767e)) {
            return vip(x509Certificate.getSubjectX500Principal(), (C9120e) cextends);
        }
        C6767e c6767e = (C6767e) cextends;
        C3784e c3784e = c6767e.f13971e;
        if (c3784e != null) {
            return c3784e.f8388e.m4665interface(x509Certificate.getSerialNumber()) && vip(x509Certificate.getIssuerX500Principal(), c3784e.f8389e);
        }
        return vip(x509Certificate.getSubjectX500Principal(), c6767e.f13972e);
    }
}
