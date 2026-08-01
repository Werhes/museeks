package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3871e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6102e f8704e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8705e;

    public /* synthetic */ C3871e(AbstractC6102e abstractC6102e, int i) {
        this.f8705e = i;
        this.f8704e = abstractC6102e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC5077e interfaceC5077e;
        switch (this.f8705e) {
            case 0:
                C5015e c5015e = AbstractC10746e.ad;
                AbstractC6102e abstractC6102e = this.f8704e;
                InterfaceC17220e interfaceC17220e = (InterfaceC17220e) AbstractC10432e.vip(abstractC6102e, c5015e);
                if (!(interfaceC17220e instanceof InterfaceC17220e)) {
                    AbstractC8889e.ad("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + interfaceC17220e);
                }
                InterfaceC17220e interfaceC17220e2 = abstractC6102e.f12797e;
                InterfaceC17220e interfaceC17220e3 = interfaceC17220e;
                abstractC6102e.f12797e = interfaceC17220e3;
                if (interfaceC17220e2 != null && !AbstractC7890e.billing(interfaceC17220e3, interfaceC17220e2) && ((interfaceC5077e = abstractC6102e.f12796e) != null || !abstractC6102e.f12800e)) {
                    if (interfaceC5077e != null) {
                        abstractC6102e.m2042e(interfaceC5077e);
                    }
                    abstractC6102e.f12796e = null;
                    abstractC6102e.m2023e();
                }
                return Unit.INSTANCE;
            default:
                this.f8704e.f12804e.invoke();
                return Boolean.TRUE;
        }
    }
}
