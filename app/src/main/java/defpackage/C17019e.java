package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.playback.widget_glance.player_small.SmallPlayerGlanceConfigurationActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17019e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33331e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f33332e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f33333e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f33334e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f33335e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f33336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17019e(int i, C4993e c4993e, InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f33331e = 2;
        this.f33335e = i;
        this.f33333e = c4993e;
        this.f33334e = interfaceC3314e;
        this.f33332e = interfaceC3314e2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17019e(InterfaceC1686e interfaceC1686e, C0370e c0370e, int i, C6571e c6571e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f33331e = 4;
        this.f33333e = interfaceC1686e;
        this.f33334e = c0370e;
        this.f33335e = i;
        this.f33332e = c6571e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17019e(C14197e c14197e, C0004e c0004e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f33331e = 5;
        this.f33334e = c14197e;
        this.f33332e = c0004e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17019e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f33331e = i;
        this.f33332e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17019e(SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f33331e = 6;
        this.f33332e = smallPlayerGlanceConfigurationActivity;
        this.f33335e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17019e(InterfaceC1108e[] interfaceC1108eArr, int i, AtomicInteger atomicInteger, C14137e c14137e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f33331e = 0;
        this.f33333e = interfaceC1108eArr;
        this.f33335e = i;
        this.f33334e = atomicInteger;
        this.f33332e = c14137e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f33331e) {
            case 0:
                return new C17019e((InterfaceC1108e[]) this.f33333e, this.f33335e, (AtomicInteger) this.f33334e, (C14137e) this.f33332e, interfaceC5083e);
            case 1:
                return new C17019e((C8252e) this.f33332e, interfaceC5083e, 1);
            case 2:
                return new C17019e(this.f33335e, (C4993e) this.f33333e, (InterfaceC3314e) this.f33334e, (InterfaceC3314e) this.f33332e, interfaceC5083e);
            case 3:
                return new C17019e((C14873e) this.f33332e, interfaceC5083e, 3);
            case 4:
                return new C17019e((InterfaceC1686e) this.f33333e, (C0370e) this.f33334e, this.f33335e, (C6571e) this.f33332e, interfaceC5083e);
            case 5:
                return new C17019e((C14197e) this.f33334e, (C0004e) this.f33332e, interfaceC5083e);
            case 6:
                return new C17019e((SmallPlayerGlanceConfigurationActivity) this.f33332e, this.f33335e, interfaceC5083e);
            default:
                return new C17019e((C5422e) this.f33332e, interfaceC5083e, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f33331e) {
            case 0:
                return ((C17019e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C17019e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C17019e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C17019e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C17019e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C17019e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C17019e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C17019e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v39, types: [eؘٕۘ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r4v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Iterator it;
        int i;
        C8252e c8252e;
        float f;
        C14873e c14873e;
        Object obj2;
        int indexOf;
        Object license;
        C12742e c12742e;
        C10838e c10838e;
        C0505e m1911package;
        C5422e c5422e;
        int i2 = this.f33331e;
        ?? r1 = 3;
        int i3 = 0;
        ?? r4 = 0;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        Object obj3 = this.f33332e;
        switch (i2) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f33334e;
                C14137e c14137e = (C14137e) obj3;
                int i4 = this.f33336e;
                try {
                    if (i4 == 0) {
                        AbstractC2003e.purchase(obj);
                        InterfaceC1108e[] interfaceC1108eArr = (InterfaceC1108e[]) this.f33333e;
                        int i5 = this.f33335e;
                        InterfaceC1108e interfaceC1108e = interfaceC1108eArr[i5];
                        C7575e c7575e = new C7575e(c14137e, i5);
                        this.f33336e = 1;
                        if (interfaceC1108e.ad(c7575e, this) == enumC2821e) {
                            return enumC2821e;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        c14137e.startapp(null);
                    }
                    return Unit.INSTANCE;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        c14137e.startapp(null);
                    }
                }
            case 1:
                int i6 = this.f33335e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    C8252e c8252e2 = (C8252e) obj3;
                    it = c8252e2.f16753e.iterator();
                    i = 0;
                    c8252e = c8252e2;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.f33336e;
                    it = (Iterator) this.f33334e;
                    c8252e = (C8252e) this.f33333e;
                    AbstractC2003e.purchase(obj);
                }
                while (it.hasNext()) {
                    Function2 function2 = (Function2) it.next();
                    C11698e c11698e = c8252e.f16754e;
                    this.f33333e = c8252e;
                    this.f33334e = it;
                    this.f33336e = i;
                    this.f33335e = 1;
                    if (function2.invoke(c11698e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj3;
                C4993e c4993e = (C4993e) this.f33333e;
                int i7 = this.f33335e;
                int i8 = this.f33336e;
                if (i8 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) this.f33334e;
                    int i9 = AbstractC12185e.ad;
                    if (!((Boolean) interfaceC3314e2.getValue()).booleanValue() && i7 >= 0) {
                        Iterator it2 = c4993e.yandex().mopub.iterator();
                        int i10 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i10 = -1;
                            } else if (((C3225e) it2.next()).ad != i7) {
                                i10++;
                            }
                        }
                        boolean z = i10 != -1;
                        int i11 = i10 > 0 ? ((C3225e) c4993e.yandex().mopub.get(i10 - 1)).Signature / 2 : 0;
                        if (!((Boolean) interfaceC3314e.getValue()).booleanValue()) {
                            this.f33336e = 3;
                            if (C4993e.adcel(c4993e, i7, this) == enumC2821e) {
                                return enumC2821e;
                            }
                            int i12 = AbstractC12185e.ad;
                            interfaceC3314e.setValue(Boolean.TRUE);
                            Unit unit = Unit.INSTANCE;
                        } else if (z) {
                            C13648e yandex = c4993e.yandex();
                            C10197e c10197e = c4993e.appmetrica;
                            if (yandex.mopub.isEmpty()) {
                                f = 0.0f;
                            } else {
                                ?? r5 = yandex.mopub;
                                int size = r5.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size) {
                                        Object obj4 = r5.get(i13);
                                        if (((C3225e) obj4).ad == i7) {
                                            r4 = obj4;
                                        } else {
                                            i13++;
                                        }
                                    }
                                }
                                C3225e c3225e = (C3225e) r4;
                                if (c3225e == null) {
                                    int size2 = r5.size();
                                    int i14 = 0;
                                    while (i3 < size2) {
                                        i14 += ((C3225e) r5.get(i3)).Signature;
                                        i3++;
                                    }
                                    f = ((i7 - c10197e.vip.purchase()) * ((i14 / r5.size()) + yandex.admob)) - c10197e.metrica.purchase();
                                } else {
                                    f = c3225e.loadAd;
                                }
                            }
                            float f2 = f - i11;
                            C12870e mopub = AbstractC12185e.mopub();
                            this.f33336e = 1;
                            if (AbstractC16653e.ad(c4993e, f2, mopub, this) == enumC2821e) {
                                return enumC2821e;
                            }
                        } else {
                            this.f33336e = 2;
                            if (c4993e.purchase(i7, this) == enumC2821e) {
                                return enumC2821e;
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                } else if (i8 == 1) {
                    AbstractC2003e.purchase(obj);
                } else if (i8 == 2) {
                    AbstractC2003e.purchase(obj);
                    Unit unit22 = Unit.INSTANCE;
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    int i122 = AbstractC12185e.ad;
                    interfaceC3314e.setValue(Boolean.TRUE);
                    Unit unit3 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 3:
                int i15 = this.f33335e;
                try {
                    if (i15 == 0) {
                        AbstractC2003e.purchase(obj);
                        c14873e = (C14873e) obj3;
                        C17651e c17651e = c14873e.f29453e;
                        this.f33333e = c17651e;
                        this.f33334e = c14873e;
                        this.f33336e = 0;
                        this.f33335e = 1;
                        Object appmetrica = c17651e.appmetrica(this);
                        obj2 = c17651e;
                        if (appmetrica == enumC2821e) {
                            return enumC2821e;
                        }
                    } else {
                        if (i15 != 1) {
                            if (i15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            InterfaceC4619e interfaceC4619e = (InterfaceC4619e) this.f33333e;
                            AbstractC2003e.purchase(obj);
                            r1 = interfaceC4619e;
                            Unit unit4 = Unit.INSTANCE;
                            ((C17651e) r1).billing(null);
                            return Unit.INSTANCE;
                        }
                        i3 = this.f33336e;
                        c14873e = (C14873e) this.f33334e;
                        Object obj5 = (InterfaceC4619e) this.f33333e;
                        AbstractC2003e.purchase(obj);
                        obj2 = obj5;
                    }
                    r1 = obj2;
                    if (AbstractC7890e.billing((InterfaceC12135e) c14873e.f29454e.getValue(), C9309e.vip)) {
                        c14873e.f29454e.setValue(C9309e.metrica);
                        this.f33333e = obj2;
                        this.f33334e = null;
                        this.f33336e = i3;
                        this.f33335e = 2;
                        r1 = obj2;
                        if (C14873e.m3871volatile(c14873e, this) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                    Unit unit42 = Unit.INSTANCE;
                    ((C17651e) r1).billing(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    ((C17651e) r1).billing(null);
                    throw th;
                }
            case 4:
                int i16 = this.f33336e;
                if (i16 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7838e c7838e = VKXApplication.f36530e;
                    C7838e c7838e2 = c7838e != null ? c7838e : null;
                    InterfaceC1686e interfaceC1686e = (InterfaceC1686e) this.f33333e;
                    C0370e c0370e = (C0370e) this.f33334e;
                    int i17 = this.f33335e;
                    AbstractC16049e abstractC16049e = (AbstractC16049e) c0370e.ad.get(((C8264e) ((C6571e) obj3).f13544e).vip.ad);
                    this.f33336e = 1;
                    if (c7838e2.Signature(interfaceC1686e, c0370e, i17, abstractC16049e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                C7838e c7838e3 = VKXApplication.f36530e;
                C7838e c7838e4 = c7838e3 != null ? c7838e3 : null;
                this.f33336e = 2;
                if (c7838e4.admob(this) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
            case 5:
                C0004e c0004e = (C0004e) obj3;
                C14197e c14197e = (C14197e) this.f33334e;
                C12742e c12742e2 = c14197e.f28049e;
                C12742e c12742e3 = c14197e.f28054e;
                C12742e c12742e4 = c14197e.f28052e;
                int i18 = this.f33335e;
                if (i18 == 0) {
                    AbstractC2003e.purchase(obj);
                    String str = c0004e.metrica;
                    String str2 = c0004e.metrica;
                    if (AbstractC13480e.ads(c12742e4, str)) {
                        AbstractC9476e.vip(c12742e4).remove(str2);
                    } else {
                        if (str2 == null) {
                            return Unit.INSTANCE;
                        }
                        c12742e4.add(str2);
                    }
                    if (!AbstractC13480e.ads(c12742e3, str2)) {
                        indexOf = c12742e2.indexOf(c0004e) + 1;
                        C8221e vip = AbstractC1831e.vip();
                        if (str2 == null) {
                            return Unit.INSTANCE;
                        }
                        this.f33333e = c12742e2;
                        this.f33336e = indexOf;
                        this.f33335e = 1;
                        C5577e c5577e = new C5577e("audio.getRelatedArtistsById", C10990e.f21761e);
                        c5577e.ad("artist_id", str2);
                        c5577e.vip(0, "offset");
                        c5577e.vip(10, "count");
                        license = vip.license(c5577e, this);
                        if (license == enumC2821e) {
                            return enumC2821e;
                        }
                        c12742e = c12742e2;
                    }
                    c14197e.f28048e = null;
                    return Unit.INSTANCE;
                }
                if (i18 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i19 = this.f33336e;
                C12742e c12742e5 = (C12742e) this.f33333e;
                AbstractC2003e.purchase(obj);
                c12742e = c12742e5;
                indexOf = i19;
                license = obj;
                C16339e c16339e = (C16339e) AbstractC3425e.adcel((AbstractC9200e) license);
                List list = c16339e != null ? c16339e.ad : null;
                if (list == null) {
                    list = C13664e.f27089e;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list) {
                    if (!c12742e2.contains((C0004e) obj6)) {
                        arrayList.add(obj6);
                    }
                }
                c12742e.addAll(indexOf, AbstractC13480e.m3602switch(arrayList, 3));
                c12742e3.add(c0004e.metrica);
                c14197e.f28048e = null;
                return Unit.INSTANCE;
            case 6:
                SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity = (SmallPlayerGlanceConfigurationActivity) obj3;
                int i20 = this.f33336e;
                if (i20 == 0) {
                    AbstractC2003e.purchase(obj);
                    C1890e c1890e = new C1890e(smallPlayerGlanceConfigurationActivity);
                    int i21 = this.f33335e;
                    if (c1890e.vip.getAppWidgetInfo(i21) == null) {
                        throw new IllegalArgumentException("Invalid AppWidget ID.");
                    }
                    c10838e = new C10838e(i21);
                    C5717e c5717e = C5717e.metrica;
                    C10954e c10954e = new C10954e(smallPlayerGlanceConfigurationActivity, r4, 16);
                    this.f33333e = smallPlayerGlanceConfigurationActivity;
                    this.f33334e = c10838e;
                    this.f33336e = 1;
                    if (AbstractC7354e.billing(smallPlayerGlanceConfigurationActivity, c5717e, c10838e, c10954e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    c10838e = (C10838e) this.f33334e;
                    smallPlayerGlanceConfigurationActivity = (SmallPlayerGlanceConfigurationActivity) this.f33333e;
                    AbstractC2003e.purchase(obj);
                }
                ?? obj7 = new Object();
                this.f33333e = null;
                this.f33334e = null;
                this.f33336e = 2;
                if (obj7.billing(smallPlayerGlanceConfigurationActivity, c10838e, this) == enumC2821e) {
                    return enumC2821e;
                }
                return Unit.INSTANCE;
            default:
                C5422e c5422e2 = (C5422e) obj3;
                int i22 = this.f33335e;
                if (i22 == 0) {
                    AbstractC2003e.purchase(obj);
                    AbstractC11110e abstractC11110e = C5422e.f11613e;
                    m1911package = c5422e2.m1911package();
                    c5422e2.f11615e.setValue(null);
                    C17647e c17647e = C14157e.f27993e;
                    long Signature = AbstractC0326e.Signature(2, EnumC15934e.SECONDS);
                    this.f33333e = c5422e2;
                    this.f33334e = m1911package;
                    this.f33336e = 0;
                    this.f33335e = 1;
                    if (AbstractC16481e.metrica(Signature, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m1911package = (C0505e) this.f33334e;
                        c5422e = (C5422e) this.f33333e;
                        AbstractC2003e.purchase(obj);
                        Boolean bool = (Boolean) ((C14688e) AbstractC1831e.ad().purchase.yandex).f29092e.getValue();
                        bool.getClass();
                        c5422e.f11616e.setValue(bool);
                        c5422e.f11615e.setValue(m1911package);
                        return Unit.INSTANCE;
                    }
                    i3 = this.f33336e;
                    m1911package = (C0505e) this.f33334e;
                    c5422e2 = (C5422e) this.f33333e;
                    AbstractC2003e.purchase(obj);
                }
                AbstractC1831e.ad().ad();
                C18046e ad = AbstractC1831e.ad();
                this.f33333e = c5422e2;
                this.f33334e = m1911package;
                this.f33336e = i3;
                this.f33335e = 2;
                if (ad.vip(this) == enumC2821e) {
                    return enumC2821e;
                }
                c5422e = c5422e2;
                Boolean bool2 = (Boolean) ((C14688e) AbstractC1831e.ad().purchase.yandex).f29092e.getValue();
                bool2.getClass();
                c5422e.f11616e.setValue(bool2);
                c5422e.f11615e.setValue(m1911package);
                return Unit.INSTANCE;
        }
    }
}
