package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17074e {
    public static final C0583e ad = metrica(true);
    public static final C0583e vip = metrica(false);
    public static final C3783e metrica = C3783e.appmetrica;

    public static final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-211209833);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, metrica, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2133e(interfaceC12864e, i);
        }
    }

    public static final InterfaceC2747e license(InterfaceC8079e interfaceC8079e, boolean z) {
        InterfaceC2747e interfaceC2747e = (InterfaceC2747e) (z ? ad : vip).billing(interfaceC8079e);
        return interfaceC2747e == null ? new C10935e(interfaceC8079e, z) : interfaceC2747e;
    }

    public static final C0583e metrica(boolean z) {
        C0583e c0583e = new C0583e(9);
        C10156e c10156e = C5438e.f11676e;
        c0583e.amazon(c10156e, new C10935e(c10156e, z));
        C10156e c10156e2 = C5438e.f11669e;
        c0583e.amazon(c10156e2, new C10935e(c10156e2, z));
        C10156e c10156e3 = C5438e.f11693e;
        c0583e.amazon(c10156e3, new C10935e(c10156e3, z));
        C10156e c10156e4 = C5438e.f11666e;
        c0583e.amazon(c10156e4, new C10935e(c10156e4, z));
        C10156e c10156e5 = C5438e.f11700e;
        c0583e.amazon(c10156e5, new C10935e(c10156e5, z));
        C10156e c10156e6 = C5438e.f11699e;
        c0583e.amazon(c10156e6, new C10935e(c10156e6, z));
        C10156e c10156e7 = C5438e.f11682e;
        c0583e.amazon(c10156e7, new C10935e(c10156e7, z));
        C10156e c10156e8 = C5438e.f11695e;
        c0583e.amazon(c10156e8, new C10935e(c10156e8, z));
        C10156e c10156e9 = C5438e.f11670e;
        c0583e.amazon(c10156e9, new C10935e(c10156e9, z));
        return c0583e;
    }

    public static final void vip(AbstractC3698e abstractC3698e, AbstractC2832e abstractC2832e, InterfaceC16719e interfaceC16719e, EnumC7792e enumC7792e, int i, int i2, InterfaceC8079e interfaceC8079e) {
        C10156e c10156e;
        Object signatures = interfaceC16719e.signatures();
        C9588e c9588e = signatures instanceof C9588e ? (C9588e) signatures : null;
        AbstractC3698e.adcel(abstractC3698e, abstractC2832e, ((c9588e == null || (c10156e = c9588e.f19021e) == null) ? interfaceC8079e : c10156e).ad((abstractC2832e.f6806e << 32) | (abstractC2832e.f6804e & 4294967295L), (i << 32) | (i2 & 4294967295L), enumC7792e));
    }
}
