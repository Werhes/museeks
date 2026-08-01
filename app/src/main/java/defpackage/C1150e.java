package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ float f3725e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1050e f3726e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f3727e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C5838e f3728e;

    public C1150e(C5838e c5838e, C1050e c1050e, float f, InterfaceC3314e interfaceC3314e) {
        this.f3728e = c5838e;
        this.f3726e = c1050e;
        this.f3725e = f;
        this.f3727e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3314e interfaceC3314e = this.f3727e;
        C16801e c16801e = (C16801e) interfaceC3314e.getValue();
        float f = this.f3726e.f3537e;
        List<C1050e> list = c16801e.f32939e;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        for (C1050e c1050e : list) {
            if (c1050e.f3537e == f) {
                c1050e = new C1050e(f, this.f3725e);
            }
            arrayList.add(c1050e);
        }
        C16801e vip = C16801e.vip(c16801e, null, null, arrayList, 27);
        C13985e c13985e = C13985e.ad;
        String str = vip.f32938e;
        c13985e.getClass();
        ArrayList arrayList2 = C13985e.license;
        C5838e c5838e = this.f3728e;
        if (arrayList2 == null || !arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (AbstractC7890e.billing(((C10620e) it.next()).ad, str)) {
                    C13985e c13985e2 = C13985e.ad;
                    C10620e billing = AbstractC16982e.billing(vip);
                    c13985e2.getClass();
                    C10620e vip2 = C13985e.vip(billing);
                    AbstractC5336e.purchase(c5838e, null, 0, new C2664e(vip2, null, 3), 3);
                    vip = C16801e.vip(vip, vip2.ad, vip2.vip, null, 28);
                    break;
                }
            }
        }
        AbstractC5336e.purchase(c5838e, null, 0, new C16600e(vip, null, 1), 3);
        interfaceC3314e.setValue(vip);
        return Unit.INSTANCE;
    }
}
