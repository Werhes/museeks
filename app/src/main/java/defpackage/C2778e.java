package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2778e extends AbstractC15049e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ crashlytics f6695e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f6696e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ C17195e f6697e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2778e(crashlytics crashlyticsVar, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f6695e = crashlyticsVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2778e c2778e = new C2778e(this.f6695e, (InterfaceC5083e) obj3);
        c2778e.f6697e = (C17195e) obj;
        return c2778e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        crashlytics crashlyticsVar = this.f6695e;
        AbstractC8712e abstractC8712e = (AbstractC8712e) crashlyticsVar.f1119e;
        C17195e c17195e = this.f6697e;
        int i = this.f6696e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            byte isVip = abstractC8712e.isVip();
            if (isVip == 1) {
                return crashlyticsVar.subs(true);
            }
            if (isVip == 0) {
                return crashlyticsVar.subs(false);
            }
            if (isVip != 6) {
                if (isVip == 8) {
                    return crashlyticsVar.isVip();
                }
                AbstractC8712e.admob(abstractC8712e, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f6697e = null;
            this.f6696e = 1;
            obj = crashlytics.license(crashlyticsVar, c17195e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return (AbstractC1948e) obj;
    }
}
