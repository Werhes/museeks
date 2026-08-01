package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7164e {
    public final C16151e ad;
    public int billing;
    public boolean metrica;
    public int yandex;
    public int vip = Alert.DURATION_SHOW_INDEFINITELY;
    public int license = 4096;
    public C4861e[] appmetrica = new C4861e[8];
    public int purchase = 7;

    public C7164e(C16151e c16151e) {
        this.ad = c16151e;
    }

    public final void ad(int i) {
        int i2;
        if (i > 0) {
            int length = this.appmetrica.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.purchase;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.appmetrica[length].metrica;
                i -= i4;
                this.yandex -= i4;
                this.billing--;
                i3++;
                length--;
            }
            C4861e[] c4861eArr = this.appmetrica;
            int i5 = i2 + 1;
            System.arraycopy(c4861eArr, i5, c4861eArr, i5 + i3, this.billing);
            C4861e[] c4861eArr2 = this.appmetrica;
            int i6 = this.purchase + 1;
            Arrays.fill(c4861eArr2, i6, i6 + i3, (Object) null);
            this.purchase += i3;
        }
    }

    public final void appmetrica(int i, int i2, int i3) {
        C16151e c16151e = this.ad;
        if (i < i2) {
            c16151e.m4128final(i | i3);
            return;
        }
        c16151e.m4128final(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c16151e.m4128final(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c16151e.m4128final(i4);
    }

    public final void license(ArrayList arrayList) {
        int i;
        int i2;
        if (this.metrica) {
            int i3 = this.vip;
            if (i3 < this.license) {
                appmetrica(i3, 31, 32);
            }
            this.metrica = false;
            this.vip = Alert.DURATION_SHOW_INDEFINITELY;
            appmetrica(this.license, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C4861e c4861e = (C4861e) arrayList.get(i4);
            C0193e admob = c4861e.ad.admob();
            C0193e c0193e = c4861e.vip;
            Integer num = (Integer) AbstractC13205e.vip.get(admob);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    C4861e[] c4861eArr = AbstractC13205e.ad;
                    if (AbstractC7890e.billing(c4861eArr[intValue].vip, c0193e)) {
                        i = i2;
                    } else if (AbstractC7890e.billing(c4861eArr[i2].vip, c0193e)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.purchase + 1;
                int length = this.appmetrica.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (AbstractC7890e.billing(this.appmetrica[i5].ad, admob)) {
                        if (AbstractC7890e.billing(this.appmetrica[i5].vip, c0193e)) {
                            i2 = AbstractC13205e.ad.length + (i5 - this.purchase);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.purchase) + AbstractC13205e.ad.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                appmetrica(i2, 127, 128);
            } else if (i == -1) {
                this.ad.m4128final(64);
                metrica(admob);
                metrica(c0193e);
                vip(c4861e);
            } else {
                C0193e c0193e2 = C4861e.license;
                admob.getClass();
                if (!admob.smaato(0, c0193e2.license(), c0193e2) || AbstractC7890e.billing(C4861e.startapp, admob)) {
                    appmetrica(i, 63, 64);
                    metrica(c0193e);
                    vip(c4861e);
                } else {
                    appmetrica(i, 15, 0);
                    metrica(c0193e);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [eِٖۢ, java.lang.Object] */
    public final void metrica(C0193e c0193e) {
        int[] iArr = AbstractC4773e.ad;
        int license = c0193e.license();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < license; i++) {
            byte startapp = c0193e.startapp(i);
            byte[] bArr = AbstractC10220e.ad;
            j2 += AbstractC4773e.vip[startapp & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int license2 = c0193e.license();
        C16151e c16151e = this.ad;
        if (i2 >= license2) {
            appmetrica(c0193e.license(), 127, 0);
            c0193e.pro(c16151e, c0193e.license());
            return;
        }
        ?? obj = new Object();
        int[] iArr2 = AbstractC4773e.ad;
        int license3 = c0193e.license();
        int i3 = 0;
        for (int i4 = 0; i4 < license3; i4++) {
            byte startapp2 = c0193e.startapp(i4);
            byte[] bArr2 = AbstractC10220e.ad;
            int i5 = startapp2 & 255;
            int i6 = AbstractC4773e.ad[i5];
            byte b = AbstractC4773e.vip[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                obj.m4128final((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            obj.m4128final((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        C0193e isPro = obj.isPro(obj.f31731e);
        appmetrica(isPro.license(), 127, 128);
        isPro.pro(c16151e, isPro.license());
    }

    public final void vip(C4861e c4861e) {
        int i = c4861e.metrica;
        int i2 = this.license;
        if (i > i2) {
            C4861e[] c4861eArr = this.appmetrica;
            Arrays.fill(c4861eArr, 0, c4861eArr.length, (Object) null);
            this.purchase = this.appmetrica.length - 1;
            this.billing = 0;
            this.yandex = 0;
            return;
        }
        ad((this.yandex + i) - i2);
        int i3 = this.billing + 1;
        C4861e[] c4861eArr2 = this.appmetrica;
        if (i3 > c4861eArr2.length) {
            C4861e[] c4861eArr3 = new C4861e[c4861eArr2.length * 2];
            System.arraycopy(c4861eArr2, 0, c4861eArr3, c4861eArr2.length, c4861eArr2.length);
            this.purchase = this.appmetrica.length - 1;
            this.appmetrica = c4861eArr3;
        }
        int i4 = this.purchase;
        this.purchase = i4 - 1;
        this.appmetrica[i4] = c4861e;
        this.billing++;
        this.yandex += i;
    }
}
