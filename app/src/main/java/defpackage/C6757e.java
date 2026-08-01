package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6757e extends C12232e {
    public static AbstractC15529e loadAd(AbstractC3160e abstractC3160e) {
        InterfaceC7329e amazon = abstractC3160e.amazon();
        return amazon instanceof AbstractC15529e ? (AbstractC15529e) amazon : C12292e.f24664e;
    }

    @Override // defpackage.C12232e
    public final InterfaceC5261e ad(C7460e c7460e) {
        return new C10208e(loadAd(c7460e), c7460e.f7267e, c7460e.f7264e, null, c7460e.f7266e);
    }

    @Override // defpackage.C12232e
    public final String adcel(InterfaceC17282e interfaceC17282e) {
        Metadata metadata = (Metadata) interfaceC17282e.getClass().getAnnotation(Metadata.class);
        C10208e c10208e = null;
        if (metadata != null) {
            String[] d1 = metadata.d1();
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                C6571e billing = C13814e.billing(d1, metadata.d2());
                C6746e c6746e = (C6746e) billing.f13544e;
                C9920e c9920e = (C9920e) billing.f13543e;
                c10208e = new C10208e(C12292e.f24664e, (C1117e) AbstractC5965e.license(interfaceC17282e.getClass(), c9920e, c6746e, new C17221e(c9920e.f19591e), new C16308e(metadata.mv(), (metadata.xi() & 8) != 0), C8951e.f17967e));
            }
        }
        if (c10208e == null) {
            return super.adcel(interfaceC17282e);
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC8960e startapp = AbstractC2803e.startapp(c10208e);
        if (startapp != null) {
            sb.append(C1400e.m597class(((C2299e) startapp).advert(), false));
            sb.append(".");
        }
        AbstractC13480e.m3610while(AbstractC2803e.mopub(c10208e), sb, ", ", "(", ")", C8865e.f17810e, 48);
        sb.append(" -> ");
        sb.append(C1400e.m597class(c10208e.inmobi(), false));
        return sb.toString();
    }

    @Override // defpackage.C12232e
    public final void advert(InterfaceC12635e interfaceC12635e, List list) {
    }

    @Override // defpackage.C12232e
    public final InterfaceC12635e amazon(InterfaceC7227e interfaceC7227e) {
        List<InterfaceC12635e> typeParameters;
        if (AbstractC0869e.premium(interfaceC7227e)) {
            typeParameters = interfaceC7227e.getTypeParameters();
        } else {
            if (!(interfaceC7227e instanceof InterfaceC15954e)) {
                throw new IllegalArgumentException("Type parameter container must be a class or a callable: " + interfaceC7227e);
            }
            typeParameters = ((InterfaceC15954e) interfaceC7227e).getTypeParameters();
        }
        for (InterfaceC12635e interfaceC12635e : typeParameters) {
            if (interfaceC12635e.getName().equals("PluginConfigT")) {
                return interfaceC12635e;
            }
        }
        throw new IllegalArgumentException("Type parameter PluginConfigT is not found in container: " + interfaceC7227e);
    }

    @Override // defpackage.C12232e
    public final InterfaceC1136e appmetrica(C17642e c17642e) {
        return new C12641e(loadAd(c17642e), c17642e.f7267e, c17642e.f7264e, c17642e.f7266e);
    }

    @Override // defpackage.C12232e
    public final InterfaceC9959e billing(C12781e c12781e) {
        return new C5785e(loadAd(c12781e), c12781e.f7267e, c12781e.f7264e, c12781e.f7266e);
    }

    @Override // defpackage.C12232e
    public final InterfaceC13984e license(InterfaceC13984e interfaceC13984e) {
        String license;
        if (!AbstractC17749e.ad) {
            C14377e c14377e = (C14377e) interfaceC13984e;
            InterfaceC0861e interfaceC0861e = c14377e.f28436e;
            InterfaceC7227e interfaceC7227e = interfaceC0861e instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC0861e : null;
            if (interfaceC7227e == null || (license = interfaceC7227e.license()) == null) {
                throw new Error("Non-class type cannot be a mutable collection type: " + interfaceC13984e);
            }
            String str = C0696e.ad;
            C12816e yandex = C0696e.yandex(new C13579e(license));
            if (yandex != null) {
                return new C14377e(c14377e.f28436e, c14377e.f28434e, c14377e.f28438e, c14377e.f28433e, c14377e.f28441e, c14377e.f28440e, c14377e.f28437e, c14377e.f28439e, AbstractC2728e.purchase(yandex, (InterfaceC7227e) interfaceC0861e), null);
            }
            throw new IllegalArgumentException("Not a readonly collection: " + interfaceC13984e);
        }
        AbstractC1186e abstractC1186e = ((C12011e) interfaceC13984e).f24023e;
        if (!(abstractC1186e instanceof AbstractC10226e)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + interfaceC13984e).toString());
        }
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        InterfaceC5052e interfaceC5052e = advert instanceof InterfaceC5052e ? (InterfaceC5052e) advert : null;
        if (interfaceC5052e == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + interfaceC13984e);
        }
        AbstractC10226e abstractC10226e = (AbstractC10226e) abstractC1186e;
        String str2 = C0696e.ad;
        int i = AbstractC2876e.ad;
        C12816e yandex2 = C0696e.yandex(AbstractC14300e.purchase(interfaceC5052e));
        if (yandex2 != null) {
            return new C12011e(AbstractC1596e.license(abstractC10226e.smaato(), AbstractC2876e.appmetrica(interfaceC5052e).adcel(yandex2).mo1459goto(), abstractC10226e.mopub(), abstractC10226e.Signature()));
        }
        throw new IllegalArgumentException("Not a readonly collection: " + interfaceC5052e);
    }

    @Override // defpackage.C12232e
    public final InterfaceC7329e metrica(Class cls) {
        return (InterfaceC7329e) AbstractC9852e.vip.signatures(cls);
    }

    @Override // defpackage.C12232e
    public final String mopub(AbstractC16858e abstractC16858e) {
        return adcel(abstractC16858e);
    }

    @Override // defpackage.C12232e
    public final InterfaceC0662e purchase(C13506e c13506e) {
        return new C14657e(loadAd(c13506e), c13506e.f7267e, c13506e.f7264e, c13506e.f7266e);
    }

    @Override // defpackage.C12232e
    public final InterfaceC13984e smaato(InterfaceC0861e interfaceC0861e, List list, boolean z) {
        if (!(interfaceC0861e instanceof InterfaceC18155e)) {
            return AbstractC14436e.license(interfaceC0861e, list, z, Collections.EMPTY_LIST, null);
        }
        Class subs = ((InterfaceC18155e) interfaceC0861e).subs();
        C16911e c16911e = AbstractC9852e.ad;
        if (list.isEmpty()) {
            return z ? (InterfaceC13984e) AbstractC9852e.license.signatures(subs) : (InterfaceC13984e) AbstractC9852e.metrica.signatures(subs);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC9852e.appmetrica.signatures(subs);
        C6571e c6571e = new C6571e(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(c6571e);
        if (obj == null) {
            AbstractC8761e license = AbstractC14436e.license((C8404e) AbstractC9852e.ad.signatures(subs), list, z, C13664e.f27089e, null);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(c6571e, license);
            obj = putIfAbsent == null ? license : putIfAbsent;
        }
        return (InterfaceC13984e) obj;
    }

    @Override // defpackage.C12232e
    public final InterfaceC11658e startapp(C11779e c11779e) {
        return new C8333e(loadAd(c11779e), c11779e.f7267e, c11779e.f7264e);
    }

    @Override // defpackage.C12232e
    public final InterfaceC7227e vip(Class cls) {
        return (C8404e) AbstractC9852e.ad.signatures(cls);
    }

    @Override // defpackage.C12232e
    public final InterfaceC0716e yandex(C12156e c12156e) {
        return new C7565e(loadAd(c12156e), c12156e.f7267e, c12156e.f7264e, c12156e.f7266e);
    }
}
