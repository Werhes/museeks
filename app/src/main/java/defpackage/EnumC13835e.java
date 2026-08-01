package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC13835e implements InterfaceC14759e {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f27403e;

    EnumC13835e(int i) {
        this.f27403e = i;
    }

    @Override // defpackage.InterfaceC14759e
    public final int ad() {
        if (this != UNRECOGNIZED) {
            return this.f27403e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f27403e);
    }
}
