package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۛۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11278e implements InterfaceC1436e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C11278e f22657e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C11278e f22658e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C11278e f22659e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C11278e f22660e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C11278e f22661e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f22662e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22663e;

    static {
        int i = 0;
        f22658e = new C11278e("TINK", i);
        f22659e = new C11278e("CRUNCHY", i);
        f22657e = new C11278e("NO_PREFIX", i);
        int i2 = 1;
        f22661e = new C11278e("TINK", i2);
        f22660e = new C11278e("NO_PREFIX", i2);
    }

    public /* synthetic */ C11278e(String str, int i) {
        this.f22663e = i;
        this.f22662e = str;
    }

    @Override // defpackage.InterfaceC1436e
    public String getServiceName() {
        return this.f22662e;
    }

    public String toString() {
        switch (this.f22663e) {
            case 0:
                return this.f22662e;
            case 1:
                return this.f22662e;
            default:
                return super.toString();
        }
    }
}
