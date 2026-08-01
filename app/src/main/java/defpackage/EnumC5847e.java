package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC5847e implements InterfaceC5848e {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f12314e;

    EnumC5847e(int i) {
        this.f12314e = i;
    }

    public final int ad() {
        if (this != UNRECOGNIZED) {
            return this.f12314e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
