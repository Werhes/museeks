package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۘٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5111e {
    public static final Object ad = AbstractC10064e.purchase(new C6571e(EnumC2880e.f6852e, Integer.valueOf(R.layout.glance_text)), new C6571e(EnumC2880e.f6830e, Integer.valueOf(R.layout.glance_list)), new C6571e(EnumC2880e.f6858e, Integer.valueOf(R.layout.glance_check_box)), new C6571e(EnumC2880e.f6857e, Integer.valueOf(R.layout.glance_check_box_backport)), new C6571e(EnumC2880e.f6844e, Integer.valueOf(R.layout.glance_button)), new C6571e(EnumC2880e.f6837e, Integer.valueOf(R.layout.glance_swtch)), new C6571e(EnumC2880e.f6851e, Integer.valueOf(R.layout.glance_swtch_backport)), new C6571e(EnumC2880e.f6854e, Integer.valueOf(R.layout.glance_frame)), new C6571e(EnumC2880e.f6859e, Integer.valueOf(R.layout.glance_image_crop)), new C6571e(EnumC2880e.f6853e, Integer.valueOf(R.layout.glance_image_crop_decorative)), new C6571e(EnumC2880e.f6835e, Integer.valueOf(R.layout.glance_image_fit)), new C6571e(EnumC2880e.f6855e, Integer.valueOf(R.layout.glance_image_fit_decorative)), new C6571e(EnumC2880e.f6849e, Integer.valueOf(R.layout.glance_image_fill_bounds)), new C6571e(EnumC2880e.f6848e, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new C6571e(EnumC2880e.f6834e, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new C6571e(EnumC2880e.f6847e, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new C6571e(EnumC2880e.f6832e, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new C6571e(EnumC2880e.f6831e, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new C6571e(EnumC2880e.f6836e, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new C6571e(EnumC2880e.f6841e, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new C6571e(EnumC2880e.f6842e, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new C6571e(EnumC2880e.f6840e, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new C6571e(EnumC2880e.f6845e, Integer.valueOf(R.layout.glance_radio_button)), new C6571e(EnumC2880e.f6846e, Integer.valueOf(R.layout.glance_radio_button_backport)));
    public static final int metrica;
    public static final int vip;

    /* JADX WARN: Type inference failed for: r0v51, types: [java.util.Map, java.lang.Object] */
    static {
        int size = AbstractC16067e.purchase.size();
        vip = size;
        metrica = Build.VERSION.SDK_INT >= 31 ? AbstractC16067e.yandex : AbstractC16067e.yandex / size;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map, java.lang.Object] */
    public static final C3237e ad(C6555e c6555e, InterfaceC7189e interfaceC7189e, int i) {
        Integer valueOf = Integer.valueOf(R.id.rootStubId);
        int i2 = 0;
        Context context = c6555e.ad;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 2;
        if (i3 >= 31) {
            int i5 = AbstractC16067e.yandex;
            if (i >= i5) {
                throw new IllegalArgumentException(AbstractC1786e.Signature(i5, i, "Index of the root view cannot be more than ", ", currently ").toString());
            }
            C7660e c7660e = new C7660e(1, 1);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), AbstractC16067e.billing + i);
            C12005e c12005e = (C12005e) interfaceC7189e.appmetrica(null, C5983e.f12599e);
            int i6 = R.id.rootView;
            if (c12005e != null) {
                AbstractC13461e.license(context, remoteViews, c12005e, R.id.rootView);
            }
            C8851e c8851e = (C8851e) interfaceC7189e.appmetrica(null, C5983e.f12598e);
            if (c8851e != null) {
                AbstractC13461e.metrica(context, remoteViews, c8851e, R.id.rootView);
            }
            if (i3 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            return new C3237e(remoteViews, new C2158e(i6, i2, i3 >= 33 ? C9139e.f18290e : Collections.singletonMap(0, Collections.singletonMap(c7660e, valueOf)), i4));
        }
        int i7 = vip * i;
        int i8 = AbstractC16067e.yandex;
        if (i7 >= i8) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i8 / 4) + ", currently " + i).toString());
        }
        C12005e c12005e2 = (C12005e) interfaceC7189e.appmetrica(null, C5983e.f12601e);
        AbstractC7107e abstractC7107e = C9133e.ad;
        AbstractC7107e appmetrica = c12005e2 != null ? appmetrica(c12005e2.ad, context) : abstractC7107e;
        C8851e c8851e2 = (C8851e) interfaceC7189e.appmetrica(null, C5983e.f12614e);
        if (c8851e2 != null) {
            abstractC7107e = appmetrica(c8851e2.ad, context);
        }
        C6705e c6705e = C6705e.ad;
        int i9 = appmetrica.equals(c6705e) ? 4 : 1;
        int i10 = abstractC7107e.equals(c6705e) ? 4 : 1;
        C7660e c7660e2 = new C7660e(i9 == 2 ? 1 : i9, i10 != 2 ? i10 : 1);
        Integer num = (Integer) AbstractC16067e.purchase.get(c7660e2);
        if (num != null) {
            return new C3237e(new RemoteViews(context.getPackageName(), i7 + AbstractC16067e.billing + num.intValue()), new C2158e(i2, i2, Collections.singletonMap(0, Collections.singletonMap(c7660e2, valueOf)), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + AbstractC5087e.m1748implements(i9) + ", " + AbstractC5087e.m1748implements(i10) + ']');
    }

    public static final AbstractC7107e appmetrica(AbstractC7107e abstractC7107e, Context context) {
        if (!(abstractC7107e instanceof C17740e)) {
            return abstractC7107e;
        }
        float dimension = context.getResources().getDimension(((C17740e) abstractC7107e).ad);
        int i = (int) dimension;
        return i != -2 ? i != -1 ? new C7191e(dimension / context.getResources().getDisplayMetrics().density) : C6705e.ad : C9133e.ad;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map, java.lang.Object] */
    public static final Integer billing(EnumC2880e enumC2880e, InterfaceC7189e interfaceC7189e) {
        if (Build.VERSION.SDK_INT >= 33) {
            C14933e c14933e = (C14933e) interfaceC7189e.appmetrica(null, C5983e.f12609e);
            C12005e c12005e = (C12005e) interfaceC7189e.appmetrica(null, C5983e.f12607e);
            C9361e c9361e = C9361e.ad;
            boolean equals = c12005e != null ? c12005e.ad.equals(c9361e) : false;
            C8851e c8851e = (C8851e) interfaceC7189e.appmetrica(null, C5983e.f12604e);
            boolean equals2 = c8851e != null ? c8851e.ad.equals(c9361e) : false;
            if (c14933e != null) {
                C7139e c7139e = c14933e.ad;
                C0561e c0561e = (C0561e) AbstractC16067e.metrica.get(new C9079e(enumC2880e, c7139e.ad, c7139e.vip));
                if (c0561e != null) {
                    return Integer.valueOf(c0561e.ad);
                }
                throw new IllegalArgumentException("Cannot find " + enumC2880e + " with alignment " + c7139e);
            }
            if (equals || equals2) {
                C0561e c0561e2 = (C0561e) AbstractC16067e.license.get(new C4463e(enumC2880e, equals, equals2));
                if (c0561e2 != null) {
                    return Integer.valueOf(c0561e2.ad);
                }
                throw new IllegalArgumentException("Cannot find " + enumC2880e + " with defaultWeight set");
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map, java.lang.Object] */
    public static final C2158e license(RemoteViews remoteViews, C6555e c6555e, int i, InterfaceC7189e interfaceC7189e) {
        Integer valueOf;
        int i2;
        int i3 = c6555e.appmetrica;
        Context context = c6555e.ad;
        Map map = null;
        C12005e c12005e = (C12005e) interfaceC7189e.appmetrica(null, C5983e.f12603e);
        AbstractC7107e abstractC7107e = C9133e.ad;
        AbstractC7107e abstractC7107e2 = c12005e != null ? c12005e.ad : abstractC7107e;
        C8851e c8851e = (C8851e) interfaceC7189e.appmetrica(null, C5983e.f12608e);
        if (c8851e != null) {
            abstractC7107e = c8851e.ad;
        }
        if (interfaceC7189e.billing(new C17187e(9))) {
            valueOf = null;
        } else {
            if (c6555e.startapp.getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            valueOf = Integer.valueOf(android.R.id.background);
        }
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 6;
        int i6 = 0;
        if (i4 >= 33) {
            if (valueOf != null) {
                i2 = valueOf.intValue();
            } else {
                int incrementAndGet = c6555e.billing.incrementAndGet();
                if (incrementAndGet >= AbstractC16067e.adcel) {
                    throw new IllegalStateException("There are too many views");
                }
                i2 = incrementAndGet + AbstractC16067e.startapp;
            }
            RemoteViews premium = AbstractC16048e.premium(i, i2, context.getPackageName());
            int i7 = c6555e.yandex.ad;
            if (i4 >= 31) {
                AbstractC16048e.ad(remoteViews, i7, premium, i3);
            } else {
                remoteViews.addView(i7, premium);
            }
            return new C2158e(i2, i6, map, i5);
        }
        if (i4 >= 31) {
            C9361e c9361e = C9361e.ad;
            return new C2158e(AbstractC11138e.billing(remoteViews, c6555e, purchase(remoteViews, c6555e, i3, abstractC7107e2.equals(c9361e) ? 3 : 1, abstractC7107e.equals(c9361e) ? 3 : 1), i, valueOf), i6, map, i5);
        }
        int yandex = yandex(appmetrica(abstractC7107e2, context));
        int yandex2 = yandex(appmetrica(abstractC7107e, context));
        int purchase = purchase(remoteViews, c6555e, i3, yandex, yandex2);
        if (yandex != 2 && yandex2 != 2) {
            return new C2158e(AbstractC11138e.billing(remoteViews, c6555e, purchase, i, valueOf), i6, map, i5);
        }
        C0561e c0561e = (C0561e) AbstractC16067e.appmetrica.get(new C7660e(yandex, yandex2));
        if (c0561e != null) {
            return new C2158e(AbstractC11138e.billing(remoteViews, c6555e, R.id.glanceViewStub, i, valueOf), AbstractC11138e.billing(remoteViews, c6555e, purchase, c0561e.ad, null), map, 4);
        }
        throw new IllegalArgumentException("Could not find complex layout for width=" + AbstractC5087e.m1748implements(yandex) + ", height=" + AbstractC5087e.m1748implements(yandex2));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public static final C2158e metrica(RemoteViews remoteViews, C6555e c6555e, EnumC2880e enumC2880e, InterfaceC7189e interfaceC7189e) {
        Integer billing = billing(enumC2880e, interfaceC7189e);
        if (billing != null || (billing = (Integer) ad.get(enumC2880e)) != null) {
            return license(remoteViews, c6555e, billing.intValue(), interfaceC7189e);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + enumC2880e);
    }

    public static final int purchase(RemoteViews remoteViews, C6555e c6555e, int i, int i2, int i3) {
        C7660e c7660e = new C7660e(i2 == 2 ? 1 : i2, i3 != 2 ? i3 : 1);
        Map map = (Map) c6555e.yandex.metrica.get(Integer.valueOf(i));
        if (map == null) {
            throw new IllegalStateException(AbstractC1786e.admob(i, "Parent doesn't have child position "));
        }
        Integer num = (Integer) map.get(c7660e);
        if (num == null) {
            StringBuilder premium = AbstractC4653e.premium("No child for position ", i, " and size ");
            premium.append(AbstractC5087e.m1748implements(i2));
            premium.append(" x ");
            premium.append(AbstractC5087e.m1748implements(i3));
            throw new IllegalStateException(premium.toString());
        }
        int intValue = num.intValue();
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((Number) obj).intValue() != intValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC11138e.billing(remoteViews, c6555e, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return intValue;
    }

    public static final C2158e vip(RemoteViews remoteViews, C6555e c6555e, EnumC2880e enumC2880e, int i, InterfaceC7189e interfaceC7189e, C2782e c2782e, C13692e c13692e) {
        int intValue;
        if (i > 10) {
            Log.e("GlanceAppWidget", "Truncated " + enumC2880e + " container from " + i + " to 10 elements", new IllegalArgumentException(enumC2880e + " container cannot have more than 10 elements"));
        }
        int i2 = i <= 10 ? i : 10;
        Integer billing = billing(enumC2880e, interfaceC7189e);
        if (billing != null) {
            intValue = billing.intValue();
        } else {
            C4309e c4309e = (C4309e) AbstractC16067e.ad.get(new C17700e(enumC2880e, i2, c2782e, c13692e));
            Integer valueOf = c4309e != null ? Integer.valueOf(c4309e.ad) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + enumC2880e + " with " + i + " children");
            }
            intValue = valueOf.intValue();
        }
        Map map = (Map) AbstractC16067e.vip.get(enumC2880e);
        if (map == null) {
            throw new IllegalArgumentException("Cannot find generated children for " + enumC2880e);
        }
        C2158e license = license(remoteViews, c6555e, intValue, interfaceC7189e);
        int i3 = license.ad;
        C2158e c2158e = new C2158e(i3, license.vip, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return c2158e;
    }

    public static final int yandex(AbstractC7107e abstractC7107e) {
        if (abstractC7107e instanceof C9133e) {
            return 1;
        }
        if (abstractC7107e instanceof C9361e) {
            return 3;
        }
        if (abstractC7107e instanceof C6705e) {
            return 4;
        }
        if ((abstractC7107e instanceof C7191e) || (abstractC7107e instanceof C17740e)) {
            return 2;
        }
        throw new C14803e(10);
    }
}
