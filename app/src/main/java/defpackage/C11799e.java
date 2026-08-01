package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11799e extends AbstractC6619e {
    @Override // defpackage.AbstractC6619e
    public final InterfaceC14001e smaato(int i) {
        C11799e c11799e = EnumC4433e.f9613e;
        if (i == 0) {
            return EnumC4433e.IN_PROGRESS;
        }
        if (i == 1) {
            return EnumC4433e.COMPLETED;
        }
        if (i == 2) {
            return EnumC4433e.FAILED;
        }
        if (i != 3) {
            return null;
        }
        return EnumC4433e.REFUNDED;
    }
}
