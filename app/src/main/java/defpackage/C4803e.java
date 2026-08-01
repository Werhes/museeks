package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.DataResponse;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4803e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f10232e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16234e f10233e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f10234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4803e(AbstractC16234e abstractC16234e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f10232e = i;
        this.f10233e = abstractC16234e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f10232e) {
            case 0:
                return new C4803e(this.f10233e, interfaceC5083e, 0);
            default:
                return new C4803e(this.f10233e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f10232e) {
            case 0:
                return ((C4803e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C4803e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object obj2;
        int i = this.f10232e;
        AbstractC16234e abstractC16234e = this.f10233e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f10234e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f10234e = 1;
                    obj = abstractC16234e.ad(this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                Closeable closeable = (Closeable) obj;
                try {
                    InterfaceC4895e mo1012e = ((AbstractC12834e) closeable).mo1012e();
                    boolean yandex = abstractC16234e.yandex();
                    Class cls = abstractC16234e.vip;
                    if (yandex) {
                        C14172e c14172e = VKXApplication.f36533e;
                        c14172e.getClass();
                        obj2 = c14172e.vip(cls, AbstractC7644e.ad, null).ad(mo1012e);
                    } else {
                        DataResponse dataResponse = (DataResponse) VKXApplication.f36533e.ad(AbstractC18453e.purchase(DataResponse.class, cls)).ad(mo1012e);
                        obj2 = dataResponse != null ? dataResponse.ad : null;
                    }
                    AbstractC16704e.vip(closeable, null);
                    return obj2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC16704e.vip(closeable, th);
                        throw th2;
                    }
                }
            default:
                int i3 = this.f10234e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f10234e = 1;
                    if (abstractC16234e.metrica(this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
