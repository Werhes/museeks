package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4058e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f9012e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C12339e f9013e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ long f9014e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C14307e f9015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4058e(C12339e c12339e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f9013e = c12339e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C2152e) obj2).ad;
        C4058e c4058e = new C4058e(this.f9013e, (InterfaceC5083e) obj3);
        c4058e.f9015e = (C14307e) obj;
        c4058e.f9014e = j;
        return c4058e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C14307e c14307e = this.f9015e;
        long j = this.f9014e;
        int i = this.f9012e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            this.f9015e = null;
            this.f9014e = j;
            this.f9012e = 1;
            Object metrica = this.f9013e.metrica(c14307e, j, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (metrica == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }
}
