package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16938e extends AbstractC13656e {
    public final Function1 vip;

    public C16938e(List list, Function1 function1) {
        super(list);
        this.vip = function1;
    }

    @Override // defpackage.AbstractC13656e
    public final AbstractC1186e ad(InterfaceC5334e interfaceC5334e) {
        InterfaceC4077e advert;
        AbstractC1186e abstractC1186e = (AbstractC1186e) this.vip.invoke(interfaceC5334e);
        if (!AbstractC13270e.isPro(abstractC1186e) && (((advert = abstractC1186e.loadAd().advert()) == null || AbstractC13270e.subscription(advert) == null) && !AbstractC13270e.premium(abstractC1186e, AbstractC0206e.f1450super.ad) && !AbstractC13270e.premium(abstractC1186e, AbstractC0206e.f1443new.ad) && !AbstractC13270e.premium(abstractC1186e, AbstractC0206e.f1449strictfp.ad))) {
            AbstractC13270e.premium(abstractC1186e, AbstractC0206e.f1445private.ad);
        }
        return abstractC1186e;
    }
}
