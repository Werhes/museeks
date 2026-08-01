package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۤۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2207e implements InterfaceC17119e {
    public final C16437e ad;
    public final long[] appmetrica;
    public final C16975e[] license;
    public final int[] metrica;
    public int purchase;
    public final int vip;

    public AbstractC2207e(C16437e c16437e, int[] iArr) {
        int i = 0;
        AbstractC2301e.subscription(iArr.length > 0);
        c16437e.getClass();
        this.ad = c16437e;
        int length = iArr.length;
        this.vip = length;
        this.license = new C16975e[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.license[i2] = c16437e.license[iArr[i2]];
        }
        Arrays.sort(this.license, new C6575e(2));
        this.metrica = new int[this.vip];
        while (true) {
            int i3 = this.vip;
            if (i >= i3) {
                this.appmetrica = new long[i3];
                return;
            } else {
                this.metrica[i] = c16437e.vip(this.license[i]);
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC17119e
    public final int Signature(int i) {
        return this.metrica[i];
    }

    @Override // defpackage.InterfaceC17119e
    public final C16437e adcel() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC17119e
    public int admob(long j, List list) {
        return list.size();
    }

    @Override // defpackage.InterfaceC17119e
    public final /* synthetic */ boolean advert(long j, AbstractC15951e abstractC15951e, List list) {
        return false;
    }

    @Override // defpackage.InterfaceC17119e
    public final C16975e amazon(int i) {
        return this.license[i];
    }

    @Override // defpackage.InterfaceC17119e
    public final int applovin(int i) {
        for (int i2 = 0; i2 < this.vip; i2++) {
            if (this.metrica[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC17119e
    public void billing() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC2207e abstractC2207e = (AbstractC2207e) obj;
            if (this.ad.equals(abstractC2207e.ad) && Arrays.equals(this.metrica, abstractC2207e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.purchase == 0) {
            this.purchase = Arrays.hashCode(this.metrica) + (System.identityHashCode(this.ad) * 31);
        }
        return this.purchase;
    }

    @Override // defpackage.InterfaceC17119e
    public final /* synthetic */ void inmobi() {
    }

    @Override // defpackage.InterfaceC17119e
    public final /* synthetic */ void isPro() {
    }

    @Override // defpackage.InterfaceC17119e
    public final int length() {
        return this.metrica.length;
    }

    @Override // defpackage.InterfaceC17119e
    public void loadAd() {
    }

    @Override // defpackage.InterfaceC17119e
    public final C16975e remoteconfig() {
        return this.license[mopub()];
    }

    @Override // defpackage.InterfaceC17119e
    public final boolean signatures(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean yandex = yandex(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.vip && !yandex) {
            yandex = (i2 == i || yandex(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!yandex) {
            return false;
        }
        long[] jArr = this.appmetrica;
        jArr[i] = Math.max(jArr[i], AbstractC9413e.ad(elapsedRealtime, j));
        return true;
    }

    @Override // defpackage.InterfaceC17119e
    public final void smaato(boolean z) {
    }

    @Override // defpackage.InterfaceC17119e
    public final int subscription() {
        return this.metrica[mopub()];
    }

    @Override // defpackage.InterfaceC17119e
    public void tapsense(float f) {
    }

    @Override // defpackage.InterfaceC17119e
    public final boolean yandex(int i, long j) {
        return this.appmetrica[i] > j;
    }
}
