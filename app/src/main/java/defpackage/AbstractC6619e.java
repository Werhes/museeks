package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6619e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        c17790e.m4433super(((InterfaceC14001e) obj).getValue());
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        int amazon = c17546e.amazon();
        InterfaceC14001e smaato = smaato(amazon);
        if (smaato != null) {
            return smaato;
        }
        throw new C17420e(amazon, this.ad);
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        int value = ((InterfaceC14001e) obj).getValue();
        if ((value & (-128)) == 0) {
            return 1;
        }
        if ((value & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & value) == 0) {
            return 3;
        }
        return (value & (-268435456)) == 0 ? 4 : 5;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        c0444e.m353protected(((InterfaceC14001e) obj).getValue());
    }

    public abstract InterfaceC14001e smaato(int i);

    @Override // defpackage.AbstractC11069e
    public final Object vip(C17582e c17582e) {
        int smaato = c17582e.smaato();
        InterfaceC14001e smaato2 = smaato(smaato);
        if (smaato2 != null) {
            return smaato2;
        }
        throw new C17420e(smaato, this.ad);
    }
}
