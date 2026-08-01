package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6140e implements InterfaceC10459e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C6140e f12910e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C6140e f12911e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f12912e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12913e;

    static {
        int i = 0;
        f12910e = new C6140e("TINK", i);
        f12911e = new C6140e("NO_PREFIX", i);
    }

    public /* synthetic */ C6140e(String str, int i) {
        this.f12913e = i;
        this.f12912e = str;
    }

    @Override // defpackage.InterfaceC10459e
    public String signatures() {
        return AbstractC4653e.applovin(new StringBuilder("expected '"), this.f12912e, '\'');
    }

    public String toString() {
        switch (this.f12913e) {
            case 0:
                return this.f12912e;
            default:
                return super.toString();
        }
    }
}
