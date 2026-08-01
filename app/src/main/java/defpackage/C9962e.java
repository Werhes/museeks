package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9962e extends AbstractC7185e implements Function2 {
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new AbstractC7185e(2, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9962e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        InputStream open = vKXApplication.getAssets().open("vkx_eq_prebuilt_vk.json");
        try {
            C8028e c8028e = AbstractC0232e.license;
            c8028e.getClass();
            List<C5766e> list = (List) AbstractC13336e.purchase(c8028e, new C13758e(C5766e.Companion.serializer(), 0), open);
            AbstractC16704e.vip(open, null);
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            for (C5766e c5766e : list) {
                String str = c5766e.ad;
                String str2 = c5766e.vip;
                List list2 = C13985e.billing;
                List list3 = c5766e.metrica;
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Double(((Number) it.next()).doubleValue() * 12.0f));
                }
                arrayList.add(new C10620e(str, str2, false, list2, arrayList2));
            }
            return arrayList;
        } finally {
        }
    }
}
