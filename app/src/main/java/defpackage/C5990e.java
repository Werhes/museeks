package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۢۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C5990e implements InterfaceC6347e {
    public final /* synthetic */ int ad;
    public final Object metrica;
    public final long vip;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5990e(long j) {
        this(j, 0L);
        this.ad = 2;
    }

    public C5990e(long j, long j2) {
        this.ad = 2;
        this.vip = j;
        C7278e c7278e = j2 == 0 ? C7278e.metrica : new C7278e(0L, j2);
        this.metrica = new C13178e(c7278e, c7278e);
    }

    public /* synthetic */ C5990e(Object obj, long j, int i) {
        this.ad = i;
        this.metrica = obj;
        this.vip = j;
    }

    @Override // defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        switch (this.ad) {
            case 0:
                C6051e c6051e = (C6051e) this.metrica;
                C13178e vip = c6051e.startapp[0].vip(j);
                int i = 1;
                while (true) {
                    C2255e[] c2255eArr = c6051e.startapp;
                    if (i >= c2255eArr.length) {
                        return vip;
                    }
                    C13178e vip2 = c2255eArr[i].vip(j);
                    if (vip2.ad.vip < vip.ad.vip) {
                        vip = vip2;
                    }
                    i++;
                }
            case 1:
                C15008e c15008e = (C15008e) this.metrica;
                c15008e.mopub.getClass();
                C16911e c16911e = c15008e.mopub;
                long[] jArr = (long[]) c16911e.f33137e;
                long[] jArr2 = (long[]) c16911e.f33136e;
                int purchase = AbstractC9413e.purchase(jArr, AbstractC9413e.mopub((c15008e.appmetrica * j) / 1000000, 0L, c15008e.adcel - 1), false);
                long j2 = purchase == -1 ? 0L : jArr[purchase];
                long j3 = purchase != -1 ? jArr2[purchase] : 0L;
                int i2 = c15008e.appmetrica;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.vip;
                C7278e c7278e = new C7278e(j4, j3 + j5);
                if (j4 == j || purchase == jArr.length - 1) {
                    return new C13178e(c7278e, c7278e);
                }
                int i3 = purchase + 1;
                return new C13178e(c7278e, new C7278e((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
            default:
                return (C13178e) this.metrica;
        }
    }

    @Override // defpackage.InterfaceC6347e
    public final long billing() {
        switch (this.ad) {
            case 0:
                return this.vip;
            case 1:
                return ((C15008e) this.metrica).vip();
            default:
                return this.vip;
        }
    }

    @Override // defpackage.InterfaceC6347e
    public final /* synthetic */ boolean license() {
        switch (this.ad) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // defpackage.InterfaceC6347e
    public final boolean vip() {
        switch (this.ad) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
