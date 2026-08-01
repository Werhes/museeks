package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۦٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18142e extends AbstractC6105e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final char f35553e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35554e;

    public /* synthetic */ C18142e(char c, int i) {
        this.f35554e = i;
        this.f35553e = c;
    }

    @Override // defpackage.AbstractC6105e, defpackage.AbstractC7723e
    public final AbstractC7723e license() {
        switch (this.f35554e) {
            case 0:
                return new C18142e(this.f35553e, 1);
            default:
                return new C18142e(this.f35553e, 0);
        }
    }

    @Override // defpackage.AbstractC7723e
    public final boolean metrica(char c) {
        switch (this.f35554e) {
            case 0:
                return c == this.f35553e;
            default:
                return c != this.f35553e;
        }
    }

    public final String toString() {
        switch (this.f35554e) {
            case 0:
                return "CharMatcher.is('" + AbstractC7723e.ad(this.f35553e) + "')";
            default:
                return "CharMatcher.isNot('" + AbstractC7723e.ad(this.f35553e) + "')";
        }
    }
}
