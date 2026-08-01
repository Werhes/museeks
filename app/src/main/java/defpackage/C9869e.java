package defpackage;

/* renamed from: eٍۤؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9869e extends AbstractC2413e {
    public final /* synthetic */ AbstractC5490e appmetrica;
    public final /* synthetic */ long[] license;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ int vip;

    public /* synthetic */ C9869e(AbstractC5490e abstractC5490e, int i, long[] jArr, int i2) {
        this.vip = i2;
        this.appmetrica = abstractC5490e;
        this.metrica = i;
        this.license = jArr;
    }

    @Override // defpackage.AbstractC2413e
    public final AbstractC9932e billing(int i) {
        switch (this.vip) {
            case 0:
                long[] jArr = new long[9];
                long[] jArr2 = new long[9];
                int i2 = 0;
                for (int i3 = 0; i3 < this.metrica; i3++) {
                    long j = ((i3 ^ i) - 1) >> 31;
                    for (int i4 = 0; i4 < 9; i4++) {
                        long j2 = jArr[i4];
                        long[] jArr3 = this.license;
                        jArr[i4] = j2 ^ (jArr3[i2 + i4] & j);
                        jArr2[i4] = jArr2[i4] ^ (jArr3[(i2 + 9) + i4] & j);
                    }
                    i2 += 18;
                }
                return new C9345e((C2033e) this.appmetrica, new C6002e(jArr), new C6002e(jArr2), C2033e.mopub, 17);
            default:
                long[] jArr4 = new long[9];
                long[] jArr5 = new long[9];
                int i5 = 0;
                for (int i6 = 0; i6 < this.metrica; i6++) {
                    long j3 = ((i6 ^ i) - 1) >> 31;
                    for (int i7 = 0; i7 < 9; i7++) {
                        long j4 = jArr4[i7];
                        long[] jArr6 = this.license;
                        jArr4[i7] = j4 ^ (jArr6[i5 + i7] & j3);
                        jArr5[i7] = jArr5[i7] ^ (jArr6[(i5 + 9) + i7] & j3);
                    }
                    i5 += 18;
                }
                return new C9345e((C10391e) this.appmetrica, new C6002e(jArr4), new C6002e(jArr5), C10391e.mopub, 18);
        }
    }

    @Override // defpackage.AbstractC2413e
    public final int license() {
        switch (this.vip) {
            case 0:
                return this.metrica;
            default:
                return this.metrica;
        }
    }

    @Override // defpackage.AbstractC2413e
    public final AbstractC9932e yandex(int i) {
        switch (this.vip) {
            case 0:
                long[] jArr = new long[9];
                long[] jArr2 = new long[9];
                int i2 = i * 18;
                for (int i3 = 0; i3 < 9; i3++) {
                    long[] jArr3 = this.license;
                    jArr[i3] = jArr3[i2 + i3];
                    jArr2[i3] = jArr3[i2 + 9 + i3];
                }
                return new C9345e((C2033e) this.appmetrica, new C6002e(jArr), new C6002e(jArr2), C2033e.mopub, 17);
            default:
                long[] jArr4 = new long[9];
                long[] jArr5 = new long[9];
                int i4 = i * 18;
                for (int i5 = 0; i5 < 9; i5++) {
                    long[] jArr6 = this.license;
                    jArr4[i5] = jArr6[i4 + i5];
                    jArr5[i5] = jArr6[i4 + 9 + i5];
                }
                return new C9345e((C10391e) this.appmetrica, new C6002e(jArr4), new C6002e(jArr5), C10391e.mopub, 18);
        }
    }
}
