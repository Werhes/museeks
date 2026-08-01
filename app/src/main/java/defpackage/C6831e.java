package defpackage;

import java.security.SecureRandom;
import org.conscrypt.PSKKeyManager;

/* renamed from: eؙۨۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6831e {
    public final int Signature;
    public final SecureRandom ad;
    public final int adcel;
    public final int admob;
    public final int advert;
    public final int amazon;
    public final int appmetrica;
    public final int billing;
    public final int license;
    public final int loadAd;
    public final int metrica;
    public final int mopub;
    public final int purchase;
    public final int smaato;
    public final int startapp;
    public final C11883e subscription;
    public final C16253e vip = new C16253e(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    public final int yandex;

    public C6831e(int i, SecureRandom secureRandom) {
        if (i == 2) {
            this.purchase = 4;
            this.billing = 4;
            this.yandex = 2;
            this.startapp = 39;
            this.adcel = 78;
            this.mopub = 131072;
            this.advert = 95232;
            this.smaato = 80;
            this.metrica = 576;
            this.license = 192;
            this.appmetrica = 96;
            this.amazon = 32;
        } else if (i == 3) {
            this.purchase = 6;
            this.billing = 5;
            this.yandex = 4;
            this.startapp = 49;
            this.adcel = 196;
            this.mopub = 524288;
            this.advert = 261888;
            this.smaato = 55;
            this.metrica = 640;
            this.license = 128;
            this.appmetrica = 128;
            this.amazon = 48;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC1634e.smaato("The mode ", i, "is not supported by Crystals Dilithium!"));
            }
            this.purchase = 8;
            this.billing = 7;
            this.yandex = 2;
            this.startapp = 60;
            this.adcel = 120;
            this.mopub = 524288;
            this.advert = 261888;
            this.smaato = 75;
            this.metrica = 640;
            this.license = 128;
            this.appmetrica = 96;
            this.amazon = 64;
        }
        this.subscription = new C11883e(20);
        this.ad = secureRandom;
        int i2 = this.smaato;
        int i3 = this.purchase;
        this.loadAd = (i3 * 320) + 32;
        this.Signature = (this.billing * this.metrica) + this.amazon + i2 + i3;
        int i4 = this.mopub;
        if (i4 == 131072) {
            this.admob = 5;
        } else {
            if (i4 != 524288) {
                throw new RuntimeException("Wrong Dilithium Gamma1!");
            }
            this.admob = 5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean ad(byte[] bArr, byte[] bArr2, int i, C16253e c16253e, byte[] bArr3, byte[] bArr4) {
        int i2;
        C18478e[] c18478eArr;
        if (i != this.Signature) {
            return false;
        }
        C18478e[] c18478eArr2 = (C18478e[]) new C12916e(this).f25784e;
        C9770e c9770e = new C9770e(this);
        C18478e[] c18478eArr3 = (C18478e[]) c9770e.f19315e;
        int i3 = 0;
        while (true) {
            int i4 = this.amazon;
            int i5 = this.metrica;
            int i6 = this.billing;
            if (i3 < i6) {
                C18478e c18478e = c18478eArr3[i3];
                int i7 = (i3 * i5) + i4;
                i3++;
                byte[] admob = AbstractC12442e.admob(i7, (i5 * i3) + i4, bArr2);
                int i8 = ((C6831e) c18478e.f36227e).mopub;
                if (i8 == 131072) {
                    int i9 = 0;
                    for (int i10 = 64; i9 < i10; i10 = 64) {
                        int i11 = i9 * 4;
                        int i12 = i9 * 9;
                        int i13 = (admob[i12] & 255) | ((admob[i12 + 1] & 255) << 8);
                        int i14 = admob[i12 + 2] & 255;
                        C18478e[] c18478eArr4 = c18478eArr2;
                        int[] iArr = (int[]) c18478e.f36228e;
                        iArr[i11] = (i13 | (i14 << 16)) & 262143;
                        int i15 = i11 + 1;
                        int i16 = ((admob[i12 + 3] & 255) << 6) | (i14 >>> 2);
                        int i17 = admob[i12 + 4] & 255;
                        iArr[i15] = (i16 | (i17 << 14)) & 262143;
                        int i18 = i11 + 2;
                        int i19 = ((admob[i12 + 5] & 255) << 4) | (i17 >>> 4);
                        int i20 = admob[i12 + 6] & 255;
                        iArr[i18] = (i19 | (i20 << 12)) & 262143;
                        int i21 = i11 + 3;
                        iArr[i21] = (((admob[i12 + 7] & 255) << 2) | (i20 >>> 6) | ((admob[i12 + 8] & 255) << 10)) & 262143;
                        iArr[i11] = i8 - iArr[i11];
                        iArr[i15] = i8 - iArr[i15];
                        iArr[i18] = i8 - iArr[i18];
                        iArr[i21] = i8 - iArr[i21];
                        i9++;
                        c18478eArr2 = c18478eArr4;
                    }
                    c18478eArr = c18478eArr2;
                } else {
                    c18478eArr = c18478eArr2;
                    if (i8 != 524288) {
                        throw new RuntimeException("Wrong Dilithium Gamma1!");
                    }
                    for (int i22 = 0; i22 < 128; i22++) {
                        int i23 = i22 * 2;
                        int i24 = i22 * 5;
                        int i25 = (admob[i24] & 255) | ((admob[i24 + 1] & 255) << 8);
                        int i26 = admob[i24 + 2] & 255;
                        int[] iArr2 = (int[]) c18478e.f36228e;
                        iArr2[i23] = (i25 | (i26 << 16)) & 1048575;
                        int i27 = i23 + 1;
                        iArr2[i27] = (((admob[i24 + 3] & 255) << 4) | (i26 >>> 4) | ((admob[i24 + 4] & 255) << 12)) & 1048575;
                        iArr2[i23] = i8 - iArr2[i23];
                        iArr2[i27] = i8 - iArr2[i27];
                    }
                }
                c18478eArr2 = c18478eArr;
            } else {
                C18478e[] c18478eArr5 = c18478eArr2;
                int i28 = (i6 * i5) + i4;
                int i29 = 0;
                int i30 = 0;
                while (true) {
                    int i31 = this.purchase;
                    boolean z = true;
                    int i32 = this.smaato;
                    if (i29 < i31) {
                        for (int i33 = 0; i33 < 256; i33++) {
                            ((int[]) c18478eArr5[i29].f36228e)[i33] = 0;
                        }
                        int i34 = i28 + i32 + i29;
                        int i35 = bArr2[i34] & 255;
                        if (i35 < i30 || i35 > i32) {
                            return false;
                        }
                        int i36 = i30;
                        while (true) {
                            i2 = bArr2[i34];
                            if (i36 < (i2 & 255)) {
                                if (i36 > i30) {
                                    int i37 = i28 + i36;
                                    if ((bArr2[i37] & 255) <= (bArr2[i37 - 1] & 255)) {
                                        return false;
                                    }
                                }
                                ((int[]) c18478eArr5[i29].f36228e)[bArr2[i28 + i36] & 255] = 1;
                                i36++;
                            }
                        }
                    } else {
                        while (i30 < i32) {
                            if ((bArr2[i28 + i30] & 255) != 0) {
                                return false;
                            }
                            i30++;
                        }
                        int i38 = this.mopub - this.adcel;
                        for (C18478e c18478e2 : c18478eArr3) {
                            if (c18478e2.inmobi(i38)) {
                                return false;
                            }
                        }
                        C18478e c18478e3 = new C18478e(this);
                        C2691e c2691e = new C2691e(this);
                        C12916e c12916e = new C12916e(this);
                        C18478e[] c18478eArr6 = (C18478e[]) c12916e.f25784e;
                        C12916e c12916e2 = new C12916e(this);
                        int i39 = 0;
                        while (i39 < i31) {
                            C18478e c18478e4 = c18478eArr6[i39];
                            boolean z2 = z;
                            int i40 = i39 * 320;
                            i39++;
                            int i41 = i31;
                            byte[] admob2 = AbstractC12442e.admob(i40, i39 * 320, bArr4);
                            c18478e4.getClass();
                            for (int i42 = 0; i42 < 64; i42++) {
                                int i43 = i42 * 4;
                                int i44 = i42 * 5;
                                int i45 = admob2[i44] & 255;
                                int i46 = admob2[i44 + 1] & 255;
                                int i47 = (i45 | (i46 << 8)) & 1023;
                                int[] iArr3 = (int[]) c18478e4.f36228e;
                                iArr3[i43] = i47;
                                int i48 = i43 + 1;
                                int i49 = i46 >> 2;
                                int i50 = admob2[i44 + 2] & 255;
                                iArr3[i48] = (i49 | (i50 << 6)) & 1023;
                                int i51 = i43 + 2;
                                int i52 = i50 >> 4;
                                int i53 = admob2[i44 + 3] & 255;
                                iArr3[i51] = (i52 | (i53 << 4)) & 1023;
                                iArr3[i43 + 3] = ((i53 >> 6) | ((admob2[i44 + 4] & 255) << 2)) & 1023;
                            }
                            z = z2;
                            i31 = i41;
                        }
                        int i54 = i31;
                        boolean z3 = z;
                        c18478e3.isVip(i4, bArr2);
                        c2691e.m1043interface(bArr3);
                        c9770e.ads();
                        c2691e.m1046throw(c12916e2, c9770e);
                        c18478e3.m4559transient();
                        for (C18478e c18478e5 : c18478eArr6) {
                            for (int i55 = 0; i55 < 256; i55++) {
                                int[] iArr4 = (int[]) c18478e5.f36228e;
                                iArr4[i55] = iArr4[i55] << 13;
                            }
                            c18478e5.getClass();
                        }
                        c12916e.crashlytics();
                        c12916e.subs(c18478e3, c12916e);
                        c12916e2.m3418this(c12916e);
                        c12916e2.m3414class();
                        c12916e2.ads();
                        c12916e2.admob();
                        int i56 = 0;
                        while (true) {
                            C18478e[] c18478eArr7 = (C18478e[]) c12916e2.f25784e;
                            if (i56 >= c18478eArr7.length) {
                                c12916e2.premium(this, bArr, 64);
                                c16253e.purchase(0, (i54 * this.license) + 64, bArr);
                                c16253e.metrica(0, i4, bArr);
                                return AbstractC12442e.amazon(i4, 0, bArr2, bArr);
                            }
                            C18478e c18478e6 = c18478eArr7[i56];
                            C18478e c18478e7 = c18478eArr5[i56];
                            c18478e6.getClass();
                            for (int i57 = 0; i57 < 256; i57++) {
                                int i58 = ((int[]) c18478e6.f36228e)[i57];
                                int i59 = ((int[]) c18478e7.f36228e)[i57];
                                int i60 = ((C6831e) c18478e6.f36227e).advert;
                                int[] license = AbstractC6232e.license(i58, i60);
                                int i61 = license[0];
                                int i62 = license[z3 ? 1 : 0];
                                if (i59 != 0) {
                                    if (i60 == 261888) {
                                        i62 = (i61 > 0 ? i62 + 1 : i62 - 1) & 15;
                                    } else {
                                        if (i60 != 95232) {
                                            throw new RuntimeException("Wrong Gamma2!");
                                        }
                                        i62 = i61 > 0 ? i62 == 43 ? 0 : i62 + 1 : i62 == 0 ? 43 : i62 - 1;
                                    }
                                }
                                ((int[]) c18478e6.f36228e)[i57] = i62;
                            }
                            i56++;
                        }
                    }
                    i29++;
                    i30 = i2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03b1, code lost:
    
        if (r7 > r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03b3, code lost:
    
        if (r7 != r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03b5, code lost:
    
        if (r0 != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03b8, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03bc, code lost:
    
        ((int[]) r2.f36228e)[r5] = r0;
        r23 = r23 + r0;
        r5 = r5 + 1;
        r0 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03bb, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03c9, code lost:
    
        r1 = r1 + r23;
        r8 = r8 + 1;
        r3 = r19;
        r5 = r21;
        r0 = r22;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03d6, code lost:
    
        r22 = r0;
        r19 = r3;
        r21 = r5;
        r26 = r7;
        r0 = r34.smaato;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03e0, code lost:
    
        if (r1 <= r0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03fb, code lost:
    
        r3 = r20;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0400, code lost:
    
        if (r8 >= r34.billing) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0402, code lost:
    
        r1 = r13[r8];
        r2 = ((defpackage.C6831e) r1.f36227e).mopub;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x040c, code lost:
    
        if (r2 != 131072) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x040e, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0411, code lost:
    
        if (r7 >= 64) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0413, code lost:
    
        r11 = r7 * 4;
        r12 = (int[]) r1.f36228e;
        r14 = r2 - r12[r11];
        r15 = r2 - r12[r11 + 1];
        r16 = r2 - r12[r11 + 2];
        r11 = r2 - r12[r11 + 3];
        r12 = (r7 * 9) + r3;
        r18[r12] = (byte) r14;
        r18[r12 + 1] = (byte) (r14 >> 8);
        r18[r12 + 2] = (byte) (((byte) (r14 >> 16)) | (r15 << 2));
        r18[r12 + 3] = (byte) (r15 >> 6);
        r18[r12 + 4] = (byte) (((byte) (r15 >> 14)) | (r16 << 4));
        r18[r12 + 5] = (byte) (r16 >> 4);
        r18[r12 + 6] = (byte) (((byte) (r16 >> 12)) | (r11 << 6));
        r18[r12 + 7] = (byte) (r11 >> 2);
        r18[r12 + 8] = (byte) (r11 >> 10);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04c5, code lost:
    
        r3 = r3 + r34.metrica;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0483, code lost:
    
        if (r2 != 524288) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0485, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0488, code lost:
    
        if (r7 >= 128) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x048a, code lost:
    
        r11 = r7 * 2;
        r12 = (int[]) r1.f36228e;
        r14 = r2 - r12[r11];
        r11 = r2 - r12[r11 + 1];
        r12 = (r7 * 5) + r3;
        r18[r12] = (byte) r14;
        r18[r12 + 1] = (byte) (r14 >> 8);
        r18[r12 + 2] = (byte) (((byte) (r14 >> 16)) | (r11 << 4));
        r18[r12 + 3] = (byte) (r11 >> 4);
        r18[r12 + 4] = (byte) (r11 >> 12);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04d3, code lost:
    
        throw new java.lang.RuntimeException("Wrong Dilithium Gamma1!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04d4, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04d7, code lost:
    
        if (r8 >= (r0 + r4)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04d9, code lost:
    
        r18[r3 + r8] = 0;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04e1, code lost:
    
        r1 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x04e4, code lost:
    
        if (r8 >= r4) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04e6, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04e9, code lost:
    
        if (r5 >= 256) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04f3, code lost:
    
        if (((int[]) r9[r8].f36228e)[r5] == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x04f5, code lost:
    
        r18[r1 + r3] = (byte) r5;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x04fc, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04ff, code lost:
    
        r18[(r3 + r0) + r8] = (byte) r1;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0508, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x021c, code lost:
    
        r30 = r1;
        r29 = r2;
        r27 = r5;
        r28 = r13;
        r12.amazon(r14);
        r14.ads();
        r15.m1046throw(r3, r14);
        r3.m3414class();
        r3.ads();
        r3.admob();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x023a, code lost:
    
        if (r0 >= r9.length) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x023c, code lost:
    
        r1 = r9[r0];
        r3 = r17[r0];
        r4 = ((defpackage.C6831e) r1.f36227e).advert;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0247, code lost:
    
        if (r5 >= 256) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0249, code lost:
    
        r7 = defpackage.AbstractC6232e.license(((int[]) r1.f36228e)[r5], r4);
        ((int[]) r1.f36228e)[r5] = r7[1];
        ((int[]) r3.f36228e)[r5] = r7[0];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0267, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x026b, code lost:
    
        r0 = r18;
        r3.premium(r34, r0, 0);
        r36.purchase(0, 64, r35);
        r3 = r34.license;
        r4 = r34.purchase;
        r36.purchase(0, r3 * r4, r0);
        r3 = r34.amazon;
        r36.metrica(0, r3, r0);
        r5 = r21;
        r5.isVip(r3, r0);
        r5.m4559transient();
        r13 = r20;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0293, code lost:
    
        if (r8 >= r13.length) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0295, code lost:
    
        r13[r8].m4553strictfp(r5, ((defpackage.C18478e[]) r30.f19315e)[r8]);
        r8 = r8 + 1;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02ab, code lost:
    
        r18 = r0;
        r0 = r30;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02b1, code lost:
    
        if (r8 >= r13.length) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02b3, code lost:
    
        r13[r8].m4543implements();
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02bb, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02bd, code lost:
    
        if (r8 >= r13.length) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02bf, code lost:
    
        r1 = r13[r8];
        r2 = r28[r8];
        r30 = r0;
        r20 = r3;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02ca, code lost:
    
        if (r0 >= 256) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02cc, code lost:
    
        r3 = (int[]) r1.f36228e;
        r26 = r0;
        r3[r26] = r3[r0] + ((int[]) r2.f36228e)[r26];
        r0 = r26 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02e1, code lost:
    
        r1.getClass();
        r8 = r8 + 1;
        r3 = r20;
        r0 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02eb, code lost:
    
        r30 = r0;
        r20 = r3;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02f1, code lost:
    
        if (r8 >= r13.length) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02f3, code lost:
    
        r13[r8].m4556synchronized();
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02fb, code lost:
    
        r0 = r34.mopub;
        r1 = r34.adcel;
        r0 = r0 - r1;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0302, code lost:
    
        if (r8 >= r13.length) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x030a, code lost:
    
        if (r13[r8].inmobi(r0) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0316, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x030c, code lost:
    
        r21 = r5;
        r26 = r17;
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0312, code lost:
    
        r9 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03e2, code lost:
    
        r0 = r0;
        r23 = r9;
        r20 = r13;
        r9 = r17;
        r17 = r26;
        r4 = r27;
        r13 = r28;
        r2 = r29;
        r1 = r30;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0319, code lost:
    
        r3 = r19;
        r3.subs(r5, r29);
        r3.ads();
        r0 = r22;
        r0.m3418this(r3);
        r0.m3414class();
        r8 = r34.advert;
        r1 = r8 - r1;
        r7 = r17;
        r2 = 0;
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0335, code lost:
    
        if (r2 >= r7.length) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x033d, code lost:
    
        if (r7[r2].inmobi(r1) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0348, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033f, code lost:
    
        r22 = r0;
        r19 = r3;
        r21 = r5;
        r26 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x034b, code lost:
    
        r3.subs(r5, r0);
        r3.ads();
        r3.m3414class();
        r9 = r23;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x035a, code lost:
    
        if (r1 >= r9.length) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0362, code lost:
    
        if (r9[r1].inmobi(r8) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x036e, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0364, code lost:
    
        r22 = r0;
        r19 = r3;
        r21 = r5;
        r26 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0371, code lost:
    
        r0.adcel(r3);
        r0.admob();
        r1 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x037a, code lost:
    
        if (r8 >= r9.length) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x037c, code lost:
    
        r2 = r9[r8];
        r22 = r0;
        r0 = r7[r8];
        r19 = r3;
        r3 = r17[r8];
        r2.getClass();
        r21 = r5;
        r26 = r7;
        r5 = 0;
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0392, code lost:
    
        if (r5 >= 256) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0394, code lost:
    
        r7 = ((int[]) r0.f36228e)[r5];
        r31 = r0;
        r0 = ((int[]) r3.f36228e)[r5];
        r0 = ((defpackage.C6831e) r2.f36227e).advert;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03aa, code lost:
    
        if (r7 <= r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03ac, code lost:
    
        r0 = 8380417 - r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] metrica(byte[] r35, defpackage.C16253e r36, byte[] r37, byte[] r38, byte[] r39, byte[] r40, byte[] r41, byte[] r42) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6831e.metrica(byte[], eٖٖۘ, byte[], byte[], byte[], byte[], byte[], byte[]):byte[]");
    }

    public final byte[][] vip(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        byte[] bArr6 = new byte[32];
        C2691e c2691e = new C2691e(this);
        C9770e c9770e = new C9770e(this);
        C18478e[] c18478eArr = (C18478e[]) c9770e.f19315e;
        C12916e c12916e = new C12916e(this);
        C18478e[] c18478eArr2 = (C18478e[]) c12916e.f25784e;
        C12916e c12916e2 = new C12916e(this);
        C12916e c12916e3 = new C12916e(this);
        C16253e c16253e = this.vip;
        c16253e.purchase(0, 32, bArr);
        int i = this.purchase;
        c16253e.update((byte) i);
        int i2 = this.billing;
        c16253e.update((byte) i2);
        c16253e.metrica(0, 128, bArr2);
        System.arraycopy(bArr2, 0, bArr4, 0, 32);
        System.arraycopy(bArr2, 32, bArr5, 0, 64);
        System.arraycopy(bArr2, 96, bArr6, 0, 32);
        c2691e.m1043interface(bArr4);
        int i3 = 0;
        short s = 0;
        while (i3 < c18478eArr.length) {
            c18478eArr[i3].m4536e(bArr5, s);
            i3++;
            s = (short) (s + 1);
        }
        short s2 = (short) i2;
        int i4 = 0;
        while (i4 < c18478eArr2.length) {
            c18478eArr2[i4].m4536e(bArr5, s2);
            i4++;
            s2 = (short) (s2 + 1);
        }
        C9770e c9770e2 = new C9770e(this);
        c9770e.amazon(c9770e2);
        c9770e2.ads();
        c2691e.m1046throw(c12916e2, c9770e2);
        c12916e2.m3414class();
        c12916e2.ads();
        c12916e2.adcel(c12916e);
        c12916e2.admob();
        c12916e2.firebase(c12916e3);
        byte[] billing = AbstractC11267e.billing(c12916e2, this);
        c16253e.purchase(0, 32, bArr4);
        c16253e.purchase(0, billing.length, billing);
        c16253e.metrica(0, 64, bArr3);
        char c = 6;
        byte[][] bArr7 = new byte[6];
        bArr7[0] = bArr4;
        boolean z = true;
        bArr7[1] = bArr6;
        char c2 = 2;
        bArr7[2] = bArr3;
        int i5 = this.appmetrica;
        char c3 = 3;
        bArr7[3] = new byte[i2 * i5];
        for (int i6 = 0; i6 < i2; i6++) {
            c18478eArr[i6].m4549private(i6 * i5, bArr7[3]);
        }
        char c4 = 4;
        bArr7[4] = new byte[i * i5];
        for (int i7 = 0; i7 < i; i7++) {
            c18478eArr2[i7].m4549private(i7 * i5, bArr7[4]);
        }
        char c5 = 5;
        bArr7[5] = new byte[i * 416];
        int i8 = 0;
        while (i8 < i) {
            C18478e c18478e = ((C18478e[]) c12916e3.f25784e)[i8];
            byte[] bArr8 = bArr7[c5];
            char c6 = c;
            int i9 = i8 * 416;
            char c7 = c5;
            boolean z2 = z;
            int i10 = 0;
            while (i10 < 32) {
                int i11 = i10 * 8;
                int[] iArr = (int[]) c18478e.f36228e;
                char c8 = c2;
                char c9 = c4;
                char c10 = c3;
                int[] iArr2 = {4096 - iArr[i11], 4096 - iArr[i11 + 1], 4096 - iArr[i11 + 2], 4096 - iArr[i11 + 3], 4096 - iArr[i11 + 4], 4096 - iArr[i11 + 5], 4096 - iArr[i11 + 6], 4096 - iArr[i11 + 7]};
                int i12 = (i10 * 13) + i9;
                int i13 = iArr2[0];
                bArr8[i12] = (byte) i13;
                int i14 = i12 + 1;
                byte b = (byte) (i13 >> 8);
                bArr8[i14] = b;
                int i15 = iArr2[z2 ? 1 : 0];
                bArr8[i14] = (byte) (b | ((byte) (i15 << 5)));
                bArr8[i12 + 2] = (byte) (i15 >> 3);
                int i16 = i12 + 3;
                byte b2 = (byte) (i15 >> 11);
                bArr8[i16] = b2;
                int i17 = iArr2[c8];
                bArr8[i16] = (byte) (b2 | ((byte) (i17 << 2)));
                int i18 = i12 + 4;
                byte b3 = (byte) (i17 >> 6);
                bArr8[i18] = b3;
                int i19 = iArr2[c10];
                bArr8[i18] = (byte) (b3 | ((byte) (i19 << 7)));
                bArr8[i12 + 5] = (byte) (i19 >> 1);
                int i20 = i12 + 6;
                byte b4 = (byte) (i19 >> 9);
                bArr8[i20] = b4;
                int i21 = iArr2[c9];
                bArr8[i20] = (byte) (b4 | ((byte) (i21 << 4)));
                bArr8[i12 + 7] = (byte) (i21 >> 4);
                int i22 = i12 + 8;
                byte b5 = (byte) (i21 >> 12);
                bArr8[i22] = b5;
                int i23 = iArr2[c7];
                bArr8[i22] = (byte) (b5 | ((byte) (i23 << 1)));
                int i24 = i12 + 9;
                byte b6 = (byte) (i23 >> 7);
                bArr8[i24] = b6;
                int i25 = iArr2[c6];
                bArr8[i24] = (byte) (b6 | ((byte) (i25 << 6)));
                bArr8[i12 + 10] = (byte) (i25 >> 2);
                int i26 = i12 + 11;
                byte b7 = (byte) (i25 >> 10);
                bArr8[i26] = b7;
                int i27 = iArr2[7];
                bArr8[i26] = (byte) (b7 | ((byte) (i27 << 3)));
                bArr8[i12 + 12] = (byte) (i27 >> 5);
                i10++;
                c2 = c8;
                c4 = c9;
                c3 = c10;
            }
            c18478e.getClass();
            i8++;
            c = c6;
            c5 = c7;
            z = z2 ? 1 : 0;
        }
        char c11 = c;
        char c12 = c5;
        boolean z3 = z;
        char c13 = c2;
        char c14 = c4;
        char c15 = c3;
        byte[] bArr9 = bArr7[0];
        byte[] bArr10 = bArr7[z3 ? 1 : 0];
        byte[] bArr11 = bArr7[c13];
        byte[] bArr12 = bArr7[c15];
        byte[] bArr13 = bArr7[c14];
        byte[] bArr14 = bArr7[c12];
        byte[][] bArr15 = new byte[8];
        bArr15[0] = bArr9;
        bArr15[z3 ? 1 : 0] = bArr10;
        bArr15[c13] = bArr11;
        bArr15[c15] = bArr12;
        bArr15[c14] = bArr13;
        bArr15[c12] = bArr14;
        bArr15[c11] = billing;
        bArr15[7] = bArr;
        return bArr15;
    }
}
