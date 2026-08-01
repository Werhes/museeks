package defpackage;

import android.text.format.Formatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8257e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16771e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f16772e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ long f16773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8257e(long j, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f16771e = 1;
        this.f16773e = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8257e(AbstractC10347e abstractC10347e, long j, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f16771e = i;
        this.f16772e = abstractC10347e;
        this.f16773e = j;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16771e) {
            case 0:
                return new C8257e((C8510e) this.f16772e, this.f16773e, interfaceC5083e, 0);
            case 1:
                C8257e c8257e = new C8257e(this.f16773e, interfaceC5083e);
                c8257e.f16772e = obj;
                return c8257e;
            default:
                return new C8257e((C11188e) this.f16772e, this.f16773e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16771e) {
            case 0:
                return ((C8257e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C8257e) advert((InterfaceC5083e) obj2, (C3593e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C8257e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f16771e;
        long j = this.f16773e;
        switch (i) {
            case 0:
                AbstractC2003e.purchase(obj);
                C8510e c8510e = (C8510e) this.f16772e;
                c8510e.f17311e.setValue(Boolean.FALSE);
                AbstractC15615e.ad(new C1478e(0, c8510e.pro(), c8510e.pro().getString(R.string.cache_migration_success, Formatter.formatFileSize(c8510e.pro(), j))));
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                C11950e c11950e = ((C3593e) this.f16772e).ad;
                c11950e.metrica(c11950e.mopub, j, 1);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                C11188e c11188e = (C11188e) this.f16772e;
                c11188e.f22450e.setValue(Boolean.FALSE);
                AbstractC15615e.ad(new C1478e(0, c11188e.pro(), c11188e.pro().getString(R.string.cache_migration_success, Formatter.formatFileSize(c11188e.pro(), j))));
                return Unit.INSTANCE;
        }
    }
}
