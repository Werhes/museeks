package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11484e extends AbstractC6619e {
    @Override // defpackage.AbstractC6619e
    public final InterfaceC14001e smaato(int i) {
        C11484e c11484e = EnumC5699e.f12101e;
        if (i == 0) {
            return EnumC5699e.GENERAL;
        }
        if (i == 1) {
            return EnumC5699e.MAJOR_UPDATE;
        }
        if (i == 2) {
            return EnumC5699e.NEWS;
        }
        if (i == 3) {
            return EnumC5699e.IMPORTANT_PSA;
        }
        if (i == 4) {
            return EnumC5699e.SALE;
        }
        if (i != 5) {
            return null;
        }
        return EnumC5699e.MINOR_UPDATE;
    }
}
