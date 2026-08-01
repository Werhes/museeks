package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12925e extends AbstractC6105e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final char f25787e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char f25788e;

    public C12925e(char c, char c2) {
        this.f25788e = c;
        this.f25787e = c2;
    }

    @Override // defpackage.AbstractC7723e
    public final boolean metrica(char c) {
        return c == this.f25788e || c == this.f25787e;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + AbstractC7723e.ad(this.f25788e) + AbstractC7723e.ad(this.f25787e) + "\")";
    }
}
