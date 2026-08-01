package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C1862e.class)
/* renamed from: eًّۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12355e extends AbstractC4879e {
    public static final C9131e Companion = new Object();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15563e f24776e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌۧ, java.lang.Object] */
    static {
        C3087e c3087e = C15563e.metrica;
        C3087e c3087e2 = C15563e.metrica;
        C3087e c3087e3 = C15563e.metrica;
        C3087e c3087e4 = C15563e.metrica;
        C3087e c3087e5 = C15563e.metrica;
        C3087e c3087e6 = C15563e.metrica;
        C3087e c3087e7 = C15563e.metrica;
    }

    public C12355e(C15563e c15563e) {
        this.f24776e = c15563e;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        if (AbstractC7890e.billing(c12232e.vip(C12355e.class), c12232e.vip(obj.getClass()))) {
            return AbstractC7890e.billing(this.f24776e, ((C12355e) obj).f24776e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24776e.hashCode();
    }

    public final String toString() {
        return "BsonDecimal128(value=" + this.f24776e + ')';
    }
}
