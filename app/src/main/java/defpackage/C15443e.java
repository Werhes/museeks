package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedList;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15443e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C3861e f30523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15443e(C3861e c3861e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f30523e = c3861e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C15443e(this.f30523e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C15443e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        C3861e c3861e = this.f30523e;
        AbstractC18491e abstractC18491e = c3861e.f21116e;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        C1841e c1841e = (C1841e) abstractC18491e;
        String str = c3861e.f8696e;
        if (str == null) {
            VKXApplication.Companion companion = VKXApplication.f36531e;
            str = VKXApplication.Companion.vip(R.string.acc_news);
        }
        C1169e license = AbstractC6874e.license();
        VKXApplication.Companion companion2 = VKXApplication.f36531e;
        license.add(new C10985e(VKXApplication.Companion.vip(R.string.acc_news), Boolean.valueOf(c3861e.f8697e == null), new C12012e(c3861e, 2)));
        List<NewsfeedList> list = c3861e.f8695e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        for (NewsfeedList newsfeedList : list) {
            String str2 = newsfeedList.vip;
            Integer num = c3861e.f8697e;
            arrayList.add(new C10985e(str2, Boolean.valueOf(num != null && num.intValue() == newsfeedList.ad), new C10869e(c3861e, newsfeedList, 14)));
        }
        license.addAll(arrayList);
        Unit unit = Unit.INSTANCE;
        C1841e.loadAd(c1841e, str, AbstractC6874e.metrica(license));
        return Unit.INSTANCE;
    }
}
