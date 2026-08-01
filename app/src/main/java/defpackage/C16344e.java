package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16344e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f32111e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14398e f32112e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f32113e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ List f32114e;

    public C16344e(List list, C14398e c14398e, long j, InterfaceC3314e interfaceC3314e) {
        this.f32114e = list;
        this.f32112e = c14398e;
        this.f32111e = j;
        this.f32113e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18055e c18055e = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            C3138e c3138e = (C3138e) this.f32114e.get(intValue);
            c13770e.m3676strictfp(-819231196);
            boolean booleanValue = ((Boolean) c3138e.appmetrica.invoke((C6442e) this.f32113e.getValue())).booleanValue();
            int i2 = c3138e.ad;
            int i3 = c3138e.vip;
            int i4 = c3138e.metrica;
            InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2), 1.0f);
            C15492e c15492e = AbstractC11785e.ad;
            InterfaceC12864e metrica2 = AbstractC16136e.metrica(AbstractC9546e.license(AbstractC12447e.vip(metrica, ((C7019e) c13770e.adcel(c15492e)).metrica.license), false, null, c3138e.license, 15), ((C7019e) c13770e.adcel(c15492e)).ad.subscription, AbstractC10432e.ad);
            long j = this.f32111e;
            boolean appmetrica = c13770e.appmetrica(j) | c13770e.billing(booleanValue);
            Object m3681throw = c13770e.m3681throw();
            if (appmetrica || m3681throw == C2987e.ad) {
                m3681throw = new C6133e(j, booleanValue);
                c13770e.m3682throws(m3681throw);
            }
            this.f32112e.m3793private(i2, i3, i4, booleanValue, AbstractC5750e.license(metrica2, (Function1) m3681throw), c13770e, 0);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
