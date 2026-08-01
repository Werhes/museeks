package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6082e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f12754e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C4581e f12755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6082e(C4581e c4581e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f12755e = c4581e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C6082e(this.f12755e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6082e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object purchase;
        int i = this.f12754e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            this.f12754e = 1;
            C18353e c18353e = C18353e.ad;
            purchase = C18353e.purchase(new C2091e(12), this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (purchase == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
            purchase = obj;
        }
        List list = (List) purchase;
        C16934e c16934e = new C16934e(this.f12755e, list);
        String pro = AbstractC14363e.pro();
        ArrayList arrayList = new ArrayList();
        c16934e.invoke(arrayList);
        Unit unit = Unit.INSTANCE;
        return new Catalog2Response(null, new Catalog2Section(pro, "Все треки", null, arrayList, null, 20), null, null, null, null, null, null, null, list, null, null, null, null, null, Collections.singletonList(new Catalog2Text("forDumb", 0, "Данный раздел является хаотичным списком треков, которые существуют в базе данных, чей порядок технически невозможен.\n\nБиблиотека в правильном порядке находится в разделе выше, который появится только после успешного завершения кеширования библиотеки.\n\nУчтите, что любые вопросы по поводу порядка в данном разделе будут игнорироваться.")), null, null, null, null, null, null, null, null, null, null, null, null, null, 536837629);
    }
}
