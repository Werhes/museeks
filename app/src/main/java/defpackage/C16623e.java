package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16623e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f32574e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f32575e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f32576e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f32577e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16623e(int i, int i2, InterfaceC5083e interfaceC5083e, int i3) {
        super(2, interfaceC5083e);
        this.f32574e = i3;
        this.f32576e = i;
        this.f32575e = i2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f32574e) {
            case 0:
                C16623e c16623e = new C16623e(this.f32576e, this.f32575e, interfaceC5083e, 0);
                c16623e.f32577e = obj;
                return c16623e;
            default:
                C16623e c16623e2 = new C16623e(this.f32576e, this.f32575e, interfaceC5083e, 1);
                c16623e2.f32577e = obj;
                return c16623e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32574e) {
            case 0:
                return ((C16623e) advert((InterfaceC5083e) obj2, (C12318e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C16623e) advert((InterfaceC5083e) obj2, (C3147e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f32574e;
        int i2 = this.f32575e;
        int i3 = this.f32576e;
        switch (i) {
            case 0:
                C12318e c12318e = (C12318e) this.f32577e;
                AbstractC2003e.purchase(obj);
                c12318e.mo2117e(i3, i2);
                return Unit.INSTANCE;
            default:
                C3147e c3147e = (C3147e) this.f32577e;
                AbstractC2003e.purchase(obj);
                ArrayList arrayList = new ArrayList(c3147e.f7229e);
                Collections.swap(arrayList, i3, i2);
                Unit unit = Unit.INSTANCE;
                return C3147e.vip(c3147e, arrayList, null, 0L, 239);
        }
    }
}
