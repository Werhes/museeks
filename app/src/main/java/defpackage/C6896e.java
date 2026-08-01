package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6896e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14131e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f14132e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f14133e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14134e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6896e(C7558e c7558e, boolean z, InterfaceC2869e interfaceC2869e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14131e = 5;
        this.f14132e = c7558e;
        this.f14134e = z;
        this.f14133e = interfaceC2869e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6896e(C7576e c7576e, InterfaceC5979e interfaceC5979e, boolean z, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14131e = 2;
        this.f14132e = c7576e;
        this.f14134e = z;
        this.f14133e = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6896e(C15062e c15062e, InterfaceC5083e interfaceC5083e, boolean z, LinkedHashSet linkedHashSet) {
        super(2, interfaceC5083e);
        this.f14131e = 3;
        this.f14132e = c15062e;
        this.f14134e = z;
        this.f14133e = linkedHashSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6896e(AbstractC16625e abstractC16625e, CachedTrack cachedTrack, boolean z, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f14131e = i;
        this.f14132e = abstractC16625e;
        this.f14133e = cachedTrack;
        this.f14134e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6896e(boolean z, C1718e c1718e, C16349e c16349e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f14131e = 0;
        this.f14134e = z;
        this.f14132e = c1718e;
        this.f14133e = c16349e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f14131e) {
            case 0:
                return new C6896e(this.f14134e, (C1718e) this.f14132e, (C16349e) this.f14133e, interfaceC5083e);
            case 1:
                return new C6896e((C5250e) this.f14132e, (CachedTrack) this.f14133e, this.f14134e, interfaceC5083e, 1);
            case 2:
                return new C6896e((C7576e) this.f14132e, (InterfaceC5979e) null, this.f14134e, (Function2) this.f14133e, interfaceC5083e);
            case 3:
                return new C6896e((C15062e) this.f14132e, interfaceC5083e, this.f14134e, (LinkedHashSet) this.f14133e);
            case 4:
                return new C6896e((C2921e) this.f14132e, (CachedTrack) this.f14133e, this.f14134e, interfaceC5083e, 4);
            default:
                return new C6896e((C7558e) this.f14132e, this.f14134e, (InterfaceC2869e) this.f14133e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f14131e) {
            case 0:
                return ((C6896e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C6896e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C6896e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C6896e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C6896e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C6896e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object purchase;
        Object startapp;
        Object startapp2;
        switch (this.f14131e) {
            case 0:
                C0576e c0576e = ((C1718e) this.f14132e).f4670e;
                int i = this.f14135e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    if (this.f14134e && ((Boolean) c0576e.getValue()).booleanValue()) {
                        C16349e c16349e = (C16349e) this.f14133e;
                        int loadAd = c16349e.loadAd() + 1;
                        this.f14135e = 1;
                        purchase = c16349e.purchase(loadAd, AbstractC12696e.purchase(0.0f, 0.0f, null, 7), this);
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (purchase == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
                c0576e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                C5250e c5250e = (C5250e) this.f14132e;
                int i2 = this.f14135e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e interfaceC1108e = c5250e.f11321e;
                    this.f14135e = 1;
                    startapp = AbstractC7535e.startapp(interfaceC1108e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (startapp == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    startapp = obj;
                }
                InterfaceC8346e interfaceC8346e = (InterfaceC8346e) startapp;
                AppActivity appActivity = (AppActivity) c5250e.pro();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(interfaceC8346e, 10));
                Iterator<E> it = interfaceC8346e.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CachedTrack) it.next()).m4723for());
                }
                C0552e c0552e = new C0552e(arrayList);
                CachedTrack cachedTrack = (CachedTrack) this.f14133e;
                String applovin = cachedTrack != null ? cachedTrack.applovin() : null;
                InterfaceC14517e c1703e = applovin != null ? new C1703e(applovin) : C2406e.ad;
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(interfaceC8346e, 10));
                Iterator<E> it2 = interfaceC8346e.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((CachedTrack) it2.next()).metrica());
                }
                AbstractC13201e.metrica(appActivity, c0552e, new C0086e(c1703e, 0L, arrayList2, false, false, this.f14134e, 90));
                return Unit.INSTANCE;
            case 2:
                C7576e c7576e = (C7576e) this.f14132e;
                int i3 = this.f14135e;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C14065e c14065e = new C14065e(this.f14134e, c7576e, (Function2) this.f14133e, null);
                this.f14135e = 1;
                Object purchase2 = AbstractC12731e.purchase(c14065e, this);
                EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                return purchase2 == enumC2821e3 ? enumC2821e3 : purchase2;
            case 3:
                int i4 = this.f14135e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                InterfaceC1908e yandex = C15062e.advert((C15062e) this.f14132e).yandex((LinkedHashSet) this.f14133e, this.f14134e);
                this.f14135e = 1;
                Object tapsense = ((C8823e) yandex).tapsense(this);
                EnumC2821e enumC2821e4 = EnumC2821e.f6782e;
                return tapsense == enumC2821e4 ? enumC2821e4 : tapsense;
            case 4:
                C2921e c2921e = (C2921e) this.f14132e;
                int i5 = this.f14135e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e interfaceC1108e2 = c2921e.f6909e;
                    this.f14135e = 1;
                    startapp2 = AbstractC7535e.startapp(interfaceC1108e2, this);
                    EnumC2821e enumC2821e5 = EnumC2821e.f6782e;
                    if (startapp2 == enumC2821e5) {
                        return enumC2821e5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    startapp2 = obj;
                }
                InterfaceC8346e interfaceC8346e2 = (InterfaceC8346e) startapp2;
                AppActivity appActivity2 = (AppActivity) c2921e.pro();
                ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(interfaceC8346e2, 10));
                Iterator<E> it3 = interfaceC8346e2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((CachedTrack) it3.next()).m4723for());
                }
                C0552e c0552e2 = new C0552e(arrayList3);
                CachedTrack cachedTrack2 = (CachedTrack) this.f14133e;
                String applovin2 = cachedTrack2 != null ? cachedTrack2.applovin() : null;
                InterfaceC14517e c1703e2 = applovin2 != null ? new C1703e(applovin2) : C2406e.ad;
                ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(interfaceC8346e2, 10));
                Iterator<E> it4 = interfaceC8346e2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((CachedTrack) it4.next()).metrica());
                }
                AbstractC13201e.metrica(appActivity2, c0552e2, new C0086e(c1703e2, 0L, arrayList4, false, false, this.f14134e, 90));
                return Unit.INSTANCE;
            default:
                int i6 = this.f14135e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7558e c7558e = (C7558e) this.f14132e;
                    Float f = new Float(this.f14134e ? 1.0f : 0.8f);
                    InterfaceC2869e interfaceC2869e = (InterfaceC2869e) this.f14133e;
                    this.f14135e = 1;
                    Object vip = C7558e.vip(c7558e, f, interfaceC2869e, null, this, 12);
                    EnumC2821e enumC2821e6 = EnumC2821e.f6782e;
                    if (vip == enumC2821e6) {
                        return enumC2821e6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
