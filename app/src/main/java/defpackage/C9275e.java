package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9275e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f18487e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C0063e f18488e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C18464e f18489e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C8419e f18490e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C14918e f18491e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f18492e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f18493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9275e(boolean z, C18464e c18464e, C14918e c14918e, C0063e c0063e, C8419e c8419e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f18492e = z;
        this.f18489e = c18464e;
        this.f18491e = c14918e;
        this.f18488e = c0063e;
        this.f18490e = c8419e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C9275e c9275e = new C9275e(this.f18492e, this.f18489e, this.f18491e, this.f18488e, this.f18490e, interfaceC5083e);
        c9275e.f18493e = obj;
        return c9275e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9275e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f18487e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            if (this.f18492e) {
                String str = C10675e.f21023e;
                C5363e c5363e = AbstractC16696e.ad;
                C10675e purchase = C10215e.purchase(AbstractC16268e.purchase().vip());
                C10675e purchase2 = C10215e.purchase(AbstractC16268e.purchase().metrica());
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                C10675e appmetrica = C10215e.purchase(vKXApplication.getFilesDir()).appmetrica("vkx_main");
                VKXApplication vKXApplication2 = VKXApplication.f36528e;
                if (vKXApplication2 == null) {
                    vKXApplication2 = null;
                }
                C10675e appmetrica2 = C10215e.purchase(vKXApplication2.getFilesDir()).appmetrica("vkx_main_cdcm");
                C18511e c18511e = AbstractC11062e.f21949e;
                c18511e.Signature(purchase);
                c18511e.license(purchase2, purchase);
                c18511e.loadAd(appmetrica, false);
                c18511e.license(appmetrica2, appmetrica);
            } else {
                C18511e c18511e2 = AbstractC11062e.f21949e;
                String str2 = C10675e.f21023e;
                C5363e c5363e2 = AbstractC16696e.ad;
                c18511e2.Signature(C10215e.purchase(AbstractC16268e.purchase().metrica()));
                VKXApplication vKXApplication3 = VKXApplication.f36528e;
                if (vKXApplication3 == null) {
                    vKXApplication3 = null;
                }
                c18511e2.loadAd(C10215e.purchase(vKXApplication3.getFilesDir()).appmetrica("vkx_main_cdcm"), false);
            }
            C1615e c1615e = (C1615e) this.f18489e.f36194e;
            C4199e c4199e = new C4199e(this.f18491e);
            c1615e.getClass();
            c1615e.smaato(null, c4199e);
            this.f18493e = null;
            this.f18487e = 1;
            Object invoke = this.f18488e.invoke(this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (invoke == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        this.f18490e.Signature(null);
        return Unit.INSTANCE;
    }
}
