package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11229e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f22489e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1922e f22490e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f22491e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22492e = 1;

    public /* synthetic */ C11229e(C1922e c1922e, C0764e c0764e, InterfaceC18435e interfaceC18435e) {
        this.f22490e = c1922e;
        this.f22489e = c0764e;
        this.f22491e = interfaceC18435e;
    }

    public /* synthetic */ C11229e(InterfaceC18435e interfaceC18435e, C1922e c1922e, C0764e c0764e) {
        this.f22491e = interfaceC18435e;
        this.f22490e = c1922e;
        this.f22489e = c0764e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f22492e) {
            case 0:
                C10620e c10620e = (C10620e) obj;
                String str = c10620e.ad;
                InterfaceC3314e interfaceC3314e = this.f22489e;
                InterfaceC5083e interfaceC5083e = null;
                if (AbstractC7890e.billing(str, ((C16801e) interfaceC3314e.getValue()).f32938e)) {
                    interfaceC3314e.setValue(C16801e.vip((C16801e) interfaceC3314e.getValue(), null, c10620e.vip, null, 29));
                }
                AbstractC5336e.purchase(this.f22491e, null, 0, new C2664e(c10620e, interfaceC5083e, 1), 3);
                this.f22490e.f5117e.setValue(null);
                return Unit.INSTANCE;
            default:
                C13985e c13985e = C13985e.ad;
                InterfaceC3314e interfaceC3314e2 = this.f22489e;
                C10620e billing = AbstractC16982e.billing((C16801e) interfaceC3314e2.getValue());
                c13985e.getClass();
                C10620e ad = C10620e.ad(C13985e.vip(billing), null, (String) obj, 29);
                AbstractC5336e.purchase(this.f22491e, null, 0, new C2664e(ad, null, 2), 3);
                interfaceC3314e2.setValue(C16801e.vip((C16801e) interfaceC3314e2.getValue(), ad.ad, ad.vip, null, 28));
                this.f22490e.f5118e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
