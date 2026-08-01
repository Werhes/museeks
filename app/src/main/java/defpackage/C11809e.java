package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11809e extends AbstractC2207e {
    public final C17381e Signature;
    public final long adcel;
    public float admob;
    public final int advert;
    public final float amazon;
    public final InterfaceC16610e billing;
    public final AbstractC17475e loadAd;
    public final int mopub;
    public long pro;
    public int remoteconfig;
    public AbstractC15186e signatures;
    public final float smaato;
    public final long startapp;
    public int subscription;
    public final long yandex;

    public C11809e(C16437e c16437e, int[] iArr, InterfaceC16610e interfaceC16610e, long j, long j2, long j3, AbstractC17475e abstractC17475e) {
        super(c16437e, iArr);
        if (j3 < j) {
            AbstractC2803e.smaato("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.billing = interfaceC16610e;
        this.yandex = j * 1000;
        this.startapp = j2 * 1000;
        this.adcel = j3 * 1000;
        this.mopub = 1279;
        this.advert = 719;
        this.smaato = 0.7f;
        this.amazon = 0.75f;
        this.loadAd = AbstractC17475e.remoteconfig(abstractC17475e);
        this.Signature = C17381e.ad;
        this.admob = 1.0f;
        this.remoteconfig = 0;
        this.pro = -9223372036854775807L;
    }

    public static void ad(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C13304e c13304e = (C13304e) arrayList.get(i);
            if (c13304e != null) {
                c13304e.metrica(new C4258e(j, jArr[i]));
            }
        }
    }

    public static long metrica(List list) {
        if (!list.isEmpty()) {
            AbstractC15186e abstractC15186e = (AbstractC15186e) AbstractC4306e.appmetrica(list);
            long j = abstractC15186e.billing;
            if (j != -9223372036854775807L) {
                long j2 = abstractC15186e.yandex;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.AbstractC2207e, defpackage.InterfaceC17119e
    public final int admob(long j, List list) {
        int i;
        int i2;
        this.Signature.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.pro;
        if (j2 != -9223372036854775807L && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((AbstractC15186e) AbstractC4306e.appmetrica(list)).equals(this.signatures))) {
            return list.size();
        }
        this.pro = elapsedRealtime;
        this.signatures = list.isEmpty() ? null : (AbstractC15186e) AbstractC4306e.appmetrica(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long m2557interface = AbstractC9413e.m2557interface(this.admob, ((AbstractC15186e) list.get(size - 1)).billing - j);
        long j3 = this.adcel;
        if (m2557interface >= j3) {
            metrica(list);
            C16975e c16975e = this.license[vip(elapsedRealtime)];
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC15186e abstractC15186e = (AbstractC15186e) list.get(i3);
                C16975e c16975e2 = abstractC15186e.license;
                if (AbstractC9413e.m2557interface(this.admob, abstractC15186e.billing - j) >= j3 && c16975e2.adcel < c16975e.adcel && (i = c16975e2.isVip) != -1 && i <= this.advert && (i2 = c16975e2.tapsense) != -1 && i2 <= this.mopub && i < c16975e.isVip) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.AbstractC2207e, defpackage.InterfaceC17119e
    public final void billing() {
        this.signatures = null;
    }

    @Override // defpackage.InterfaceC17119e
    public final Object isVip() {
        return null;
    }

    @Override // defpackage.AbstractC2207e, defpackage.InterfaceC17119e
    public final void loadAd() {
        this.pro = -9223372036854775807L;
        this.signatures = null;
    }

    @Override // defpackage.InterfaceC17119e
    public final int mopub() {
        return this.subscription;
    }

    @Override // defpackage.InterfaceC17119e
    public final int pro() {
        return this.remoteconfig;
    }

    @Override // defpackage.InterfaceC17119e
    public final void startapp(long j, long j2, long j3, List list, InterfaceC14651e[] interfaceC14651eArr) {
        long metrica;
        this.Signature.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.subscription;
        int i2 = 0;
        if (i >= interfaceC14651eArr.length || !interfaceC14651eArr[i].next()) {
            int length = interfaceC14651eArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    metrica = metrica(list);
                    break;
                }
                InterfaceC14651e interfaceC14651e = interfaceC14651eArr[i3];
                if (interfaceC14651e.next()) {
                    metrica = interfaceC14651e.loadAd() - interfaceC14651e.mopub();
                    break;
                }
                i3++;
            }
        } else {
            InterfaceC14651e interfaceC14651e2 = interfaceC14651eArr[this.subscription];
            metrica = interfaceC14651e2.loadAd() - interfaceC14651e2.mopub();
        }
        int i4 = this.remoteconfig;
        if (i4 == 0) {
            this.remoteconfig = 1;
            this.subscription = vip(elapsedRealtime);
            return;
        }
        int i5 = this.subscription;
        boolean isEmpty = list.isEmpty();
        C16975e[] c16975eArr = this.license;
        if (!isEmpty) {
            C16975e c16975e = ((AbstractC15186e) AbstractC4306e.appmetrica(list)).license;
            while (i2 < this.vip) {
                if (c16975eArr[i2] == c16975e) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            i4 = ((AbstractC15186e) AbstractC4306e.appmetrica(list)).appmetrica;
            i5 = i2;
        }
        int vip = vip(elapsedRealtime);
        if (vip != i5 && !yandex(i5, elapsedRealtime)) {
            C16975e c16975e2 = c16975eArr[i5];
            C16975e c16975e3 = c16975eArr[vip];
            long j4 = this.yandex;
            if (j3 != -9223372036854775807L) {
                j4 = Math.min(((float) (metrica != -9223372036854775807L ? j3 - metrica : j3)) * this.amazon, j4);
            }
            int i6 = c16975e3.adcel;
            int i7 = c16975e2.adcel;
            if ((i6 > i7 && j2 < j4) || (i6 < i7 && j2 >= this.startapp)) {
                vip = i5;
            }
        }
        if (vip != i5) {
            i4 = 3;
        }
        this.remoteconfig = i4;
        this.subscription = vip;
    }

    @Override // defpackage.AbstractC2207e, defpackage.InterfaceC17119e
    public final void tapsense(float f) {
        this.admob = f;
    }

    public final int vip(long j) {
        long j2;
        C10573e c10573e = (C10573e) this.billing;
        synchronized (c10573e) {
            j2 = c10573e.advert;
        }
        long j3 = ((float) j2) * this.smaato;
        this.billing.getClass();
        long j4 = ((float) j3) / this.admob;
        if (!this.loadAd.isEmpty()) {
            int i = 1;
            while (i < this.loadAd.size() - 1 && ((C4258e) this.loadAd.get(i)).ad < j4) {
                i++;
            }
            C4258e c4258e = (C4258e) this.loadAd.get(i - 1);
            C4258e c4258e2 = (C4258e) this.loadAd.get(i);
            long j5 = c4258e.ad;
            float f = ((float) (j4 - j5)) / ((float) (c4258e2.ad - j5));
            j4 = c4258e.vip + (f * ((float) (c4258e2.vip - r1)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.vip; i3++) {
            if (j == Long.MIN_VALUE || !yandex(i3, j)) {
                if (this.license[i3].adcel <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
