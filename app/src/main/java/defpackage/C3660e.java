package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕ۟ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3660e extends AbstractC16858e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f8238e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f8239e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f8240e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3660e(Object obj, Object obj2, int i) {
        super(2);
        this.f8239e = i;
        this.f8238e = obj;
        this.f8240e = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8239e;
        Object obj3 = this.f8240e;
        Object obj4 = this.f8238e;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                C6071e c6071e = (C6071e) obj2;
                ViewOnAttachStateChangeListenerC5346e viewOnAttachStateChangeListenerC5346e = (ViewOnAttachStateChangeListenerC5346e) obj3;
                if (!((C8929e) obj4).vip.metrica(c6071e.purchase)) {
                    viewOnAttachStateChangeListenerC5346e.startapp(intValue, c6071e);
                    viewOnAttachStateChangeListenerC5346e.f11464e.amazon(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj4;
                interfaceC3314e.setValue(C15036e.ad((C15036e) interfaceC3314e.getValue(), 0.0f, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), 0.0f, 9));
                ((Function1) ((InterfaceC3314e) obj3).getValue()).invoke(interfaceC3314e.getValue());
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Boolean bool = (Boolean) ((C5017e) obj4).billing.getValue();
                    boolean booleanValue = bool.booleanValue();
                    Function2 function2 = (Function2) obj3;
                    c13770e.m3683transient(bool);
                    boolean billing = c13770e.billing(booleanValue);
                    if (booleanValue) {
                        function2.invoke(c13770e, 0);
                    } else {
                        if (c13770e.advert != 0) {
                            AbstractC1889e.ad("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!c13770e.f27292implements) {
                            if (billing) {
                                C0690e c0690e = c13770e.f27293interface;
                                int i2 = c0690e.billing;
                                int i3 = c0690e.yandex;
                                C18143e c18143e = c13770e.f27299while;
                                c18143e.getClass();
                                c18143e.license(false);
                                c18143e.vip.metrica.adcel(C10352e.license);
                                AbstractC4224e.ad(i2, i3, c13770e.remoteconfig);
                                c13770e.f27293interface.pro();
                            } else {
                                c13770e.m3653abstract();
                            }
                        }
                    }
                    if (c13770e.isPro && c13770e.f27293interface.startapp == c13770e.applovin) {
                        c13770e.applovin = -1;
                        c13770e.isPro = false;
                    }
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC14576e interfaceC14576e = (InterfaceC14576e) obj;
                C16446e c16446e = (C16446e) obj2;
                AbstractC17732e abstractC17732e = (AbstractC17732e) obj4;
                C13915e c13915e = abstractC17732e.f34782e;
                if (c13915e.m3724throw()) {
                    abstractC17732e.f34798e = interfaceC14576e;
                    abstractC17732e.f34783e = c16446e;
                    C15087e snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC10501e.ad(c13915e)).getSnapshotObserver();
                    C10122e c10122e = AbstractC17732e.f34770e;
                    snapshotObserver.ad.metrica(abstractC17732e, C8082e.f16399e, (C13479e) obj3);
                    abstractC17732e.f34775e = false;
                } else {
                    abstractC17732e.f34775e = true;
                }
                return Unit.INSTANCE;
        }
    }
}
