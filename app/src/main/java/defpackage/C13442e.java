package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13442e extends AbstractC13109e {
    public boolean Signature;
    public C10177e admob;
    public C10379e amazon;
    public int loadAd;
    public C10182e subscription;

    @Override // defpackage.AbstractC13109e
    public final void ad(long j) {
        this.billing = j;
        this.Signature = j != 0;
        C10177e c10177e = this.admob;
        this.loadAd = c10177e != null ? c10177e.appmetrica : 0;
    }

    @Override // defpackage.AbstractC13109e
    public final void license(boolean z) {
        super.license(z);
        if (z) {
            this.amazon = null;
            this.admob = null;
            this.subscription = null;
        }
        this.loadAd = 0;
        this.Signature = false;
    }

    /* JADX WARN: Type inference failed for: r1v59, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [eََ, java.lang.Object] */
    @Override // defpackage.AbstractC13109e
    public final boolean metrica(C1292e c1292e, long j, C10312e c10312e) {
        C10379e c10379e;
        if (this.amazon != null) {
            ((C16975e) c10312e.f20361e).getClass();
            return false;
        }
        C10177e c10177e = this.admob;
        int i = 4;
        if (c10177e == null) {
            AbstractC0014e.smaato(1, c1292e, false);
            c1292e.remoteconfig();
            int ads = c1292e.ads();
            int remoteconfig = c1292e.remoteconfig();
            int loadAd = c1292e.loadAd();
            if (loadAd <= 0) {
                loadAd = -1;
            }
            int loadAd2 = c1292e.loadAd();
            int i2 = loadAd2 > 0 ? loadAd2 : -1;
            c1292e.loadAd();
            int ads2 = c1292e.ads();
            int pow = (int) Math.pow(2.0d, ads2 & 15);
            int pow2 = (int) Math.pow(2.0d, (ads2 & 240) >> 4);
            c1292e.ads();
            ?? copyOf = Arrays.copyOf(c1292e.ad, c1292e.metrica);
            ?? obj = new Object();
            obj.ad = ads;
            obj.vip = remoteconfig;
            obj.metrica = loadAd;
            obj.license = i2;
            obj.appmetrica = pow;
            obj.purchase = pow2;
            obj.billing = copyOf;
            this.admob = obj;
        } else {
            C10182e c10182e = this.subscription;
            if (c10182e == null) {
                this.subscription = AbstractC0014e.advert(c1292e, true, true);
            } else {
                int i3 = c1292e.metrica;
                byte[] bArr = new byte[i3];
                System.arraycopy(c1292e.ad, 0, bArr, 0, i3);
                int i4 = c10177e.ad;
                int i5 = 5;
                AbstractC0014e.smaato(5, c1292e, false);
                int ads3 = c1292e.ads() + 1;
                C2125e c2125e = new C2125e(c1292e.ad);
                int i6 = 8;
                c2125e.loadAd(c1292e.vip * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 16;
                    if (i7 < ads3) {
                        int i9 = i6;
                        if (c2125e.billing(24) != 5653314) {
                            throw C15125e.ad(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c2125e.license * 8) + c2125e.appmetrica));
                        }
                        int billing = c2125e.billing(16);
                        int billing2 = c2125e.billing(24);
                        if (c2125e.purchase()) {
                            c2125e.loadAd(i5);
                            int i10 = 0;
                            while (i10 < billing2) {
                                int i11 = 0;
                                for (int i12 = billing2 - i10; i12 > 0; i12 >>>= 1) {
                                    i11++;
                                }
                                i10 += c2125e.billing(i11);
                            }
                        } else {
                            boolean purchase = c2125e.purchase();
                            for (int i13 = 0; i13 < billing2; i13++) {
                                if (!purchase) {
                                    c2125e.loadAd(i5);
                                } else if (c2125e.purchase()) {
                                    c2125e.loadAd(i5);
                                }
                            }
                        }
                        int billing3 = c2125e.billing(4);
                        if (billing3 > 2) {
                            throw C15125e.ad(null, "lookup type greater than 2 not decodable: " + billing3);
                        }
                        if (billing3 == 1 || billing3 == 2) {
                            c2125e.loadAd(32);
                            c2125e.loadAd(32);
                            int billing4 = c2125e.billing(4) + 1;
                            c2125e.loadAd(1);
                            c2125e.loadAd((int) ((billing3 == 1 ? billing != 0 ? (long) Math.floor(Math.pow(billing2, 1.0d / billing)) : 0L : billing2 * billing) * billing4));
                        }
                        i7++;
                        i6 = i9;
                        i5 = 5;
                    } else {
                        int i14 = i6;
                        int i15 = 6;
                        int billing5 = c2125e.billing(6) + 1;
                        for (int i16 = 0; i16 < billing5; i16++) {
                            if (c2125e.billing(16) != 0) {
                                throw C15125e.ad(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i17 = 1;
                        int billing6 = c2125e.billing(6) + 1;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < billing6) {
                                int billing7 = c2125e.billing(i8);
                                if (billing7 == 0) {
                                    int i20 = i14;
                                    c2125e.loadAd(i20);
                                    c2125e.loadAd(16);
                                    c2125e.loadAd(16);
                                    c2125e.loadAd(6);
                                    c2125e.loadAd(i20);
                                    int billing8 = c2125e.billing(4) + 1;
                                    int i21 = 0;
                                    while (i21 < billing8) {
                                        c2125e.loadAd(i20);
                                        i21++;
                                        i20 = 8;
                                    }
                                } else {
                                    if (billing7 != i17) {
                                        throw C15125e.ad(null, "floor type greater than 1 not decodable: " + billing7);
                                    }
                                    int billing9 = c2125e.billing(5);
                                    int[] iArr = new int[billing9];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < billing9; i23++) {
                                        int billing10 = c2125e.billing(i);
                                        iArr[i23] = billing10;
                                        if (billing10 > i22) {
                                            i22 = billing10;
                                        }
                                    }
                                    int i24 = i22 + 1;
                                    int[] iArr2 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        iArr2[i25] = c2125e.billing(i19) + 1;
                                        int billing11 = c2125e.billing(2);
                                        int i26 = i14;
                                        if (billing11 > 0) {
                                            c2125e.loadAd(i26);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i27 = 0;
                                        for (int i28 = 1; i27 < (i28 << billing11); i28 = 1) {
                                            c2125e.loadAd(i26);
                                            i27++;
                                            i26 = 8;
                                        }
                                        i25++;
                                        iArr2 = iArr3;
                                        i14 = 8;
                                        i19 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    c2125e.loadAd(2);
                                    int billing12 = c2125e.billing(4);
                                    int i29 = 0;
                                    int i30 = 0;
                                    for (int i31 = 0; i31 < billing9; i31++) {
                                        i29 += iArr4[iArr[i31]];
                                        while (i30 < i29) {
                                            c2125e.loadAd(billing12);
                                            i30++;
                                        }
                                    }
                                }
                                i18++;
                                i14 = 8;
                                i15 = 6;
                                i = 4;
                                i8 = 16;
                                i17 = 1;
                            } else {
                                int billing13 = c2125e.billing(i15) + 1;
                                int i32 = 0;
                                while (i32 < billing13) {
                                    if (c2125e.billing(16) > 2) {
                                        throw C15125e.ad(null, "residueType greater than 2 is not decodable");
                                    }
                                    c2125e.loadAd(24);
                                    c2125e.loadAd(24);
                                    c2125e.loadAd(24);
                                    int billing14 = c2125e.billing(i15) + 1;
                                    int i33 = 8;
                                    c2125e.loadAd(8);
                                    int[] iArr5 = new int[billing14];
                                    for (int i34 = 0; i34 < billing14; i34++) {
                                        iArr5[i34] = ((c2125e.purchase() ? c2125e.billing(5) : 0) * 8) + c2125e.billing(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < billing14) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr5[i35] & (1 << i36)) != 0) {
                                                c2125e.loadAd(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i15 = 6;
                                }
                                int billing15 = c2125e.billing(i15) + 1;
                                for (int i37 = 0; i37 < billing15; i37++) {
                                    int billing16 = c2125e.billing(16);
                                    if (billing16 != 0) {
                                        AbstractC2803e.purchase("VorbisUtil", "mapping type other than 0 not supported: " + billing16);
                                    } else {
                                        int billing17 = c2125e.purchase() ? c2125e.billing(4) + 1 : 1;
                                        if (c2125e.purchase()) {
                                            int billing18 = c2125e.billing(8) + 1;
                                            for (int i38 = 0; i38 < billing18; i38++) {
                                                int i39 = i4 - 1;
                                                int i40 = 0;
                                                for (int i41 = i39; i41 > 0; i41 >>>= 1) {
                                                    i40++;
                                                }
                                                c2125e.loadAd(i40);
                                                int i42 = 0;
                                                while (i39 > 0) {
                                                    i42++;
                                                    i39 >>>= 1;
                                                }
                                                c2125e.loadAd(i42);
                                            }
                                        }
                                        if (c2125e.billing(2) != 0) {
                                            throw C15125e.ad(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (billing17 > 1) {
                                            for (int i43 = 0; i43 < i4; i43++) {
                                                c2125e.loadAd(4);
                                            }
                                        }
                                        for (int i44 = 0; i44 < billing17; i44++) {
                                            c2125e.loadAd(8);
                                            c2125e.loadAd(8);
                                            c2125e.loadAd(8);
                                        }
                                    }
                                }
                                int billing19 = c2125e.billing(6);
                                int i45 = billing19 + 1;
                                C13875e[] c13875eArr = new C13875e[i45];
                                for (int i46 = 0; i46 < i45; i46++) {
                                    boolean purchase2 = c2125e.purchase();
                                    c2125e.billing(16);
                                    c2125e.billing(16);
                                    c2125e.billing(8);
                                    c13875eArr[i46] = new C13875e(purchase2, 7);
                                }
                                if (!c2125e.purchase()) {
                                    throw C15125e.ad(null, "framing bit after modes not set as expected");
                                }
                                int i47 = 0;
                                while (billing19 > 0) {
                                    i47++;
                                    billing19 >>>= 1;
                                }
                                c10379e = new C10379e(c10177e, c10182e, bArr, c13875eArr, i47);
                            }
                        }
                    }
                }
            }
        }
        c10379e = null;
        this.amazon = c10379e;
        if (c10379e == null) {
            return true;
        }
        C10177e c10177e2 = (C10177e) c10379e.f20508e;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) c10177e2.billing);
        arrayList.add((byte[]) c10379e.f20507e);
        C17750e mopub = AbstractC0014e.mopub(AbstractC17475e.tapsense((String[]) ((C10182e) c10379e.f20510e).f20137e));
        C11445e c11445e = new C11445e();
        c11445e.smaato = AbstractC8542e.amazon("audio/ogg");
        c11445e.amazon = AbstractC8542e.amazon("audio/vorbis");
        c11445e.yandex = c10177e2.license;
        c11445e.startapp = c10177e2.metrica;
        c11445e.f23018class = c10177e2.ad;
        c11445e.f23021interface = c10177e2.vip;
        c11445e.admob = arrayList;
        c11445e.mopub = mopub;
        c10312e.f20361e = new C16975e(c11445e);
        return true;
    }

    @Override // defpackage.AbstractC13109e
    public final long vip(C1292e c1292e) {
        byte b = c1292e.ad[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C10379e c10379e = this.amazon;
        c10379e.getClass();
        int i = c10379e.f20509e;
        C10177e c10177e = (C10177e) c10379e.f20508e;
        int i2 = !((C13875e[]) c10379e.f20512e)[(b >> 1) & (255 >>> (8 - i))].f27485e ? c10177e.appmetrica : c10177e.purchase;
        long j = this.Signature ? (this.loadAd + i2) / 4 : 0;
        byte[] bArr = c1292e.ad;
        int length = bArr.length;
        int i3 = c1292e.metrica + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            c1292e.m570throw(copyOf.length, copyOf);
        } else {
            c1292e.m572while(i3);
        }
        byte[] bArr2 = c1292e.ad;
        int i4 = c1292e.metrica;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.Signature = true;
        this.loadAd = i2;
        return j;
    }
}
