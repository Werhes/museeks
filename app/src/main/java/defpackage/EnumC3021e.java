package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3021e implements InterfaceC7564e {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f7086e;

    EnumC3021e(int i) {
        this.f7086e = i;
    }

    public static EnumC3021e ad(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i == 4) {
            return CRUNCHY;
        }
        if (i != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    public final int vip() {
        if (this != UNRECOGNIZED) {
            return this.f7086e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
