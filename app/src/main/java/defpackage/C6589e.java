package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6589e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C3675e f13597e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Block f13598e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f13599e;

    public C6589e(C3675e c3675e, AbstractC15876e abstractC15876e, Catalog2Block catalog2Block) {
        this.f13599e = abstractC15876e;
        this.f13598e = catalog2Block;
        this.f13597e = c3675e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Number) obj2).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            Object obj3 = C2987e.ad;
            if (m3681throw == obj3) {
                Catalog2Block catalog2Block = this.f13598e;
                Map metrica = catalog2Block.metrica(this.f13597e);
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
                    if (next instanceof AudioStreamMix) {
                        arrayList2.add(next);
                    }
                }
                m3681throw = AbstractC8228e.license(arrayList2);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC11110e abstractC11110e = (AbstractC11110e) m3681throw;
            InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            AbstractC15876e abstractC15876e = this.f13599e;
            boolean yandex = c13770e.yandex(abstractC15876e);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == obj3) {
                m3681throw2 = new C12596e(abstractC15876e);
                c13770e.m3682throws(m3681throw2);
            }
            Function2 function2 = (Function2) m3681throw2;
            boolean yandex2 = c13770e.yandex(abstractC15876e);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex2 || m3681throw3 == obj3) {
                m3681throw3 = new C15221e(3, abstractC15876e);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC13643e.ad(abstractC11110e, function2, (Function2) m3681throw3, metrica2, c13770e, 3078);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
