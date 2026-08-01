package defpackage;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13138e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26114e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f26115e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ Object f26116e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f26117e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f26118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13138e(int i, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f26114e = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13138e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(4, interfaceC5083e);
        this.f26114e = i;
        this.f26116e = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f26114e) {
            case 0:
                C13138e c13138e = new C13138e((View) this.f26116e, (InterfaceC5083e) obj4, 0);
                c13138e.f26117e = (C3225e) obj2;
                c13138e.f26115e = (C3225e) obj3;
                return c13138e.loadAd(Unit.INSTANCE);
            case 1:
                C13138e c13138e2 = new C13138e((C12358e) this.f26116e, (InterfaceC5083e) obj4, 1);
                c13138e2.f26117e = (C3850e) obj;
                c13138e2.f26115e = (InterfaceC8376e) obj2;
                return c13138e2.loadAd(Unit.INSTANCE);
            default:
                C13138e c13138e3 = new C13138e(4, (InterfaceC5083e) obj4);
                c13138e3.f26117e = (C16122e) obj;
                c13138e3.f26115e = (InterfaceC8376e) obj2;
                c13138e3.f26116e = obj3;
                return c13138e3.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f26114e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        InterfaceC5083e interfaceC5083e = null;
        int i2 = 1;
        switch (i) {
            case 0:
                View view = (View) this.f26116e;
                C3225e c3225e = (C3225e) this.f26117e;
                C3225e c3225e2 = (C3225e) this.f26115e;
                int i3 = this.f26118e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7850e c7850e = (C7850e) AbstractC1831e.metrica().f22774e;
                    int i4 = c3225e.ad - 1;
                    int i5 = c3225e2.ad - 1;
                    this.f26117e = null;
                    this.f26115e = null;
                    this.f26118e = 1;
                    if (((InterfaceC8018e) c7850e.f15896e).vip(new C16623e(i4, i5, interfaceC5083e, i2), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                if (AbstractC7640e.vip(view.getContext())) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        view.performHapticFeedback(27);
                    } else {
                        view.performHapticFeedback(4);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C3850e c3850e = (C3850e) this.f26117e;
                InterfaceC8376e interfaceC8376e = (InterfaceC8376e) this.f26115e;
                int i6 = this.f26118e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    C12358e c12358e = (C12358e) this.f26116e;
                    this.f26117e = null;
                    this.f26115e = null;
                    this.f26118e = 1;
                    if (c12358e.invoke(c3850e, interfaceC8376e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                C16122e c16122e = (C16122e) this.f26117e;
                InterfaceC8376e interfaceC8376e2 = (InterfaceC8376e) this.f26115e;
                Object obj2 = this.f26116e;
                int i7 = this.f26118e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (obj2 instanceof AbstractC14601e) {
                        AbstractC17926e.ad.amazon("Skipping because body is already converted.");
                        return Unit.INSTANCE;
                    }
                    Set set = ((C13184e) c16122e.ad).metrica;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (((InterfaceC7227e) it.next()).applovin(obj2)) {
                                String mopub = AbstractC3820e.ad.vip(obj2.getClass()).mopub();
                                String str = ((C3434e) ((C17790e) AbstractC10337e.ad(interfaceC8376e2.license())).f34883e).ad + ' ' + AbstractC7535e.loadAd(interfaceC8376e2.license());
                                InterfaceC4911e interfaceC4911e = AbstractC17926e.ad;
                                StringBuilder tapsense = AbstractC17861e.tapsense("Skipping response body transformation from ", mopub, " to OutgoingContent for the ", str, " request because the ");
                                tapsense.append(mopub);
                                tapsense.append(" type is ignored. See [ContentNegotiationConfig::ignoreType].");
                                interfaceC4911e.amazon(tapsense.toString());
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    InterfaceC7046e loadAd = interfaceC8376e2.loadAd();
                    C8208e c8208e = AbstractC7186e.ad;
                    C12025e c12025e = (C12025e) loadAd.metrica().getAttributes().purchase(AbstractC7186e.ad);
                    if (c12025e == null) {
                        return Unit.INSTANCE;
                    }
                    C13184e c13184e = (C13184e) c16122e.ad;
                    ArrayList arrayList = c13184e.ad;
                    c13184e.getClass();
                    C12803e c12803e = new C12803e(interfaceC8376e2, c16122e, arrayList, c12025e, obj2, null);
                    this.f26117e = null;
                    this.f26115e = null;
                    this.f26116e = null;
                    this.f26118e = 1;
                    if (c16122e.ad(c12803e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
