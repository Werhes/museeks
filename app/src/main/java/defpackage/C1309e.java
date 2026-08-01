package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1309e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ CustomCatalogBlockItem f4027e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4028e;

    public /* synthetic */ C1309e(CustomCatalogBlockItem customCatalogBlockItem, int i) {
        this.f4028e = i;
        this.f4027e = customCatalogBlockItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4028e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC0865e.ad(AbstractC18007e.startapp(C0115e.f1276e, 48), ((C7019e) c13770e.adcel(c15492e)).metrica.vip, AbstractC12322e.vip(C3618e.vip(0.25f, ((C7019e) c13770e.adcel(c15492e)).ad.ad), ((C7019e) c13770e.adcel(c15492e)).ad.ad, 0L, 0L, c13770e, 0, 12), null, null, AbstractC16653e.license(-23302180, new C6599e(1, this.f4027e), c13770e), c13770e, 196614, 24);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14489e.vip(this.f4027e.ad, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC6022e.vip(null, AbstractC16653e.license(1147803484, new C1309e(this.f4027e, 3), c13770e3), c13770e3, 48, 1);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    CustomCatalogBlockItem customCatalogBlockItem = this.f4027e;
                    boolean yandex = c13770e4.yandex(customCatalogBlockItem);
                    Object m3681throw = c13770e4.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C13465e(1, customCatalogBlockItem);
                        c13770e4.m3682throws(m3681throw);
                    }
                    AbstractC11463e.admob(customCatalogBlockItem, (Function0) m3681throw, c13770e4, 0);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
