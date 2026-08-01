package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6312e extends AbstractC11062e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC11062e f13142e;

    public C6312e(AbstractC11062e abstractC11062e) {
        this.f13142e = abstractC11062e;
    }

    @Override // defpackage.AbstractC11062e
    public final InterfaceC0274e ad(C10675e c10675e) {
        return this.f13142e.ad(c10675e);
    }

    @Override // defpackage.AbstractC11062e
    public final List ads(C10675e c10675e) {
        List ads = this.f13142e.ads(c10675e);
        if (ads == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ads.iterator();
        while (it.hasNext()) {
            arrayList.add((C10675e) it.next());
        }
        AbstractC5167e.pro(arrayList);
        return arrayList;
    }

    @Override // defpackage.AbstractC11062e
    public final void advert(C10675e c10675e) {
        this.f13142e.advert(c10675e);
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: break */
    public final InterfaceC0274e mo1914break(C10675e c10675e, boolean z) {
        C10675e metrica = c10675e.metrica();
        if (metrica != null) {
            purchase(metrica);
        }
        return this.f13142e.mo1914break(c10675e, z);
    }

    @Override // defpackage.AbstractC11062e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13142e.close();
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: extends */
    public final C0058e mo1916extends(C10675e c10675e) {
        return this.f13142e.mo1916extends(c10675e);
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: goto */
    public final C15308e mo1917goto(C10675e c10675e) {
        C15308e mo1917goto = this.f13142e.mo1917goto(c10675e);
        if (mo1917goto == null) {
            return null;
        }
        C10675e c10675e2 = mo1917goto.metrica;
        return c10675e2 == null ? mo1917goto : new C15308e(mo1917goto.ad, mo1917goto.vip, c10675e2, mo1917goto.license, mo1917goto.appmetrica, mo1917goto.purchase, mo1917goto.billing, mo1917goto.yandex);
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: implements */
    public final InterfaceC2537e mo1918implements(C10675e c10675e) {
        return this.f13142e.mo1918implements(c10675e);
    }

    @Override // defpackage.AbstractC11062e
    public final List inmobi(C10675e c10675e) {
        List inmobi = this.f13142e.inmobi(c10675e);
        ArrayList arrayList = new ArrayList();
        Iterator it = inmobi.iterator();
        while (it.hasNext()) {
            arrayList.add((C10675e) it.next());
        }
        AbstractC5167e.pro(arrayList);
        return arrayList;
    }

    @Override // defpackage.AbstractC11062e
    public final void license(C10675e c10675e, C10675e c10675e2) {
        this.f13142e.license(c10675e, c10675e2);
    }

    @Override // defpackage.AbstractC11062e
    public final void loadAd(C10675e c10675e, boolean z) {
        this.f13142e.loadAd(c10675e, z);
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: protected */
    public final C0058e mo1919protected(C10675e c10675e) {
        return this.f13142e.mo1919protected(c10675e);
    }

    @Override // defpackage.AbstractC11062e
    public final InterfaceC9093e subs(C10675e c10675e) {
        return new C2167e(this.f13142e.subs(c10675e), new C10739e(27, this));
    }

    public final String toString() {
        return AbstractC3820e.ad.vip(C6312e.class).mopub() + '(' + this.f13142e + ')';
    }
}
