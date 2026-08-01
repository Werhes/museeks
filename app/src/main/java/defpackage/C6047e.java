package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۥۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6047e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C16869e f12719e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6047e(C16869e c16869e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f12719e = c16869e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C6047e(this.f12719e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6047e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        C5363e c5363e = AbstractC16696e.ad;
        AbstractC16696e purchase = AbstractC16268e.purchase();
        boolean z = purchase instanceof C17770e;
        C16869e c16869e = this.f12719e;
        C6571e ads = z ? AbstractC11815e.ads(c16869e.pro(), ((C17770e) purchase).vip().getAbsolutePath()) : AbstractC11815e.subs(c16869e.pro());
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Context applicationContext = vKXApplication.getApplicationContext();
        String str = C10675e.f21023e;
        return new C16579e(ads, AbstractC12322e.startapp(C10215e.purchase(applicationContext.getCacheDir())) + AbstractC12322e.startapp(C10215e.purchase(applicationContext.getDir("artworkCache", 0))), AbstractC12322e.startapp(C10215e.purchase(AbstractC16268e.purchase().vip())), ((List) AbstractC16696e.ad.getValue()).size() > 1, AbstractC16268e.purchase().ad() == 0 ? R.string.storage_external : R.string.storage_internal);
    }
}
