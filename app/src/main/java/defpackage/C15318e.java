package defpackage;

import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15318e extends AbstractC10347e {
    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-1025066524);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                C1630e c1630e = new C1630e(0, EnumC6916e.f14170e);
                while (true) {
                    if (!c1630e.hasNext()) {
                        m3681throw = EnumC6916e.f14174e;
                        break;
                    }
                    EnumC6916e enumC6916e = (EnumC6916e) c1630e.next();
                    VKXApplication vKXApplication = VKXApplication.f36528e;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    if (AbstractC1535e.ad(vKXApplication, enumC6916e)) {
                        m3681throw = enumC6916e;
                        break;
                    }
                }
                c13770e.m3682throws(m3681throw);
            }
            EnumC6916e enumC6916e2 = (EnumC6916e) m3681throw;
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            C18046e c18046e = VKXApplication.f36532e;
            if (c18046e == null) {
                c18046e = null;
            }
            InterfaceC3314e license = AbstractC4628e.license((C14688e) c18046e.purchase.appmetrica, c13770e, 0);
            C18046e c18046e2 = VKXApplication.f36532e;
            AbstractC13348e.ad(null, AbstractC16653e.license(1457584552, new C3441e(this, enumC6916e2, 0), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-1251540301, new C2329e(startapp, license, this, AbstractC4628e.license((C14688e) (c18046e2 != null ? c18046e2 : null).purchase.yandex, c13770e, 0)), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11213e(this, i, 23);
        }
    }
}
