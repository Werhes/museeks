package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public final class appmetrica extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f625e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C12718e f626e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11062e f627e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Iterator f628e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C10675e f629e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public appmetrica(C10675e c10675e, AbstractC11062e abstractC11062e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f629e = c10675e;
        this.f627e = abstractC11062e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        appmetrica appmetricaVar = new appmetrica(this.f629e, this.f627e, interfaceC5083e);
        appmetricaVar.f630e = obj;
        return appmetricaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((appmetrica) advert((InterfaceC5083e) obj2, (C4300e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C12718e c12718e;
        Iterator it;
        C4300e c4300e;
        int i = this.f625e;
        AbstractC11062e abstractC11062e = this.f627e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C4300e c4300e2 = (C4300e) this.f630e;
            C12718e c12718e2 = new C12718e();
            C10675e c10675e = this.f629e;
            c12718e2.addLast(c10675e);
            c12718e = c12718e2;
            it = abstractC11062e.inmobi(c10675e).iterator();
            c4300e = c4300e2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f628e;
            C12718e c12718e3 = this.f626e;
            C4300e c4300e3 = (C4300e) this.f630e;
            AbstractC2003e.purchase(obj);
            c12718e = c12718e3;
            c4300e = c4300e3;
        }
        while (it.hasNext()) {
            C10675e c10675e2 = (C10675e) it.next();
            this.f630e = c4300e;
            this.f626e = c12718e;
            this.f628e = it;
            this.f625e = 1;
            Object metrica = AbstractC5097e.metrica(c4300e, abstractC11062e, c12718e, c10675e2, false, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (metrica == enumC2821e) {
                return enumC2821e;
            }
        }
        return Unit.INSTANCE;
    }
}
