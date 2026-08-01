package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13101e implements InterfaceC5021e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C10879e f26043e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f26044e;

    public AbstractC13101e(InterfaceC11542e interfaceC11542e) {
        this.f26043e = new C10879e((C6272e) interfaceC11542e, new C3411e(1, this), new C17877e(5, this));
    }

    @Override // defpackage.InterfaceC5021e
    /* renamed from: appmetrica, reason: merged with bridge method [inline-methods] */
    public final List ad() {
        return ((C4204e) this.f26043e.invoke()).vip;
    }

    public List billing(List list) {
        return list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC5021e) && obj.hashCode() == hashCode()) {
            InterfaceC5021e interfaceC5021e = (InterfaceC5021e) obj;
            if (interfaceC5021e.getParameters().size() == getParameters().size()) {
                InterfaceC4077e advert = advert();
                InterfaceC4077e advert2 = interfaceC5021e.advert();
                if (advert2 == null || C18139e.appmetrica(advert) || AbstractC14300e.smaato(advert) || C18139e.appmetrica(advert2) || AbstractC14300e.smaato(advert2)) {
                    return false;
                }
                return purchase(advert2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f26044e;
        if (i != 0) {
            return i;
        }
        InterfaceC4077e advert = advert();
        int identityHashCode = (C18139e.appmetrica(advert) || AbstractC14300e.smaato(advert)) ? System.identityHashCode(this) : AbstractC14300e.purchase(advert).ad.hashCode();
        this.f26044e = identityHashCode;
        return identityHashCode;
    }

    public abstract C5107e license();

    public abstract AbstractC1186e metrica();

    public abstract boolean purchase(InterfaceC4077e interfaceC4077e);

    public abstract Collection vip();
}
