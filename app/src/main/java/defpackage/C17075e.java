package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17075e implements InterfaceC6175e {
    public final C11122e ad;
    public InterfaceC17077e adcel;
    public Surface appmetrica;
    public long billing;
    public final ArrayDeque license;
    public final C2912e metrica;
    public C16975e purchase;
    public Executor startapp;
    public final C8034e vip;
    public InterfaceC8193e yandex;

    /* JADX WARN: Type inference failed for: r2v6, types: [eٗ٘ۜ, java.lang.Object] */
    public C17075e(C11122e c11122e, C8034e c8034e, C17381e c17381e) {
        this.ad = c11122e;
        this.vip = c8034e;
        c11122e.advert = c17381e;
        this.metrica = new C2912e(new C17424e(this), c11122e, c8034e);
        this.license = new ArrayDeque();
        this.purchase = new C16975e(new C11445e());
        this.billing = -9223372036854775807L;
        this.yandex = InterfaceC8193e.f16679e;
        this.startapp = new ExecutorC14279e(1);
        this.adcel = new Object();
    }

    @Override // defpackage.InterfaceC6175e
    public final void Signature(long j, long j2) {
        try {
            this.metrica.ad(j, j2);
        } catch (C5681e e) {
            throw new C4087e(e, this.purchase);
        }
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.InterfaceC6175e
    public final void adcel(int i) {
        C14347e c14347e = this.ad.vip;
        if (c14347e.adcel == i) {
            return;
        }
        c14347e.adcel = i;
        c14347e.license(true);
    }

    @Override // defpackage.InterfaceC6175e
    public final void admob(boolean z) {
        this.ad.metrica(z);
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean advert(long j, C11418e c11418e) {
        this.license.add(c11418e);
        C2912e c2912e = this.metrica;
        C11199e c11199e = c2912e.purchase;
        int i = c11199e.f22465e;
        long[] jArr = (long[]) c11199e.f22467e;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = c11199e.f22464e;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) c11199e.f22467e, 0, jArr2, i3, i2);
            c11199e.f22464e = 0;
            c11199e.f22463e = c11199e.f22465e - 1;
            c11199e.f22467e = jArr2;
            c11199e.f22462e = length - 1;
        }
        int i4 = (c11199e.f22463e + 1) & c11199e.f22462e;
        c11199e.f22463e = i4;
        ((long[]) c11199e.f22467e)[i4] = j;
        c11199e.f22465e++;
        c2912e.yandex = j;
        c2912e.adcel = -9223372036854775807L;
        this.startapp.execute(new RunnableC2783e(0, this));
        return true;
    }

    @Override // defpackage.InterfaceC6175e
    public final void amazon(boolean z) {
        if (z) {
            C11122e c11122e = this.ad;
            c11122e.vip.vip();
            c11122e.yandex = -9223372036854775807L;
            c11122e.purchase = -9223372036854775807L;
            c11122e.appmetrica = Math.min(c11122e.appmetrica, 1);
            c11122e.startapp = -9223372036854775807L;
            c11122e.amazon = false;
        }
        this.vip.vip();
        C2912e c2912e = this.metrica;
        C9831e c9831e = c2912e.license;
        C11199e c11199e = c2912e.purchase;
        c11199e.f22464e = 0;
        c11199e.f22463e = -1;
        c11199e.f22465e = 0;
        c2912e.yandex = -9223372036854775807L;
        c2912e.startapp = -9223372036854775807L;
        c2912e.adcel = -9223372036854775807L;
        C9831e c9831e2 = c2912e.appmetrica;
        if (c9831e2.m2709switch() > 0) {
            AbstractC2301e.billing(c9831e2.m2709switch() > 0);
            while (c9831e2.m2709switch() > 1) {
                c9831e2.m2707strictfp();
            }
            Object m2707strictfp = c9831e2.m2707strictfp();
            m2707strictfp.getClass();
            c2912e.advert = ((Long) m2707strictfp).longValue();
        }
        if (c9831e.m2709switch() > 0) {
            AbstractC2301e.billing(c9831e.m2709switch() > 0);
            while (c9831e.m2709switch() > 1) {
                c9831e.m2707strictfp();
            }
            Object m2707strictfp2 = c9831e.m2707strictfp();
            m2707strictfp2.getClass();
            c9831e.purchase(0L, (C2351e) m2707strictfp2);
        }
        this.license.clear();
    }

    @Override // defpackage.InterfaceC6175e
    public final void appmetrica(C16089e c16089e) {
        this.yandex = c16089e;
        this.startapp = EnumC3320e.f7489e;
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean billing() {
        C2912e c2912e = this.metrica;
        long j = c2912e.adcel;
        return j != -9223372036854775807L && c2912e.startapp == j;
    }

    @Override // defpackage.InterfaceC6175e
    public final Surface getInputSurface() {
        Surface surface = this.appmetrica;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.InterfaceC6175e
    public final void license(C16975e c16975e, long j, int i, List list) {
        AbstractC2301e.subscription(list.isEmpty());
        int i2 = c16975e.tapsense;
        int i3 = c16975e.isVip;
        C16975e c16975e2 = this.purchase;
        int i4 = c16975e2.tapsense;
        C2912e c2912e = this.metrica;
        if (i2 != i4 || i3 != c16975e2.isVip) {
            C9831e c9831e = c2912e.license;
            long j2 = c2912e.yandex;
            c9831e.purchase(j2 == -9223372036854775807L ? 0L : j2 + 1, new C2351e(i2, i3));
        }
        float f = c16975e.applovin;
        if (f != this.purchase.applovin) {
            this.ad.purchase(f);
        }
        this.purchase = c16975e;
        if (j != this.billing) {
            if (c2912e.purchase.f22465e == 0) {
                c2912e.vip.appmetrica(i);
                c2912e.advert = j;
            } else {
                C9831e c9831e2 = c2912e.appmetrica;
                long j3 = c2912e.yandex;
                c9831e2.purchase(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.billing = j;
        }
    }

    @Override // defpackage.InterfaceC6175e
    public final void loadAd(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC6175e
    public final void metrica() {
        this.vip.vip();
        this.ad.license();
    }

    @Override // defpackage.InterfaceC6175e
    public final void mopub() {
        this.appmetrica = null;
        this.ad.billing(null);
    }

    @Override // defpackage.InterfaceC6175e
    public final void pro() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC6175e
    public final void purchase(float f) {
        this.ad.yandex(f);
    }

    @Override // defpackage.InterfaceC6175e
    public final void release() {
    }

    @Override // defpackage.InterfaceC6175e
    public final void remoteconfig(InterfaceC17077e interfaceC17077e) {
        this.adcel = interfaceC17077e;
    }

    @Override // defpackage.InterfaceC6175e
    public final void signatures(Surface surface, C8795e c8795e) {
        this.appmetrica = surface;
        this.ad.billing(surface);
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean smaato(C16975e c16975e) {
        return true;
    }

    @Override // defpackage.InterfaceC6175e
    public final void startapp() {
        C2912e c2912e = this.metrica;
        if (c2912e.yandex == -9223372036854775807L) {
            c2912e.yandex = Long.MIN_VALUE;
            c2912e.startapp = Long.MIN_VALUE;
        }
        c2912e.adcel = c2912e.yandex;
    }

    @Override // defpackage.InterfaceC6175e
    public final boolean subscription(boolean z) {
        return this.ad.vip(z);
    }

    @Override // defpackage.InterfaceC6175e
    public final void tapsense() {
        C11122e c11122e = this.ad;
        if (c11122e.appmetrica == 0) {
            c11122e.appmetrica = 1;
        }
    }

    @Override // defpackage.InterfaceC6175e
    public final void vip() {
        this.vip.vip();
        C11122e c11122e = this.ad;
        c11122e.license = false;
        c11122e.startapp = -9223372036854775807L;
        C14347e c14347e = c11122e.vip;
        c14347e.license = false;
        AbstractC17090e abstractC17090e = c14347e.metrica;
        if (abstractC17090e != null) {
            abstractC17090e.vip();
        }
        c14347e.ad();
    }

    @Override // defpackage.InterfaceC6175e
    public final void yandex(long j) {
        throw new UnsupportedOperationException();
    }
}
