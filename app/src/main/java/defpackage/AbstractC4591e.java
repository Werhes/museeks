package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4591e {
    public static final C11709e ad;

    static {
        C12816e c12816e = new C12816e("java.lang.Void");
        ad = new C11709e(c12816e.vip(), c12816e.ad.billing());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C3326e ad(InterfaceC16528e interfaceC16528e) {
        String metrica = AbstractC5400e.metrica(interfaceC16528e);
        if (metrica == null) {
            if (interfaceC16528e instanceof C7901e) {
                metrica = AbstractC7903e.ad(AbstractC2876e.startapp(interfaceC16528e).getName().vip());
            } else if (interfaceC16528e instanceof C2042e) {
                String vip = AbstractC2876e.startapp(interfaceC16528e).getName().vip();
                C12816e c12816e = AbstractC7903e.ad;
                StringBuilder sb = new StringBuilder("set");
                sb.append(AbstractC7903e.vip(vip) ? vip.substring(2) : AbstractC6022e.metrica(vip));
                metrica = sb.toString();
            } else {
                metrica = ((AbstractC2214e) interfaceC16528e).getName().vip();
            }
        }
        return new C3326e(new C11771e(metrica, AbstractC5209e.vip(interfaceC16528e, 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC5357e metrica(InterfaceC16528e interfaceC16528e) {
        Method method;
        InterfaceC16528e vip = ((InterfaceC16528e) AbstractC14300e.subscription(interfaceC16528e)).vip();
        if (vip instanceof InterfaceC14176e) {
            InterfaceC3667e interfaceC3667e = (InterfaceC3667e) vip;
            AbstractC6649e mo362e = interfaceC3667e.mo362e();
            if (mo362e instanceof C9920e) {
                C18521e c18521e = C13814e.ad;
                C11771e metrica = C13814e.metrica((C9920e) mo362e, interfaceC3667e.mo364e(), interfaceC3667e.mo363e());
                if (metrica != null) {
                    return new C3326e(metrica);
                }
            }
            if (mo362e instanceof C11505e) {
                C18521e c18521e2 = C13814e.ad;
                C11771e ad2 = C13814e.ad((C11505e) mo362e, interfaceC3667e.mo364e(), interfaceC3667e.mo363e());
                if (ad2 != null) {
                    String str = ad2.vip;
                    String str2 = ad2.metrica;
                    if (AbstractC17093e.vip(interfaceC16528e.mo1351switch())) {
                        return new C3326e(ad2);
                    }
                    if (!AbstractC17093e.metrica(interfaceC16528e.mo1351switch())) {
                        return new C4483e(ad2);
                    }
                    InterfaceC11788e interfaceC11788e = (InterfaceC11788e) interfaceC16528e;
                    if (interfaceC11788e.mo2281e()) {
                        if (!AbstractC7890e.billing(str, "constructor-impl") || !AbstractC6507e.amazon(str2, ")V", false)) {
                            throw new IllegalArgumentException(("Invalid signature: " + ad2).toString());
                        }
                    } else {
                        if (!AbstractC7890e.billing(str, "constructor-impl")) {
                            throw new IllegalArgumentException(("Invalid signature: " + ad2).toString());
                        }
                        String vip2 = AbstractC13133e.vip(AbstractC2876e.purchase(interfaceC11788e.mo2283e()).vip());
                        if (AbstractC6507e.amazon(str2, ")V", false)) {
                            ad2 = new C11771e(str, AbstractC5304e.m1853catch(str2, "V") + vip2);
                        } else if (!AbstractC6507e.amazon(str2, vip2, false)) {
                            throw new IllegalArgumentException(("Invalid signature: " + ad2).toString());
                        }
                    }
                    return new C3326e(ad2);
                }
            }
            return ad(vip);
        }
        if (vip instanceof C0782e) {
            InterfaceC3054e adcel = ((C0782e) vip).adcel();
            C10253e c10253e = adcel instanceof C10253e ? (C10253e) adcel : null;
            AbstractC18469e abstractC18469e = c10253e != null ? c10253e.f20269e : null;
            C6185e c6185e = abstractC18469e instanceof C6185e ? (C6185e) abstractC18469e : null;
            if (c6185e != null && (method = c6185e.ad) != null) {
                return new C13227e(method);
            }
            throw new Error("Incorrect resolution sequence for Java method " + vip);
        }
        if (!(vip instanceof C10687e)) {
            AbstractC2214e abstractC2214e = (AbstractC2214e) vip;
            if ((abstractC2214e.getName().equals(AbstractC4972e.metrica) && AbstractC7518e.loadAd(vip)) || ((abstractC2214e.getName().equals(AbstractC4972e.ad) && AbstractC7518e.loadAd(vip)) || (AbstractC7890e.billing(abstractC2214e.getName(), C3036e.appmetrica) && vip.mo330e().isEmpty()))) {
                return ad(vip);
            }
            throw new Error("Unknown origin of " + vip + " (" + vip.getClass() + ')');
        }
        InterfaceC3054e adcel2 = ((C10687e) vip).adcel();
        C10253e c10253e2 = adcel2 instanceof C10253e ? (C10253e) adcel2 : null;
        Object obj = c10253e2 != null ? c10253e2.f20269e : null;
        if (obj instanceof C11378e) {
            return new C10267e(((C11378e) obj).ad);
        }
        if (obj instanceof C17070e) {
            Class cls = ((C17070e) obj).ad;
            if (cls.isAnnotation()) {
                return new C14631e(cls);
            }
        }
        throw new Error("Incorrect resolution sequence for Java constructor " + vip + " (" + obj + ')');
    }

    public static AbstractC10888e vip(InterfaceC2188e interfaceC2188e) {
        InterfaceC2188e vip = ((InterfaceC2188e) AbstractC14300e.subscription(interfaceC2188e)).vip();
        if (vip instanceof C11580e) {
            C11580e c11580e = (C11580e) vip;
            C17485e c17485e = c11580e.f23257e;
            C4442e c4442e = (C4442e) AbstractC0863e.appmetrica(c17485e, AbstractC5745e.license);
            if (c4442e != null) {
                return new C3345e(vip, c17485e, c4442e, c11580e.f23255e, c11580e.f23254e);
            }
        } else if (vip instanceof C2398e) {
            C2398e c2398e = (C2398e) vip;
            InterfaceC3054e adcel = c2398e.adcel();
            C10253e c10253e = adcel instanceof C10253e ? (C10253e) adcel : null;
            AbstractC18469e abstractC18469e = c10253e != null ? c10253e.f20269e : null;
            if (abstractC18469e instanceof C1214e) {
                return new C4635e(((C1214e) abstractC18469e).ad);
            }
            if (!(abstractC18469e instanceof C6185e)) {
                throw new Error("Incorrect resolution sequence for Java field " + vip + " (source = " + abstractC18469e + ')');
            }
            Method method = ((C6185e) abstractC18469e).ad;
            C2042e c2042e = c2398e.f20112e;
            InterfaceC3054e adcel2 = c2042e != null ? c2042e.adcel() : null;
            C10253e c10253e2 = adcel2 instanceof C10253e ? (C10253e) adcel2 : null;
            AbstractC18469e abstractC18469e2 = c10253e2 != null ? c10253e2.f20269e : null;
            C6185e c6185e = abstractC18469e2 instanceof C6185e ? (C6185e) abstractC18469e2 : null;
            return new C12299e(method, c6185e != null ? c6185e.ad : null);
        }
        C3326e ad2 = ad(vip.metrica());
        C2042e appmetrica = vip.appmetrica();
        return new C14249e(ad2, appmetrica != null ? ad(appmetrica) : null);
    }
}
