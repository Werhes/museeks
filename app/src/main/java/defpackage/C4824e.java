package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4824e extends AbstractC1984e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C4824e f10284e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C4824e f10285e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C4824e f10286e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C4824e f10287e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C4824e f10288e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C4824e f10290e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C4824e f10291e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C4824e f10292e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C4824e f10293e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C4824e f10294e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f10295e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C4824e f10283e = new C4824e("package", false, 0);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C4824e f10289e = new C4824e("unknown", false, 11);

    static {
        boolean z = true;
        f10294e = new C4824e("protected_and_package", z, 1);
        f10293e = new C4824e("protected_static", z, 2);
        boolean z2 = false;
        f10290e = new C4824e("inherited", z2, 3);
        f10292e = new C4824e("internal", z2, 4);
        f10286e = new C4824e("invisible_fake", z2, 5);
        f10291e = new C4824e("local", z2, 6);
        f10285e = new C4824e("private", z2, 7);
        f10284e = new C4824e("private_to_this", z2, 8);
        boolean z3 = true;
        f10287e = new C4824e("protected", z3, 9);
        f10288e = new C4824e("public", z3, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4824e(String str, boolean z, int i) {
        super(str, z);
        this.f10295e = i;
    }

    @Override // defpackage.AbstractC1984e
    public String billing() {
        switch (this.f10295e) {
            case 0:
                return "public/*package*/";
            case 1:
                return "protected/*protected and package*/";
            case 2:
                return "protected/*protected static*/";
            case 8:
                return "private/*private to this*/";
            default:
                return super.billing();
        }
    }

    @Override // defpackage.AbstractC1984e
    public AbstractC1984e remoteconfig() {
        switch (this.f10295e) {
            case 0:
                return f10287e;
            case 1:
                return f10287e;
            case 2:
                return f10287e;
            default:
                return this;
        }
    }

    @Override // defpackage.AbstractC1984e
    public Integer vip(AbstractC1984e abstractC1984e) {
        int i = this.f10295e;
        C4824e c4824e = f10284e;
        C4824e c4824e2 = f10285e;
        switch (i) {
            case 0:
                if (this == abstractC1984e) {
                    return 0;
                }
                C1239e c1239e = AbstractC2716e.ad;
                return abstractC1984e == c4824e2 || abstractC1984e == c4824e ? 1 : -1;
            case 1:
                if (equals(abstractC1984e)) {
                    return 0;
                }
                if (abstractC1984e == f10292e) {
                    return null;
                }
                C1239e c1239e2 = AbstractC2716e.ad;
                return abstractC1984e == c4824e2 || abstractC1984e == c4824e ? 1 : -1;
            default:
                return super.vip(abstractC1984e);
        }
    }
}
