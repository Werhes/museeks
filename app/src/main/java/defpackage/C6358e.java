package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6358e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f13204e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f13205e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13206e;

    public /* synthetic */ C6358e(Object obj, Object obj2, int i) {
        this.f13206e = i;
        this.f13205e = obj;
        this.f13204e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v46 */
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        Object obj5;
        boolean z2;
        Object obj6;
        boolean z3;
        ?? r7;
        Object obj7;
        String str;
        int i = this.f13206e;
        C0115e c0115e = C0115e.f1276e;
        int i2 = 8;
        int i3 = 4;
        Object obj8 = C2987e.ad;
        Object obj9 = this.f13204e;
        Object obj10 = this.f13205e;
        switch (i) {
            case 0:
                C16875e c16875e = (C16875e) obj10;
                C2038e c2038e = ((C13621e) obj9).ad;
                C13770e c13770e = (C13770e) obj3;
                ((Integer) obj4).getClass();
                boolean z4 = c16875e.metrica == EnumC11342e.f22808e;
                String str2 = c16875e.ad.ad;
                C3177e c3177e = (C3177e) c2038e.adcel.getValue();
                C14137e c14137e = c2038e.advert;
                String str3 = c16875e.license;
                boolean yandex = c13770e.yandex(c2038e);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == obj8) {
                    m3681throw = new C0638e(1, c2038e, C2038e.class, "onTrackClickedInQueue", "onTrackClickedInQueue(Lbruhcollective/itaysonlab/playback/PlaybackItem;)V", 0, 0, 7);
                    c13770e.m3682throws(m3681throw);
                }
                Function1 function1 = (Function1) ((InterfaceC5261e) m3681throw);
                boolean yandex2 = c13770e.yandex(c2038e);
                Object m3681throw2 = c13770e.m3681throw();
                if (yandex2 || m3681throw2 == obj8) {
                    m3681throw2 = new C0638e(1, c2038e, C2038e.class, "onTrackMenuClickedInQueue", "onTrackMenuClickedInQueue(Lbruhcollective/itaysonlab/playback/PlaybackItem;)V", 0, 0, 8);
                    c13770e.m3682throws(m3681throw2);
                }
                Function1 function12 = (Function1) ((InterfaceC5261e) m3681throw2);
                boolean yandex3 = c13770e.yandex(c2038e);
                Object m3681throw3 = c13770e.m3681throw();
                if (yandex3 || m3681throw3 == obj8) {
                    m3681throw3 = new C0638e(1, c2038e, C2038e.class, "onTrackDismissedFromQueue", "onTrackDismissedFromQueue(Lbruhcollective/itaysonlab/playback/PlaybackItem;)V", 0, 0, 9);
                    c13770e.m3682throws(m3681throw3);
                }
                Function1 function13 = (Function1) ((InterfaceC5261e) m3681throw3);
                boolean yandex4 = c13770e.yandex(c2038e);
                Object m3681throw4 = c13770e.m3681throw();
                if (yandex4 || m3681throw4 == obj8) {
                    m3681throw4 = new C14874e(2, c2038e, C2038e.class, "onTrackMovedFromQueue", "onTrackMovedFromQueue(II)V", 0, 0, 0);
                    c13770e.m3682throws(m3681throw4);
                }
                Function2 function2 = (Function2) ((InterfaceC5261e) m3681throw4);
                boolean yandex5 = c13770e.yandex(c2038e);
                Object m3681throw5 = c13770e.m3681throw();
                if (yandex5 || m3681throw5 == obj8) {
                    m3681throw5 = new Cvolatile(0, c2038e, C2038e.class, "onCreatePlaylistFromQueueClicked", "onCreatePlaylistFromQueueClicked()V", 0, 0, 11);
                    c13770e.m3682throws(m3681throw5);
                }
                C14155e.ad(z4, str2, c3177e, c14137e, str3, function1, function12, function13, function2, (Function0) ((InterfaceC5261e) m3681throw5), AbstractC5400e.billing(AbstractC12220e.loadAd(AbstractC18007e.metrica, 0.0f, 16, 0.0f, 0.0f, 13), AbstractC5400e.startapp), c13770e, 0);
                return Unit.INSTANCE;
            case 1:
                C3409e c3409e = (C3409e) obj9;
                InterfaceC5726e interfaceC5726e = (InterfaceC5726e) obj2;
                C13770e c13770e2 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.metrica, (InterfaceC12123e) obj10);
                InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
                long j = c13770e2.f27286case;
                int i4 = (int) (j ^ (j >>> 32));
                InterfaceC3483e advert = c13770e2.advert();
                InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, adcel);
                InterfaceC5685e.mopub.getClass();
                Function0 function0 = C2721e.vip;
                c13770e2.m3666import();
                if (c13770e2.f27292implements) {
                    c13770e2.mopub(function0);
                } else {
                    c13770e2.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e2, license, C2721e.billing);
                AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
                AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                if (interfaceC5726e.equals(C1492e.ad)) {
                    c13770e2.m3676strictfp(31764520);
                    AbstractC10558e.license(AbstractC11160e.metrica, c13770e2, 6);
                    c13770e2.Signature(false);
                } else if (interfaceC5726e instanceof C1656e) {
                    c13770e2.m3676strictfp(31913754);
                    Exception exc = ((C1656e) interfaceC5726e).ad;
                    boolean yandex6 = c13770e2.yandex(c3409e);
                    Object m3681throw6 = c13770e2.m3681throw();
                    if (yandex6 || m3681throw6 == obj8) {
                        m3681throw6 = new C12829e(0, c3409e, C3409e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 19);
                        c13770e2.m3682throws(m3681throw6);
                    }
                    AbstractC10558e.metrica(exc, (Function0) ((InterfaceC5261e) m3681throw6), c13770e2, 0);
                    c13770e2.Signature(false);
                } else if (interfaceC5726e.equals(C1132e.ad)) {
                    c13770e2.m3676strictfp(32213648);
                    AbstractC10558e.license(AbstractC11160e.license, c13770e2, 6);
                    c13770e2.Signature(false);
                } else if (interfaceC5726e.equals(C11599e.ad)) {
                    c13770e2.m3676strictfp(32465492);
                    AbstractC10558e.appmetrica(c3409e.f7621e.purchase(), c3409e.f7625e.purchase(), true, c13770e2, 384);
                    c13770e2.Signature(false);
                } else if (interfaceC5726e instanceof C10552e) {
                    c13770e2.m3676strictfp(32808631);
                    boolean yandex7 = c13770e2.yandex(c3409e);
                    Object m3681throw7 = c13770e2.m3681throw();
                    if (yandex7 || m3681throw7 == obj8) {
                        m3681throw7 = new C12829e(0, c3409e, C3409e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 20);
                        c13770e2.m3682throws(m3681throw7);
                    }
                    AbstractC10558e.vip(5, (Function0) ((InterfaceC5261e) m3681throw7), c13770e2, 0);
                    c13770e2.Signature(false);
                } else if (interfaceC5726e instanceof C12604e) {
                    c13770e2.m3676strictfp(33129884);
                    C12604e c12604e = (C12604e) interfaceC5726e;
                    boolean yandex8 = c13770e2.yandex(c3409e);
                    Object m3681throw8 = c13770e2.m3681throw();
                    if (yandex8 || m3681throw8 == obj8) {
                        m3681throw8 = new C12829e(0, c3409e, C3409e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 21);
                        c13770e2.m3682throws(m3681throw8);
                    }
                    c3409e.m1356strictfp(c12604e, (Function0) ((InterfaceC5261e) m3681throw8), c13770e2, 0);
                    c13770e2.Signature(false);
                } else {
                    if (!(interfaceC5726e instanceof C11884e)) {
                        if (!interfaceC5726e.equals(C2069e.ad)) {
                            throw AbstractC1786e.loadAd(139572090, c13770e2, false);
                        }
                        c13770e2.m3676strictfp(33909844);
                        boolean yandex9 = c13770e2.yandex(c3409e);
                        Object m3681throw9 = c13770e2.m3681throw();
                        if (yandex9 || m3681throw9 == obj8) {
                            z = true;
                            Object c15442e = new C15442e(c3409e, 1);
                            c13770e2.m3682throws(c15442e);
                            obj5 = c15442e;
                        } else {
                            z = true;
                            obj5 = m3681throw9;
                        }
                        c3409e.m1355private((Function0) obj5, c13770e2, 0);
                        c13770e2.Signature(false);
                        c13770e2.Signature(z);
                        return Unit.INSTANCE;
                    }
                    c13770e2.m3676strictfp(33446673);
                    String str4 = ((C11884e) interfaceC5726e).ad;
                    boolean yandex10 = c13770e2.yandex(c3409e);
                    Object m3681throw10 = c13770e2.m3681throw();
                    Object obj11 = m3681throw10;
                    if (yandex10 || m3681throw10 == obj8) {
                        Object c15442e2 = new C15442e(c3409e, 0);
                        c13770e2.m3682throws(c15442e2);
                        obj11 = c15442e2;
                    }
                    Function0 function02 = (Function0) obj11;
                    boolean yandex11 = c13770e2.yandex(c3409e);
                    Object m3681throw11 = c13770e2.m3681throw();
                    if (yandex11 || m3681throw11 == obj8) {
                        m3681throw11 = new C12829e(0, c3409e, C3409e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 22);
                        c13770e2.m3682throws(m3681throw11);
                    }
                    AbstractC10558e.purchase(str4, function02, (Function0) ((InterfaceC5261e) m3681throw11), c13770e2, 6);
                    c13770e2.Signature(false);
                }
                z = true;
                c13770e2.Signature(z);
                return Unit.INSTANCE;
            case 2:
                C1963e c1963e = (C1963e) obj9;
                InterfaceC3851e interfaceC3851e = (InterfaceC3851e) obj2;
                C13770e c13770e3 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                InterfaceC12864e adcel2 = AbstractC12220e.adcel(AbstractC18007e.metrica, (InterfaceC12123e) obj10);
                InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
                long j2 = c13770e3.f27286case;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC3483e advert2 = c13770e3.advert();
                InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, adcel2);
                InterfaceC5685e.mopub.getClass();
                Function0 function03 = C2721e.vip;
                c13770e3.m3666import();
                if (c13770e3.f27292implements) {
                    c13770e3.mopub(function03);
                } else {
                    c13770e3.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e3, license2, C2721e.billing);
                AbstractC2270e.yandex(c13770e3, advert2, C2721e.purchase);
                AbstractC2270e.yandex(c13770e3, Integer.valueOf(i5), C2721e.adcel);
                AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                AbstractC2270e.yandex(c13770e3, purchase2, C2721e.license);
                if (interfaceC3851e.equals(C2100e.ad)) {
                    c13770e3.m3676strictfp(228898798);
                    AbstractC10558e.license(AbstractC7844e.metrica, c13770e3, 6);
                    c13770e3.Signature(false);
                } else if (interfaceC3851e instanceof C5561e) {
                    c13770e3.m3676strictfp(229045986);
                    Exception exc2 = ((C5561e) interfaceC3851e).ad;
                    boolean yandex12 = c13770e3.yandex(c1963e);
                    Object m3681throw12 = c13770e3.m3681throw();
                    if (yandex12 || m3681throw12 == obj8) {
                        m3681throw12 = new C12829e(0, c1963e, C1963e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 24);
                        c13770e3.m3682throws(m3681throw12);
                    }
                    AbstractC10558e.metrica(exc2, (Function0) ((InterfaceC5261e) m3681throw12), c13770e3, 0);
                    c13770e3.Signature(false);
                } else if (interfaceC3851e.equals(C5252e.ad)) {
                    c13770e3.m3676strictfp(229352979);
                    if (c1963e.f5159e.isEmpty()) {
                        z3 = false;
                        c13770e3.m3676strictfp(229506894);
                        AbstractC10558e.license(AbstractC7844e.license, c13770e3, 6);
                        c13770e3.Signature(false);
                    } else {
                        c13770e3.m3676strictfp(229406082);
                        z3 = false;
                        c1963e.m738strictfp(c13770e3, 0);
                        c13770e3.Signature(false);
                    }
                    c13770e3.Signature(z3);
                } else if (interfaceC3851e.equals(C8504e.ad)) {
                    c13770e3.m3676strictfp(229878894);
                    AbstractC10558e.license(AbstractC7844e.appmetrica, c13770e3, 6);
                    c13770e3.Signature(false);
                } else if (interfaceC3851e.equals(C8520e.ad)) {
                    c13770e3.m3676strictfp(230025555);
                    boolean yandex13 = c13770e3.yandex(c1963e);
                    Object m3681throw13 = c13770e3.m3681throw();
                    if (yandex13 || m3681throw13 == obj8) {
                        m3681throw13 = new C12829e(0, c1963e, C1963e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 25);
                        c13770e3.m3682throws(m3681throw13);
                    }
                    c1963e.m737private((Function0) ((InterfaceC5261e) m3681throw13), c13770e3, 0);
                    c13770e3.Signature(false);
                } else if (interfaceC3851e instanceof C11536e) {
                    c13770e3.m3676strictfp(230295193);
                    String str5 = ((C11536e) interfaceC3851e).ad;
                    boolean yandex14 = c13770e3.yandex(c1963e);
                    Object m3681throw14 = c13770e3.m3681throw();
                    Object obj12 = m3681throw14;
                    if (yandex14 || m3681throw14 == obj8) {
                        Object c15597e = new C15597e(c1963e, 0);
                        c13770e3.m3682throws(c15597e);
                        obj12 = c15597e;
                    }
                    Function0 function04 = (Function0) obj12;
                    boolean yandex15 = c13770e3.yandex(c1963e);
                    Object m3681throw15 = c13770e3.m3681throw();
                    if (yandex15 || m3681throw15 == obj8) {
                        m3681throw15 = new C12829e(0, c1963e, C1963e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 26);
                        c13770e3.m3682throws(m3681throw15);
                    }
                    AbstractC10558e.purchase(str5, function04, (Function0) ((InterfaceC5261e) m3681throw15), c13770e3, 6);
                    c13770e3.Signature(false);
                } else if (interfaceC3851e.equals(C4192e.ad)) {
                    c13770e3.m3676strictfp(230759449);
                    AbstractC10558e.appmetrica(c1963e.f5158e.purchase(), c1963e.f5160e.purchase(), false, c13770e3, 384);
                    c13770e3.Signature(false);
                } else {
                    if (!(interfaceC3851e instanceof C9827e)) {
                        if (!interfaceC3851e.equals(C3902e.ad)) {
                            throw AbstractC1786e.loadAd(-131163073, c13770e3, false);
                        }
                        c13770e3.m3676strictfp(231310970);
                        boolean yandex16 = c13770e3.yandex(c1963e);
                        Object m3681throw16 = c13770e3.m3681throw();
                        if (yandex16 || m3681throw16 == obj8) {
                            z2 = true;
                            Object c15597e2 = new C15597e(c1963e, 1);
                            c13770e3.m3682throws(c15597e2);
                            obj6 = c15597e2;
                        } else {
                            z2 = true;
                            obj6 = m3681throw16;
                        }
                        c1963e.m736package((Function0) obj6, c13770e3, 0);
                        c13770e3.Signature(false);
                        c13770e3.Signature(z2);
                        return Unit.INSTANCE;
                    }
                    c13770e3.m3676strictfp(231100573);
                    int i6 = ((C9827e) interfaceC3851e).ad;
                    boolean yandex17 = c13770e3.yandex(c1963e);
                    Object m3681throw17 = c13770e3.m3681throw();
                    if (yandex17 || m3681throw17 == obj8) {
                        m3681throw17 = new C12829e(0, c1963e, C1963e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 27);
                        c13770e3.m3682throws(m3681throw17);
                    }
                    AbstractC10558e.vip(i6, (Function0) ((InterfaceC5261e) m3681throw17), c13770e3, 0);
                    c13770e3.Signature(false);
                }
                z2 = true;
                c13770e3.Signature(z2);
                return Unit.INSTANCE;
            case 3:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj10;
                C1374e c1374e = (C1374e) obj9;
                int intValue = ((Integer) obj2).intValue();
                C13770e c13770e4 = (C13770e) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                C13964e billing = AbstractC16497e.billing(8);
                C7913e c7913e = AbstractC18007e.metrica;
                boolean yandex18 = c13770e4.yandex(c1374e) | ((((intValue2 & 112) ^ 48) > 32 && c13770e4.license(intValue)) || (intValue2 & 48) == 32);
                Object m3681throw18 = c13770e4.m3681throw();
                if (yandex18 || m3681throw18 == obj8) {
                    m3681throw18 = new C17766e(c1374e, intValue, i3);
                    c13770e4.m3682throws(m3681throw18);
                }
                AbstractC7023e.ad(c7913e, null, interfaceC12123e, billing, null, null, false, null, (Function1) m3681throw18, c13770e4, 24582, 490);
                return Unit.INSTANCE;
            case 4:
                C2892e c2892e = (C2892e) obj10;
                C2892e c2892e2 = (C2892e) obj9;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                C13770e c13770e5 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                if (booleanValue) {
                    c13770e5.m3676strictfp(-1198121255);
                    c2892e.invoke(c13770e5, 0);
                    c13770e5.Signature(false);
                } else {
                    c13770e5.m3676strictfp(-1198070570);
                    c2892e2.invoke(c13770e5, 0);
                    c13770e5.Signature(false);
                }
                return Unit.INSTANCE;
            case 5:
                C1718e c1718e = (C1718e) obj10;
                C16349e c16349e = (C16349e) obj9;
                int intValue3 = ((Integer) obj2).intValue();
                C13770e c13770e6 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                C12742e c12742e = c1718e.f4674e;
                if (intValue3 != c12742e.size()) {
                    c13770e6.m3676strictfp(-570081909);
                    c1718e.m683strictfp(intValue3 == c16349e.loadAd(), (AudioSnippetEntry) c12742e.get(intValue3), c13770e6, 0);
                    c13770e6.Signature(false);
                } else {
                    c13770e6.m3676strictfp(-569846960);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11700e, false);
                    long j3 = c13770e6.f27286case;
                    int i7 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e6.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e6, metrica);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e6.m3666import();
                    if (c13770e6.f27292implements) {
                        c13770e6.mopub(c7309e);
                    } else {
                        c13770e6.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e6, license3, C2721e.billing);
                    AbstractC2270e.yandex(c13770e6, advert3, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e6, Integer.valueOf(i7), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e6, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e6, purchase3, C2721e.license);
                    AbstractC6232e.vip(null, 0L, null, c13770e6, 0, 7);
                    c13770e6.Signature(true);
                    c13770e6.Signature(false);
                }
                return Unit.INSTANCE;
            case 6:
                final C3566e c3566e = (C3566e) obj10;
                final InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj9;
                C13770e c13770e7 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                int ordinal = ((EnumC10826e) obj2).ordinal();
                if (ordinal == 0) {
                    c13770e7.m3676strictfp(509521960);
                    c3566e.isPro(c3566e.f8048e, c13770e7, 48);
                    c13770e7.Signature(false);
                } else if (ordinal == 1) {
                    c13770e7.m3676strictfp(509768348);
                    boolean yandex19 = c13770e7.yandex(c3566e);
                    Object m3681throw19 = c13770e7.m3681throw();
                    Object obj13 = m3681throw19;
                    if (yandex19 || m3681throw19 == obj8) {
                        Object c7604e = new C7604e(c3566e, 5);
                        c13770e7.m3682throws(c7604e);
                        obj13 = c7604e;
                    }
                    Function0 function05 = (Function0) obj13;
                    boolean yandex20 = c13770e7.yandex(interfaceC18435e) | c13770e7.yandex(c3566e);
                    Object m3681throw20 = c13770e7.m3681throw();
                    if (yandex20 || m3681throw20 == obj8) {
                        r7 = 0;
                        final boolean z5 = false ? 1 : 0;
                        Object obj14 = new Function0() { // from class: eؔٓۧ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (z5) {
                                    case 0:
                                        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C14358e(c3566e, null, 1), 3);
                                        return Unit.INSTANCE;
                                    default:
                                        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C14358e(c3566e, null, 2), 3);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e7.m3682throws(obj14);
                        obj7 = obj14;
                    } else {
                        r7 = 0;
                        obj7 = m3681throw20;
                    }
                    c3566e.subs(function05, (Function0) obj7, c13770e7, r7);
                    c13770e7.Signature(r7);
                } else if (ordinal == 2) {
                    c13770e7.m3676strictfp(510178509);
                    boolean yandex21 = c13770e7.yandex(c3566e);
                    Object m3681throw21 = c13770e7.m3681throw();
                    Object obj15 = m3681throw21;
                    if (yandex21 || m3681throw21 == obj8) {
                        Object c7604e2 = new C7604e(c3566e, 6);
                        c13770e7.m3682throws(c7604e2);
                        obj15 = c7604e2;
                    }
                    Function0 function06 = (Function0) obj15;
                    boolean yandex22 = c13770e7.yandex(interfaceC18435e) | c13770e7.yandex(c3566e);
                    Object m3681throw22 = c13770e7.m3681throw();
                    Object obj16 = m3681throw22;
                    if (yandex22 || m3681throw22 == obj8) {
                        final int i8 = 1;
                        Object obj17 = new Function0() { // from class: eؔٓۧ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i8) {
                                    case 0:
                                        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C14358e(c3566e, null, 1), 3);
                                        return Unit.INSTANCE;
                                    default:
                                        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C14358e(c3566e, null, 2), 3);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e7.m3682throws(obj17);
                        obj16 = obj17;
                    }
                    c3566e.premium(function06, (Function0) obj16, c13770e7, 0);
                    c13770e7.Signature(false);
                } else if (ordinal == 3) {
                    c13770e7.m3676strictfp(510597908);
                    c3566e.f8050e.tapsense(c13770e7, 0);
                    c13770e7.Signature(false);
                } else if (ordinal == 4) {
                    c13770e7.m3676strictfp(510840917);
                    C13552e c13552e = c3566e.f8047e;
                    if (c13552e == null) {
                        c13770e7.m3676strictfp(510888284);
                        c13770e7.Signature(false);
                    } else {
                        c13770e7.m3676strictfp(1956142917);
                        c13552e.tapsense(c13770e7, 0);
                        c13770e7.Signature(false);
                        Unit unit = Unit.INSTANCE;
                    }
                    c13770e7.Signature(false);
                } else {
                    if (ordinal != 5) {
                        throw AbstractC1786e.loadAd(1956098410, c13770e7, false);
                    }
                    c13770e7.m3676strictfp(510728356);
                    c3566e.crashlytics(c13770e7, 0);
                    c13770e7.Signature(false);
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function14 = (Function1) obj9;
                int intValue4 = ((Integer) obj2).intValue();
                C13770e c13770e8 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                AudioStreamMix audioStreamMix = (AudioStreamMix) ((C15747e) obj10).ad.get(intValue4);
                InterfaceC12864e metrica2 = AbstractC18007e.metrica(AbstractC12220e.smaato(c0115e, 24, 0.0f, 2), 1.0f);
                C13964e billing2 = AbstractC16497e.billing(16);
                C9577e c9577e = C5438e.f11672e;
                C4789e ad = AbstractC14801e.ad(billing2, c9577e, c13770e8, 6);
                long j4 = c13770e8.f27286case;
                int i9 = (int) (j4 ^ (j4 >>> 32));
                InterfaceC3483e advert4 = c13770e8.advert();
                InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e8, metrica2);
                InterfaceC5685e.mopub.getClass();
                C7309e c7309e2 = C2721e.vip;
                c13770e8.m3666import();
                if (c13770e8.f27292implements) {
                    c13770e8.mopub(c7309e2);
                } else {
                    c13770e8.m3684volatile();
                }
                C14865e c14865e = C2721e.billing;
                AbstractC2270e.yandex(c13770e8, ad, c14865e);
                C14865e c14865e2 = C2721e.purchase;
                AbstractC2270e.yandex(c13770e8, advert4, c14865e2);
                Integer valueOf = Integer.valueOf(i9);
                C14865e c14865e3 = C2721e.adcel;
                AbstractC2270e.yandex(c13770e8, valueOf, c14865e3);
                C5430e c5430e = C2721e.mopub;
                AbstractC2270e.purchase(c13770e8, c5430e);
                C14865e c14865e4 = C2721e.license;
                AbstractC2270e.yandex(c13770e8, purchase4, c14865e4);
                C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(4), c9577e, c13770e8, 6);
                long j5 = c13770e8.f27286case;
                int i10 = (int) (j5 ^ (j5 >>> 32));
                InterfaceC3483e advert5 = c13770e8.advert();
                InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e8, c0115e);
                c13770e8.m3666import();
                if (c13770e8.f27292implements) {
                    c13770e8.mopub(c7309e2);
                } else {
                    c13770e8.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e8, ad2, c14865e);
                AbstractC2270e.yandex(c13770e8, advert5, c14865e2);
                AbstractC8703e.premium(i10, c13770e8, c14865e3, c13770e8, c5430e);
                AbstractC2270e.yandex(c13770e8, purchase5, c14865e4);
                AudioStreamMix.Link link = audioStreamMix.license;
                if (link == null || (str = link.vip) == null) {
                    str = audioStreamMix.vip;
                }
                String str6 = str;
                C15492e c15492e = AbstractC17878e.ad;
                AbstractC10600e.vip(str6, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C10375e) c13770e8.adcel(c15492e)).billing, c13770e8, 0, 0, 65534);
                AbstractC10600e.vip(audioStreamMix.metrica, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C10375e) c13770e8.adcel(c15492e)).adcel, c13770e8, 0, 0, 65534);
                c13770e8.Signature(true);
                C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e8, 0);
                long j6 = c13770e8.f27286case;
                int i11 = (int) (j6 ^ (j6 >>> 32));
                InterfaceC3483e advert6 = c13770e8.advert();
                InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e8, c0115e);
                c13770e8.m3666import();
                if (c13770e8.f27292implements) {
                    c13770e8.mopub(c7309e2);
                } else {
                    c13770e8.m3684volatile();
                }
                AbstractC2270e.yandex(c13770e8, ad3, c14865e);
                AbstractC2270e.yandex(c13770e8, advert6, c14865e2);
                AbstractC8703e.premium(i11, c13770e8, c14865e3, c13770e8, c5430e);
                AbstractC2270e.yandex(c13770e8, purchase6, c14865e4);
                C16005e c16005e = AbstractC2373e.metrica;
                C9010e ad4 = AbstractC2373e.ad(((C6032e) c13770e8.adcel(AbstractC12491e.ad)).startapp(), c13770e8, 254);
                boolean purchase7 = c13770e8.purchase(function14) | c13770e8.purchase(audioStreamMix);
                Object m3681throw23 = c13770e8.m3681throw();
                Object obj18 = m3681throw23;
                if (purchase7 || m3681throw23 == obj8) {
                    Object c16200e = new C16200e(function14, audioStreamMix, 2);
                    c13770e8.m3682throws(c16200e);
                    obj18 = c16200e;
                }
                AbstractC11138e.ad((Function0) obj18, null, ad4, c16005e, AbstractC6537e.ad, c13770e8, 0, 2942);
                c13770e8.Signature(true);
                c13770e8.Signature(true);
                return Unit.INSTANCE;
            default:
                C13552e c13552e2 = (C13552e) obj10;
                Object obj19 = (InterfaceC18435e) obj9;
                C13770e c13770e9 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                int ordinal2 = ((EnumC1894e) obj2).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        c13770e9.m3676strictfp(-378633964);
                        c13552e2.isPro(c13770e9, 0);
                        c13770e9.Signature(false);
                    } else if (ordinal2 == 2) {
                        c13770e9.m3676strictfp(-378527634);
                        boolean yandex23 = c13770e9.yandex(c13552e2) | c13770e9.yandex(obj19);
                        Object m3681throw24 = c13770e9.m3681throw();
                        Object obj20 = m3681throw24;
                        if (yandex23 || m3681throw24 == obj8) {
                            Object c13942e = new C13942e(c13552e2, obj19, i2);
                            c13770e9.m3682throws(c13942e);
                            obj20 = c13942e;
                        }
                        c13552e2.inmobi((Function1) obj20, c13770e9, 0);
                        c13770e9.Signature(false);
                    } else if (ordinal2 != 3) {
                        throw AbstractC1786e.loadAd(957611505, c13770e9, false);
                    }
                    return Unit.INSTANCE;
                }
                c13770e9.m3676strictfp(-378741937);
                c13552e2.isVip(c13770e9, 0);
                c13770e9.Signature(false);
                return Unit.INSTANCE;
        }
    }
}
