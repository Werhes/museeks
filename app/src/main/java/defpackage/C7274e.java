package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7274e extends AbstractC7723e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC7723e f14871e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC7723e f14872e;

    public C7274e(AbstractC7723e abstractC7723e, AbstractC7723e abstractC7723e2) {
        abstractC7723e.getClass();
        this.f14872e = abstractC7723e;
        abstractC7723e2.getClass();
        this.f14871e = abstractC7723e2;
    }

    @Override // defpackage.InterfaceC11801e
    public final boolean apply(Object obj) {
        return metrica(((Character) obj).charValue());
    }

    @Override // defpackage.AbstractC7723e
    public final boolean metrica(char c) {
        return this.f14872e.metrica(c) && this.f14871e.metrica(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.f14872e + ", " + this.f14871e + ")";
    }
}
