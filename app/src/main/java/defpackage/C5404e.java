package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5404e extends C4707e {
    public final boolean advert;

    public C5404e(String str, InterfaceC12067e interfaceC12067e) {
        super(str, interfaceC12067e, 1);
        this.advert = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.C4707e
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5404e) {
            InterfaceC9998e interfaceC9998e = (InterfaceC9998e) obj;
            if (AbstractC7890e.billing(this.ad, interfaceC9998e.ad())) {
                C5404e c5404e = (C5404e) obj;
                if (c5404e.advert && Arrays.equals((InterfaceC9998e[]) this.adcel.getValue(), (InterfaceC9998e[]) c5404e.adcel.getValue())) {
                    int purchase = interfaceC9998e.purchase();
                    int i2 = this.metrica;
                    if (i2 == purchase) {
                        for (0; i < i2; i + 1) {
                            i = (AbstractC7890e.billing(adcel(i).ad(), interfaceC9998e.adcel(i).ad()) && AbstractC7890e.billing(adcel(i).appmetrica(), interfaceC9998e.adcel(i).appmetrica())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.C4707e
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.C4707e, defpackage.InterfaceC9998e
    public final boolean yandex() {
        return this.advert;
    }
}
