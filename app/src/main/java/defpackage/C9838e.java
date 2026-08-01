package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9838e extends AbstractC2356e {
    public final RunnableC1156e license(String str) {
        boolean z;
        InterfaceC4766e mo940default;
        AbstractC14291e abstractC14291e = C10832e.appmetrica;
        C17823e vip = AbstractC5076e.vip();
        InterfaceC4766e interfaceC4766e = vip.vip;
        if (interfaceC4766e == C13169e.f26148e) {
            interfaceC4766e = null;
            AbstractC5076e.ad(vip, null);
            z = true;
        } else {
            z = false;
        }
        if (interfaceC4766e == null) {
            UUID vip2 = C9569e.metrica.vip();
            String ad = AbstractC2228e.ad(vip2);
            C2123e c2123e = C5517e.f11791e;
            AbstractC12614e abstractC12614e = (AbstractC12614e) AbstractC5076e.ad.get();
            if (!abstractC12614e.isEmpty()) {
                Iterable$EL.forEach(abstractC12614e, new C6987e(1));
            }
            mo940default = new C13190e(vip2, ad, str, abstractC14291e, c2123e, vip);
        } else {
            mo940default = interfaceC4766e instanceof InterfaceC2534e ? ((InterfaceC2534e) interfaceC4766e).mo940default(str, abstractC14291e, false, vip) : interfaceC4766e.mo1672e(str, abstractC14291e, vip);
        }
        AbstractC5076e.ad(vip, mo940default);
        return new RunnableC1156e(mo940default, z);
    }
}
