package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٛؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8043e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16338e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f16339e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f16340e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f16341e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public InterfaceC3314e f16342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8043e(InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16338e = i;
        this.f16339e = interfaceC3314e;
        this.f16340e = interfaceC3314e2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16338e) {
            case 0:
                return new C8043e(this.f16339e, this.f16340e, interfaceC5083e, 0);
            default:
                return new C8043e(this.f16339e, this.f16340e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f16338e) {
            case 0:
                return ((C8043e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C8043e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object c12763e;
        Object c12763e2;
        long j;
        int i = this.f16338e;
        InterfaceC3314e interfaceC3314e = this.f16340e;
        InterfaceC3314e interfaceC3314e2 = this.f16339e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f16341e;
                try {
                } catch (Throwable th) {
                    c12763e = new C12763e(th);
                }
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (!AbstractC0933e.ad) {
                        int i3 = C9326e.f18571new;
                        Bitmap bitmap = (Bitmap) interfaceC3314e2.getValue();
                        if (bitmap != null) {
                            C1188e c1188e = C0896e.appmetrica;
                            this.f16342e = interfaceC3314e;
                            this.f16341e = 1;
                            obj = AbstractC5336e.advert(AbstractC6731e.ad, new C17071e(bitmap, null, 9), this);
                            if (obj == enumC2821e) {
                                return enumC2821e;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3314e = this.f16342e;
                AbstractC2003e.purchase(obj);
                c12763e = new C3618e(((C3618e) obj).ad);
                C3618e c3618e = (C3618e) (c12763e instanceof C12763e ? null : c12763e);
                long j2 = c3618e != null ? c3618e.ad : C3618e.vip;
                int i4 = C9326e.f18571new;
                interfaceC3314e.setValue(new C3618e(j2));
                return Unit.INSTANCE;
            default:
                int i5 = this.f16341e;
                try {
                } catch (Throwable th2) {
                    c12763e2 = new C12763e(th2);
                }
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    Bitmap bitmap2 = (Bitmap) interfaceC3314e2.getValue();
                    if (bitmap2 != null) {
                        C1188e c1188e2 = C0896e.appmetrica;
                        this.f16342e = interfaceC3314e;
                        this.f16341e = 1;
                        obj = AbstractC5336e.advert(AbstractC6731e.ad, new C17071e(bitmap2, null, 9), this);
                        if (obj == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3314e = this.f16342e;
                AbstractC2003e.purchase(obj);
                c12763e2 = new C3618e(((C3618e) obj).ad);
                C3618e c3618e2 = (C3618e) (c12763e2 instanceof C12763e ? null : c12763e2);
                if (c3618e2 != null) {
                    j = c3618e2.ad;
                    AbstractC6532e.billing(C3618e.vip, j);
                } else {
                    j = C3618e.vip;
                }
                interfaceC3314e.setValue(new C3618e(j));
                return Unit.INSTANCE;
        }
    }
}
