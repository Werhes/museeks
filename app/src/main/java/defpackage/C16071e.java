package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16071e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16997e f31648e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f31649e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31650e = 0;

    public /* synthetic */ C16071e(AbstractC16997e abstractC16997e, AppActivity appActivity) {
        this.f31648e = abstractC16997e;
        this.f31649e = appActivity;
    }

    public /* synthetic */ C16071e(AppActivity appActivity, AbstractC16997e abstractC16997e) {
        this.f31649e = appActivity;
        this.f31648e = abstractC16997e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f31650e;
        AbstractC16997e abstractC16997e = this.f31648e;
        AppActivity appActivity = this.f31649e;
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC6022e.vip((C9553e) abstractC16997e.f33299e.metrica.getValue(), AbstractC16653e.license(-1387840143, new C16071e(appActivity, abstractC16997e), c13770e), c13770e, 48, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC1101e.vip(new C14815e[]{AbstractC9016e.ad.ad(appActivity), AbstractC12450e.ad.ad(abstractC16997e.f33299e), AbstractC9179e.ad.ad(abstractC16997e)}, AbstractC16653e.license(-2015309263, new C11213e(12, abstractC16997e), c13770e), c13770e, 56);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
