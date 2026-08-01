package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0948e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3375e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14314e f3376e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0948e(C14314e c14314e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f3375e = i;
        this.f3376e = c14314e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3375e) {
            case 0:
                return new C0948e(this.f3376e, interfaceC5083e, 0);
            default:
                return new C0948e(this.f3376e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f3375e) {
            case 0:
                return ((C0948e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0948e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f3375e;
        C14314e c14314e = this.f3376e;
        switch (i) {
            case 0:
                AbstractC2003e.purchase(obj);
                ContentResolver contentResolver = c14314e.f28307e;
                contentResolver.registerContentObserver(Settings.System.getUriFor("reduce_animations"), false, c14314e.f28309e);
                boolean z = Settings.System.getInt(contentResolver, "reduce_animations", 0) == 0;
                if (c14314e.f28310e != null) {
                    C15420e c15420e = AbstractC6731e.ad;
                    AbstractC5336e.purchase(AbstractC9743e.ad(AbstractC1497e.ad), null, 0, new C11441e(c14314e, z, null, 2), 3);
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                c14314e.f28307e.unregisterContentObserver(c14314e.f28309e);
                if (c14314e.f28310e != null) {
                    C15420e c15420e2 = AbstractC6731e.ad;
                    AbstractC5336e.purchase(AbstractC9743e.ad(AbstractC1497e.ad), null, 0, new C11441e(c14314e, false, null, 2), 3);
                }
                return Unit.INSTANCE;
        }
    }
}
