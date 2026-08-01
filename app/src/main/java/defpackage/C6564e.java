package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6564e implements InterfaceC8848e {
    public final int Signature;
    public final int ad;
    public final Object adcel;
    public int admob = RecyclerView.UNDEFINED_DURATION;
    public final long advert;
    public final int amazon;
    public final EnumC7792e appmetrica;
    public final int billing;
    public boolean inmobi;
    public int isVip;
    public final int license;
    public final int loadAd;
    public final boolean metrica;
    public final C2245e mopub;
    public final long pro;
    public final int purchase;
    public int remoteconfig;
    public long signatures;
    public final int smaato;
    public final long startapp;
    public int subscription;
    public int tapsense;
    public final Object vip;
    public final List yandex;

    public C6564e(int i, Object obj, boolean z, int i2, int i3, EnumC7792e enumC7792e, int i4, int i5, List list, long j, Object obj2, C2245e c2245e, long j2, int i6, int i7) {
        this.ad = i;
        this.vip = obj;
        this.metrica = z;
        this.license = i2;
        this.appmetrica = enumC7792e;
        this.purchase = i4;
        this.billing = i5;
        this.yandex = list;
        this.startapp = j;
        this.adcel = obj2;
        this.mopub = c2245e;
        this.advert = j2;
        this.smaato = i6;
        this.amazon = i7;
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC2832e abstractC2832e = (AbstractC2832e) list.get(i9);
            i8 = Math.max(i8, this.metrica ? abstractC2832e.f6804e : abstractC2832e.f6806e);
        }
        this.loadAd = i8;
        int i10 = i3 + i8;
        this.Signature = i10 >= 0 ? i10 : 0;
        this.pro = this.metrica ? (4294967295L & i8) | (this.license << 32) : (4294967295L & this.license) | (i8 << 32);
        this.signatures = 0L;
        this.tapsense = -1;
        this.isVip = -1;
    }

    public final int ad(long j) {
        return (int) (this.metrica ? j & 4294967295L : j >> 32);
    }

    @Override // defpackage.InterfaceC8848e
    public final long adcel() {
        return this.advert;
    }

    @Override // defpackage.InterfaceC8848e
    public final void advert() {
        this.inmobi = true;
    }

    @Override // defpackage.InterfaceC8848e
    public final int amazon() {
        return this.smaato;
    }

    @Override // defpackage.InterfaceC8848e
    public final int billing() {
        return this.Signature;
    }

    @Override // defpackage.InterfaceC8848e
    public final int getIndex() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC8848e
    public final Object getKey() {
        return this.vip;
    }

    public final void license(int i, int i2, int i3, int i4, int i5, int i6) {
        long j;
        long j2;
        boolean z = this.metrica;
        int i7 = z ? i4 : i3;
        this.admob = i7;
        if (!z) {
            i3 = i4;
        }
        if (z && this.appmetrica == EnumC7792e.f15793e) {
            i2 = (i3 - i2) - this.license;
        }
        if (z) {
            j = i2 << 32;
            j2 = i;
        } else {
            j = i << 32;
            j2 = i2;
        }
        this.signatures = (j2 & 4294967295L) | j;
        this.tapsense = i5;
        this.isVip = i6;
        this.subscription = -this.purchase;
        this.remoteconfig = i7 + this.billing;
    }

    public final void metrica(AbstractC3698e abstractC3698e, boolean z) {
        C16446e c16446e;
        if (this.admob == Integer.MIN_VALUE) {
            AbstractC8889e.ad("position() should be called first");
        }
        List list = this.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC2832e abstractC2832e = (AbstractC2832e) list.get(i);
            int i2 = this.subscription;
            boolean z2 = this.metrica;
            int i3 = i2 - (z2 ? abstractC2832e.f6804e : abstractC2832e.f6806e);
            int i4 = this.remoteconfig;
            long j = this.signatures;
            C0110e vip = this.mopub.vip(i, this.vip);
            if (vip != null) {
                if (z) {
                    vip.subscription = j;
                } else {
                    long license = C11490e.license(!C11490e.vip(vip.subscription, C0110e.remoteconfig) ? vip.subscription : j, ((C11490e) vip.admob.getValue()).ad);
                    if ((ad(j) <= i3 && ad(license) <= i3) || (ad(j) >= i4 && ad(license) >= i4)) {
                        vip.vip();
                    }
                    j = license;
                }
                c16446e = vip.amazon;
            } else {
                c16446e = null;
            }
            long license2 = C11490e.license(j, this.startapp);
            if (!z && vip != null) {
                vip.smaato = license2;
            }
            if (z2) {
                if (c16446e != null) {
                    abstractC3698e.getClass();
                    AbstractC3698e.ad(abstractC3698e, abstractC2832e);
                    abstractC2832e.mo1207case(C11490e.license(license2, abstractC2832e.f6802e), 0.0f, c16446e);
                } else {
                    AbstractC3698e.admob(abstractC3698e, abstractC2832e, license2);
                }
            } else if (c16446e != null) {
                AbstractC3698e.loadAd(abstractC3698e, abstractC2832e, license2, c16446e);
            } else {
                AbstractC3698e.amazon(abstractC3698e, abstractC2832e, license2);
            }
        }
    }

    @Override // defpackage.InterfaceC8848e
    public final boolean mopub() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC8848e
    public final void purchase(int i, int i2, int i3, int i4) {
        license(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.InterfaceC8848e
    public final long smaato(int i) {
        return this.signatures;
    }

    @Override // defpackage.InterfaceC8848e
    public final Object startapp(int i) {
        return ((AbstractC2832e) this.yandex.get(i)).signatures();
    }

    @Override // defpackage.InterfaceC8848e
    public final int vip() {
        return this.yandex.size();
    }

    @Override // defpackage.InterfaceC8848e
    public final int yandex() {
        return this.amazon;
    }
}
