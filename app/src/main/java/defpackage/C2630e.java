package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2630e extends AbstractC17767e {
    @Override // defpackage.AbstractC17767e
    /* renamed from: class, reason: not valid java name */
    public final C17041e mo1036class() {
        return this.mopub;
    }

    @Override // defpackage.AbstractC17767e
    /* renamed from: interface, reason: not valid java name */
    public final void mo1037interface() {
    }

    @Override // defpackage.InterfaceC5757e
    public final InterfaceC11845e metrica(InterfaceC9998e interfaceC9998e) {
        long[] Signature;
        boolean z = this.adcel.ad.license;
        C17041e c17041e = this.mopub;
        if (z && (Signature = AbstractC12797e.Signature(interfaceC9998e)) != null) {
            int i = 0;
            while (true) {
                if (!(i < Signature.length)) {
                    break;
                }
                if (i >= Signature.length) {
                    throw new NoSuchElementException(String.valueOf(i));
                }
                C4094e.vip(c17041e, new C10994e(Signature[i]).f21777e, 192);
                i++;
            }
        }
        if (AbstractC12797e.remoteconfig(interfaceC9998e)) {
            c17041e.yandex(159);
            return this;
        }
        AbstractC8457e appmetrica = interfaceC9998e.appmetrica();
        if (AbstractC7890e.billing(appmetrica, C3016e.appmetrica) || (appmetrica instanceof AbstractC13637e)) {
            c17041e.yandex(159);
            return this;
        }
        if (appmetrica instanceof C18215e) {
            c17041e.yandex(191);
            return this;
        }
        c17041e.yandex(191);
        return this;
    }

    @Override // defpackage.InterfaceC11845e
    public final void vip(InterfaceC9998e interfaceC9998e) {
        this.mopub.yandex(255);
    }
}
