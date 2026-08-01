package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7977e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16152e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f16153e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ long f16154e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f16155e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7977e(long j, Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16152e = i;
        this.f16154e = j;
        this.f16153e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7977e(C11268e c11268e, long j, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f16152e = 6;
        this.f16153e = c11268e;
        this.f16154e = j;
        this.f16155e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7977e(Object obj, long j, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16152e = i;
        this.f16153e = obj;
        this.f16154e = j;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16152e) {
            case 0:
                return new C7977e((AbstractC9936e) this.f16153e, this.f16154e, interfaceC5083e, 0);
            case 1:
                return new C7977e(this.f16154e, (C4760e) this.f16153e, interfaceC5083e, 1);
            case 2:
                return new C7977e((C10743e) this.f16153e, this.f16154e, interfaceC5083e, 2);
            case 3:
                return new C7977e((C7558e) this.f16153e, this.f16154e, interfaceC5083e, 3);
            case 4:
                return new C7977e(this.f16154e, (C14718e) this.f16153e, interfaceC5083e, 4);
            case 5:
                return new C7977e((C11242e) this.f16153e, this.f16154e, interfaceC5083e, 5);
            case 6:
                return new C7977e((C11268e) this.f16153e, this.f16154e, this.f16155e, interfaceC5083e);
            default:
                return new C7977e(this.f16154e, (C2243e) this.f16153e, interfaceC5083e, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f16152e) {
            case 0:
                return ((C7977e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C7977e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C7977e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C7977e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C7977e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C7977e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C7977e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7977e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0139  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7977e.loadAd(java.lang.Object):java.lang.Object");
    }
}
