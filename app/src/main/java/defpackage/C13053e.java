package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13053e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25979e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f25980e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f25981e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f25982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13053e(Object obj, boolean z, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f25979e = i;
        this.f25980e = obj;
        this.f25982e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13053e(boolean z, C10743e c10743e, Object obj, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f25979e = 1;
        this.f25982e = z;
        this.f25980e = c10743e;
        this.f25981e = obj;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f25979e) {
            case 0:
                C13053e c13053e = new C13053e((C7838e) this.f25980e, this.f25982e, interfaceC5083e, 0);
                c13053e.f25981e = obj;
                return c13053e;
            case 1:
                return new C13053e(this.f25982e, (C10743e) this.f25980e, this.f25981e, interfaceC5083e);
            default:
                C13053e c13053e2 = new C13053e((EnumC0698e) this.f25980e, this.f25982e, interfaceC5083e, 2);
                c13053e2.f25981e = obj;
                return c13053e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25979e) {
            case 0:
                return ((C13053e) advert((InterfaceC5083e) obj2, (C12318e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C13053e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C13053e) advert((InterfaceC5083e) obj2, (C3147e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f25979e) {
            case 0:
                C12318e c12318e = (C12318e) this.f25981e;
                AbstractC2003e.purchase(obj);
                C7838e c7838e = (C7838e) this.f25980e;
                C1962e c1962e = (C1962e) c7838e.yandex(new C1586e(c7838e, 14));
                String str = c1962e != null ? c1962e.ad : null;
                C11326e c11326e = new C11326e(this.f25982e);
                c12318e.metrica();
                AbstractC2301e.amazon(str, "mediaId must not be null");
                AbstractC2301e.yandex(!TextUtils.isEmpty(str), "mediaId must not be empty");
                InterfaceC10488e interfaceC10488e = c12318e.f24700e;
                if (interfaceC10488e.mo1580e()) {
                    interfaceC10488e.mo1570e(str, c11326e);
                } else {
                    AbstractC2017e.license(new C9759e(-100));
                }
                return Unit.INSTANCE;
            case 1:
                Object obj2 = this.f25981e;
                C10743e c10743e = (C10743e) this.f25980e;
                AbstractC2003e.purchase(obj);
                if (this.f25982e) {
                    c10743e.admob.add(obj2);
                } else {
                    c10743e.admob.remove(obj2);
                }
                return Unit.INSTANCE;
            default:
                C3147e c3147e = (C3147e) this.f25981e;
                AbstractC2003e.purchase(obj);
                List<C8874e> list = c3147e.f7229e;
                EnumC0698e enumC0698e = (EnumC0698e) this.f25980e;
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                for (C8874e c8874e : list) {
                    EnumC0698e enumC0698e2 = c8874e.f17829e;
                    if (enumC0698e2 == enumC0698e) {
                        c8874e = new C8874e(enumC0698e2, this.f25982e, c8874e.ad());
                    }
                    arrayList.add(c8874e);
                }
                return C3147e.vip(c3147e, arrayList, null, 0L, 239);
        }
    }
}
