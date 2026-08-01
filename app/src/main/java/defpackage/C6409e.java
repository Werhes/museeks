package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6409e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13283e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f13284e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f13285e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f13286e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13287e;

    public /* synthetic */ C6409e(InterfaceC3314e interfaceC3314e, Object obj, Object obj2, Object obj3, int i) {
        this.f13287e = i;
        this.f13283e = interfaceC3314e;
        this.f13285e = obj;
        this.f13284e = obj2;
        this.f13286e = obj3;
    }

    public /* synthetic */ C6409e(Object obj, InterfaceC3314e interfaceC3314e, Object obj2, Object obj3, int i) {
        this.f13287e = i;
        this.f13285e = obj;
        this.f13283e = interfaceC3314e;
        this.f13284e = obj2;
        this.f13286e = obj3;
    }

    public /* synthetic */ C6409e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f13287e = i;
        this.f13285e = obj;
        this.f13284e = obj2;
        this.f13286e = obj3;
        this.f13283e = obj4;
    }

    public /* synthetic */ C6409e(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f13287e = i2;
        this.f13285e = obj;
        this.f13284e = obj2;
        this.f13286e = obj3;
        this.f13283e = obj4;
    }

    private final Object ad(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((C11188e) this.f13285e).m3057transient((InterfaceC12864e) this.f13284e, (Function2) this.f13286e, (Function2) this.f13283e, (C13770e) obj, AbstractC5190e.advert(433));
        return Unit.INSTANCE;
    }

    private final Object adcel(Object obj, Object obj2) {
        InterfaceC12864e interfaceC12864e = (InterfaceC12864e) this.f13285e;
        C2892e c2892e = (C2892e) this.f13284e;
        C2892e c2892e2 = (C2892e) this.f13286e;
        Function3 function3 = (Function3) this.f13283e;
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Integer) obj2).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(16), C5438e.f11668e, c13770e, 54);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            C3533e c3533e = C3533e.ad;
            c2892e.invoke(c3533e, c13770e, 6);
            c2892e2.invoke(c3533e, c13770e, 6);
            function3.invoke(c3533e, c13770e, 6);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2) {
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f13283e;
        C8651e c8651e = (C8651e) this.f13285e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) this.f13284e;
        C2892e c2892e = (C2892e) this.f13286e;
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Integer) obj2).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
            InterfaceC12864e startapp = AbstractC11203e.startapp(C0115e.f1276e, "Container");
            C17642e c17642e = new C17642e(0, 3, InterfaceC3314e.class, interfaceC3314e, "value", "getValue()Ljava/lang/Object;");
            InterfaceC3886e purchase = AbstractC2754e.purchase(c8651e);
            float f = AbstractC11257e.ad;
            InterfaceC12864e appmetrica = AbstractC5750e.appmetrica(startapp, new Cthrows(28, c17642e, interfaceC12123e, purchase));
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, true);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, appmetrica);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, license, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            c2892e.invoke(c13770e, 0);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object license(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((C10797e) this.f13285e).m2934return((CachedTrack) this.f13284e, (Function0) this.f13286e, (Function0) this.f13283e, (C13770e) obj, AbstractC5190e.advert(1));
        return Unit.INSTANCE;
    }

    private final Object purchase(Object obj, Object obj2) {
        Integer valueOf;
        C2892e c2892e = (C2892e) this.f13285e;
        Function2 function2 = (Function2) this.f13284e;
        final Function4 function4 = (Function4) this.f13286e;
        final InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f13283e;
        final InterfaceC7183e interfaceC7183e = (InterfaceC7183e) obj;
        C5602e c5602e = (C5602e) obj2;
        List subscription = interfaceC7183e.subscription(EnumC9320e.f18567e, c2892e);
        final ArrayList arrayList = new ArrayList(subscription.size());
        int size = subscription.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((InterfaceC16719e) subscription.get(i)).admob(C5602e.ad(0, 0, 0, 0, 10, c5602e.ad)));
        }
        int i2 = 1;
        int size2 = subscription.size() - 1;
        List subscription2 = interfaceC7183e.subscription(EnumC9320e.f18564e, new C2892e(2005070237, true, new C13752e(size2, function2)));
        final ArrayList arrayList2 = new ArrayList(subscription2.size());
        int size3 = subscription2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(((InterfaceC16719e) subscription2.get(i3)).admob(C5602e.ad(0, 0, 0, 0, 10, c5602e.ad)));
        }
        AbstractC2832e abstractC2832e = (AbstractC2832e) AbstractC13480e.m3604this(arrayList2);
        int i4 = abstractC2832e != null ? abstractC2832e.f6806e : 0;
        int size4 = arrayList.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size4; i6++) {
            i5 += ((AbstractC2832e) arrayList.get(i6)).f6806e;
        }
        final int i7 = (size2 * i4) + i5;
        if (arrayList.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((AbstractC2832e) arrayList.get(0)).f6804e);
            int billing = AbstractC6874e.billing(arrayList);
            if (1 <= billing) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((AbstractC2832e) arrayList.get(i2)).f6804e);
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == billing) {
                        break;
                    }
                    i2++;
                }
            }
        }
        final int intValue = valueOf != null ? valueOf.intValue() : 0;
        final int i8 = i4;
        return interfaceC7183e.ads(i7, intValue, C9139e.f18290e, new Function1() { // from class: eٌۡۥ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                InterfaceC7183e interfaceC7183e2;
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj3;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = arrayList;
                int size5 = arrayList4.size();
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    interfaceC7183e2 = interfaceC7183e;
                    if (i9 >= size5) {
                        break;
                    }
                    AbstractC2832e abstractC2832e2 = (AbstractC2832e) arrayList4.get(i9);
                    AbstractC3698e.advert(abstractC3698e, abstractC2832e2, i10, 0);
                    arrayList3.add(new C5819e(interfaceC7183e2.mo496final(i10), interfaceC7183e2.mo496final(0), interfaceC7183e2.mo496final(abstractC2832e2.f6806e + i10), interfaceC7183e2.mo496final(abstractC2832e2.f6804e)));
                    int i11 = i10 + abstractC2832e2.f6806e;
                    if (AbstractC6874e.billing(arrayList4) != i9) {
                        AbstractC3698e.advert(abstractC3698e, (AbstractC2832e) arrayList2.get(i9), i11, 0);
                    }
                    i10 = i11 + i8;
                    i9++;
                }
                List subscription3 = interfaceC7183e2.subscription(EnumC9320e.f18565e, new C2892e(900811855, true, new C18522e(function4, arrayList3, interfaceC3314e)));
                int size6 = subscription3.size();
                for (int i12 = 0; i12 < size6; i12++) {
                    InterfaceC16719e interfaceC16719e = (InterfaceC16719e) subscription3.get(i12);
                    int i13 = i7;
                    boolean z = i13 >= 0;
                    int i14 = intValue;
                    if (!(z & (i14 >= 0))) {
                        AbstractC15805e.ad("width and height must be >= 0");
                    }
                    AbstractC3698e.advert(abstractC3698e, interfaceC16719e.admob(AbstractC2278e.yandex(i13, i13, i14, i14)), 0, 0);
                }
                return Unit.INSTANCE;
            }
        });
    }

    private final Object startapp(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((C13622e) this.f13285e).m3625strictfp((C10985e) this.f13284e, (Function1) this.f13286e, (Function1) this.f13283e, (C13770e) obj, AbstractC5190e.advert(1));
        return Unit.INSTANCE;
    }

    private final Object vip(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ((C17047e) this.f13285e).m4235strictfp((CachedPlaylist) this.f13284e, (C2892e) this.f13286e, (InterfaceC12864e) this.f13283e, (C13770e) obj, AbstractC5190e.advert(49));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0339, code lost:
    
        if (r4 == r2) goto L82;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r53, java.lang.Object r54) {
        /*
            Method dump skipped, instructions count: 3458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6409e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
