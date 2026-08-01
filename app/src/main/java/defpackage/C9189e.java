package defpackage;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9189e extends AbstractC6690e {
    public static final /* synthetic */ int amazon = 0;
    public final int[] adcel;
    public final Object[] advert;
    public final int appmetrica;
    public final int billing;
    public final AbstractC6690e[] mopub;
    public final C2166e purchase;
    public final HashMap smaato;
    public final int[] startapp;
    public final int yandex;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9189e(java.util.ArrayList r7, defpackage.C2166e r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            eؙ۠ؐ[] r0 = new defpackage.AbstractC6690e[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            eؘٙۢ r4 = (defpackage.InterfaceC5718e) r4
            int r5 = r3 + 1
            eؙ۠ؐ r4 = r4.metrica()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            eؘٙۢ r3 = (defpackage.InterfaceC5718e) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.vip()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9189e.<init>(java.util.ArrayList, eؓۢؖ):void");
    }

    public C9189e(AbstractC6690e[] abstractC6690eArr, Object[] objArr, C2166e c2166e) {
        this.purchase = c2166e;
        this.appmetrica = c2166e.vip.length;
        int length = abstractC6690eArr.length;
        this.mopub = abstractC6690eArr;
        this.startapp = new int[length];
        this.adcel = new int[length];
        this.advert = objArr;
        this.smaato = new HashMap();
        int length2 = abstractC6690eArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            AbstractC6690e abstractC6690e = abstractC6690eArr[i];
            this.mopub[i4] = abstractC6690e;
            this.adcel[i4] = i2;
            this.startapp[i4] = i3;
            i2 += abstractC6690e.loadAd();
            i3 += this.mopub[i4].yandex();
            this.smaato.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.billing = i2;
        this.yandex = i3;
    }

    @Override // defpackage.AbstractC6690e
    public final int ad(boolean z) {
        if (this.appmetrica != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.purchase.vip;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC6690e[] abstractC6690eArr = this.mopub;
                if (!abstractC6690eArr[i].Signature()) {
                    return abstractC6690eArr[i].ad(z) + this.adcel[i];
                }
                i = admob(i, z);
            } while (i != -1);
        }
        return -1;
    }

    public final int admob(int i, boolean z) {
        if (!z) {
            if (i < this.appmetrica - 1) {
                return i + 1;
            }
            return -1;
        }
        C2166e c2166e = this.purchase;
        int i2 = c2166e.metrica[i] + 1;
        int[] iArr = c2166e.vip;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // defpackage.AbstractC6690e
    public final Object advert(int i) {
        int[] iArr = this.startapp;
        int appmetrica = AbstractC9413e.appmetrica(iArr, i + 1, false, false);
        return Pair.create(this.advert[appmetrica], this.mopub[appmetrica].advert(i - iArr[appmetrica]));
    }

    @Override // defpackage.AbstractC6690e
    public final int appmetrica(int i, int i2, boolean z) {
        int[] iArr = this.adcel;
        int appmetrica = AbstractC9413e.appmetrica(iArr, i + 1, false, false);
        int i3 = iArr[appmetrica];
        AbstractC6690e[] abstractC6690eArr = this.mopub;
        int appmetrica2 = abstractC6690eArr[appmetrica].appmetrica(i - i3, i2 != 2 ? i2 : 0, z);
        if (appmetrica2 != -1) {
            return i3 + appmetrica2;
        }
        int admob = admob(appmetrica, z);
        while (admob != -1 && abstractC6690eArr[admob].Signature()) {
            admob = admob(admob, z);
        }
        if (admob != -1) {
            return abstractC6690eArr[admob].ad(z) + iArr[admob];
        }
        if (i2 == 2) {
            return ad(z);
        }
        return -1;
    }

    @Override // defpackage.AbstractC6690e
    public final C6158e billing(Object obj, C6158e c6158e) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.smaato.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.adcel[intValue];
        this.mopub[intValue].billing(obj3, c6158e);
        c6158e.metrica += i;
        c6158e.vip = obj;
        return c6158e;
    }

    @Override // defpackage.AbstractC6690e
    public final int loadAd() {
        return this.billing;
    }

    @Override // defpackage.AbstractC6690e
    public final int metrica(boolean z) {
        int i;
        int i2 = this.appmetrica;
        if (i2 != 0) {
            if (z) {
                int[] iArr = this.purchase.vip;
                i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                i = i2 - 1;
            }
            do {
                AbstractC6690e[] abstractC6690eArr = this.mopub;
                if (!abstractC6690eArr[i].Signature()) {
                    return abstractC6690eArr[i].metrica(z) + this.adcel[i];
                }
                i = subscription(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.AbstractC6690e
    public final int mopub(int i, int i2, boolean z) {
        int[] iArr = this.adcel;
        int appmetrica = AbstractC9413e.appmetrica(iArr, i + 1, false, false);
        int i3 = iArr[appmetrica];
        AbstractC6690e[] abstractC6690eArr = this.mopub;
        int mopub = abstractC6690eArr[appmetrica].mopub(i - i3, i2 != 2 ? i2 : 0, z);
        if (mopub != -1) {
            return i3 + mopub;
        }
        int subscription = subscription(appmetrica, z);
        while (subscription != -1 && abstractC6690eArr[subscription].Signature()) {
            subscription = subscription(subscription, z);
        }
        if (subscription != -1) {
            return abstractC6690eArr[subscription].metrica(z) + iArr[subscription];
        }
        if (i2 == 2) {
            return metrica(z);
        }
        return -1;
    }

    @Override // defpackage.AbstractC6690e
    public final C6158e purchase(int i, C6158e c6158e, boolean z) {
        int[] iArr = this.startapp;
        int appmetrica = AbstractC9413e.appmetrica(iArr, i + 1, false, false);
        int i2 = this.adcel[appmetrica];
        this.mopub[appmetrica].purchase(i - iArr[appmetrica], c6158e, z);
        c6158e.metrica += i2;
        if (z) {
            Object obj = this.advert[appmetrica];
            Object obj2 = c6158e.vip;
            obj2.getClass();
            c6158e.vip = Pair.create(obj, obj2);
        }
        return c6158e;
    }

    @Override // defpackage.AbstractC6690e
    public final C11501e smaato(int i, C11501e c11501e, long j) {
        int[] iArr = this.adcel;
        int appmetrica = AbstractC9413e.appmetrica(iArr, i + 1, false, false);
        int i2 = iArr[appmetrica];
        int i3 = this.startapp[appmetrica];
        this.mopub[appmetrica].smaato(i - i2, c11501e, j);
        Object obj = this.advert[appmetrica];
        if (!C11501e.admob.equals(c11501e.ad)) {
            obj = Pair.create(obj, c11501e.ad);
        }
        c11501e.ad = obj;
        c11501e.amazon += i3;
        c11501e.loadAd += i3;
        return c11501e;
    }

    public final int subscription(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        C2166e c2166e = this.purchase;
        int i2 = c2166e.metrica[i] - 1;
        if (i2 >= 0) {
            return c2166e.vip[i2];
        }
        return -1;
    }

    @Override // defpackage.AbstractC6690e
    public final int vip(Object obj) {
        int vip;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.smaato.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (vip = this.mopub[intValue].vip(obj3)) != -1) {
                return this.startapp[intValue] + vip;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC6690e
    public final int yandex() {
        return this.yandex;
    }
}
