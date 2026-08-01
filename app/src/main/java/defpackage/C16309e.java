package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16309e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f32053e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f32054e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f32055e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f32056e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32057e;

    public /* synthetic */ C16309e(long j, Object obj, Function2 function2, int i, int i2) {
        this.f32057e = i2;
        this.f32055e = j;
        this.f32056e = obj;
        this.f32053e = function2;
        this.f32054e = i;
    }

    public /* synthetic */ C16309e(C14873e c14873e, long j, C8583e c8583e, int i) {
        this.f32057e = 0;
        this.f32056e = c14873e;
        this.f32055e = j;
        this.f32053e = c8583e;
        this.f32054e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32057e) {
            case 0:
                ((Integer) obj2).intValue();
                ((C14873e) this.f32056e).m3878import(this.f32055e, (C8583e) this.f32053e, (C13770e) obj, AbstractC5190e.advert(this.f32054e | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC14753e.ad(this.f32055e, (C1839e) this.f32056e, (C2892e) this.f32053e, (C13770e) obj, AbstractC5190e.advert(this.f32054e | 1));
                return Unit.INSTANCE;
            default:
                InterfaceC3997e interfaceC3997e = (InterfaceC3997e) this.f32056e;
                Function2 function2 = (Function2) this.f32053e;
                ((Integer) obj2).getClass();
                AbstractC5418e.vip(AbstractC5190e.advert(this.f32054e | 1), this.f32055e, (C13770e) obj, interfaceC3997e, function2);
                return Unit.INSTANCE;
        }
    }
}
