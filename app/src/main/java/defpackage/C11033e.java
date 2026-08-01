package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11033e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f21854e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f21855e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C12810e f21856e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f21857e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11033e(C12810e c12810e, int i, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f21856e = c12810e;
        this.f21855e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C11033e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i;
        int i2 = this.f21857e;
        try {
            if (i2 == 0) {
                AbstractC2003e.purchase(obj);
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOffAsync");
                }
                C12810e c12810e = this.f21856e;
                i = this.f21855e;
                C12701e ad = c12810e.metrica.ad();
                this.f21854e = i;
                this.f21857e = 1;
                obj = ad.ad(this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (obj == enumC2821e) {
                    return enumC2821e;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f21854e;
                AbstractC2003e.purchase(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                C8823e ad2 = ((C15154e) autoCloseable).ad(new C6510e(i));
                AbstractC18453e.ad(autoCloseable, null);
                return ad2;
            } finally {
            }
        } catch (CancellationException e) {
            if (AbstractC9464e.smaato("CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return C12810e.advert;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C11033e(this.f21856e, this.f21855e, interfaceC5083e);
    }
}
