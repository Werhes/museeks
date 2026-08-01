package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٞۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13408e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5397e f26661e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26662e;

    public /* synthetic */ C13408e(AbstractC5397e abstractC5397e, int i) {
        this.f26662e = i;
        this.f26661e = abstractC5397e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC6459e interfaceC6459e = (InterfaceC6459e) obj;
        switch (this.f26662e) {
            case 0:
                AbstractC5397e abstractC5397e = (AbstractC5397e) interfaceC6459e;
                InterfaceC11968e interfaceC11968e = this.f26661e.f11558e;
                if (!AbstractC7890e.billing(abstractC5397e.f11557e, interfaceC11968e)) {
                    abstractC5397e.f11557e = interfaceC11968e;
                    abstractC5397e.mo1899e();
                }
                return EnumC9253e.f18466e;
            default:
                this.f26661e.f11557e = ((AbstractC5397e) interfaceC6459e).f11558e;
                return Boolean.FALSE;
        }
    }
}
