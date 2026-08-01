package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11761e implements InterfaceC7794e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C6798e f23633e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1553e f23634e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1553e f23635e;

    public C11761e(C6798e c6798e, C14882e c14882e, C6746e c6746e) {
        C1553e c1553e = new C1553e(C1553e.appmetrica(AbstractC2677e.ad(c6798e.ad)));
        C4813e c4813e = c6798e.vip;
        C1553e c1553e2 = null;
        String str = ((EnumC5730e) c4813e.metrica) != EnumC5730e.MULTIFILE_CLASS_PART ? null : (String) c4813e.yandex;
        if (str != null && str.length() > 0) {
            c1553e2 = C1553e.metrica(str);
        }
        this.f23635e = c1553e;
        this.f23634e = c1553e2;
        this.f23633e = c6798e;
        Integer num = (Integer) AbstractC0863e.appmetrica(c14882e, AbstractC5745e.mopub);
        if (num != null) {
            c6746e.getString(num.intValue());
        }
    }

    public final C11709e ad() {
        C12816e c12816e;
        C1553e c1553e = this.f23635e;
        String str = c1553e.ad;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            c12816e = C12816e.metrica;
            if (c12816e == null) {
                C1553e.ad(9);
                throw null;
            }
        } else {
            c12816e = new C12816e(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        String license = c1553e.license();
        return new C11709e(c12816e, C0520e.appmetrica(AbstractC5304e.m1876synchronized('/', license, license)));
    }

    @Override // defpackage.InterfaceC7794e
    public final String signatures() {
        return AbstractC4653e.applovin(new StringBuilder("Class '"), ad().ad().ad.ad, '\'');
    }

    public final String toString() {
        return C11761e.class.getSimpleName() + ": " + this.f23635e;
    }
}
