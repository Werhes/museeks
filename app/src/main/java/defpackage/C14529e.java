package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14529e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C11950e f28725e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ long f28726e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C11950e f28727e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f28728e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C7142e f28729e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ Object f28730e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f28731e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C7142e f28732e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14529e(C11950e c11950e, C7142e c7142e, long j, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f28727e = c11950e;
        this.f28729e = c7142e;
        this.f28726e = j;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C14529e c14529e = new C14529e(this.f28727e, this.f28729e, this.f28726e, interfaceC5083e);
        c14529e.f28730e = obj;
        return c14529e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C14529e) advert((InterfaceC5083e) obj2, (C3593e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C11950e c11950e;
        C7142e c7142e;
        long j;
        C11950e c11950e2;
        int i = this.f28728e;
        EnumC17426e enumC17426e = EnumC17426e.f34145e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            c11950e = this.f28727e;
            C2407e c2407e = new C2407e(c11950e, (C3593e) this.f28730e, 1);
            InterfaceC8642e interfaceC8642e = c11950e.metrica;
            C7142e c7142e2 = this.f28729e;
            long j2 = c7142e2.f14622e;
            EnumC17426e enumC17426e2 = c11950e.license;
            long j3 = this.f28726e;
            float license = c11950e.license(enumC17426e2 == enumC17426e ? C11422e.vip(j3) : C11422e.metrica(j3));
            this.f28730e = c11950e;
            this.f28725e = c11950e;
            this.f28732e = c7142e2;
            this.f28731e = j2;
            this.f28728e = 1;
            obj = interfaceC8642e.ad(c2407e, license, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
            c7142e = c7142e2;
            j = j2;
            c11950e2 = c11950e;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f28731e;
            c7142e = this.f28732e;
            c11950e = this.f28725e;
            c11950e2 = (C11950e) this.f28730e;
            AbstractC2003e.purchase(obj);
        }
        float license2 = c11950e2.license(((Number) obj).floatValue());
        c7142e.f14622e = c11950e.license == enumC17426e ? C11422e.ad(j, license2, 0.0f, 2) : C11422e.ad(j, 0.0f, license2, 1);
        return Unit.INSTANCE;
    }
}
