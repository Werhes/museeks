package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC16535e implements InterfaceC14759e {
    UNKNOWN(0),
    SHARED_PREFS(1),
    CONTENT_PROVIDER(2),
    FILE(6),
    TIKTOK(4),
    DEVICE_CONFIG(5),
    PROCESS_STABLE_CONTENT_PROVIDER(3);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f32417e;

    EnumC16535e(int i) {
        this.f32417e = i;
    }

    public static EnumC16535e vip(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SHARED_PREFS;
            case 2:
                return CONTENT_PROVIDER;
            case 3:
                return PROCESS_STABLE_CONTENT_PROVIDER;
            case 4:
                return TIKTOK;
            case 5:
                return DEVICE_CONFIG;
            case 6:
                return FILE;
            default:
                return null;
        }
    }

    @Override // defpackage.InterfaceC14759e
    public final int ad() {
        return this.f32417e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f32417e);
    }
}
