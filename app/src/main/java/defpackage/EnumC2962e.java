package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣۣؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2962e implements InterfaceC9891e {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f7009e;

    EnumC2962e(int i) {
        this.f7009e = i;
    }

    @Override // defpackage.InterfaceC9891e
    public final int ad() {
        return this.f7009e;
    }
}
