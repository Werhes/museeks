package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11582e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23262e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ WebView f23263e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C13849e f23264e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f23265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11582e(C13849e c13849e, WebView webView, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f23262e = i;
        this.f23264e = c13849e;
        this.f23263e = webView;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f23262e) {
            case 0:
                return new C11582e(this.f23264e, this.f23263e, interfaceC5083e, 0);
            default:
                return new C11582e(this.f23264e, this.f23263e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f23262e) {
            case 0:
                ((C11582e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
            default:
                ((C11582e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
                return EnumC2821e.f6782e;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f23262e) {
            case 0:
                int i = this.f23265e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f23265e = 1;
                    this.f23264e.ad(this.f23263e, this);
                    break;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    throw new C14803e(9);
                }
            default:
                int i2 = this.f23265e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C5981e c5981e = this.f23264e.ad;
                    C3140e c3140e = new C3140e(3);
                    this.f23265e = 1;
                    c5981e.ad(c3140e, this);
                    break;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    throw new C14803e(9);
                }
        }
        return EnumC2821e.f6782e;
    }
}
