package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15400e implements InterfaceC14128e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C15400e f30386e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C15400e f30387e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C15400e f30388e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f30389e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30390e;

    static {
        int i = 0;
        f30387e = new C15400e("TINK", i);
        f30388e = new C15400e("CRUNCHY", i);
        f30386e = new C15400e("NO_PREFIX", i);
    }

    public /* synthetic */ C15400e(String str, int i) {
        this.f30390e = i;
        this.f30389e = str;
    }

    @Override // defpackage.InterfaceC14128e
    public void ad(C4734e c4734e) {
    }

    @Override // defpackage.InterfaceC14128e
    public String license() {
        return this.f30389e;
    }

    public String toString() {
        switch (this.f30390e) {
            case 0:
                return this.f30389e;
            default:
                return super.toString();
        }
    }
}
