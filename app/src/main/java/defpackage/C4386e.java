package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۛۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4386e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long[] f9558e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C5143e f9559e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C5143e f9560e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f9561e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C15243e f9562e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C15243e f9563e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f9564e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f9565e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4386e(C15243e c15243e, C5143e c5143e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f9563e = c15243e;
        this.f9560e = c5143e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C4386e c4386e = new C4386e(this.f9563e, this.f9560e, interfaceC5083e);
        c4386e.f9561e = obj;
        return c4386e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4386e) advert((InterfaceC5083e) obj2, (C4300e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C4300e c4300e;
        C15243e c15243e;
        long[] jArr;
        int i;
        C5143e c5143e;
        int i2 = this.f9564e;
        if (i2 == 0) {
            AbstractC2003e.purchase(obj);
            c4300e = (C4300e) this.f9561e;
            c15243e = this.f9563e;
            C5896e c5896e = c15243e.f30161e;
            jArr = c5896e.metrica;
            i = c5896e.appmetrica;
            c5143e = this.f9560e;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f9565e;
            jArr = this.f9558e;
            c15243e = this.f9562e;
            c5143e = this.f9559e;
            c4300e = (C4300e) this.f9561e;
            AbstractC2003e.purchase(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.INSTANCE;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        c5143e.f11023e = i;
        Object obj2 = c15243e.f30161e.vip[i];
        this.f9561e = c4300e;
        this.f9559e = c5143e;
        this.f9562e = c15243e;
        this.f9558e = jArr;
        this.f9565e = i3;
        this.f9564e = 1;
        c4300e.metrica(this, obj2);
        return EnumC2821e.f6782e;
    }
}
