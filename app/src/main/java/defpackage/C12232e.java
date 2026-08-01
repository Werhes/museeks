package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C12232e {
    public InterfaceC5261e ad(C7460e c7460e) {
        return c7460e;
    }

    public String adcel(InterfaceC17282e interfaceC17282e) {
        String obj = interfaceC17282e.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public void advert(InterfaceC12635e interfaceC12635e, List list) {
        C10231e c10231e = (C10231e) interfaceC12635e;
        if (c10231e.f20236e == null) {
            c10231e.f20236e = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + c10231e + "' have already been initialized.").toString());
    }

    public InterfaceC12635e amazon(InterfaceC7227e interfaceC7227e) {
        return new C10231e(interfaceC7227e);
    }

    public InterfaceC1136e appmetrica(C17642e c17642e) {
        return c17642e;
    }

    public InterfaceC9959e billing(C12781e c12781e) {
        return c12781e;
    }

    public InterfaceC13984e license(InterfaceC13984e interfaceC13984e) {
        C5627e c5627e = (C5627e) interfaceC13984e;
        InterfaceC0861e isVip = interfaceC13984e.isVip();
        List signatures = interfaceC13984e.signatures();
        c5627e.getClass();
        return new C5627e(isVip, signatures, c5627e.f11996e | 2);
    }

    public InterfaceC7329e metrica(Class cls) {
        return new C15568e(cls);
    }

    public String mopub(AbstractC16858e abstractC16858e) {
        return adcel(abstractC16858e);
    }

    public InterfaceC0662e purchase(C13506e c13506e) {
        return c13506e;
    }

    public InterfaceC13984e smaato(InterfaceC0861e interfaceC0861e, List list, boolean z) {
        return new C5627e(interfaceC0861e, list, z ? 1 : 0);
    }

    public InterfaceC11658e startapp(C11779e c11779e) {
        return c11779e;
    }

    public InterfaceC7227e vip(Class cls) {
        return new C9985e(cls);
    }

    public InterfaceC0716e yandex(C12156e c12156e) {
        return c12156e;
    }
}
