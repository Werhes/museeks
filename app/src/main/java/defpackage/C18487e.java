package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۥۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18487e extends AbstractC6619e {
    @Override // defpackage.AbstractC6619e
    public final InterfaceC14001e smaato(int i) {
        C18487e c18487e = EnumC3217e.f7336e;
        switch (i) {
            case 0:
                return EnumC3217e.SUCCESS;
            case 1:
                return EnumC3217e.NOT_FOUND;
            case 2:
                return EnumC3217e.ALREADY_USED_ELSEWHERE;
            case 3:
                return EnumC3217e.ALREADY_USED_HERE;
            case 4:
                return EnumC3217e.HAS_THIS_ONE_TIME_ENTITLEMENT;
            case 5:
                return EnumC3217e.EXPIRED;
            case 6:
                return EnumC3217e.FLOOD_WAIT;
            case 7:
                return EnumC3217e.NO_USES_LEFT;
            default:
                return null;
        }
    }
}
