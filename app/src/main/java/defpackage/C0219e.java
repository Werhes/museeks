package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219e implements InterfaceC5825e {
    public final long[] ad;
    public final int appmetrica;
    public final long license;
    public final long metrica;
    public final long[] vip;

    public C0219e(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.ad = jArr;
        this.vip = jArr2;
        this.metrica = j;
        this.license = j3;
        this.appmetrica = i;
    }

    @Override // defpackage.InterfaceC5825e
    public final long ad() {
        return this.license;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        long[] jArr = this.ad;
        int purchase = AbstractC9413e.purchase(jArr, j, true);
        long j2 = jArr[purchase];
        long[] jArr2 = this.vip;
        C7278e c7278e = new C7278e(j2, jArr2[purchase]);
        if (j2 >= j || purchase == jArr.length - 1) {
            return new C13178e(c7278e, c7278e);
        }
        int i = purchase + 1;
        return new C13178e(c7278e, new C7278e(jArr[i], jArr2[i]));
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        return false;
    }

    @Override // defpackage.InterfaceC5825e
    public final long metrica(long j) {
        return this.ad[AbstractC9413e.purchase(this.vip, j, true)];
    }

    @Override // defpackage.InterfaceC5825e
    public final int purchase() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        return true;
    }
}
