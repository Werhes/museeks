package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۢ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC10611e implements InterfaceC7564e {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f20928e;

    EnumC10611e(int i) {
        this.f20928e = i;
    }

    public static EnumC10611e ad(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public final int vip() {
        if (this != UNRECOGNIZED) {
            return this.f20928e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
