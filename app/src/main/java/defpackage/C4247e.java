package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4247e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f9319e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f9320e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9321e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f9322e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ float f9323e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ long f9324e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ C14307e f9325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4247e(boolean z, float f, InterfaceC3314e interfaceC3314e, InterfaceC16132e interfaceC16132e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f9321e = z;
        this.f9323e = f;
        this.f9320e = interfaceC3314e;
        this.f9322e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C2152e) obj2).ad;
        InterfaceC3314e interfaceC3314e = this.f9320e;
        InterfaceC16132e interfaceC16132e = this.f9322e;
        C4247e c4247e = new C4247e(this.f9321e, this.f9323e, interfaceC3314e, interfaceC16132e, (InterfaceC5083e) obj3);
        c4247e.f9325e = (C14307e) obj;
        c4247e.f9324e = j;
        return c4247e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        float intBitsToFloat;
        int i = this.f9319e;
        InterfaceC3314e interfaceC3314e = this.f9320e;
        try {
            if (i == 0) {
                AbstractC2003e.purchase(obj);
                C14307e c14307e = this.f9325e;
                long j = this.f9324e;
                if (this.f9321e) {
                    intBitsToFloat = this.f9323e - Float.intBitsToFloat((int) (j >> 32));
                } else {
                    intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                }
                interfaceC3314e.setValue(new Float(intBitsToFloat - ((Number) this.f9322e.getValue()).floatValue()));
                this.f9319e = 1;
                Object ad = c14307e.ad(this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (ad == enumC2821e) {
                    return enumC2821e;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
            }
        } catch (C6468e unused) {
            interfaceC3314e.setValue(new Float(0.0f));
        }
        return Unit.INSTANCE;
    }
}
