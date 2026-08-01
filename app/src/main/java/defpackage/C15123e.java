package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۧۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15123e extends AbstractC4579e {
    public static final C15123e metrica = new AbstractC4579e(C14760e.ad);

    @Override // defpackage.AbstractC4579e
    public final void Signature(InterfaceC11845e interfaceC11845e, Object obj, int i) {
        long[] jArr = ((C15571e) obj).f30738e;
        for (int i2 = 0; i2 < i; i2++) {
            ((AbstractC15920e) interfaceC11845e).isVip(this.vip, i2).admob(jArr[i2]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؚٔۗ] */
    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        long[] jArr = ((C15571e) obj).f30738e;
        ?? obj2 = new Object();
        obj2.ad = jArr;
        obj2.vip = jArr.length;
        obj2.vip(10);
        return obj2;
    }

    @Override // defpackage.AbstractC4579e
    public final Object loadAd() {
        return new C15571e(new long[0]);
    }

    @Override // defpackage.AbstractC15168e, defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        C7159e c7159e = (C7159e) obj;
        long tapsense = interfaceC2043e.license(this.vip, i).tapsense();
        c7159e.vip(c7159e.license() + 1);
        long[] jArr = c7159e.ad;
        int i2 = c7159e.vip;
        c7159e.vip = i2 + 1;
        jArr[i2] = tapsense;
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        return ((C15571e) obj).f30738e.length;
    }
}
