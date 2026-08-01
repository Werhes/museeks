package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۤٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2202e extends AbstractC13345e {
    public final Class ad;
    public final C16911e license;
    public final Enum[] metrica;
    public final String[] vip;

    public C2202e(Class cls) {
        this.ad = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.metrica = enumArr;
            this.vip = new String[enumArr.length];
            int i = 0;
            while (true) {
                Enum[] enumArr2 = this.metrica;
                if (i >= enumArr2.length) {
                    this.license = C16911e.firebase(this.vip);
                    return;
                }
                String name = enumArr2[i].name();
                String[] strArr = this.vip;
                Field field = cls.getField(name);
                Set set = AbstractC7644e.ad;
                InterfaceC7685e interfaceC7685e = (InterfaceC7685e) field.getAnnotation(InterfaceC7685e.class);
                if (interfaceC7685e != null) {
                    String name2 = interfaceC7685e.name();
                    if (!"\u0000".equals(name2)) {
                        name = name2;
                    }
                }
                strArr[i] = name;
                i++;
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        abstractC3442e.ads(this.vip[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.ad.getName() + ")";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        int mo2316protected = abstractC17080e.mo2316protected(this.license);
        if (mo2316protected != -1) {
            return this.metrica[mo2316protected];
        }
        String loadAd = abstractC17080e.loadAd();
        throw new C14803e("Expected one of " + Arrays.asList(this.vip) + " but was " + abstractC17080e.subs() + " at path " + loadAd, 8, (byte) 0);
    }
}
