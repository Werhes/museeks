package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17093e {
    public static final /* synthetic */ int ad = 0;

    static {
        C12816e c12816e = new C12816e("kotlin.jvm.JvmInline");
        c12816e.vip();
        C0520e billing = c12816e.ad.billing();
        C12816e c12816e2 = C12816e.metrica;
        AbstractC18453e.billing(billing).ad.metrica();
        new C12816e("kotlin.jvm.JvmName");
    }

    public static final boolean ad(InterfaceC0390e interfaceC0390e) {
        AbstractC12421e mo1728e;
        if (!(interfaceC0390e instanceof C7901e)) {
            return false;
        }
        InterfaceC2188e m4030e = ((C7901e) interfaceC0390e).m4030e();
        if (m4030e.mo327e() != null) {
            return false;
        }
        InterfaceC15498e mo1351switch = m4030e.mo1351switch();
        InterfaceC5052e interfaceC5052e = mo1351switch instanceof InterfaceC5052e ? (InterfaceC5052e) mo1351switch : null;
        return (interfaceC5052e == null || (mo1728e = interfaceC5052e.mo1728e()) == null || !mo1728e.ad(m4030e.getName())) ? false : true;
    }

    public static final boolean appmetrica(InterfaceC15498e interfaceC15498e) {
        return vip(interfaceC15498e) || metrica(interfaceC15498e);
    }

    public static final AbstractC10226e billing(AbstractC1186e abstractC1186e) {
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        InterfaceC5052e interfaceC5052e = advert instanceof InterfaceC5052e ? (InterfaceC5052e) advert : null;
        if (interfaceC5052e != null) {
            int i = AbstractC2876e.ad;
            AbstractC12421e mo1728e = interfaceC5052e.mo1728e();
            C10773e c10773e = mo1728e instanceof C10773e ? (C10773e) mo1728e : null;
            if (c10773e != null) {
                return (AbstractC10226e) c10773e.vip;
            }
        }
        return null;
    }

    public static final boolean license(InterfaceC8185e interfaceC8185e) {
        if (interfaceC8185e.mo327e() != null) {
            return false;
        }
        InterfaceC15498e mo1351switch = interfaceC8185e.mo1351switch();
        C0520e c0520e = null;
        InterfaceC5052e interfaceC5052e = mo1351switch instanceof InterfaceC5052e ? (InterfaceC5052e) mo1351switch : null;
        if (interfaceC5052e != null) {
            int i = AbstractC2876e.ad;
            AbstractC12421e mo1728e = interfaceC5052e.mo1728e();
            C10773e c10773e = mo1728e instanceof C10773e ? (C10773e) mo1728e : null;
            if (c10773e != null) {
                c0520e = c10773e.ad;
            }
        }
        return AbstractC7890e.billing(c0520e, interfaceC8185e.getName());
    }

    public static final boolean metrica(InterfaceC15498e interfaceC15498e) {
        return (interfaceC15498e instanceof InterfaceC5052e) && (((InterfaceC5052e) interfaceC15498e).mo1728e() instanceof C0940e);
    }

    public static final boolean purchase(AbstractC1186e abstractC1186e) {
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        return (advert == null || !metrica(advert) || AbstractC11957e.appmetrica(abstractC1186e)) ? false : true;
    }

    public static final boolean vip(InterfaceC15498e interfaceC15498e) {
        return (interfaceC15498e instanceof InterfaceC5052e) && (((InterfaceC5052e) interfaceC15498e).mo1728e() instanceof C10773e);
    }
}
