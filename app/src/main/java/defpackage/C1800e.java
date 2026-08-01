package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1800e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f4864e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f4865e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f4866e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4867e;

    public /* synthetic */ C1800e(Function1 function1, InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, int i) {
        this.f4867e = i;
        this.f4865e = function1;
        this.f4864e = interfaceC3314e;
        this.f4866e = interfaceC3314e2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4867e) {
            case 0:
                C0398e c0398e = (C0398e) obj;
                this.f4864e.setValue(c0398e);
                InterfaceC3314e interfaceC3314e = this.f4866e;
                boolean billing = AbstractC7890e.billing((String) interfaceC3314e.getValue(), c0398e.ad.f20850e);
                C10566e c10566e = c0398e.ad;
                interfaceC3314e.setValue(c10566e.f20850e);
                if (!billing) {
                    this.f4865e.invoke(c10566e.f20850e);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC3314e interfaceC3314e2 = this.f4864e;
                if (((C0398e) interfaceC3314e2.getValue()).ad.f20850e.length() > 0) {
                    this.f4866e.setValue(Boolean.FALSE);
                    Float yandex = AbstractC17414e.yandex(((C0398e) interfaceC3314e2.getValue()).ad.f20850e);
                    if (yandex != null) {
                        this.f4865e.invoke(yandex);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
