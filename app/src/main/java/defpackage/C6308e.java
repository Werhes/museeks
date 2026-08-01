package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/* renamed from: eَؙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6308e implements InterfaceC1408e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Date f13137e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Date f13138e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1079e f13139e;

    public C6308e(byte[] bArr) {
        try {
            C1079e loadAd = C1079e.loadAd(new Cgoto(new ByteArrayInputStream(bArr)).Signature());
            this.f13139e = loadAd;
            try {
                this.f13137e = loadAd.f3611e.f14758e.f18281e.firebase();
                this.f13138e = loadAd.f3611e.f14758e.f18282e.firebase();
            } catch (ParseException unused) {
                throw new IOException("invalid data structure in certificate!");
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(AbstractC8703e.subscription(e2, new StringBuilder("exception decoding certificate structure: ")));
        }
    }

    public final void ad(Date date) {
        Date date2 = this.f13137e;
        if (date.after(date2)) {
            throw new CertificateExpiredException("certificate expired on " + date2);
        }
        Date date3 = this.f13138e;
        if (date.before(date3)) {
            throw new CertificateNotYetValidException("certificate not valid till " + date3);
        }
    }

    public final C4636e appmetrica() {
        return new C4636e(this.f13139e.f3611e.f14751e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC1408e)) {
            return false;
        }
        try {
            return Arrays.equals(this.f13139e.getEncoded(), ((C6308e) ((InterfaceC1408e) obj)).f13139e.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return metrica(true);
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        C1597e loadAd;
        C9216e c9216e = this.f13139e.f3611e.f14755e;
        if (c9216e == null || (loadAd = c9216e.loadAd(new Ctry(str))) == null) {
            return null;
        }
        try {
            return loadAd.f4520e.smaato();
        } catch (Exception e) {
            throw new RuntimeException(AbstractC8703e.subscription(e, new StringBuilder("error encoding ")));
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return metrica(false);
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        C9216e c9216e = this.f13139e.f3611e.f14755e;
        return c9216e != null && c9216e.subscription();
    }

    public final int hashCode() {
        try {
            return AbstractC12442e.isVip(this.f13139e.getEncoded());
        } catch (IOException unused) {
            return 0;
        }
    }

    public final C5213e license() {
        return new C5213e((Ccatch) this.f13139e.f3611e.f14752e.billing());
    }

    public final HashSet metrica(boolean z) {
        C9216e c9216e = this.f13139e.f3611e.f14755e;
        if (c9216e == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration elements = c9216e.f18405e.elements();
        while (elements.hasMoreElements()) {
            Ctry ctry = (Ctry) elements.nextElement();
            if (c9216e.loadAd(ctry).f4521e == z) {
                hashSet.add(ctry.m4673class());
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, eٓ۠ٚ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eؕٙۚ, java.lang.Object] */
    public final C14285e[] vip(String str) {
        Ccatch ccatch = this.f13139e.f3611e.f14757e;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            C3458e c3458e = null;
            if (i == ccatch.size()) {
                if (arrayList.size() == 0) {
                    return null;
                }
                return (C14285e[]) arrayList.toArray(new C14285e[arrayList.size()]);
            }
            subs mo171interface = ccatch.mo171interface(i);
            ?? obj = new Object();
            if (mo171interface instanceof C3458e) {
                c3458e = (C3458e) mo171interface;
            } else if (mo171interface != null) {
                Ccatch m168class = Ccatch.m168class(mo171interface);
                ?? obj2 = new Object();
                if (m168class.size() != 2) {
                    throw new IllegalArgumentException(AbstractC0054e.premium(m168class, new StringBuilder("Bad sequence size: ")));
                }
                obj2.f7710e = Ctry.m4669interface(m168class.mo171interface(0));
                obj2.f7709e = Cfinal.crashlytics(m168class.mo171interface(1));
                c3458e = obj2;
            }
            obj.f28253e = c3458e;
            c3458e.getClass();
            if (new Ctry(c3458e.f7710e.m4673class()).m4673class().equals(str)) {
                arrayList.add(obj);
            }
            i++;
        }
    }
}
