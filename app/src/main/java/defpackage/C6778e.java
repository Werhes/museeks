package defpackage;

/* renamed from: eؙۥٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6778e extends AbstractC2413e {
    public final /* synthetic */ int[] appmetrica;
    public final /* synthetic */ long[] license;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ C13022e purchase;
    public final /* synthetic */ int vip;

    public C6778e(C13022e c13022e, int i, int i2, long[] jArr, int[] iArr) {
        this.purchase = c13022e;
        this.vip = i;
        this.metrica = i2;
        this.license = jArr;
        this.appmetrica = iArr;
    }

    @Override // defpackage.AbstractC2413e
    public final AbstractC9932e billing(int i) {
        int i2 = this.metrica;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.vip; i4++) {
            long j = ((i4 ^ i) - 1) >> 31;
            for (int i5 = 0; i5 < i2; i5++) {
                long j2 = jArr[i5];
                long[] jArr3 = this.license;
                jArr[i5] = j2 ^ (jArr3[i3 + i5] & j);
                jArr2[i5] = jArr2[i5] ^ (jArr3[(i3 + i2) + i5] & j);
            }
            i3 += i2 * 2;
        }
        return startapp(jArr, jArr2);
    }

    @Override // defpackage.AbstractC2413e
    public final int license() {
        return this.vip;
    }

    public final C9345e startapp(long[] jArr, long[] jArr2) {
        C13022e c13022e = this.purchase;
        int i = c13022e.adcel;
        C8954e c8954e = new C8954e(jArr);
        int[] iArr = this.appmetrica;
        return new C9345e(c13022e, new C16247e(i, iArr, c8954e), new C16247e(i, iArr, new C8954e(jArr2)), 0);
    }

    @Override // defpackage.AbstractC2413e
    public final AbstractC9932e yandex(int i) {
        int i2 = this.metrica;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = i * i2 * 2;
        for (int i4 = 0; i4 < i2; i4++) {
            long[] jArr3 = this.license;
            jArr[i4] = jArr3[i3 + i4];
            jArr2[i4] = jArr3[i3 + i2 + i4];
        }
        return startapp(jArr, jArr2);
    }
}
