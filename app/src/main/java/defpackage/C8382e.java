package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۨۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8382e extends AbstractC15493e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f17148e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C8382e f17145e = new C8382e("CharMatcher.any()", 0);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C8382e f17146e = new C8382e("CharMatcher.ascii()", 1);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C8382e f17144e = new C8382e("CharMatcher.javaIsoControl()", 2);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C8382e f17147e = new C8382e("CharMatcher.none()", 3);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8382e(String str, int i) {
        super(str);
        this.f17148e = i;
    }

    @Override // defpackage.AbstractC6105e, defpackage.AbstractC7723e
    public AbstractC7723e license() {
        switch (this.f17148e) {
            case 0:
                return f17147e;
            case 3:
                return f17145e;
            default:
                return super.license();
        }
    }

    @Override // defpackage.AbstractC7723e
    public final boolean metrica(char c) {
        switch (this.f17148e) {
            case 0:
                return true;
            case 1:
                return c <= 127;
            case 2:
                return c <= 31 || (c >= 127 && c <= 159);
            default:
                return false;
        }
    }
}
