package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٟؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11164e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f22404e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ String f22405e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f22406e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f22407e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11164e(C4246e c4246e, String str, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f22404e = i;
        this.f22406e = c4246e;
        this.f22405e = str;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f22404e) {
            case 0:
                C11164e c11164e = new C11164e(this.f22406e, this.f22405e, interfaceC5083e, 0);
                c11164e.f22407e = obj;
                return c11164e;
            default:
                C11164e c11164e2 = new C11164e(this.f22406e, this.f22405e, interfaceC5083e, 1);
                c11164e2.f22407e = obj;
                return c11164e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C10171e c10171e = (C10171e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f22404e) {
            case 0:
                return ((C11164e) advert(interfaceC5083e, c10171e)).loadAd(Unit.INSTANCE);
            default:
                return ((C11164e) advert(interfaceC5083e, c10171e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f22404e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C10171e c10171e = (C10171e) this.f22407e;
                Log.d("CXCP", "tryOpenCamera: openCamera() for " + ((Object) C5060e.vip(this.f22405e)) + " returned");
                this.f22406e.f9318e = null;
                return c10171e;
            default:
                AbstractC2003e.purchase(obj);
                C10171e c10171e2 = (C10171e) this.f22407e;
                Log.d("CXCP", "tryOpenCamera: " + ((Object) C5060e.vip(this.f22405e)) + " opened");
                this.f22406e.f9318e = null;
                return c10171e2;
        }
    }
}
