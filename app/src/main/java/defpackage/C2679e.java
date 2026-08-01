package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* renamed from: eؔٙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2679e extends AbstractC2413e {
    public final /* synthetic */ AbstractC0362e appmetrica;
    public final /* synthetic */ Object license;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ int vip;

    public /* synthetic */ C2679e(AbstractC0362e abstractC0362e, int i, Object obj, int i2) {
        this.vip = i2;
        this.appmetrica = abstractC0362e;
        this.metrica = i;
        this.license = obj;
    }

    @Override // defpackage.AbstractC2413e
    public final AbstractC9932e billing(int i) {
        switch (this.vip) {
            case 0:
                int[] iArr = new int[8];
                int[] iArr2 = new int[8];
                int i2 = 0;
                for (int i3 = 0; i3 < this.metrica; i3++) {
                    int i4 = ((i3 ^ i) - 1) >> 31;
                    for (int i5 = 0; i5 < 8; i5++) {
                        int i6 = iArr[i5];
                        int[] iArr3 = (int[]) this.license;
                        iArr[i5] = i6 ^ (iArr3[i2 + i5] & i4);
                        iArr2[i5] = iArr2[i5] ^ (iArr3[(i2 + 8) + i5] & i4);
                    }
                    i2 += 16;
                }
                return new C17373e((C7922e) this.appmetrica, new C18150e(iArr), new C18150e(iArr2), C7922e.smaato, 0);
            case 1:
                int[] iArr4 = new int[8];
                int[] iArr5 = new int[8];
                int i7 = 0;
                for (int i8 = 0; i8 < this.metrica; i8++) {
                    int i9 = ((i8 ^ i) - 1) >> 31;
                    for (int i10 = 0; i10 < 8; i10++) {
                        int i11 = iArr4[i10];
                        int[] iArr6 = (int[]) this.license;
                        iArr4[i10] = i11 ^ (iArr6[i7 + i10] & i9);
                        iArr5[i10] = iArr5[i10] ^ (iArr6[(i7 + 8) + i10] & i9);
                    }
                    i7 += 16;
                }
                return new C17373e((C3486e) this.appmetrica, new C5472e(iArr4), new C5472e(iArr5), C3486e.mopub, 2);
            case 2:
                int[] iArr7 = new int[4];
                int[] iArr8 = new int[4];
                int i12 = 0;
                for (int i13 = 0; i13 < this.metrica; i13++) {
                    int i14 = ((i13 ^ i) - 1) >> 31;
                    for (int i15 = 0; i15 < 4; i15++) {
                        int i16 = iArr7[i15];
                        int[] iArr9 = (int[]) this.license;
                        iArr7[i15] = i16 ^ (iArr9[i12 + i15] & i14);
                        iArr8[i15] = iArr8[i15] ^ (iArr9[(i12 + 4) + i15] & i14);
                    }
                    i12 += 8;
                }
                return new C17373e((C8818e) this.appmetrica, new C5356e(iArr7), new C5356e(iArr8), C8818e.mopub, 3);
            case 3:
                int[] iArr10 = new int[5];
                int[] iArr11 = new int[5];
                int i17 = 0;
                for (int i18 = 0; i18 < this.metrica; i18++) {
                    int i19 = ((i18 ^ i) - 1) >> 31;
                    for (int i20 = 0; i20 < 5; i20++) {
                        int i21 = iArr10[i20];
                        int[] iArr12 = (int[]) this.license;
                        iArr10[i20] = i21 ^ (iArr12[i17 + i20] & i19);
                        iArr11[i20] = iArr11[i20] ^ (iArr12[(i17 + 5) + i20] & i19);
                    }
                    i17 += 10;
                }
                return new C17373e((C2605e) this.appmetrica, new C4312e(iArr10), new C4312e(iArr11), C2605e.mopub, 4);
            case 4:
                int[] iArr13 = new int[5];
                int[] iArr14 = new int[5];
                int i22 = 0;
                for (int i23 = 0; i23 < this.metrica; i23++) {
                    int i24 = ((i23 ^ i) - 1) >> 31;
                    for (int i25 = 0; i25 < 5; i25++) {
                        int i26 = iArr13[i25];
                        int[] iArr15 = (int[]) this.license;
                        iArr13[i25] = i26 ^ (iArr15[i22 + i25] & i24);
                        iArr14[i25] = iArr14[i25] ^ (iArr15[(i22 + 5) + i25] & i24);
                    }
                    i22 += 10;
                }
                return new C17373e((C15334e) this.appmetrica, new C15557e(iArr13), new C15557e(iArr14), C15334e.mopub, 5);
            case 5:
                int[] iArr16 = new int[5];
                int[] iArr17 = new int[5];
                int i27 = 0;
                for (int i28 = 0; i28 < this.metrica; i28++) {
                    int i29 = ((i28 ^ i) - 1) >> 31;
                    for (int i30 = 0; i30 < 5; i30++) {
                        int i31 = iArr16[i30];
                        int[] iArr18 = (int[]) this.license;
                        iArr16[i30] = i31 ^ (iArr18[i27 + i30] & i29);
                        iArr17[i30] = iArr17[i30] ^ (iArr18[(i27 + 5) + i30] & i29);
                    }
                    i27 += 10;
                }
                return new C17373e((C5818e) this.appmetrica, new C4312e(iArr16), new C4312e(iArr17), C5818e.mopub, 6);
            case 6:
                int[] iArr19 = new int[6];
                int[] iArr20 = new int[6];
                int i32 = 0;
                for (int i33 = 0; i33 < this.metrica; i33++) {
                    int i34 = ((i33 ^ i) - 1) >> 31;
                    for (int i35 = 0; i35 < 6; i35++) {
                        int i36 = iArr19[i35];
                        int[] iArr21 = (int[]) this.license;
                        iArr19[i35] = i36 ^ (iArr21[i32 + i35] & i34);
                        iArr20[i35] = iArr20[i35] ^ (iArr21[(i32 + 6) + i35] & i34);
                    }
                    i32 += 12;
                }
                return new C17373e((C13833e) this.appmetrica, new C17520e(iArr19), new C17520e(iArr20), C13833e.mopub, 7);
            case 7:
                int[] iArr22 = new int[6];
                int[] iArr23 = new int[6];
                int i37 = 0;
                for (int i38 = 0; i38 < this.metrica; i38++) {
                    int i39 = ((i38 ^ i) - 1) >> 31;
                    for (int i40 = 0; i40 < 6; i40++) {
                        int i41 = iArr22[i40];
                        int[] iArr24 = (int[]) this.license;
                        iArr22[i40] = i41 ^ (iArr24[i37 + i40] & i39);
                        iArr23[i40] = iArr23[i40] ^ (iArr24[(i37 + 6) + i40] & i39);
                    }
                    i37 += 12;
                }
                return new C17373e((C3051e) this.appmetrica, new C8674e(iArr22), new C8674e(iArr23), C3051e.mopub, 8);
            case 8:
                int[] iArr25 = new int[7];
                int[] iArr26 = new int[7];
                int i42 = 0;
                for (int i43 = 0; i43 < this.metrica; i43++) {
                    int i44 = ((i43 ^ i) - 1) >> 31;
                    for (int i45 = 0; i45 < 7; i45++) {
                        int i46 = iArr25[i45];
                        int[] iArr27 = (int[]) this.license;
                        iArr25[i45] = i46 ^ (iArr27[i42 + i45] & i44);
                        iArr26[i45] = iArr26[i45] ^ (iArr27[(i42 + 7) + i45] & i44);
                    }
                    i42 += 14;
                }
                return new C17373e((C7632e) this.appmetrica, new C11372e(iArr25), new C11372e(iArr26), C7632e.mopub, 9);
            case 9:
                int[] iArr28 = new int[7];
                int[] iArr29 = new int[7];
                int i47 = 0;
                for (int i48 = 0; i48 < this.metrica; i48++) {
                    int i49 = ((i48 ^ i) - 1) >> 31;
                    for (int i50 = 0; i50 < 7; i50++) {
                        int i51 = iArr28[i50];
                        int[] iArr30 = (int[]) this.license;
                        iArr28[i50] = i51 ^ (iArr30[i47 + i50] & i49);
                        iArr29[i50] = iArr29[i50] ^ (iArr30[(i47 + 7) + i50] & i49);
                    }
                    i47 += 14;
                }
                return new C17373e((C7689e) this.appmetrica, new C10207e(iArr28), new C10207e(iArr29), C7689e.mopub, 10);
            case 10:
                int[] iArr31 = new int[8];
                int[] iArr32 = new int[8];
                int i52 = 0;
                for (int i53 = 0; i53 < this.metrica; i53++) {
                    int i54 = ((i53 ^ i) - 1) >> 31;
                    for (int i55 = 0; i55 < 8; i55++) {
                        int i56 = iArr31[i55];
                        int[] iArr33 = (int[]) this.license;
                        iArr31[i55] = i56 ^ (iArr33[i52 + i55] & i54);
                        iArr32[i55] = iArr32[i55] ^ (iArr33[(i52 + 8) + i55] & i54);
                    }
                    i52 += 16;
                }
                return new C17373e((C4288e) this.appmetrica, new C13183e(iArr31), new C13183e(iArr32), C4288e.mopub, 11);
            case 11:
                int[] iArr34 = new int[8];
                int[] iArr35 = new int[8];
                int i57 = 0;
                for (int i58 = 0; i58 < this.metrica; i58++) {
                    int i59 = ((i58 ^ i) - 1) >> 31;
                    for (int i60 = 0; i60 < 8; i60++) {
                        int i61 = iArr34[i60];
                        int[] iArr36 = (int[]) this.license;
                        iArr34[i60] = i61 ^ (iArr36[i57 + i60] & i59);
                        iArr35[i60] = iArr35[i60] ^ (iArr36[(i57 + 8) + i60] & i59);
                    }
                    i57 += 16;
                }
                return new C17373e((C13801e) this.appmetrica, new C2926e(iArr34), new C2926e(iArr35), C13801e.mopub, 12);
            case 12:
                int[] iArr37 = new int[12];
                int[] iArr38 = new int[12];
                int i62 = 0;
                for (int i63 = 0; i63 < this.metrica; i63++) {
                    int i64 = ((i63 ^ i) - 1) >> 31;
                    for (int i65 = 0; i65 < 12; i65++) {
                        int i66 = iArr37[i65];
                        int[] iArr39 = (int[]) this.license;
                        iArr37[i65] = i66 ^ (iArr39[i62 + i65] & i64);
                        iArr38[i65] = iArr38[i65] ^ (iArr39[(i62 + 12) + i65] & i64);
                    }
                    i62 += 24;
                }
                return new C17373e((C1936e) this.appmetrica, new C2021e(iArr37), new C2021e(iArr38), C1936e.mopub, 13);
            case 13:
                int[] iArr40 = new int[17];
                int[] iArr41 = new int[17];
                int i67 = 0;
                for (int i68 = 0; i68 < this.metrica; i68++) {
                    int i69 = ((i68 ^ i) - 1) >> 31;
                    for (int i70 = 0; i70 < 17; i70++) {
                        int i71 = iArr40[i70];
                        int[] iArr42 = (int[]) this.license;
                        iArr40[i70] = i71 ^ (iArr42[i67 + i70] & i69);
                        iArr41[i70] = iArr41[i70] ^ (iArr42[(i67 + 17) + i70] & i69);
                    }
                    i67 += 34;
                }
                return new C17373e((C9469e) this.appmetrica, new C15881e(iArr40), new C15881e(iArr41), C9469e.mopub, 14);
            case 14:
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                int i72 = 0;
                for (int i73 = 0; i73 < this.metrica; i73++) {
                    long j = ((i73 ^ i) - 1) >> 31;
                    for (int i74 = 0; i74 < 2; i74++) {
                        long j2 = jArr[i74];
                        long[] jArr3 = (long[]) this.license;
                        jArr[i74] = j2 ^ (jArr3[i72 + i74] & j);
                        jArr2[i74] = jArr2[i74] ^ (jArr3[(i72 + 2) + i74] & j);
                    }
                    i72 += 4;
                }
                return new C9345e((C17640e) this.appmetrica, new C4489e(jArr), new C4489e(jArr2), C17640e.mopub, 1);
            case 15:
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[2];
                int i75 = 0;
                for (int i76 = 0; i76 < this.metrica; i76++) {
                    long j3 = ((i76 ^ i) - 1) >> 31;
                    for (int i77 = 0; i77 < 2; i77++) {
                        long j4 = jArr4[i77];
                        long[] jArr6 = (long[]) this.license;
                        jArr4[i77] = j4 ^ (jArr6[i75 + i77] & j3);
                        jArr5[i77] = jArr5[i77] ^ (jArr6[(i75 + 2) + i77] & j3);
                    }
                    i75 += 4;
                }
                return new C9345e((C10908e) this.appmetrica, new C4489e(jArr4), new C4489e(jArr5), C10908e.mopub, 2);
            case 16:
                long[] jArr7 = new long[3];
                long[] jArr8 = new long[3];
                int i78 = 0;
                for (int i79 = 0; i79 < this.metrica; i79++) {
                    long j5 = ((i79 ^ i) - 1) >> 31;
                    for (int i80 = 0; i80 < 3; i80++) {
                        long j6 = jArr7[i80];
                        long[] jArr9 = (long[]) this.license;
                        jArr7[i80] = j6 ^ (jArr9[i78 + i80] & j5);
                        jArr8[i80] = jArr8[i80] ^ (jArr9[(i78 + 3) + i80] & j5);
                    }
                    i78 += 6;
                }
                return new C9345e((C8828e) this.appmetrica, new C0037e(jArr7), new C0037e(jArr8), C8828e.mopub, 3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long[] jArr10 = new long[3];
                long[] jArr11 = new long[3];
                int i81 = 0;
                for (int i82 = 0; i82 < this.metrica; i82++) {
                    long j7 = ((i82 ^ i) - 1) >> 31;
                    for (int i83 = 0; i83 < 3; i83++) {
                        long j8 = jArr10[i83];
                        long[] jArr12 = (long[]) this.license;
                        jArr10[i83] = j8 ^ (jArr12[i81 + i83] & j7);
                        jArr11[i83] = jArr11[i83] ^ (jArr12[(i81 + 3) + i83] & j7);
                    }
                    i81 += 6;
                }
                return new C9345e((C14788e) this.appmetrica, new C0037e(jArr10), new C0037e(jArr11), C14788e.mopub, 4);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long[] jArr13 = new long[3];
                long[] jArr14 = new long[3];
                int i84 = 0;
                for (int i85 = 0; i85 < this.metrica; i85++) {
                    long j9 = ((i85 ^ i) - 1) >> 31;
                    for (int i86 = 0; i86 < 3; i86++) {
                        long j10 = jArr13[i86];
                        long[] jArr15 = (long[]) this.license;
                        jArr13[i86] = j10 ^ (jArr15[i84 + i86] & j9);
                        jArr14[i86] = jArr14[i86] ^ (jArr15[(i84 + 3) + i86] & j9);
                    }
                    i84 += 6;
                }
                return new C9345e((C14245e) this.appmetrica, new C11291e(jArr13), new C11291e(jArr14), C14245e.mopub, 5);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                long[] jArr16 = new long[3];
                long[] jArr17 = new long[3];
                int i87 = 0;
                for (int i88 = 0; i88 < this.metrica; i88++) {
                    long j11 = ((i88 ^ i) - 1) >> 31;
                    for (int i89 = 0; i89 < 3; i89++) {
                        long j12 = jArr16[i89];
                        long[] jArr18 = (long[]) this.license;
                        jArr16[i89] = j12 ^ (jArr18[i87 + i89] & j11);
                        jArr17[i89] = jArr17[i89] ^ (jArr18[(i87 + 3) + i89] & j11);
                    }
                    i87 += 6;
                }
                return new C9345e((C12064e) this.appmetrica, new C11291e(jArr16), new C11291e(jArr17), C12064e.mopub, 6);
            case 20:
                long[] jArr19 = new long[3];
                long[] jArr20 = new long[3];
                int i90 = 0;
                for (int i91 = 0; i91 < this.metrica; i91++) {
                    long j13 = ((i91 ^ i) - 1) >> 31;
                    for (int i92 = 0; i92 < 3; i92++) {
                        long j14 = jArr19[i92];
                        long[] jArr21 = (long[]) this.license;
                        jArr19[i92] = j14 ^ (jArr21[i90 + i92] & j13);
                        jArr20[i92] = jArr20[i92] ^ (jArr21[(i90 + 3) + i92] & j13);
                    }
                    i90 += 6;
                }
                return new C9345e((C12611e) this.appmetrica, new C11291e(jArr19), new C11291e(jArr20), C12611e.mopub, 7);
            case 21:
                long[] jArr22 = new long[4];
                long[] jArr23 = new long[4];
                int i93 = 0;
                for (int i94 = 0; i94 < this.metrica; i94++) {
                    long j15 = ((i94 ^ i) - 1) >> 31;
                    for (int i95 = 0; i95 < 4; i95++) {
                        long j16 = jArr22[i95];
                        long[] jArr24 = (long[]) this.license;
                        jArr22[i95] = j16 ^ (jArr24[i93 + i95] & j15);
                        jArr23[i95] = jArr23[i95] ^ (jArr24[(i93 + 4) + i95] & j15);
                    }
                    i93 += 8;
                }
                return new C9345e((C5347e) this.appmetrica, new C6139e(jArr22), new C6139e(jArr23), C5347e.mopub, 8);
            case 22:
                long[] jArr25 = new long[4];
                long[] jArr26 = new long[4];
                int i96 = 0;
                for (int i97 = 0; i97 < this.metrica; i97++) {
                    long j17 = ((i97 ^ i) - 1) >> 31;
                    for (int i98 = 0; i98 < 4; i98++) {
                        long j18 = jArr25[i98];
                        long[] jArr27 = (long[]) this.license;
                        jArr25[i98] = j18 ^ (jArr27[i96 + i98] & j17);
                        jArr26[i98] = jArr26[i98] ^ (jArr27[(i96 + 4) + i98] & j17);
                    }
                    i96 += 8;
                }
                return new C9345e((C12912e) this.appmetrica, new C6139e(jArr25), new C6139e(jArr26), C12912e.mopub, 9);
            case 23:
                long[] jArr28 = new long[4];
                long[] jArr29 = new long[4];
                int i99 = 0;
                for (int i100 = 0; i100 < this.metrica; i100++) {
                    long j19 = ((i100 ^ i) - 1) >> 31;
                    for (int i101 = 0; i101 < 4; i101++) {
                        long j20 = jArr28[i101];
                        long[] jArr30 = (long[]) this.license;
                        jArr28[i101] = j20 ^ (jArr30[i99 + i101] & j19);
                        jArr29[i101] = jArr29[i101] ^ (jArr30[(i99 + 4) + i101] & j19);
                    }
                    i99 += 8;
                }
                return new C9345e((C1551e) this.appmetrica, new C12858e(jArr28), new C12858e(jArr29), C1551e.mopub, 10);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                long[] jArr31 = new long[4];
                long[] jArr32 = new long[4];
                int i102 = 0;
                for (int i103 = 0; i103 < this.metrica; i103++) {
                    long j21 = ((i103 ^ i) - 1) >> 31;
                    for (int i104 = 0; i104 < 4; i104++) {
                        long j22 = jArr31[i104];
                        long[] jArr33 = (long[]) this.license;
                        jArr31[i104] = j22 ^ (jArr33[i102 + i104] & j21);
                        jArr32[i104] = jArr32[i104] ^ (jArr33[(i102 + 4) + i104] & j21);
                    }
                    i102 += 8;
                }
                return new C9345e((C15310e) this.appmetrica, new C12858e(jArr31), new C12858e(jArr32), C15310e.mopub, 11);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                long[] jArr34 = new long[4];
                long[] jArr35 = new long[4];
                int i105 = 0;
                for (int i106 = 0; i106 < this.metrica; i106++) {
                    long j23 = ((i106 ^ i) - 1) >> 31;
                    for (int i107 = 0; i107 < 4; i107++) {
                        long j24 = jArr34[i107];
                        long[] jArr36 = (long[]) this.license;
                        jArr34[i107] = j24 ^ (jArr36[i105 + i107] & j23);
                        jArr35[i107] = jArr35[i107] ^ (jArr36[(i105 + 4) + i107] & j23);
                    }
                    i105 += 8;
                }
                return new C9345e((C5997e) this.appmetrica, new C1185e(jArr34), new C1185e(jArr35), C5997e.mopub, 12);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                long[] jArr37 = new long[5];
                long[] jArr38 = new long[5];
                int i108 = 0;
                for (int i109 = 0; i109 < this.metrica; i109++) {
                    long j25 = ((i109 ^ i) - 1) >> 31;
                    for (int i110 = 0; i110 < 5; i110++) {
                        long j26 = jArr37[i110];
                        long[] jArr39 = (long[]) this.license;
                        jArr37[i110] = j26 ^ (jArr39[i108 + i110] & j25);
                        jArr38[i110] = jArr38[i110] ^ (jArr39[(i108 + 5) + i110] & j25);
                    }
                    i108 += 10;
                }
                return new C9345e((C2013e) this.appmetrica, new C15844e(jArr37), new C15844e(jArr38), C2013e.mopub, 13);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                long[] jArr40 = new long[5];
                long[] jArr41 = new long[5];
                int i111 = 0;
                for (int i112 = 0; i112 < this.metrica; i112++) {
                    long j27 = ((i112 ^ i) - 1) >> 31;
                    for (int i113 = 0; i113 < 5; i113++) {
                        long j28 = jArr40[i113];
                        long[] jArr42 = (long[]) this.license;
                        jArr40[i113] = j28 ^ (jArr42[i111 + i113] & j27);
                        jArr41[i113] = jArr41[i113] ^ (jArr42[(i111 + 5) + i113] & j27);
                    }
                    i111 += 10;
                }
                return new C9345e((C13332e) this.appmetrica, new C15844e(jArr40), new C15844e(jArr41), C13332e.mopub, 14);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                long[] jArr43 = new long[7];
                long[] jArr44 = new long[7];
                int i114 = 0;
                for (int i115 = 0; i115 < this.metrica; i115++) {
                    long j29 = ((i115 ^ i) - 1) >> 31;
                    for (int i116 = 0; i116 < 7; i116++) {
                        long j30 = jArr43[i116];
                        long[] jArr45 = (long[]) this.license;
                        jArr43[i116] = j30 ^ (jArr45[i114 + i116] & j29);
                        jArr44[i116] = jArr44[i116] ^ (jArr45[(i114 + 7) + i116] & j29);
                    }
                    i114 += 14;
                }
                return new C9345e((C10160e) this.appmetrica, new C18203e(jArr43), new C18203e(jArr44), C10160e.mopub, 15);
            default:
                long[] jArr46 = new long[7];
                long[] jArr47 = new long[7];
                int i117 = 0;
                for (int i118 = 0; i118 < this.metrica; i118++) {
                    long j31 = ((i118 ^ i) - 1) >> 31;
                    for (int i119 = 0; i119 < 7; i119++) {
                        long j32 = jArr46[i119];
                        long[] jArr48 = (long[]) this.license;
                        jArr46[i119] = j32 ^ (jArr48[i117 + i119] & j31);
                        jArr47[i119] = jArr47[i119] ^ (jArr48[(i117 + 7) + i119] & j31);
                    }
                    i117 += 14;
                }
                return new C9345e((C3931e) this.appmetrica, new C18203e(jArr46), new C18203e(jArr47), C3931e.mopub, 16);
        }
    }

    @Override // defpackage.AbstractC2413e
    public final int license() {
        switch (this.vip) {
            case 0:
                return this.metrica;
            case 1:
                return this.metrica;
            case 2:
                return this.metrica;
            case 3:
                return this.metrica;
            case 4:
                return this.metrica;
            case 5:
                return this.metrica;
            case 6:
                return this.metrica;
            case 7:
                return this.metrica;
            case 8:
                return this.metrica;
            case 9:
                return this.metrica;
            case 10:
                return this.metrica;
            case 11:
                return this.metrica;
            case 12:
                return this.metrica;
            case 13:
                return this.metrica;
            case 14:
                return this.metrica;
            case 15:
                return this.metrica;
            case 16:
                return this.metrica;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return this.metrica;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return this.metrica;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return this.metrica;
            case 20:
                return this.metrica;
            case 21:
                return this.metrica;
            case 22:
                return this.metrica;
            case 23:
                return this.metrica;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return this.metrica;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return this.metrica;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return this.metrica;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return this.metrica;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return this.metrica;
            default:
                return this.metrica;
        }
    }

    @Override // defpackage.AbstractC2413e
    public final AbstractC9932e yandex(int i) {
        switch (this.vip) {
            case 0:
                int[] iArr = new int[8];
                int[] iArr2 = new int[8];
                int i2 = i * 16;
                for (int i3 = 0; i3 < 8; i3++) {
                    int[] iArr3 = (int[]) this.license;
                    iArr[i3] = iArr3[i2 + i3];
                    iArr2[i3] = iArr3[i2 + 8 + i3];
                }
                return new C17373e((C7922e) this.appmetrica, new C18150e(iArr), new C18150e(iArr2), C7922e.smaato, 0);
            case 1:
                int[] iArr4 = new int[8];
                int[] iArr5 = new int[8];
                int i4 = i * 16;
                for (int i5 = 0; i5 < 8; i5++) {
                    int[] iArr6 = (int[]) this.license;
                    iArr4[i5] = iArr6[i4 + i5];
                    iArr5[i5] = iArr6[i4 + 8 + i5];
                }
                return new C17373e((C3486e) this.appmetrica, new C5472e(iArr4), new C5472e(iArr5), C3486e.mopub, 2);
            case 2:
                int[] iArr7 = new int[4];
                int[] iArr8 = new int[4];
                int i6 = i * 8;
                for (int i7 = 0; i7 < 4; i7++) {
                    int[] iArr9 = (int[]) this.license;
                    iArr7[i7] = iArr9[i6 + i7];
                    iArr8[i7] = iArr9[i6 + 4 + i7];
                }
                return new C17373e((C8818e) this.appmetrica, new C5356e(iArr7), new C5356e(iArr8), C8818e.mopub, 3);
            case 3:
                int[] iArr10 = new int[5];
                int[] iArr11 = new int[5];
                int i8 = i * 10;
                for (int i9 = 0; i9 < 5; i9++) {
                    int[] iArr12 = (int[]) this.license;
                    iArr10[i9] = iArr12[i8 + i9];
                    iArr11[i9] = iArr12[i8 + 5 + i9];
                }
                return new C17373e((C2605e) this.appmetrica, new C4312e(iArr10), new C4312e(iArr11), C2605e.mopub, 4);
            case 4:
                int[] iArr13 = new int[5];
                int[] iArr14 = new int[5];
                int i10 = i * 10;
                for (int i11 = 0; i11 < 5; i11++) {
                    int[] iArr15 = (int[]) this.license;
                    iArr13[i11] = iArr15[i10 + i11];
                    iArr14[i11] = iArr15[i10 + 5 + i11];
                }
                return new C17373e((C15334e) this.appmetrica, new C15557e(iArr13), new C15557e(iArr14), C15334e.mopub, 5);
            case 5:
                int[] iArr16 = new int[5];
                int[] iArr17 = new int[5];
                int i12 = i * 10;
                for (int i13 = 0; i13 < 5; i13++) {
                    int[] iArr18 = (int[]) this.license;
                    iArr16[i13] = iArr18[i12 + i13];
                    iArr17[i13] = iArr18[i12 + 5 + i13];
                }
                return new C17373e((C5818e) this.appmetrica, new C4312e(iArr16), new C4312e(iArr17), C5818e.mopub, 6);
            case 6:
                int[] iArr19 = new int[6];
                int[] iArr20 = new int[6];
                int i14 = i * 12;
                for (int i15 = 0; i15 < 6; i15++) {
                    int[] iArr21 = (int[]) this.license;
                    iArr19[i15] = iArr21[i14 + i15];
                    iArr20[i15] = iArr21[i14 + 6 + i15];
                }
                return new C17373e((C13833e) this.appmetrica, new C17520e(iArr19), new C17520e(iArr20), C13833e.mopub, 7);
            case 7:
                int[] iArr22 = new int[6];
                int[] iArr23 = new int[6];
                int i16 = i * 12;
                for (int i17 = 0; i17 < 6; i17++) {
                    int[] iArr24 = (int[]) this.license;
                    iArr22[i17] = iArr24[i16 + i17];
                    iArr23[i17] = iArr24[i16 + 6 + i17];
                }
                return new C17373e((C3051e) this.appmetrica, new C8674e(iArr22), new C8674e(iArr23), C3051e.mopub, 8);
            case 8:
                int[] iArr25 = new int[7];
                int[] iArr26 = new int[7];
                int i18 = 0;
                for (int i19 = 0; i19 < this.metrica; i19++) {
                    int i20 = ((i19 ^ i) - 1) >> 31;
                    for (int i21 = 0; i21 < 7; i21++) {
                        int i22 = iArr25[i21];
                        int[] iArr27 = (int[]) this.license;
                        iArr25[i21] = i22 ^ (iArr27[i18 + i21] & i20);
                        iArr26[i21] = iArr26[i21] ^ (iArr27[(i18 + 7) + i21] & i20);
                    }
                    i18 += 14;
                }
                return new C17373e((C7632e) this.appmetrica, new C11372e(iArr25), new C11372e(iArr26), C7632e.mopub, 9);
            case 9:
                int[] iArr28 = new int[7];
                int[] iArr29 = new int[7];
                int i23 = i * 14;
                for (int i24 = 0; i24 < 7; i24++) {
                    int[] iArr30 = (int[]) this.license;
                    iArr28[i24] = iArr30[i23 + i24];
                    iArr29[i24] = iArr30[i23 + 7 + i24];
                }
                return new C17373e((C7689e) this.appmetrica, new C10207e(iArr28), new C10207e(iArr29), C7689e.mopub, 10);
            case 10:
                int[] iArr31 = new int[8];
                int[] iArr32 = new int[8];
                int i25 = i * 16;
                for (int i26 = 0; i26 < 8; i26++) {
                    int[] iArr33 = (int[]) this.license;
                    iArr31[i26] = iArr33[i25 + i26];
                    iArr32[i26] = iArr33[i25 + 8 + i26];
                }
                return new C17373e((C4288e) this.appmetrica, new C13183e(iArr31), new C13183e(iArr32), C4288e.mopub, 11);
            case 11:
                int[] iArr34 = new int[8];
                int[] iArr35 = new int[8];
                int i27 = i * 16;
                for (int i28 = 0; i28 < 8; i28++) {
                    int[] iArr36 = (int[]) this.license;
                    iArr34[i28] = iArr36[i27 + i28];
                    iArr35[i28] = iArr36[i27 + 8 + i28];
                }
                return new C17373e((C13801e) this.appmetrica, new C2926e(iArr34), new C2926e(iArr35), C13801e.mopub, 12);
            case 12:
                int[] iArr37 = new int[12];
                int[] iArr38 = new int[12];
                int i29 = i * 24;
                for (int i30 = 0; i30 < 12; i30++) {
                    int[] iArr39 = (int[]) this.license;
                    iArr37[i30] = iArr39[i29 + i30];
                    iArr38[i30] = iArr39[i29 + 12 + i30];
                }
                return new C17373e((C1936e) this.appmetrica, new C2021e(iArr37), new C2021e(iArr38), C1936e.mopub, 13);
            case 13:
                int[] iArr40 = new int[17];
                int[] iArr41 = new int[17];
                int i31 = i * 34;
                for (int i32 = 0; i32 < 17; i32++) {
                    int i33 = iArr40[i32];
                    int[] iArr42 = (int[]) this.license;
                    iArr40[i32] = i33 ^ iArr42[i31 + i32];
                    iArr41[i32] = iArr41[i32] ^ iArr42[(i31 + 17) + i32];
                }
                return new C17373e((C9469e) this.appmetrica, new C15881e(iArr40), new C15881e(iArr41), C9469e.mopub, 14);
            case 14:
                long[] jArr = new long[2];
                long[] jArr2 = new long[2];
                int i34 = i * 4;
                for (int i35 = 0; i35 < 2; i35++) {
                    long[] jArr3 = (long[]) this.license;
                    jArr[i35] = jArr3[i34 + i35];
                    jArr2[i35] = jArr3[i34 + 2 + i35];
                }
                return new C9345e((C17640e) this.appmetrica, new C4489e(jArr), new C4489e(jArr2), C17640e.mopub, 1);
            case 15:
                long[] jArr4 = new long[2];
                long[] jArr5 = new long[2];
                int i36 = i * 4;
                for (int i37 = 0; i37 < 2; i37++) {
                    long[] jArr6 = (long[]) this.license;
                    jArr4[i37] = jArr6[i36 + i37];
                    jArr5[i37] = jArr6[i36 + 2 + i37];
                }
                return new C9345e((C10908e) this.appmetrica, new C4489e(jArr4), new C4489e(jArr5), C10908e.mopub, 2);
            case 16:
                long[] jArr7 = new long[3];
                long[] jArr8 = new long[3];
                int i38 = i * 6;
                for (int i39 = 0; i39 < 3; i39++) {
                    long[] jArr9 = (long[]) this.license;
                    jArr7[i39] = jArr9[i38 + i39];
                    jArr8[i39] = jArr9[i38 + 3 + i39];
                }
                return new C9345e((C8828e) this.appmetrica, new C0037e(jArr7), new C0037e(jArr8), C8828e.mopub, 3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long[] jArr10 = new long[3];
                long[] jArr11 = new long[3];
                int i40 = i * 6;
                for (int i41 = 0; i41 < 3; i41++) {
                    long[] jArr12 = (long[]) this.license;
                    jArr10[i41] = jArr12[i40 + i41];
                    jArr11[i41] = jArr12[i40 + 3 + i41];
                }
                return new C9345e((C14788e) this.appmetrica, new C0037e(jArr10), new C0037e(jArr11), C14788e.mopub, 4);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                long[] jArr13 = new long[3];
                long[] jArr14 = new long[3];
                int i42 = i * 6;
                for (int i43 = 0; i43 < 3; i43++) {
                    long[] jArr15 = (long[]) this.license;
                    jArr13[i43] = jArr15[i42 + i43];
                    jArr14[i43] = jArr15[i42 + 3 + i43];
                }
                return new C9345e((C14245e) this.appmetrica, new C11291e(jArr13), new C11291e(jArr14), C14245e.mopub, 5);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                long[] jArr16 = new long[3];
                long[] jArr17 = new long[3];
                int i44 = i * 6;
                for (int i45 = 0; i45 < 3; i45++) {
                    long[] jArr18 = (long[]) this.license;
                    jArr16[i45] = jArr18[i44 + i45];
                    jArr17[i45] = jArr18[i44 + 3 + i45];
                }
                return new C9345e((C12064e) this.appmetrica, new C11291e(jArr16), new C11291e(jArr17), C12064e.mopub, 6);
            case 20:
                long[] jArr19 = new long[3];
                long[] jArr20 = new long[3];
                int i46 = i * 6;
                for (int i47 = 0; i47 < 3; i47++) {
                    long[] jArr21 = (long[]) this.license;
                    jArr19[i47] = jArr21[i46 + i47];
                    jArr20[i47] = jArr21[i46 + 3 + i47];
                }
                return new C9345e((C12611e) this.appmetrica, new C11291e(jArr19), new C11291e(jArr20), C12611e.mopub, 7);
            case 21:
                long[] jArr22 = new long[4];
                long[] jArr23 = new long[4];
                int i48 = i * 8;
                for (int i49 = 0; i49 < 4; i49++) {
                    long[] jArr24 = (long[]) this.license;
                    jArr22[i49] = jArr24[i48 + i49];
                    jArr23[i49] = jArr24[i48 + 4 + i49];
                }
                return new C9345e((C5347e) this.appmetrica, new C6139e(jArr22), new C6139e(jArr23), C5347e.mopub, 8);
            case 22:
                long[] jArr25 = new long[4];
                long[] jArr26 = new long[4];
                int i50 = i * 8;
                for (int i51 = 0; i51 < 4; i51++) {
                    long j = jArr25[i51];
                    long[] jArr27 = (long[]) this.license;
                    jArr25[i51] = j ^ jArr27[i50 + i51];
                    jArr26[i51] = jArr26[i51] ^ jArr27[(i50 + 4) + i51];
                }
                return new C9345e((C12912e) this.appmetrica, new C6139e(jArr25), new C6139e(jArr26), C12912e.mopub, 9);
            case 23:
                long[] jArr28 = new long[4];
                long[] jArr29 = new long[4];
                int i52 = i * 8;
                for (int i53 = 0; i53 < 4; i53++) {
                    long[] jArr30 = (long[]) this.license;
                    jArr28[i53] = jArr30[i52 + i53];
                    jArr29[i53] = jArr30[i52 + 4 + i53];
                }
                return new C9345e((C1551e) this.appmetrica, new C12858e(jArr28), new C12858e(jArr29), C1551e.mopub, 10);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                long[] jArr31 = new long[4];
                long[] jArr32 = new long[4];
                int i54 = i * 8;
                for (int i55 = 0; i55 < 4; i55++) {
                    long[] jArr33 = (long[]) this.license;
                    jArr31[i55] = jArr33[i54 + i55];
                    jArr32[i55] = jArr33[i54 + 4 + i55];
                }
                return new C9345e((C15310e) this.appmetrica, new C12858e(jArr31), new C12858e(jArr32), C15310e.mopub, 11);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                long[] jArr34 = new long[4];
                long[] jArr35 = new long[4];
                int i56 = i * 8;
                for (int i57 = 0; i57 < 4; i57++) {
                    long[] jArr36 = (long[]) this.license;
                    jArr34[i57] = jArr36[i56 + i57];
                    jArr35[i57] = jArr36[i56 + 4 + i57];
                }
                return new C9345e((C5997e) this.appmetrica, new C1185e(jArr34), new C1185e(jArr35), C5997e.mopub, 12);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                long[] jArr37 = new long[5];
                long[] jArr38 = new long[5];
                int i58 = i * 10;
                for (int i59 = 0; i59 < 5; i59++) {
                    long[] jArr39 = (long[]) this.license;
                    jArr37[i59] = jArr39[i58 + i59];
                    jArr38[i59] = jArr39[i58 + 5 + i59];
                }
                return new C9345e((C2013e) this.appmetrica, new C15844e(jArr37), new C15844e(jArr38), C2013e.mopub, 13);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                long[] jArr40 = new long[5];
                long[] jArr41 = new long[5];
                int i60 = i * 10;
                for (int i61 = 0; i61 < 5; i61++) {
                    long[] jArr42 = (long[]) this.license;
                    jArr40[i61] = jArr42[i60 + i61];
                    jArr41[i61] = jArr42[i60 + 5 + i61];
                }
                return new C9345e((C13332e) this.appmetrica, new C15844e(jArr40), new C15844e(jArr41), C13332e.mopub, 14);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                long[] jArr43 = new long[7];
                long[] jArr44 = new long[7];
                int i62 = i * 14;
                for (int i63 = 0; i63 < 7; i63++) {
                    long[] jArr45 = (long[]) this.license;
                    jArr43[i63] = jArr45[i62 + i63];
                    jArr44[i63] = jArr45[i62 + 7 + i63];
                }
                return new C9345e((C10160e) this.appmetrica, new C18203e(jArr43), new C18203e(jArr44), C10160e.mopub, 15);
            default:
                long[] jArr46 = new long[7];
                long[] jArr47 = new long[7];
                int i64 = i * 14;
                for (int i65 = 0; i65 < 7; i65++) {
                    long[] jArr48 = (long[]) this.license;
                    jArr46[i65] = jArr48[i64 + i65];
                    jArr47[i65] = jArr48[i64 + 7 + i65];
                }
                return new C9345e((C3931e) this.appmetrica, new C18203e(jArr46), new C18203e(jArr47), C3931e.mopub, 16);
        }
    }
}
