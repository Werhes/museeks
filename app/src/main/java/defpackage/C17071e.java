package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ٘ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17071e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33404e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f33405e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f33406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17071e(InterfaceC5083e interfaceC5083e, C6455e c6455e) {
        super(2, interfaceC5083e);
        this.f33404e = 8;
        this.f33405e = c6455e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17071e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f33404e = i;
        this.f33405e = obj;
    }

    private final Object subscription(Object obj) {
        C8823e c8823e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        int i = this.f33406e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            if (AbstractC9464e.smaato("CXCP")) {
                Log.d("CXCP", "Closing " + ((C6455e) this.f33405e));
            }
            C12383e c12383e = ((C6455e) this.f33405e).ad;
            if (c12383e.appmetrica.ad()) {
                AutoCloseable ad = c12383e.ad();
                if (ad instanceof AutoCloseable) {
                    ad.close();
                } else {
                    if (!(ad instanceof ExecutorService)) {
                        throw new IllegalArgumentException();
                    }
                    AbstractC6418e.smaato((ExecutorService) ad);
                }
            }
            C11728e c11728e = (C11728e) ((C6455e) this.f33405e).startapp.getValue();
            synchronized (c11728e.appmetrica) {
                try {
                    c8823e = c11728e.startapp;
                    if (c8823e == null) {
                        C8763e c8763e = c11728e.purchase;
                        if (c8763e != null) {
                            c8763e.Signature(null);
                        }
                        c11728e.metrica.metrica();
                        c11728e.yandex = null;
                        c8823e = new C8823e();
                        c11728e.startapp = c8823e;
                        c11728e.billing();
                    } else if (AbstractC9464e.admob()) {
                        Log.w("CXCP", "UseCaseSurfaceManager is already stopping!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f33406e = 1;
            if (c8823e.tapsense(this) == enumC2821e) {
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

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f33404e) {
            case 0:
                return new C17071e((C8763e) this.f33405e, interfaceC5083e, 0);
            case 1:
                return new C17071e((C14426e) this.f33405e, interfaceC5083e, 1);
            case 2:
                return new C17071e((C0593e) this.f33405e, interfaceC5083e, 2);
            case 3:
                return new C17071e((C13389e) this.f33405e, interfaceC5083e, 3);
            case 4:
                return new C17071e((C12672e) this.f33405e, interfaceC5083e, 4);
            case 5:
                return new C17071e((C2743e) this.f33405e, interfaceC5083e, 5);
            case 6:
                return new C17071e((C13679e) this.f33405e, interfaceC5083e, 6);
            case 7:
                return new C17071e((C4320e) this.f33405e, interfaceC5083e, 7);
            case 8:
                return new C17071e(interfaceC5083e, (C6455e) this.f33405e);
            case 9:
                return new C17071e((Bitmap) this.f33405e, interfaceC5083e, 9);
            case 10:
                return new C17071e((C1071e) this.f33405e, interfaceC5083e, 10);
            case 11:
                return new C17071e((C1439e) this.f33405e, interfaceC5083e, 11);
            case 12:
                return new C17071e((C11046e) this.f33405e, interfaceC5083e, 12);
            case 13:
                return new C17071e((Function1) this.f33405e, interfaceC5083e, 13);
            case 14:
                return new C17071e((C16452e) this.f33405e, interfaceC5083e, 14);
            case 15:
                return new C17071e((C2243e) this.f33405e, interfaceC5083e, 15);
            default:
                return new C17071e((C18100e) this.f33405e, interfaceC5083e, 16);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f33404e) {
            case 0:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C17071e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0028, code lost:
    
        if (defpackage.AbstractC16481e.vip(1000, r13) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0102, code lost:
    
        if (r14 == r0) goto L69;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17071e.loadAd(java.lang.Object):java.lang.Object");
    }
}
