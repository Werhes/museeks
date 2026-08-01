package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6659e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f13747e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f13748e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C13621e f13749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6659e(C13621e c13621e, InterfaceC3314e interfaceC3314e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f13747e = i;
        this.f13749e = c13621e;
        this.f13748e = interfaceC3314e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f13747e) {
            case 0:
                return new C6659e(this.f13749e, this.f13748e, interfaceC5083e, 0);
            default:
                return new C6659e(this.f13749e, this.f13748e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f13747e) {
            case 0:
                return ((C6659e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C6659e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f13747e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C14314e c14314e = (C14314e) this.f13748e.getValue();
                if (c14314e != null) {
                    boolean z = this.f13749e.ad.mopub().metrica == EnumC11342e.f22808e;
                    C5008e c5008e = c14314e.f28310e;
                    if (c5008e != null && c5008e.license != z) {
                        c5008e.license = z;
                        if (c5008e.appmetrica && z) {
                            ((ValueAnimator) c5008e.purchase.yandex()).resume();
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                C14314e c14314e2 = (C14314e) this.f13748e.getValue();
                if (c14314e2 != null) {
                    C10983e c10983e = (C10983e) ((C0576e) this.f13749e.ad.Signature.f23070e).getValue();
                    Bitmap vip = c10983e != null ? AbstractC11815e.vip(c10983e.vip) : null;
                    C5008e c5008e2 = c14314e2.f28310e;
                    if (c5008e2 != null && (vip == null || c14314e2.f28311e != vip.hashCode())) {
                        c14314e2.f28311e = vip == null ? -1 : vip.hashCode();
                        AbstractC5336e.purchase(AbstractC5131e.vip, null, 0, new C10954e(vip, c5008e2, (InterfaceC5083e) null, 26), 3);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
