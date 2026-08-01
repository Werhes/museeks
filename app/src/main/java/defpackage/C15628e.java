package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15628e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30815e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C18480e f30816e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15628e(C18480e c18480e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f30815e = i;
        this.f30816e = c18480e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f30815e) {
            case 0:
                return new C15628e(this.f30816e, interfaceC5083e, 0);
            default:
                return new C15628e(this.f30816e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f30815e) {
            case 0:
                return ((C15628e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C15628e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f30815e;
        InterfaceC5083e interfaceC5083e = null;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        C18480e c18480e = this.f30816e;
        switch (i) {
            case 0:
                int i2 = this.f30817e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C5891e metrica = ((C12454e) ((C5389e) AbstractC1831e.ad().adcel.f36194e).f11540e).metrica(new C12894e(18, "/PaymentsService/BuildPaymentUrl", C12282e.f24616e, C6007e.f12655e));
                    String str = ((C14902e) AbstractC13480e.m3591interface(c18480e.f36233e.f2599e.f36015e)).f29533e;
                    String str2 = ((C2357e) c18480e.f36237e.getValue()).f5898e;
                    Long l = new Long(((C17561e) c18480e.f36232e.getValue()).ad);
                    long longValue = l.longValue();
                    C14027e.ad.getClass();
                    C12282e c12282e = new C12282e(str, str2, longValue != C14027e.metrica() ? l : null, new Integer(200), null, C0193e.f1409e);
                    this.f30817e = 1;
                    obj = metrica.firebase(c12282e, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                String str3 = ((C6007e) obj).f12656e;
                int i3 = C18480e.f36231e;
                c18480e.f10582e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                return Unit.INSTANCE;
            default:
                int i4 = this.f30817e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e yandex = AbstractC7535e.yandex(AbstractC7535e.billing(c18480e.f36238e, 300L));
                    C2122e c2122e = new C2122e(c18480e, interfaceC5083e, 23);
                    this.f30817e = 1;
                    if (AbstractC7535e.appmetrica(yandex, c2122e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
