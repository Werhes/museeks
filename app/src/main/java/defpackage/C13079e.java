package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13079e extends AbstractC3257e {
    public final C17642e ad;
    public final C10651e vip;

    public C13079e(C17642e c17642e, C10651e c10651e) {
        this.ad = c17642e;
        this.vip = c10651e;
    }

    @Override // defpackage.AbstractC3257e, defpackage.InterfaceC11304e
    public final C11058e ad(C9840e c9840e) {
        return ((Boolean) this.ad.get()).booleanValue() ? super.ad(c9840e) : c9840e.purchase((C8650e) c9840e.startapp);
    }

    @Override // defpackage.AbstractC3257e
    public final C8650e metrica(C8650e c8650e) {
        C15718e c15718e = c8650e.ad;
        Object value = this.vip.metrica.f29092e.getValue();
        C3897e c3897e = value instanceof C3897e ? (C3897e) value : null;
        if (c3897e != null) {
            String str = c15718e.license;
            List<String> list = c3897e.metrica;
            if (list == null || !list.isEmpty()) {
                for (String str2 : list) {
                    if (!AbstractC7890e.billing(str, str2)) {
                        if (AbstractC6507e.amazon(str, "." + str2, false)) {
                        }
                    }
                    C18464e ad = c8650e.ad();
                    C14052e purchase = c15718e.purchase();
                    String str3 = (String) AbstractC13480e.m3591interface(c3897e.ad);
                    String vip = AbstractC16953e.vip(AbstractC11309e.adcel(0, 0, 7, str3));
                    if (vip == null) {
                        throw new IllegalArgumentException("unexpected host: ".concat(str3));
                    }
                    purchase.yandex = vip;
                    ad.f36191e = purchase.metrica();
                    ((C15783e) ad.f36192e).startapp("Host");
                    ((C15783e) ad.f36192e).purchase("Host", str);
                    return new C8650e(ad);
                }
            }
        }
        return c8650e;
    }
}
