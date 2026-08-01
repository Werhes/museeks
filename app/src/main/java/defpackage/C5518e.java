package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5518e extends AbstractC11062e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C10675e f11793e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final LinkedHashMap f11794e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C10675e f11795e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC11062e f11796e;

    static {
        String str = C10675e.f21023e;
        f11793e = C10215e.license("/", false);
    }

    public C5518e(C10675e c10675e, AbstractC11062e abstractC11062e, LinkedHashMap linkedHashMap) {
        this.f11795e = c10675e;
        this.f11796e = abstractC11062e;
        this.f11794e = linkedHashMap;
    }

    @Override // defpackage.AbstractC11062e
    public final InterfaceC0274e ad(C10675e c10675e) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.AbstractC11062e
    public final List ads(C10675e c10675e) {
        return m1915catch(c10675e, false);
    }

    @Override // defpackage.AbstractC11062e
    public final void advert(C10675e c10675e) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: break, reason: not valid java name */
    public final InterfaceC0274e mo1914break(C10675e c10675e, boolean z) {
        throw new IOException("zip file systems are read-only");
    }

    /* renamed from: catch, reason: not valid java name */
    public final List m1915catch(C10675e c10675e, boolean z) {
        C10675e c10675e2 = f11793e;
        c10675e2.getClass();
        C12243e c12243e = (C12243e) this.f11794e.get(purchase.vip(c10675e2, c10675e, true));
        if (c12243e != null) {
            return AbstractC13480e.m3575continue(c12243e.admob);
        }
        if (!z) {
            return null;
        }
        throw new IOException("not a directory: " + c10675e);
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: extends, reason: not valid java name */
    public final C0058e mo1916extends(C10675e c10675e) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    @Override // defpackage.AbstractC11062e
    /* renamed from: goto, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C15308e mo1917goto(defpackage.C10675e r27) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5518e.mo1917goto(eَۦۦ):eًؚٕ");
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: implements, reason: not valid java name */
    public final InterfaceC2537e mo1918implements(C10675e c10675e) {
        C13197e c13197e;
        Throwable th;
        C10675e c10675e2 = f11793e;
        c10675e2.getClass();
        C12243e c12243e = (C12243e) this.f11794e.get(purchase.vip(c10675e2, c10675e, true));
        if (c12243e == null) {
            throw new FileNotFoundException("no such file: " + c10675e);
        }
        long j = c12243e.purchase;
        C0058e mo1916extends = this.f11796e.mo1916extends(this.f11795e);
        try {
            c13197e = new C13197e(mo1916extends.license(c12243e.yandex));
            try {
                mo1916extends.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (mo1916extends != null) {
                try {
                    mo1916extends.close();
                } catch (Throwable th4) {
                    AbstractC13362e.license(th3, th4);
                }
            }
            c13197e = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        AbstractC15182e.adcel(c13197e, null);
        if (c12243e.billing == 0) {
            return new C1590e(c13197e, j, true);
        }
        return new C1590e(new C15532e(new C13197e(new C1590e(c13197e, c12243e.appmetrica, true)), new Inflater(true)), j, false);
    }

    @Override // defpackage.AbstractC11062e
    public final List inmobi(C10675e c10675e) {
        return m1915catch(c10675e, true);
    }

    @Override // defpackage.AbstractC11062e
    public final void license(C10675e c10675e, C10675e c10675e2) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.AbstractC11062e
    public final void loadAd(C10675e c10675e, boolean z) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: protected, reason: not valid java name */
    public final C0058e mo1919protected(C10675e c10675e) {
        throw new IOException("zip entries are not writable");
    }
}
