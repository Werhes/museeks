package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2533e extends AbstractC6619e {
    @Override // defpackage.AbstractC6619e
    public final InterfaceC14001e smaato(int i) {
        C2533e c2533e = EnumC10900e.f21578e;
        if (i == 0) {
            return EnumC10900e.NEW;
        }
        if (i == 1) {
            return EnumC10900e.RUNNABLE;
        }
        if (i == 2) {
            return EnumC10900e.BLOCKED;
        }
        if (i == 3) {
            return EnumC10900e.WAITING;
        }
        if (i == 4) {
            return EnumC10900e.TIMED_WAITING;
        }
        if (i != 5) {
            return null;
        }
        return EnumC10900e.TERMINATED;
    }
}
