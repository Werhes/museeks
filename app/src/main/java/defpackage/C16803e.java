package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16803e implements InterfaceC5372e {
    public final InterfaceC7227e ad;
    public final C17709e vip;

    public C16803e() {
        InterfaceC7227e vip = AbstractC3820e.ad.vip(InterfaceC8399e.class);
        this.ad = vip;
        this.vip = AbstractC10003e.appmetrica("JsonContentPolymorphicSerializer<" + vip.mopub() + '>', C13234e.purchase, new InterfaceC9998e[0]);
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        interfaceC5757e.ad().getClass();
        InterfaceC7227e interfaceC7227e = this.ad;
        if (interfaceC7227e.applovin(obj)) {
            AbstractC9476e.adcel(1, null);
        }
        Class<?> cls = obj.getClass();
        C12232e c12232e = AbstractC3820e.ad;
        InterfaceC5372e mopub = AbstractC17808e.mopub(c12232e.vip(cls));
        if (mopub != null) {
            mopub.ad(interfaceC5757e, obj);
            return;
        }
        InterfaceC7227e vip = c12232e.vip(obj.getClass());
        String mopub2 = vip.mopub();
        if (mopub2 == null) {
            mopub2 = String.valueOf(vip);
        }
        throw new IllegalArgumentException(AbstractC17861e.subscription("Class '", mopub2, "' is not registered for polymorphic serialization ", "in the scope of '" + interfaceC7227e.mopub() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC5372e serializer;
        InterfaceC1527e vip = AbstractC5542e.vip(interfaceC11754e);
        AbstractC1948e mopub = vip.mopub();
        AbstractC1948e abstractC1948e = (AbstractC1948e) AbstractC12517e.purchase(mopub).get("error");
        if (abstractC1948e == null) {
            serializer = C1479e.Companion.serializer();
        } else if (abstractC1948e instanceof C4030e) {
            serializer = C15748e.Companion.serializer();
        } else {
            String appmetrica = AbstractC12517e.billing(abstractC1948e).appmetrica();
            int hashCode = appmetrica.hashCode();
            if (hashCode == -632018157) {
                if (appmetrica.equals("invalid_client")) {
                    serializer = C0535e.Companion.serializer();
                }
                serializer = C11172e.Companion.serializer();
            } else if (hashCode != 96713681) {
                if (hashCode == 304348098 && appmetrica.equals("need_validation")) {
                    serializer = C11209e.Companion.serializer();
                }
                serializer = C11172e.Companion.serializer();
            } else {
                if (appmetrica.equals("need_captcha")) {
                    serializer = C11002e.Companion.serializer();
                }
                serializer = C11172e.Companion.serializer();
            }
        }
        return vip.isPro().license(serializer, mopub);
    }
}
