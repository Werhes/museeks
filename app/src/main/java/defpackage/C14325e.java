package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۢۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14325e extends AbstractC17767e {
    public final ArrayList amazon;

    public C14325e(AbstractC10129e abstractC10129e, C17041e c17041e) {
        super(abstractC10129e, c17041e);
        this.amazon = AbstractC6874e.mopub(new C15523e(c17041e, -1));
    }

    @Override // defpackage.AbstractC17767e
    /* renamed from: class */
    public final C17041e mo1036class() {
        return ((C15523e) AbstractC13480e.m3570break(this.amazon)).ad;
    }

    @Override // defpackage.AbstractC17767e
    /* renamed from: interface */
    public final void mo1037interface() {
        ((C15523e) AbstractC13480e.m3570break(this.amazon)).vip++;
    }

    @Override // defpackage.InterfaceC5757e
    public final InterfaceC11845e metrica(InterfaceC9998e interfaceC9998e) {
        this.amazon.add(new C15523e(new C17041e(), 0));
        return this;
    }

    @Override // defpackage.InterfaceC11845e
    public final void vip(InterfaceC9998e interfaceC9998e) {
        long[] Signature;
        C15523e c15523e = (C15523e) AbstractC13480e.m3595private(this.amazon);
        C17041e mo1036class = mo1036class();
        int i = c15523e.vip;
        if (this.adcel.ad.license && (Signature = AbstractC12797e.Signature(interfaceC9998e)) != null) {
            int i2 = 0;
            while (true) {
                if (!(i2 < Signature.length)) {
                    break;
                }
                if (i2 >= Signature.length) {
                    throw new NoSuchElementException(String.valueOf(i2));
                }
                C4094e.vip(mo1036class, new C10994e(Signature[i2]).f21777e, 192);
                i2++;
            }
        }
        if (AbstractC12797e.remoteconfig(interfaceC9998e)) {
            C4094e.vip(mo1036class, i, 128);
        } else {
            AbstractC8457e appmetrica = interfaceC9998e.appmetrica();
            if (AbstractC7890e.billing(appmetrica, C3016e.appmetrica) || (appmetrica instanceof AbstractC13637e)) {
                C4094e.vip(mo1036class, i, 128);
            } else if (appmetrica instanceof C18215e) {
                C4094e.vip(mo1036class, i / 2, 160);
            } else {
                C4094e.vip(mo1036class, i, 160);
            }
        }
        C17041e c17041e = c15523e.ad;
        C17041e.startapp(mo1036class, c17041e.ad, c17041e.vip, 2);
    }
}
