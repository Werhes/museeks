package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ۟٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0588e {
    public int billing;
    public final C13197e metrica;
    public int purchase;
    public int ad = 4096;
    public final ArrayList vip = new ArrayList();
    public C4861e[] license = new C4861e[8];
    public int appmetrica = 7;

    public C0588e(C8387e c8387e) {
        this.metrica = new C13197e(c8387e);
    }

    public final int ad(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.license.length;
            while (true) {
                length--;
                i2 = this.appmetrica;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.license[length].metrica;
                i -= i4;
                this.billing -= i4;
                this.purchase--;
                i3++;
            }
            C4861e[] c4861eArr = this.license;
            System.arraycopy(c4861eArr, i2 + 1, c4861eArr, i2 + 1 + i3, this.purchase);
            this.appmetrica += i3;
        }
        return i3;
    }

    public final int appmetrica(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.metrica.readByte();
            byte[] bArr = AbstractC10220e.ad;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [eِٖۢ, java.lang.Object] */
    public final C0193e license() {
        C13197e c13197e = this.metrica;
        byte readByte = c13197e.readByte();
        byte[] bArr = AbstractC10220e.ad;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long appmetrica = appmetrica(i, 127);
        if (!z) {
            return c13197e.isPro(appmetrica);
        }
        ?? obj = new Object();
        C10629e c10629e = AbstractC4773e.metrica;
        C10629e c10629e2 = c10629e;
        int i3 = 0;
        for (long j = 0; j < appmetrica; j++) {
            byte readByte2 = c13197e.readByte();
            byte[] bArr2 = AbstractC10220e.ad;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                c10629e2 = ((C10629e[]) c10629e2.f20952e)[(i2 >>> (i3 - 8)) & 255];
                if (((C10629e[]) c10629e2.f20952e) == null) {
                    obj.m4128final(c10629e2.f20951e);
                    i3 -= c10629e2.f20950e;
                    c10629e2 = c10629e;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            C10629e c10629e3 = ((C10629e[]) c10629e2.f20952e)[(i2 << (8 - i3)) & 255];
            C10629e[] c10629eArr = (C10629e[]) c10629e3.f20952e;
            int i4 = c10629e3.f20950e;
            if (c10629eArr != null || i4 > i3) {
                break;
            }
            obj.m4128final(c10629e3.f20951e);
            i3 -= i4;
            c10629e2 = c10629e;
        }
        return obj.isPro(obj.f31731e);
    }

    public final void metrica(C4861e c4861e) {
        this.vip.add(c4861e);
        int i = c4861e.metrica;
        int i2 = this.ad;
        if (i > i2) {
            AbstractC1660e.inmobi(null, this.license);
            this.appmetrica = this.license.length - 1;
            this.purchase = 0;
            this.billing = 0;
            return;
        }
        ad((this.billing + i) - i2);
        int i3 = this.purchase + 1;
        C4861e[] c4861eArr = this.license;
        if (i3 > c4861eArr.length) {
            C4861e[] c4861eArr2 = new C4861e[c4861eArr.length * 2];
            System.arraycopy(c4861eArr, 0, c4861eArr2, c4861eArr.length, c4861eArr.length);
            this.appmetrica = this.license.length - 1;
            this.license = c4861eArr2;
        }
        int i4 = this.appmetrica;
        this.appmetrica = i4 - 1;
        this.license[i4] = c4861e;
        this.purchase++;
        this.billing += i;
    }

    public final C0193e vip(int i) {
        if (i >= 0) {
            C4861e[] c4861eArr = AbstractC13205e.ad;
            if (i <= c4861eArr.length - 1) {
                return c4861eArr[i].ad;
            }
        }
        int length = this.appmetrica + 1 + (i - AbstractC13205e.ad.length);
        if (length >= 0) {
            C4861e[] c4861eArr2 = this.license;
            if (length < c4861eArr2.length) {
                return c4861eArr2[length].ad;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }
}
