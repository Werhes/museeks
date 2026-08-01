package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f2458e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3675e f2459e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Block f2460e;

    public C0411e(C3675e c3675e, AbstractC15876e abstractC15876e, Catalog2Block catalog2Block) {
        this.f2460e = catalog2Block;
        this.f2459e = c3675e;
        this.f2458e = abstractC15876e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Number) obj2).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            C3675e c3675e = this.f2459e;
            if (m3681throw == c5170e) {
                Catalog2Block catalog2Block = this.f2460e;
                Map metrica = catalog2Block.metrica(c3675e);
                List appmetrica = catalog2Block.appmetrica();
                ArrayList arrayList = new ArrayList();
                Iterator it = appmetrica.iterator();
                while (it.hasNext()) {
                    InterfaceC15377e interfaceC15377e = (InterfaceC15377e) metrica.get((String) it.next());
                    if (interfaceC15377e != null) {
                        arrayList.add(interfaceC15377e);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof AudioContentCard) {
                        arrayList2.add(next);
                    }
                }
                m3681throw = AbstractC8228e.license(arrayList2);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC2467e.ad((AbstractC11110e) m3681throw, AbstractC18007e.metrica(C0115e.f1276e, 1.0f), AbstractC16653e.license(-2061340936, new C1616e(c3675e, this.f2458e, 1), c13770e), c13770e, 440, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
