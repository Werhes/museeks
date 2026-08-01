package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11084e {
    public final ArrayList ad;
    public final int adcel;
    public final String advert;
    public final int appmetrica;
    public final int billing;
    public final int license;
    public final int metrica;
    public final float mopub;
    public final int purchase;
    public final int startapp;
    public final int vip;
    public final int yandex;

    public C11084e(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.ad = arrayList;
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = i4;
        this.purchase = i5;
        this.billing = i6;
        this.yandex = i7;
        this.startapp = i8;
        this.adcel = i9;
        this.mopub = f;
        this.advert = str;
    }

    public static C11084e ad(C1292e c1292e) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            c1292e.m568protected(4);
            int ads = (c1292e.ads() & 3) + 1;
            if (ads == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int ads2 = c1292e.ads() & 31;
            for (int i9 = 0; i9 < ads2; i9++) {
                int m565goto = c1292e.m565goto();
                int i10 = c1292e.vip;
                c1292e.m568protected(m565goto);
                byte[] bArr = c1292e.ad;
                byte[] bArr2 = new byte[m565goto + 4];
                System.arraycopy(AbstractC13612e.ad, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, m565goto);
                arrayList.add(bArr2);
            }
            int ads3 = c1292e.ads();
            for (int i11 = 0; i11 < ads3; i11++) {
                int m565goto2 = c1292e.m565goto();
                int i12 = c1292e.vip;
                c1292e.m568protected(m565goto2);
                byte[] bArr3 = c1292e.ad;
                byte[] bArr4 = new byte[m565goto2 + 4];
                System.arraycopy(AbstractC13612e.ad, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, m565goto2);
                arrayList.add(bArr4);
            }
            if (ads2 > 0) {
                C9195e Signature = AbstractC17595e.Signature(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i13 = Signature.appmetrica;
                int i14 = Signature.purchase;
                int i15 = Signature.yandex + 8;
                int i16 = Signature.startapp + 8;
                int i17 = Signature.Signature;
                int i18 = Signature.admob;
                int i19 = Signature.subscription;
                int i20 = Signature.remoteconfig;
                float f2 = Signature.billing;
                int i21 = Signature.ad;
                int i22 = Signature.vip;
                int i23 = Signature.metrica;
                byte[] bArr5 = AbstractC13612e.ad;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i6 = i20;
                f = f2;
                i7 = i18;
                i8 = i19;
                i4 = i16;
                i5 = i17;
                i2 = i14;
                i3 = i15;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new C11084e(arrayList, ads, i, i2, i3, i4, i5, i7, i8, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C15125e.ad(e, "Error parsing AVC config");
        }
    }
}
