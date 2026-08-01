package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؐۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3053e extends AbstractC9910e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC1108e f7111e;

    public AbstractC3053e(int i, int i2, InterfaceC8850e interfaceC8850e, InterfaceC1108e interfaceC1108e) {
        super(interfaceC8850e, i, i2);
        this.f7111e = interfaceC1108e;
    }

    @Override // defpackage.AbstractC9910e, defpackage.InterfaceC1108e
    public final Object ad(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        int i = this.f19547e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (i == -3) {
            InterfaceC8850e admob = interfaceC5083e.admob();
            Boolean bool = Boolean.FALSE;
            C8436e c8436e = new C8436e((byte) 0, 5);
            InterfaceC8850e interfaceC8850e = this.f19548e;
            InterfaceC8850e mo394const = !((Boolean) interfaceC8850e.mo395e(bool, c8436e)).booleanValue() ? admob.mo394const(interfaceC8850e) : AbstractC6494e.yandex(admob, interfaceC8850e, false);
            if (AbstractC7890e.billing(mo394const, admob)) {
                Object adcel = adcel(interfaceC6034e, interfaceC5083e);
                return adcel == enumC2821e ? adcel : Unit.INSTANCE;
            }
            C12575e c12575e = C12575e.f25235e;
            if (AbstractC7890e.billing(mo394const.mo397public(c12575e), admob.mo397public(c12575e))) {
                InterfaceC8850e admob2 = interfaceC5083e.admob();
                if (!(interfaceC6034e instanceof C9278e) && !(interfaceC6034e instanceof C2682e)) {
                    interfaceC6034e = new C15312e(interfaceC6034e, admob2);
                }
                Object metrica = AbstractC2426e.metrica(mo394const, interfaceC6034e, mo394const.mo395e(0, AbstractC2745e.metrica), new C1853e(this, (InterfaceC5083e) null, 21), interfaceC5083e);
                return metrica == enumC2821e ? metrica : Unit.INSTANCE;
            }
        }
        Object ad = super.ad(interfaceC6034e, interfaceC5083e);
        return ad == enumC2821e ? ad : Unit.INSTANCE;
    }

    public abstract Object adcel(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e);

    @Override // defpackage.AbstractC9910e
    public final Object appmetrica(InterfaceC9543e interfaceC9543e, InterfaceC5083e interfaceC5083e) {
        Object adcel = adcel(new C9278e(interfaceC9543e), interfaceC5083e);
        return adcel == EnumC2821e.f6782e ? adcel : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC9910e
    public final String toString() {
        return this.f7111e + " -> " + super.toString();
    }
}
