package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7018e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f14363e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C0272e f14364e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f14365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7018e(C4246e c4246e, C4246e c4246e2, C0272e c0272e, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f14363e = c4246e;
        this.f14365e = c4246e2;
        this.f14364e = c0272e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C7018e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        Log.d("CXCP", "tryOpenCamera: 3000ms elapsed");
        this.f14363e.f9318e = null;
        if (this.f14365e.f9318e == null) {
            return null;
        }
        Log.e("CXCP", "tryOpenCamera: openCamera() timed out");
        this.f14364e.ad();
        return new C10171e(null, new C1096e(13), 1);
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C7018e(this.f14363e, this.f14365e, this.f14364e, interfaceC5083e);
    }
}
