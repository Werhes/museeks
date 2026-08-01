package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13894e {
    public static final LinkedHashSet ad;
    public static final C11709e vip;

    static {
        List<C12816e> startapp = AbstractC6874e.startapp(AbstractC15262e.ad, AbstractC15262e.yandex, AbstractC15262e.startapp, AbstractC15262e.metrica, AbstractC15262e.license, AbstractC15262e.purchase);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C12816e c12816e : startapp) {
            linkedHashSet.add(new C11709e(c12816e.vip(), c12816e.ad.billing()));
        }
        ad = linkedHashSet;
        C12816e c12816e2 = AbstractC15262e.billing;
        vip = new C11709e(c12816e2.vip(), c12816e2.ad.billing());
    }
}
