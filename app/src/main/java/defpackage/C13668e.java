package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۨۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13668e implements InterfaceC8848e {
    public int Signature;
    public final int ad;
    public final C2245e adcel;
    public int admob;
    public boolean advert = true;
    public final int amazon;
    public final int appmetrica;
    public final int billing;
    public final boolean license;
    public int loadAd;
    public final List metrica;
    public final long mopub;
    public long pro;
    public final int purchase;
    public final long remoteconfig;
    public final int smaato;
    public final Object startapp;
    public boolean subscription;
    public final Object vip;
    public final int yandex;

    public C13668e(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, C2245e c2245e, long j) {
        int i7;
        long j2;
        long j3;
        this.ad = i;
        this.vip = obj;
        this.metrica = list;
        this.license = z;
        this.appmetrica = i3;
        this.purchase = i4;
        this.billing = i5;
        this.yandex = i6;
        this.startapp = obj2;
        this.adcel = c2245e;
        this.mopub = j;
        int i8 = 1;
        int i9 = 0;
        if (list.isEmpty()) {
            i7 = 0;
        } else {
            AbstractC2832e abstractC2832e = (AbstractC2832e) list.get(0);
            i7 = z ? abstractC2832e.f6804e : abstractC2832e.f6806e;
            int billing = AbstractC6874e.billing(list);
            if (1 <= billing) {
                int i10 = 1;
                while (true) {
                    AbstractC2832e abstractC2832e2 = (AbstractC2832e) list.get(i10);
                    int i11 = this.license ? abstractC2832e2.f6804e : abstractC2832e2.f6806e;
                    i7 = i11 > i7 ? i11 : i7;
                    if (i10 == billing) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.smaato = i7;
        int i12 = i7 + i2;
        this.amazon = i12 < 0 ? 0 : i12;
        List list2 = this.metrica;
        if (!list2.isEmpty()) {
            AbstractC2832e abstractC2832e3 = (AbstractC2832e) list2.get(0);
            int i13 = this.license ? abstractC2832e3.f6806e : abstractC2832e3.f6804e;
            int billing2 = AbstractC6874e.billing(list2);
            if (1 <= billing2) {
                while (true) {
                    AbstractC2832e abstractC2832e4 = (AbstractC2832e) list2.get(i8);
                    int i14 = this.license ? abstractC2832e4.f6806e : abstractC2832e4.f6804e;
                    i13 = i14 > i13 ? i14 : i13;
                    if (i8 == billing2) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            i9 = i13;
        }
        this.loadAd = RecyclerView.UNDEFINED_DURATION;
        if (this.license) {
            j2 = i9 << 32;
            j3 = this.smaato;
        } else {
            j2 = this.smaato << 32;
            j3 = i9;
        }
        this.remoteconfig = (4294967295L & j3) | j2;
        this.pro = 0L;
    }

    public final int ad(long j) {
        return (int) (this.license ? j & 4294967295L : j >> 32);
    }

    @Override // defpackage.InterfaceC8848e
    public final long adcel() {
        return this.mopub;
    }

    @Override // defpackage.InterfaceC8848e
    public final void advert() {
        this.subscription = true;
    }

    @Override // defpackage.InterfaceC8848e
    public final int amazon() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC8848e
    public final int billing() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC8848e
    public final int getIndex() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC8848e
    public final Object getKey() {
        return this.vip;
    }

    public final void license(int i, int i2, int i3) {
        long j;
        this.loadAd = i3;
        this.Signature = -this.billing;
        this.admob = i3 + this.yandex;
        if (this.license) {
            j = (i2 << 32) | (4294967295L & i);
        } else {
            j = (i2 & 4294967295L) | (i << 32);
        }
        this.pro = j;
    }

    public final int metrica() {
        return (int) (!this.license ? this.pro >> 32 : this.pro & 4294967295L);
    }

    @Override // defpackage.InterfaceC8848e
    public final boolean mopub() {
        return this.license;
    }

    @Override // defpackage.InterfaceC8848e
    public final void purchase(int i, int i2, int i3, int i4) {
        if (this.license) {
            i3 = i4;
        }
        license(i, i2, i3);
    }

    @Override // defpackage.InterfaceC8848e
    public final long smaato(int i) {
        return this.pro;
    }

    @Override // defpackage.InterfaceC8848e
    public final Object startapp(int i) {
        return ((AbstractC2832e) this.metrica.get(i)).signatures();
    }

    @Override // defpackage.InterfaceC8848e
    public final int vip() {
        return this.metrica.size();
    }

    @Override // defpackage.InterfaceC8848e
    public final int yandex() {
        return this.purchase;
    }
}
