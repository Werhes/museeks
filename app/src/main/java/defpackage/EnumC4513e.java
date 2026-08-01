package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC4513e implements InterfaceC7564e {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f9790e;

    EnumC4513e(int i) {
        this.f9790e = i;
    }

    public final int ad() {
        if (this != UNRECOGNIZED) {
            return this.f9790e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
