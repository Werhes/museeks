package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3345e extends AbstractC10888e {
    public final InterfaceC11824e appmetrica;
    public final String billing;
    public final C4442e license;
    public final C17485e metrica;
    public final C17221e purchase;
    public final InterfaceC2188e vip;

    public C3345e(InterfaceC2188e interfaceC2188e, C17485e c17485e, C4442e c4442e, InterfaceC11824e interfaceC11824e, C17221e c17221e) {
        String str;
        String ads;
        String string;
        this.vip = interfaceC2188e;
        this.metrica = c17485e;
        this.license = c4442e;
        this.appmetrica = interfaceC11824e;
        this.purchase = c17221e;
        if (c4442e.startapp()) {
            ads = interfaceC11824e.getString(c4442e.f9638e.f34833e) + interfaceC11824e.getString(c4442e.f9638e.f34835e);
        } else {
            C13769e vip = C13814e.vip(c17485e, interfaceC11824e, c17221e, true);
            if (vip == null) {
                throw new Error("No field signature for property: " + interfaceC2188e);
            }
            String str2 = vip.vip;
            String str3 = vip.metrica;
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC7903e.ad(str2));
            InterfaceC15498e mo1351switch = interfaceC2188e.mo1351switch();
            if (AbstractC7890e.billing(interfaceC2188e.advert(), AbstractC6050e.license) && (mo1351switch instanceof C7025e)) {
                Integer num = (Integer) AbstractC0863e.appmetrica(((C7025e) mo1351switch).f14369e, AbstractC5745e.billing);
                str = "$".concat(AbstractC0757e.ad.f20638e.matcher((num == null || (string = interfaceC11824e.getString(num.intValue())) == null) ? "main" : string).replaceAll("_"));
            } else {
                if (AbstractC7890e.billing(interfaceC2188e.advert(), AbstractC6050e.ad) && (mo1351switch instanceof InterfaceC9646e)) {
                    InterfaceC7794e interfaceC7794e = ((C11580e) interfaceC2188e).f23253e;
                    if (interfaceC7794e instanceof C11761e) {
                        C11761e c11761e = (C11761e) interfaceC7794e;
                        if (c11761e.f23634e != null) {
                            StringBuilder sb2 = new StringBuilder("$");
                            String license = c11761e.f23635e.license();
                            sb2.append(C0520e.appmetrica(AbstractC5304e.m1876synchronized('/', license, license)).vip());
                            str = sb2.toString();
                        }
                    }
                }
                str = BuildConfig.FLAVOR;
            }
            ads = AbstractC8647e.ads(sb, str, "()", str3);
        }
        this.billing = ads;
    }

    @Override // defpackage.AbstractC10888e
    public final String vip() {
        return this.billing;
    }
}
