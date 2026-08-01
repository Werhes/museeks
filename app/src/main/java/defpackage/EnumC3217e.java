package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3217e implements InterfaceC14001e {
    SUCCESS(0),
    NOT_FOUND(1),
    ALREADY_USED_ELSEWHERE(2),
    ALREADY_USED_HERE(3),
    HAS_THIS_ONE_TIME_ENTITLEMENT(4),
    EXPIRED(5),
    FLOOD_WAIT(6),
    NO_USES_LEFT(7);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f7343e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C18487e f7336e = new AbstractC11069e(1, AbstractC3820e.ad.vip(EnumC3217e.class), 2, SUCCESS);

    EnumC3217e(int i) {
        this.f7343e = i;
    }

    @Override // defpackage.InterfaceC14001e
    public final int getValue() {
        return this.f7343e;
    }
}
