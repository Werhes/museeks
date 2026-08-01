package defpackage;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10802e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C7044e f21416e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ float f21417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10802e(C7044e c7044e, float f, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f21416e = c7044e;
        this.f21417e = f;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C10802e(this.f21416e, this.f21417e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10802e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        C7044e c7044e = this.f21416e;
        Allocation allocation = (Allocation) c7044e.purchase;
        ScriptIntrinsicBlur scriptIntrinsicBlur = (ScriptIntrinsicBlur) c7044e.license;
        if (!c7044e.vip) {
            float f = this.f21417e;
            if (f > 25.0f) {
                f = 25.0f;
            }
            scriptIntrinsicBlur.setRadius(f);
            scriptIntrinsicBlur.forEach(allocation);
            if (!c7044e.vip) {
                allocation.copyTo((Bitmap) c7044e.billing);
            }
        }
        return Unit.INSTANCE;
    }
}
