package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٝۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14857e {
    public final List ad;
    public final int adcel;
    public final float advert;
    public final String amazon;
    public final int appmetrica;
    public final int billing;
    public final int license;
    public final C11467e loadAd;
    public final int metrica;
    public final int mopub;
    public final int purchase;
    public final int smaato;
    public final int startapp;
    public final int vip;
    public final int yandex;

    public C14857e(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, C11467e c11467e) {
        this.ad = list;
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = i4;
        this.purchase = i5;
        this.billing = i6;
        this.yandex = i7;
        this.startapp = i8;
        this.adcel = i9;
        this.mopub = i10;
        this.advert = f;
        this.smaato = i11;
        this.amazon = str;
        this.loadAd = c11467e;
    }

    public static C14857e ad(C1292e c1292e, boolean z, C11467e c11467e) {
        boolean z2;
        C5401e smaato;
        int i;
        int i2 = 4;
        try {
            if (z) {
                c1292e.m568protected(4);
            } else {
                c1292e.m568protected(21);
            }
            int ads = c1292e.ads() & 3;
            int ads2 = c1292e.ads();
            int i3 = c1292e.vip;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z2 = true;
                if (i5 >= ads2) {
                    break;
                }
                c1292e.m568protected(1);
                int m565goto = c1292e.m565goto();
                for (int i7 = 0; i7 < m565goto; i7++) {
                    int m565goto2 = c1292e.m565goto();
                    i6 += m565goto2 + 4;
                    c1292e.m568protected(m565goto2);
                }
                i5++;
            }
            c1292e.m571try(i3);
            byte[] bArr = new byte[i6];
            C11467e c11467e2 = c11467e;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            String str = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < ads2) {
                int ads3 = c1292e.ads() & 63;
                int m565goto3 = c1292e.m565goto();
                int i20 = i4;
                C11467e c11467e3 = c11467e2;
                while (i20 < m565goto3) {
                    boolean z3 = z2;
                    int m565goto4 = c1292e.m565goto();
                    int i21 = ads;
                    System.arraycopy(AbstractC17595e.ad, i4, bArr, i19, i2);
                    int i22 = i19 + 4;
                    System.arraycopy(c1292e.ad, c1292e.vip, bArr, i22, m565goto4);
                    if (ads3 == 32 && i20 == 0) {
                        c11467e3 = AbstractC17595e.loadAd(i22, i22 + m565goto4, bArr);
                    } else {
                        if (ads3 == 33 && i20 == 0) {
                            C11996e amazon = AbstractC17595e.amazon(bArr, i22, i22 + m565goto4, c11467e3);
                            i8 = amazon.ad + 1;
                            i9 = amazon.billing;
                            int i23 = amazon.yandex;
                            i11 = amazon.metrica + 8;
                            i12 = amazon.license + 8;
                            int i24 = amazon.mopub;
                            i10 = i23;
                            int i25 = amazon.advert;
                            int i26 = amazon.smaato;
                            float f2 = amazon.startapp;
                            int i27 = amazon.adcel;
                            C17049e c17049e = amazon.vip;
                            if (c17049e != null) {
                                i = i27;
                                str = AbstractC13612e.ad(c17049e.ad, c17049e.vip, c17049e.metrica, c17049e.license, c17049e.appmetrica, c17049e.purchase);
                            } else {
                                i = i27;
                            }
                            i17 = i;
                            f = f2;
                            i15 = i26;
                            i14 = i25;
                            i13 = i24;
                        } else if (ads3 == 39 && i20 == 0 && (smaato = AbstractC17595e.smaato(i22, i22 + m565goto4, bArr)) != null && c11467e3 != null) {
                            i4 = 0;
                            i16 = smaato.f11581e == ((C8690e) ((AbstractC17475e) c11467e3.f23072e).get(0)).vip ? 4 : 5;
                        }
                        i4 = 0;
                    }
                    i19 = i22 + m565goto4;
                    c1292e.m568protected(m565goto4);
                    i20++;
                    z2 = z3;
                    ads = i21;
                    i2 = 4;
                }
                i18++;
                c11467e2 = c11467e3;
                i2 = 4;
            }
            return new C14857e(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), ads + 1, i8, i9, i10, i11, i12, i13, i14, i15, i16, f, i17, str, c11467e2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C15125e.ad(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
