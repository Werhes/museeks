package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؒؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971e {
    public static final C11883e advert = new C11883e(new C1870e(29), new C7983e(11), 15);
    public boolean ad;
    public C16784e adcel;
    public C16784e appmetrica;
    public C1973e billing;
    public final AtomicLong license;
    public final C16529e metrica;
    public final C0576e mopub;
    public C8035e purchase;
    public C16784e startapp;
    public final ArrayList vip = new ArrayList();
    public C18408e yandex;

    public C0971e(long j) {
        C16529e c16529e = AbstractC2800e.ad;
        this.metrica = new C16529e();
        this.license = new AtomicLong(j);
        this.mopub = AbstractC14533e.startapp(AbstractC2800e.ad);
    }

    public final C16529e ad() {
        return (C16529e) this.mopub.getValue();
    }

    public final void license(C12850e c12850e) {
        long j = c12850e.ad;
        C16529e c16529e = this.metrica;
        if (c16529e.vip(j)) {
            this.vip.remove(c12850e);
            long j2 = c12850e.ad;
            c16529e.billing(j2);
            C16784e c16784e = this.adcel;
            if (c16784e != null) {
                c16784e.invoke(Long.valueOf(j2));
            }
        }
    }

    public final ArrayList metrica(InterfaceC0043e interfaceC0043e) {
        boolean z = this.ad;
        ArrayList arrayList = this.vip;
        if (!z) {
            AbstractC5167e.signatures(new C15401e(2, new C3450e(1, interfaceC0043e)), arrayList);
            this.ad = true;
        }
        return arrayList;
    }

    public final boolean vip(InterfaceC0043e interfaceC0043e, long j, long j2, C16658e c16658e, boolean z) {
        C1973e c1973e = this.billing;
        if (c1973e == null) {
            return true;
        }
        C4034e c4034e = c1973e.f5178e;
        long ad = c4034e.ad(interfaceC0043e, j);
        long ad2 = c4034e.ad(interfaceC0043e, j2);
        c4034e.mopub(z);
        return c4034e.amazon(ad, ad2, false, c16658e);
    }
}
