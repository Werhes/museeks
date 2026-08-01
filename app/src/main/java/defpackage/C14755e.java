package defpackage;

import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14755e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f29185e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f29186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14755e(AppActivity appActivity, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f29186e = appActivity;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C14755e(this.f29186e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C14755e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f29185e;
        AppActivity appActivity = this.f29186e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C18046e c18046e = VKXApplication.f36532e;
            if (c18046e == null) {
                c18046e = null;
            }
            if (((Boolean) ((C14688e) c18046e.purchase.yandex).f29092e.getValue()).booleanValue()) {
                C14965e.ad(appActivity);
            }
            C18046e c18046e2 = VKXApplication.f36532e;
            if (c18046e2 == null) {
                c18046e2 = null;
            }
            this.f29185e = 1;
            Object vip = c18046e2.vip(this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (vip == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        C18046e c18046e3 = VKXApplication.f36532e;
        if (((Boolean) ((C14688e) (c18046e3 != null ? c18046e3 : null).purchase.yandex).f29092e.getValue()).booleanValue()) {
            C14965e.ad(appActivity);
        } else {
            AbstractC17680e.mopub((LinearLayout) appActivity.f36547e.f10511e);
            AbstractC17680e.mopub((CoordinatorLayout) appActivity.f36547e.f10516e);
            appActivity.f36542e.appmetrica(EnumC16729e.f32794e, true);
        }
        return Unit.INSTANCE;
    }
}
