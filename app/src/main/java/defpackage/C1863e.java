package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1863e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4953e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C4320e f4954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1863e(C4320e c4320e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f4953e = i;
        this.f4954e = c4320e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f4953e) {
            case 0:
                return new C1863e(this.f4954e, interfaceC5083e, 0);
            default:
                return new C1863e(this.f4954e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f4953e) {
            case 0:
                return ((C1863e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C1863e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f4953e;
        C4320e c4320e = this.f4954e;
        switch (i) {
            case 0:
                AbstractC2003e.purchase(obj);
                c4320e.purchase();
                AbstractC15615e.ad(new C1478e(0, c4320e.f10582e, "Аудиозапись загружена на сервер!"));
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                int i2 = C4320e.f9432e;
                c4320e.f9438e.setValue(Boolean.TRUE);
                C0576e c0576e = c4320e.f9433e;
                Bitmap bitmap = (Bitmap) c0576e.getValue();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                c0576e.setValue(null);
                c4320e.f9434e.setValue(null);
                c4320e.f9436e.setValue("Untitled");
                c4320e.f9439e.setValue("Unknown artist");
                return Unit.INSTANCE;
        }
    }
}
