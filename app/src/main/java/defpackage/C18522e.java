package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۧۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18522e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f36312e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f36313e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f36314e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36315e;

    public /* synthetic */ C18522e(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f36315e = i2;
        this.f36313e = obj;
        this.f36312e = obj2;
        this.f36314e = obj3;
    }

    public /* synthetic */ C18522e(int i, Object obj, Object obj2, Object obj3) {
        this.f36315e = i;
        this.f36313e = obj;
        this.f36312e = obj2;
        this.f36314e = obj3;
    }

    public /* synthetic */ C18522e(InterfaceC3314e interfaceC3314e, Object obj, Object obj2, int i) {
        this.f36315e = i;
        this.f36312e = interfaceC3314e;
        this.f36313e = obj;
        this.f36314e = obj2;
    }

    public /* synthetic */ C18522e(InterfaceC18435e interfaceC18435e, InterfaceC16132e interfaceC16132e, C13622e c13622e) {
        this.f36315e = 10;
        this.f36312e = interfaceC18435e;
        this.f36314e = c13622e;
        this.f36313e = interfaceC16132e;
    }

    public /* synthetic */ C18522e(Function4 function4, ArrayList arrayList, InterfaceC3314e interfaceC3314e) {
        this.f36315e = 7;
        this.f36313e = function4;
        this.f36314e = arrayList;
        this.f36312e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int ad;
        InterfaceC3314e interfaceC3314e;
        int i = this.f36315e;
        C5100e c5100e = AbstractC10432e.ad;
        C0115e c0115e = C0115e.f1276e;
        int i2 = 27;
        C5170e c5170e = C2987e.ad;
        int i3 = 1;
        Object obj3 = this.f36314e;
        Object obj4 = this.f36312e;
        Object obj5 = this.f36313e;
        switch (i) {
            case 0:
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj5;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) obj4;
                C11188e c11188e = (C11188e) obj3;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(1 & intValue, (intValue & 3) != 2)) {
                    AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.sort_horizontal_outline_28, 0, c13770e);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e, ((EnumC9603e) interfaceC16132e.getValue()).f19051e);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC5647e.vip(metrica, appmetrica, null, ((C7019e) c13770e.adcel(c15492e)).ad.admob, c13770e, 8, 4);
                    boolean booleanValue = ((Boolean) interfaceC3314e2.getValue()).booleanValue();
                    Object m3681throw = c13770e.m3681throw();
                    if (m3681throw == c5170e) {
                        m3681throw = new C1672e(interfaceC3314e2, i2);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC4709e.ad(booleanValue, (Function0) m3681throw, AbstractC16136e.metrica(c0115e, ((C7019e) c13770e.adcel(c15492e)).ad.subscription, c5100e), 0L, null, null, null, 0L, 0.0f, 0.0f, AbstractC16653e.license(1328118206, new C6710e(false ? 1 : 0, c11188e, interfaceC3314e2, interfaceC16132e), c13770e), c13770e, 48, 2040);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13240e c13240e = (C13240e) obj5;
                Context context = (Context) obj4;
                C10838e c10838e = (C10838e) obj3;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c13770e2.m3672private(-534706435);
                    Object adcel = c13770e2.adcel(AbstractC4449e.metrica);
                    if (adcel == null) {
                        throw new NullPointerException("null cannot be cast to non-null type bruhcollective.itaysonlab.libvkx.proto.appwidget.VkxPlaylistsWidgetState");
                    }
                    C13355e c13355e = (C13355e) adcel;
                    c13770e2.Signature(false);
                    InterfaceC5083e interfaceC5083e = null;
                    if (AbstractC0933e.ad) {
                        c13770e2.m3676strictfp(612289824);
                        C15492e c15492e2 = AbstractC4449e.vip;
                        if (((Context) c13770e2.adcel(c15492e2)).getResources().getResourceName(android.R.dimen.accessibility_touch_slop) != null) {
                            c13770e2.m3676strictfp(612401982);
                            int dimensionPixelSize = ((Context) c13770e2.adcel(c15492e2)).getResources().getDimensionPixelSize(android.R.dimen.accessibility_touch_slop);
                            c13770e2.Signature(false);
                            num = Integer.valueOf(dimensionPixelSize);
                        } else {
                            c13770e2.m3676strictfp(612527966);
                            c13770e2.Signature(false);
                            num = null;
                        }
                        c13770e2.Signature(false);
                    } else {
                        c13770e2.m3676strictfp(612567398);
                        c13770e2.Signature(false);
                        num = null;
                    }
                    if (num != null) {
                        ad = num.intValue();
                    } else {
                        VKXApplication.Companion companion = VKXApplication.f36531e;
                        ad = VKXApplication.Companion.ad(8.0f);
                    }
                    int i4 = ad;
                    boolean yandex = c13770e2.yandex(c13240e) | c13770e2.yandex(context) | c13770e2.yandex(c10838e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    Object obj6 = m3681throw2;
                    if (yandex || m3681throw2 == c5170e) {
                        C16115e c16115e = new C16115e(c13240e, context, c10838e, null);
                        c13770e2.m3682throws(c16115e);
                        obj6 = c16115e;
                    }
                    AbstractC17680e.license(c13770e2, c13355e, (Function2) obj6);
                    C1768e c1768e = (C1768e) AbstractC13480e.m3604this(c13355e.f26611e);
                    boolean purchase = c13770e2.purchase(c1768e != null ? c1768e.f4813e : null);
                    Object m3681throw3 = c13770e2.m3681throw();
                    Object obj7 = m3681throw3;
                    if (purchase || m3681throw3 == c5170e) {
                        C0576e startapp = AbstractC14533e.startapp(null);
                        c13770e2.m3682throws(startapp);
                        obj7 = startapp;
                    }
                    InterfaceC3314e interfaceC3314e3 = (InterfaceC3314e) obj7;
                    boolean purchase2 = c13770e2.purchase(c1768e != null ? c1768e.f4813e : null);
                    Object m3681throw4 = c13770e2.m3681throw();
                    Object obj8 = m3681throw4;
                    if (purchase2 || m3681throw4 == c5170e) {
                        C0576e startapp2 = AbstractC14533e.startapp(new C3618e(C3618e.vip));
                        c13770e2.m3682throws(startapp2);
                        obj8 = startapp2;
                    }
                    InterfaceC3314e interfaceC3314e4 = (InterfaceC3314e) obj8;
                    Object c12338e = c1768e != null ? new C12338e(new Intent("android.intent.action.VIEW").setClass(context, AppActivity.class).setData(Uri.parse(c1768e.f4811e)).putExtra("vkx_autoplay", true), AbstractC16091e.isVip((AbstractC12378e[]) Arrays.copyOf(new AbstractC12378e[0], 0))) : new C2703e(AbstractC16091e.isVip((AbstractC12378e[]) Arrays.copyOf(new AbstractC12378e[0], 0)));
                    String str = c1768e != null ? c1768e.f4813e : null;
                    boolean yandex2 = c13770e2.yandex(c1768e) | c13770e2.purchase(interfaceC3314e3) | c13770e2.yandex(context) | c13770e2.license(i4);
                    Object m3681throw5 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw5 == c5170e) {
                        C12228e c12228e = new C12228e(c1768e, context, i4, interfaceC3314e3, null, 4);
                        interfaceC3314e = interfaceC3314e3;
                        c13770e2.m3682throws(c12228e);
                        m3681throw5 = c12228e;
                    } else {
                        interfaceC3314e = interfaceC3314e3;
                    }
                    AbstractC17680e.license(c13770e2, str, (Function2) m3681throw5);
                    Bitmap bitmap = (Bitmap) interfaceC3314e.getValue();
                    boolean purchase3 = c13770e2.purchase(interfaceC3314e) | c13770e2.purchase(interfaceC3314e4);
                    Object m3681throw6 = c13770e2.m3681throw();
                    Object obj9 = m3681throw6;
                    if (purchase3 || m3681throw6 == c5170e) {
                        C8043e c8043e = new C8043e(interfaceC3314e, interfaceC3314e4, interfaceC5083e, i3);
                        c13770e2.m3682throws(c8043e);
                        obj9 = c8043e;
                    }
                    AbstractC17680e.license(c13770e2, bitmap, (Function2) obj9);
                    AbstractC11765e.vip(null, AbstractC16653e.license(-1529875697, new C0773e(c12338e, interfaceC3314e4, interfaceC3314e, c1768e, context, 5), c13770e2), c13770e2, 48);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC3314e interfaceC3314e5 = (InterfaceC3314e) obj4;
                C1768e c1768e2 = (C1768e) obj5;
                Context context2 = (Context) obj3;
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C5782e advert = AbstractC14430e.advert(AbstractC0933e.vip);
                    AbstractC11261e.ad(AbstractC10589e.license(new C4293e(advert, advert, advert, advert)), AbstractC16653e.license(2139342007, new C6710e(interfaceC3314e5, c1768e2, context2), c13770e3), c13770e3, 3072);
                    AbstractC5190e.metrica(new C8052e(C3618e.vip(0.75f, C3618e.appmetrica)), c13770e3, 0, 0);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC7111e.metrica((C2317e) obj5, (InterfaceC12864e) obj4, (C2892e) obj3, (C13770e) obj, AbstractC5190e.advert(391));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((C1374e) obj5).m577strictfp((C16742e) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((C1374e) obj5).m576private((C11590e) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC0903e.ad((C2357e) obj5, (List) obj4, (Function1) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 7:
                Function4 function4 = (Function4) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                InterfaceC3314e interfaceC3314e6 = (InterfaceC3314e) obj4;
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Boolean bool = (Boolean) interfaceC3314e6.getValue();
                    bool.booleanValue();
                    function4.invoke(arrayList, bool, c13770e4, 0);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                C7142e c7142e = (C7142e) obj5;
                C7765e c7765e = (C7765e) obj4;
                C2401e c2401e = (C2401e) obj;
                long startapp3 = C2152e.startapp(c7142e.f14622e, ((C2152e) obj2).ad);
                c7142e.f14622e = startapp3;
                c7765e.ads(EnumC12813e.f25633e, C2152e.startapp(((C7142e) obj3).f14622e, startapp3));
                if (c7765e.signatures(c7765e.amazon())) {
                    c2401e.ad();
                    InterfaceC5178e interfaceC5178e = c7765e.mopub;
                    if (interfaceC5178e != null) {
                        ((C6169e) interfaceC5178e).ad(9);
                    }
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC3314e interfaceC3314e7 = (InterfaceC3314e) obj4;
                InterfaceC3314e interfaceC3314e8 = (InterfaceC3314e) obj5;
                InterfaceC3314e interfaceC3314e9 = (InterfaceC3314e) obj3;
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (!c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    c13770e5.m3659default();
                } else if (((Boolean) interfaceC3314e8.getValue()).booleanValue()) {
                    c13770e5.m3676strictfp(-914378048);
                    String str2 = (String) interfaceC3314e7.getValue();
                    boolean purchase4 = c13770e5.purchase(interfaceC3314e7);
                    Object m3681throw7 = c13770e5.m3681throw();
                    if (purchase4 || m3681throw7 == c5170e) {
                        m3681throw7 = new C13676e(interfaceC3314e7, 4);
                        c13770e5.m3682throws(m3681throw7);
                    }
                    AbstractC11257e.metrica(str2, (Function1) m3681throw7, null, false, null, null, null, null, AbstractC7354e.yandex, false, null, null, null, false, 0, 0, null, null, c13770e5, 0, 6, 8387580);
                    c13770e5.Signature(false);
                } else {
                    c13770e5.m3676strictfp(-913940142);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e5, 6);
                    long j = c13770e5.f27286case;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert2 = c13770e5.advert();
                    InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e5, c0115e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e5.m3666import();
                    if (c13770e5.f27292implements) {
                        c13770e5.mopub(c7309e);
                    } else {
                        c13770e5.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e5, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e5, advert2, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e5, Integer.valueOf(i5), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e5, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e5, purchase5, C2721e.license);
                    AbstractC17074e.ad(AbstractC13201e.ad(AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC18007e.license(AbstractC18007e.metrica(c0115e, 1.0f), 32), c5100e), ((C15036e) interfaceC3314e9.getValue()).vip(), c5100e), (float) 0.5d, C3618e.metrica, c5100e), c13770e5, 0);
                    C15036e c15036e = (C15036e) interfaceC3314e9.getValue();
                    InterfaceC12864e license = AbstractC18007e.license(c0115e, 200);
                    boolean purchase6 = c13770e5.purchase(interfaceC3314e9);
                    Object m3681throw8 = c13770e5.m3681throw();
                    if (purchase6 || m3681throw8 == c5170e) {
                        m3681throw8 = new C13676e(interfaceC3314e9, 5);
                        c13770e5.m3682throws(m3681throw8);
                    }
                    C11883e c11883e = C15036e.appmetrica;
                    AbstractC2803e.ad(license, c15036e, false, (Function1) m3681throw8, c13770e5, 390);
                    c13770e5.Signature(true);
                    c13770e5.Signature(false);
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj4;
                C13622e c13622e = (C13622e) obj3;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) obj5;
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean z = ((C3487e) interfaceC16132e2.getValue()).f7753e;
                    boolean yandex3 = c13770e6.yandex(interfaceC18435e) | c13770e6.yandex(c13622e);
                    Object m3681throw9 = c13770e6.m3681throw();
                    if (yandex3 || m3681throw9 == c5170e) {
                        m3681throw9 = new C6538e(interfaceC18435e, c13622e, i2);
                        c13770e6.m3682throws(m3681throw9);
                    }
                    AbstractC8844e.ad(z, (Function1) m3681throw9, null, false, null, c13770e6, 0, 124);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ((C4524e) obj5).pro((C6260e) obj4, (C2892e) obj3, (C13770e) obj, AbstractC5190e.advert(433));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ((C4031e) obj5).m1453return((EnumC7808e) obj4, (InterfaceC12864e) obj3, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            case 13:
                Function0 function0 = (Function0) obj5;
                C12380e c12380e = (C12380e) obj4;
                C12380e c12380e2 = (C12380e) obj3;
                C13770e c13770e7 = (C13770e) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue7 & 1, (intValue7 & 3) != 2)) {
                    AbstractC1513e.license(function0, null, c12380e.vip().f33322e.length() > 0 && c12380e2.vip().f33322e.length() > 0, null, null, null, AbstractC9528e.ad, c13770e7, 805306368, 506);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC9764e.purchase((C12781e) obj5, (Function0) obj4, (Function0) obj3, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
