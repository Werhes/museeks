package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13000e implements InterfaceC6347e {
    public final int ad;
    public final long[] appmetrica;
    public final long[] license;
    public final long[] metrica;
    public final long purchase;
    public final int[] vip;

    public C13000e(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.vip = iArr;
        this.metrica = jArr;
        this.license = jArr2;
        this.appmetrica = jArr3;
        int length = iArr.length;
        this.ad = length;
        if (length > 0) {
            this.purchase = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.purchase = 0L;
        }
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        long[] jArr = this.appmetrica;
        int purchase = AbstractC9413e.purchase(jArr, j, true);
        long j2 = jArr[purchase];
        long[] jArr2 = this.metrica;
        C7278e c7278e = new C7278e(j2, jArr2[purchase]);
        if (j2 >= j || purchase == this.ad - 1) {
            return new C13178e(c7278e, c7278e);
        }
        int i = purchase + 1;
        return new C13178e(c7278e, new C7278e(jArr[i], jArr2[i]));
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.ad + ", sizes=" + Arrays.toString(this.vip) + ", offsets=" + Arrays.toString(this.metrica) + ", timeUs=" + Arrays.toString(this.appmetrica) + ", durationsUs=" + Arrays.toString(this.license) + ")";
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return true;
    }
}
