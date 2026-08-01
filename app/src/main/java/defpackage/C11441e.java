package defpackage;

import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11441e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f23008e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f23009e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ boolean f23010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11441e(InterfaceC5083e interfaceC5083e, C6455e c6455e, boolean z) {
        super(2, interfaceC5083e);
        this.f23008e = 4;
        this.f23009e = c6455e;
        this.f23010e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11441e(C6540e c6540e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f23008e = 1;
        this.f23009e = c6540e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11441e(Object obj, boolean z, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f23008e = i;
        this.f23009e = obj;
        this.f23010e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11441e(boolean z, C16818e c16818e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f23008e = 0;
        this.f23010e = z;
        this.f23009e = c16818e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f23008e) {
            case 0:
                return new C11441e(this.f23010e, (C16818e) this.f23009e, interfaceC5083e);
            case 1:
                C11441e c11441e = new C11441e((C6540e) this.f23009e, interfaceC5083e);
                c11441e.f23010e = ((Boolean) obj).booleanValue();
                return c11441e;
            case 2:
                return new C11441e((C14314e) this.f23009e, this.f23010e, interfaceC5083e, 2);
            case 3:
                return new C11441e((C0567e) this.f23009e, this.f23010e, interfaceC5083e, 3);
            default:
                return new C11441e(interfaceC5083e, (C6455e) this.f23009e, this.f23010e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23008e) {
            case 0:
                return ((C11441e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C11441e) advert((InterfaceC5083e) obj2, bool)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C11441e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C11441e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C11441e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f23008e) {
            case 0:
                AbstractC2003e.purchase(obj);
                if (!this.f23010e) {
                    ((C16818e) this.f23009e).vip.crashlytics(-1);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                if (!this.f23010e) {
                    ((C6540e) this.f23009e).ad();
                }
                return Unit.INSTANCE;
            case 2:
                AbstractC2003e.purchase(obj);
                C5008e c5008e = ((C14314e) this.f23009e).f28310e;
                boolean z = this.f23010e;
                if (c5008e.appmetrica != z) {
                    c5008e.appmetrica = z;
                    if (z && c5008e.license) {
                        ((ValueAnimator) c5008e.purchase.yandex()).resume();
                    }
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC2003e.purchase(obj);
                C0567e c0567e = (C0567e) this.f23009e;
                C17954e c17954e = c0567e.f2741e;
                List list = c0567e.f2748e;
                C12742e c12742e = c17954e.startapp;
                c12742e.clear();
                c12742e.addAll(list);
                if (this.f23010e) {
                    C6977e c6977e = c0567e.f2747e;
                    if (c6977e != null) {
                        AbstractC17680e.amazon(c6977e);
                    }
                    View view = c0567e.f2745e;
                    if (view != null) {
                        AbstractC17680e.mopub(view);
                    }
                } else {
                    View view2 = c0567e.f2745e;
                    if (view2 != null) {
                        AbstractC17680e.amazon(view2);
                    }
                    C6977e c6977e2 = c0567e.f2747e;
                    if (c6977e2 != null) {
                        AbstractC17680e.mopub(c6977e2);
                    }
                }
                C5935e c5935e = new C5935e(c0567e);
                C6977e c6977e3 = c0567e.f11121e;
                if (c6977e3 == null) {
                    c6977e3 = null;
                }
                c6977e3.setAdapter(c5935e);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                if (!((C6455e) this.f23009e).yandex.vip()) {
                    C12701e ad = ((C6455e) this.f23009e).ad.ad();
                    boolean z2 = this.f23010e;
                    C4760e c4760e = ad.f25436e;
                    synchronized (c4760e.Signature) {
                        c4760e.admob = z2;
                        Unit unit = Unit.INSTANCE;
                    }
                } else if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
                }
                return Unit.INSTANCE;
        }
    }
}
