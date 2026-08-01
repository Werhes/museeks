package defpackage;

import android.content.ClipDescription;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17955e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f35200e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35201e;

    public /* synthetic */ C17955e(int i, Object obj) {
        this.f35201e = i;
        this.f35200e = obj;
    }

    public /* synthetic */ C17955e(C17955e c17955e, C10981e c10981e) {
        this.f35201e = 10;
        this.f35200e = c17955e;
    }

    private final Object ad(Object obj) {
        C12701e metrica;
        C9485e c9485e = (C9485e) obj;
        C9872e c9872e = ((C10503e) this.f35200e).ad;
        synchronized (c9872e.metrica) {
            if (c9872e.license) {
                throw new IllegalStateException("Check failed.");
            }
            StringBuilder sb = new StringBuilder("CameraGraph-");
            C11498e c11498e = C13783e.vip;
            c11498e.getClass();
            sb.append(C11498e.vip.incrementAndGet(c11498e));
            metrica = c9872e.metrica(c9485e, new C13783e(sb.toString()));
        }
        return metrica;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final int i = 4;
        final int i2 = 2;
        boolean z = false;
        z = false;
        final int i3 = 3;
        final int i4 = 1;
        switch (this.f35201e) {
            case 0:
                C13128e c13128e = (C13128e) this.f35200e;
                synchronized (c13128e.billing) {
                    C14040e c14040e = c13128e.startapp;
                    Object obj2 = c14040e.vip;
                    int i5 = c14040e.license;
                    C17866e c17866e = c14040e.metrica;
                    if (c17866e == null) {
                        c17866e = new C17866e();
                        c14040e.metrica = c17866e;
                        c14040e.purchase.amazon(obj2, c17866e);
                        Unit unit = Unit.INSTANCE;
                    }
                    c14040e.vip(obj, i5, obj2, c17866e);
                }
                return Unit.INSTANCE;
            case 1:
                ((AbstractC10149e) this.f35200e).m2774protected();
                return Unit.INSTANCE;
            case 2:
                C6267e c6267e = (C6267e) this.f35200e;
                C17213e c17213e = (C17213e) obj;
                C0576e c0576e = c6267e.f13081e;
                if (((AbstractC7674e) ((InterfaceC8346e) c0576e.getValue())).isEmpty()) {
                    AbstractC5087e.premium(c17213e, null, null, AbstractC18491e.metrica, 3);
                }
                InterfaceC8346e interfaceC8346e = (InterfaceC8346e) c0576e.getValue();
                c17213e.mopub(((AbstractC7674e) interfaceC8346e).subs(), null, new C7976e(interfaceC8346e, 20, z), new C2892e(802480018, true, new C15055e(interfaceC8346e, c6267e, i2)));
                return Unit.INSTANCE;
            case 3:
                C5352e c5352e = (C5352e) this.f35200e;
                C17213e c17213e2 = (C17213e) obj;
                C0576e c0576e2 = c5352e.f11474e;
                if (((AbstractC11110e) c0576e2.getValue()).isEmpty()) {
                    AbstractC5087e.premium(c17213e2, null, null, AbstractC17976e.metrica, 3);
                } else {
                    AbstractC11110e abstractC11110e = (AbstractC11110e) c0576e2.getValue();
                    c17213e2.mopub(abstractC11110e.subs(), null, new C7976e(abstractC11110e, 21, z), new C2892e(802480018, true, new C15055e(abstractC11110e, c5352e, i3)));
                    if (((Boolean) c5352e.f11473e.getValue()).booleanValue()) {
                        AbstractC5087e.premium(c17213e2, null, null, new C2892e(-1524105466, true, new C8069e(c5352e, i4)), 3);
                    }
                }
                return Unit.INSTANCE;
            case 4:
                C5422e c5422e = (C5422e) this.f35200e;
                C7882e c7882e = (C7882e) obj;
                AbstractC5087e.subs(c7882e, new C2892e(-426862035, true, new C7721e(c5422e, i4)));
                AbstractC11110e abstractC11110e2 = C5422e.f11613e;
                c7882e.ad.appmetrica(abstractC11110e2.subs(), new C6967e(null, new C7976e(abstractC11110e2, 22, z), null, new C2892e(-334987442, true, new C15055e(abstractC11110e2, c5422e, i))));
                AbstractC5087e.subs(c7882e, AbstractC12184e.purchase);
                AbstractC5087e.subs(c7882e, new C2892e(-1602702667, true, new C7721e(c5422e, i3)));
                return Unit.INSTANCE;
            case 5:
                C15926e c15926e = (C15926e) obj;
                return ((CharSequence) this.f35200e).subSequence(c15926e.f22523e, c15926e.f22522e + 1).toString();
            case 6:
                C10122e c10122e = (C10122e) obj;
                C8005e m4162e = C16546e.m4162e((C16546e) this.f35200e, 4);
                c10122e.metrica(m4162e.f16243e);
                c10122e.advert(m4162e.f16242e);
                c10122e.smaato(m4162e.f16192e);
                c10122e.pro(m4162e.f16202e);
                c10122e.signatures(m4162e.f16214e);
                c10122e.billing(m4162e.f16208e);
                c10122e.startapp(m4162e.f16240e);
                c10122e.adcel(m4162e.f16230e);
                c10122e.admob(m4162e.f16235e);
                c10122e.appmetrica(m4162e.f16211e);
                c10122e.loadAd(m4162e.f16238e);
                return Unit.INSTANCE;
            case 7:
                C17142e c17142e = (C17142e) obj;
                ((Function2) this.f35200e).invoke(c17142e.appmetrica.getValue(), AbstractC9546e.ad.vip.invoke(c17142e.purchase));
                return Unit.INSTANCE;
            case 8:
                Drawable drawable = (Drawable) this.f35200e;
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                InterfaceC14576e m4557this = interfaceC2235e.mo782finally().m4557this();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)), (int) Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)));
                Canvas canvas = AbstractC16863e.ad;
                drawable.draw(((C11648e) m4557this).ad);
                return Unit.INSTANCE;
            case 9:
                ((Function1) obj).invoke((C0765e) this.f35200e);
                return Unit.INSTANCE;
            case 10:
                C17955e c17955e = (C17955e) this.f35200e;
                InterfaceC6459e interfaceC6459e = (InterfaceC6459e) obj;
                if (!(interfaceC6459e instanceof C16597e)) {
                    throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                c17955e.invoke(((C16597e) interfaceC6459e).f32553e);
                return Boolean.TRUE;
            case 11:
                C9755e c9755e = (C9755e) this.f35200e;
                InterfaceC0043e interfaceC0043e = (InterfaceC0043e) obj;
                C0763e c0763e = (C0763e) c9755e.f19284e.isPro.getValue();
                if (c0763e == null) {
                    c0763e = C0763e.appmetrica;
                }
                InterfaceC0043e appmetrica = c9755e.f19298e.appmetrica();
                if (appmetrica != null) {
                    return AbstractC1561e.startapp(c0763e, appmetrica, interfaceC0043e);
                }
                AbstractC8889e.license("Required value was null.");
                throw new C14803e(9);
            case 12:
                C10593e c10593e = (C10593e) this.f35200e;
                ClipDescription clipDescription = ((C6057e) obj).ad.getClipDescription();
                Iterable<C4559e> iterable = (Iterable) c10593e.invoke();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (C4559e c4559e : iterable) {
                        if (AbstractC7890e.billing(c4559e, C4559e.metrica) || (clipDescription != null && clipDescription.hasMimeType(c4559e.ad))) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                C17210e c17210e = (C17210e) this.f35200e;
                float floatValue = ((Float) obj).floatValue();
                C2616e c2616e = c17210e.ad;
                float purchase = c2616e.purchase() + floatValue;
                C2616e c2616e2 = c17210e.vip;
                if (purchase > c2616e2.purchase()) {
                    floatValue = c2616e2.purchase() - c2616e.purchase();
                } else if (purchase < 0.0f) {
                    floatValue = -c2616e.purchase();
                }
                c2616e.startapp(c2616e.purchase() + floatValue);
                return Float.valueOf(floatValue);
            case 14:
                C2233e c2233e = (C2233e) this.f35200e;
                C9363e c9363e = (C9363e) obj;
                InterfaceC3703e interfaceC3703e = (InterfaceC3703e) c9363e.ad;
                if (interfaceC3703e instanceof C1611e) {
                    C1611e c1611e = (C1611e) interfaceC3703e;
                    if (c1611e.vip == null) {
                        return C9363e.ad(c9363e, new C1611e(c1611e.ad, c2233e, c1611e.metrica), 0, 0, 14);
                    }
                }
                if (!(interfaceC3703e instanceof C5320e)) {
                    return c9363e;
                }
                C5320e c5320e = (C5320e) interfaceC3703e;
                return c5320e.vip == null ? C9363e.ad(c9363e, new C5320e(c5320e.ad, c2233e, c5320e.metrica), 0, 0, 14) : c9363e;
            case 15:
                return (InterfaceC0043e) ((C9055e) this.f35200e).ad.invoke();
            case 16:
                ((C17425e) this.f35200e).adcel = null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C2699e c2699e = (C2699e) this.f35200e;
                C7469e c7469e = (C7469e) obj;
                c7469e.ad(c2699e.ad.appmetrica(), "first");
                c7469e.ad(c2699e.vip.appmetrica(), "second");
                c7469e.ad(c2699e.metrica.appmetrica(), "third");
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C13817e) this.f35200e).purchase.subscription((String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C12344e) ((C13477e) this.f35200e).license.f25784e).license(new C17927e(new C17028e(((Integer) obj).intValue(), 16), new C17706e(10)));
                return Unit.INSTANCE;
            case 20:
                C2743e c2743e = (C2743e) this.f35200e;
                List list = (List) c2743e.f6644e.getValue();
                ((C17213e) obj).mopub(list.size(), null, new C16296e(2, list), new C2892e(802480018, true, new C15055e(list, c2743e, 6)));
                return Unit.INSTANCE;
            case 21:
                C13679e c13679e = (C13679e) this.f35200e;
                List list2 = (List) c13679e.f27101e.getValue();
                ((C17213e) obj).mopub(list2.size(), null, new C16296e(3, list2), new C2892e(802480018, true, new C15055e(list2, c13679e, 7)));
                return Unit.INSTANCE;
            case 22:
                return ad(obj);
            case 23:
                final C14987e c14987e = (C14987e) this.f35200e;
                C17213e c17213e3 = (C17213e) obj;
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(-911803962, true, new Function3() { // from class: eًۚؐ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i6 = i4;
                        C13770e c13770e = (C13770e) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        switch (i6) {
                            case 0:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать прочие треки", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Специальная иконка", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Фильтрация каталогов", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать треки с кириллицей...", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e3, null, null, AbstractC2301e.appmetrica, 3);
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(-90816626, true, new Function3() { // from class: eًۚؐ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i6 = i2;
                        C13770e c13770e = (C13770e) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        switch (i6) {
                            case 0:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать прочие треки", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Специальная иконка", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Фильтрация каталогов", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать треки с кириллицей...", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(780004973, true, new Function3() { // from class: eًۚؐ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i6 = i3;
                        C13770e c13770e = (C13770e) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        switch (i6) {
                            case 0:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать прочие треки", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Специальная иконка", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Фильтрация каталогов", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать треки с кириллицей...", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e3, null, null, AbstractC2301e.purchase, 3);
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(-1773319125, true, new Function3() { // from class: eًۚؐ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i6 = i;
                        C13770e c13770e = (C13770e) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        switch (i6) {
                            case 0:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать прочие треки", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Специальная иконка", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Фильтрация каталогов", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать треки с кириллицей...", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e3, null, null, AbstractC2301e.billing, 3);
                AbstractC5087e.premium(c17213e3, null, null, AbstractC2301e.yandex, 3);
                AbstractC5087e.premium(c17213e3, null, null, AbstractC2301e.startapp, 3);
                final int i6 = z ? 1 : 0;
                AbstractC5087e.premium(c17213e3, null, null, new C2892e(1709967271, true, new Function3() { // from class: eًۚؐ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i62 = i6;
                        C13770e c13770e = (C13770e) obj4;
                        int intValue = ((Integer) obj5).intValue();
                        switch (i62) {
                            case 0:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать прочие треки", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 1:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Специальная иконка", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 2:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Автор иконки: https://vk.com/sayfex\nАвтор идеи: https://vk.com/nyakolan\n\nВернуть нормальную иконку можно в Настройках > Внешний вид.", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            case 3:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Фильтрация каталогов", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    c14987e.m3906strictfp("Блокировать треки с кириллицей...", c13770e, 6);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                AbstractC5087e.premium(c17213e3, null, null, AbstractC2301e.adcel, 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C1615e) this.f35200e).smaato(null, obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C9167e) obj).vip = (C1343e) this.f35200e;
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C10524e) ((C8221e) this.f35200e).ad).getClass();
                C5363e c5363e = C0308e.appmetrica;
                ((C0880e) obj).ad = AbstractC18271e.metrica().license.pro();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C0576e c0576e3 = (C0576e) this.f35200e;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                c0576e3.setValue(bool);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                final C1071e c1071e = (C1071e) this.f35200e;
                C17213e c17213e4 = (C17213e) obj;
                AbstractC5087e.premium(c17213e4, null, null, AbstractC1513e.vip, 3);
                final int i7 = z ? 1 : 0;
                AbstractC5087e.premium(c17213e4, null, null, new C2892e(-357048947, true, new Function3() { // from class: eؚْٔ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        switch (i7) {
                            case 0:
                                C13770e c13770e = (C13770e) obj4;
                                int intValue = ((Integer) obj5).intValue();
                                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C1071e c1071e2 = c1071e;
                                    boolean z2 = ((String) c1071e2.f3604e.getValue()).length() == 0;
                                    boolean yandex = c13770e.yandex(c1071e2);
                                    Object m3681throw = c13770e.m3681throw();
                                    if (yandex || m3681throw == C2987e.ad) {
                                        C11212e c11212e = new C11212e(0, c1071e2, C1071e.class, "signIntoVkm", "signIntoVkm()V", 0, 0, 21);
                                        c13770e.m3682throws(c11212e);
                                        m3681throw = c11212e;
                                    }
                                    AbstractC16429e.ad(AbstractC16653e.license(928292075, new C17585e(c1071e2, 1, (byte) 0), c13770e), AbstractC9546e.license(metrica, z2, null, (Function0) ((InterfaceC5261e) m3681throw), 14), null, AbstractC16653e.license(-235311314, new C17585e(c1071e2, 2, (byte) 0), c13770e), null, null, null, 0.0f, 0.0f, c13770e, 3078, 500);
                                } else {
                                    c13770e.m3659default();
                                }
                                return Unit.INSTANCE;
                            default:
                                C13770e c13770e2 = (C13770e) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                    C1071e c1071e3 = c1071e;
                                    boolean yandex2 = c13770e2.yandex(c1071e3);
                                    Object m3681throw2 = c13770e2.m3681throw();
                                    if (yandex2 || m3681throw2 == C2987e.ad) {
                                        C11212e c11212e2 = new C11212e(0, c1071e3, C1071e.class, "resetVkm", "resetVkm()V", 0, 0, 22);
                                        c13770e2.m3682throws(c11212e2);
                                        m3681throw2 = c11212e2;
                                    }
                                    AbstractC16429e.ad(AbstractC1513e.metrica, AbstractC9546e.license(metrica2, false, null, (Function0) ((InterfaceC5261e) m3681throw2), 15), null, AbstractC1513e.license, null, null, null, 0.0f, 0.0f, c13770e2, 3078, 500);
                                } else {
                                    c13770e2.m3659default();
                                }
                                return Unit.INSTANCE;
                        }
                    }
                }), 3);
                if (((String) c1071e.f3604e.getValue()).length() > 0) {
                    AbstractC5087e.premium(c17213e4, null, null, new C2892e(-2089962319, true, new Function3() { // from class: eؚْٔ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            switch (i4) {
                                case 0:
                                    C13770e c13770e = (C13770e) obj4;
                                    int intValue = ((Integer) obj5).intValue();
                                    if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                        InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        C1071e c1071e2 = c1071e;
                                        boolean z2 = ((String) c1071e2.f3604e.getValue()).length() == 0;
                                        boolean yandex = c13770e.yandex(c1071e2);
                                        Object m3681throw = c13770e.m3681throw();
                                        if (yandex || m3681throw == C2987e.ad) {
                                            C11212e c11212e = new C11212e(0, c1071e2, C1071e.class, "signIntoVkm", "signIntoVkm()V", 0, 0, 21);
                                            c13770e.m3682throws(c11212e);
                                            m3681throw = c11212e;
                                        }
                                        AbstractC16429e.ad(AbstractC16653e.license(928292075, new C17585e(c1071e2, 1, (byte) 0), c13770e), AbstractC9546e.license(metrica, z2, null, (Function0) ((InterfaceC5261e) m3681throw), 14), null, AbstractC16653e.license(-235311314, new C17585e(c1071e2, 2, (byte) 0), c13770e), null, null, null, 0.0f, 0.0f, c13770e, 3078, 500);
                                    } else {
                                        c13770e.m3659default();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    C13770e c13770e2 = (C13770e) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                                        C1071e c1071e3 = c1071e;
                                        boolean yandex2 = c13770e2.yandex(c1071e3);
                                        Object m3681throw2 = c13770e2.m3681throw();
                                        if (yandex2 || m3681throw2 == C2987e.ad) {
                                            C11212e c11212e2 = new C11212e(0, c1071e3, C1071e.class, "resetVkm", "resetVkm()V", 0, 0, 22);
                                            c13770e2.m3682throws(c11212e2);
                                            m3681throw2 = c11212e2;
                                        }
                                        AbstractC16429e.ad(AbstractC1513e.metrica, AbstractC9546e.license(metrica2, false, null, (Function0) ((InterfaceC5261e) m3681throw2), 15), null, AbstractC1513e.license, null, null, null, 0.0f, 0.0f, c13770e2, 3078, 500);
                                    } else {
                                        c13770e2.m3659default();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }), 3);
                }
                AbstractC5087e.premium(c17213e4, null, null, AbstractC1513e.appmetrica, 3);
                return Unit.INSTANCE;
            default:
                ((C9438e) this.f35200e).license = null;
                return Unit.INSTANCE;
        }
    }
}
