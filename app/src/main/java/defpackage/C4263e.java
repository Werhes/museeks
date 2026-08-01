package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٞۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4263e implements InterfaceC16566e {
    public final AbstractC1186e ad;
    public final InterfaceC3054e metrica;
    public final Map vip;

    public C4263e(AbstractC10226e abstractC10226e, Map map, InterfaceC3054e interfaceC3054e) {
        if (abstractC10226e == null) {
            vip(0);
            throw null;
        }
        if (map == null) {
            vip(1);
            throw null;
        }
        this.ad = abstractC10226e;
        this.vip = map;
        this.metrica = interfaceC3054e;
    }

    public static /* synthetic */ void vip(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // defpackage.InterfaceC16566e
    public final AbstractC1186e ad() {
        AbstractC1186e abstractC1186e = this.ad;
        if (abstractC1186e != null) {
            return abstractC1186e;
        }
        vip(3);
        throw null;
    }

    @Override // defpackage.InterfaceC16566e
    public final InterfaceC3054e adcel() {
        InterfaceC3054e interfaceC3054e = this.metrica;
        if (interfaceC3054e != null) {
            return interfaceC3054e;
        }
        vip(5);
        throw null;
    }

    @Override // defpackage.InterfaceC16566e
    public final Map advert() {
        Map map = this.vip;
        if (map != null) {
            return map;
        }
        vip(4);
        throw null;
    }

    @Override // defpackage.InterfaceC16566e
    public final C12816e mopub() {
        InterfaceC5052e license = AbstractC2876e.license(this);
        if (license != null) {
            if (C18139e.appmetrica(license)) {
                license = null;
            }
            if (license != null) {
                return AbstractC2876e.metrica(license);
            }
        }
        return null;
    }

    public final String toString() {
        return C8746e.metrica.isVip(this, null);
    }
}
