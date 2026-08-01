package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C16747e f4004e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f4005e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C9260e f4006e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C7558e f4007e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ long f4008e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f4009e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f4010e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C9302e f4011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1297e(C7558e c7558e, Object obj, C9260e c9260e, long j, Function1 function1, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f4007e = c7558e;
        this.f4009e = obj;
        this.f4006e = c9260e;
        this.f4008e = j;
        this.f4005e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1297e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [eٍؚؔ, java.lang.Object] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C16747e c16747e;
        C9302e c9302e;
        C9260e c9260e = this.f4006e;
        C7558e c7558e = this.f4007e;
        C16747e c16747e2 = c7558e.metrica;
        int i = this.f4010e;
        int i2 = 1;
        try {
            if (i == 0) {
                AbstractC2003e.purchase(obj);
                c16747e2.f32834e = (AbstractC3424e) c7558e.ad.ad.invoke(this.f4009e);
                c7558e.appmetrica.setValue(c9260e.metrica);
                c7558e.license.setValue(Boolean.TRUE);
                C16747e c16747e3 = new C16747e(c16747e2.f32837e, c16747e2.f32835e.getValue(), AbstractC12246e.metrica(c16747e2.f32834e), c16747e2.f32836e, Long.MIN_VALUE, c16747e2.f32838e);
                ?? obj2 = new Object();
                long j = this.f4008e;
                C17819e c17819e = new C17819e(c7558e, c16747e3, this.f4005e, (Object) obj2, 1);
                this.f4004e = c16747e3;
                this.f4011e = obj2;
                this.f4010e = 1;
                Object metrica = AbstractC7844e.metrica(c16747e3, c9260e, j, c17819e, this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (metrica == enumC2821e) {
                    return enumC2821e;
                }
                c16747e = c16747e3;
                c9302e = obj2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c9302e = this.f4011e;
                c16747e = this.f4004e;
                AbstractC2003e.purchase(obj);
            }
            if (!c9302e.f18534e) {
                i2 = 2;
            }
            C7558e.ad(c7558e);
            return new C16365e(i2, c16747e);
        } catch (CancellationException e) {
            C7558e.ad(c7558e);
            throw e;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C1297e(this.f4007e, this.f4009e, this.f4006e, this.f4008e, this.f4005e, interfaceC5083e);
    }
}
