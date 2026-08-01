package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۤؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17378e {
    /* JADX WARN: Multi-variable type inference failed */
    public static C17094e ad() {
        String packageName;
        C12328e c12328e = AbstractC2890e.ad;
        C16452e c16452e = (C16452e) AbstractC1831e.metrica().f22771e;
        c16452e.getClass();
        int i = 14;
        C17071e c17071e = new C17071e(c16452e, null == true ? 1 : 0, i);
        C2693e c2693e = C2693e.f6576e;
        C3487e c3487e = (C3487e) AbstractC5336e.yandex(c2693e, c17071e);
        int i2 = c3487e.f7755e ? AbstractC1129e.license ? c3487e.f7759e : c3487e.f7764e : c3487e.f7761e;
        C0583e c0583e = AbstractC2890e.metrica;
        C12560e c12560e = (C12560e) c0583e.billing(Integer.valueOf(i2));
        if (c12560e == null) {
            c12560e = (C12560e) c0583e.billing(0);
        }
        C16452e c16452e2 = (C16452e) AbstractC1831e.metrica().f22771e;
        c16452e2.getClass();
        C3487e c3487e2 = (C3487e) AbstractC5336e.yandex(c2693e, new C17071e(c16452e2, null == true ? 1 : 0, i));
        int parseColor = Color.parseColor(AbstractC2890e.ad(c3487e2.f7755e ? AbstractC1129e.license ? c3487e2.f7762e : c3487e2.f7763e : c3487e2.f7752e).metrica);
        C16452e c16452e3 = (C16452e) AbstractC1831e.metrica().f22771e;
        c16452e3.getClass();
        C3487e c3487e3 = (C3487e) AbstractC5336e.yandex(c2693e, new C17071e(c16452e3, null == true ? 1 : 0, i));
        boolean z = (AbstractC12681e.ad() && c3487e3.f7760e) ? !AbstractC1129e.license : c12560e.license;
        C17094e c17094e = new C17094e();
        c12560e.getClass();
        c17094e.vip = "vkx_predefined_theme";
        c17094e.metrica = !z;
        c17094e.license = z;
        SparseIntArray sparseIntArray = c17094e.ad;
        sparseIntArray.clear();
        for (Map.Entry entry : c12560e.purchase.entrySet()) {
            String str = (String) entry.getKey();
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            Resources resources = vKXApplication.getResources();
            String m1852case = AbstractC5304e.m1852case(str, "@");
            if (AbstractC6507e.pro(str, "@", false)) {
                packageName = "android";
            } else {
                VKXApplication vKXApplication2 = VKXApplication.f36528e;
                if (vKXApplication2 == null) {
                    vKXApplication2 = null;
                }
                packageName = vKXApplication2.getPackageName();
            }
            sparseIntArray.put(resources.getIdentifier(m1852case, "attr", packageName), Color.parseColor((String) entry.getValue()));
        }
        if (AbstractC12681e.ad()) {
            boolean z2 = c3487e3.f7760e;
            boolean z3 = c3487e3.f7754e;
            if (z2 || z3) {
                VKXApplication vKXApplication3 = VKXApplication.f36528e;
                C10089e c10089e = new C10089e(vKXApplication3 != null ? vKXApplication3 : null);
                if (c3487e3.f7760e) {
                    sparseIntArray.put(R.attr.bg_primary, c10089e.vip(0.11f));
                    sparseIntArray.put(R.attr.nextdock_background, c10089e.vip(0.08f));
                    sparseIntArray.put(R.attr.text_primary, c10089e.ad(8));
                    sparseIntArray.put(R.attr.text_secondary, c10089e.ad(10));
                    sparseIntArray.put(android.R.attr.windowBackground, c10089e.ad(7));
                }
                if (z3) {
                    parseColor = c10089e.ad(1);
                }
            }
        }
        boolean z4 = c3487e3.f7753e;
        Map map = c3487e3.f7758e;
        if (z4) {
            List list = C13622e.f27026e;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC13480e.inmobi(arrayList, (List) ((C7020e) it.next()).ad.f13543e);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (map.containsKey((String) ((C18222e) next).ad.f21742e)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C10985e c10985e = ((C18222e) it3.next()).ad;
                arrayList3.add(new C6571e((String) c10985e.f21742e, Integer.valueOf(((Number) c10985e.f21740e).intValue())));
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C6571e c6571e = (C6571e) it4.next();
                try {
                    sparseIntArray.put(((Number) c6571e.f13543e).intValue(), Color.parseColor((String) map.get(c6571e.f13544e)));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable unused) {
                }
            }
            if (map.containsKey("global_accent")) {
                try {
                    parseColor = Color.parseColor((String) map.get("global_accent"));
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable unused2) {
                }
            }
        }
        sparseIntArray.put(R.attr.global_accent, parseColor);
        sparseIntArray.put(R.attr.colorAccent, parseColor);
        sparseIntArray.put(R.attr.colorPrimary, parseColor);
        sparseIntArray.put(R.attr.colorSecondary, parseColor);
        sparseIntArray.put(R.attr.colorControlActivated, parseColor);
        sparseIntArray.put(android.R.attr.colorAccent, parseColor);
        sparseIntArray.put(android.R.attr.colorPrimary, parseColor);
        vip(sparseIntArray, R.attr.pref_card_bg, sparseIntArray.get(R.attr.bg_primary));
        vip(sparseIntArray, R.attr.bottomsheet_seperator_color, sparseIntArray.get(R.attr.bg_primary));
        vip(sparseIntArray, R.attr.bottomsheet_background_color, sparseIntArray.get(android.R.attr.windowBackground));
        vip(sparseIntArray, R.attr.bg_page, sparseIntArray.get(android.R.attr.windowBackground));
        if (z) {
            vip(sparseIntArray, R.attr.scrim_color, Color.parseColor("#25000000"));
            vip(sparseIntArray, R.attr.scrim_color_lighter, Color.parseColor("#50000000"));
            vip(sparseIntArray, R.attr.dim_color, Color.parseColor("#20000000"));
            vip(sparseIntArray, R.attr.feed_stroke_color, Color.parseColor("#20000000"));
            vip(sparseIntArray, R.attr.text_primary, -16777216);
            vip(sparseIntArray, R.attr.text_inverse, -1);
            vip(sparseIntArray, R.attr.text_secondary, Color.parseColor("#a0000000"));
            vip(sparseIntArray, R.attr.modal_card_border, 0);
            vip(sparseIntArray, R.attr.reborn_title_color, sparseIntArray.get(R.attr.text_primary));
            sparseIntArray.put(R.attr.modal_card_background, sparseIntArray.get(android.R.attr.windowBackground));
            sparseIntArray.put(R.attr.modal_card_border, sparseIntArray.get(R.attr.bg_primary));
        } else {
            vip(sparseIntArray, R.attr.scrim_color_lighter, Color.parseColor("#30ffffff"));
            vip(sparseIntArray, R.attr.text_primary, -1);
            vip(sparseIntArray, R.attr.text_inverse, -16777216);
            vip(sparseIntArray, R.attr.text_secondary, Color.parseColor("#b3ffffff"));
            vip(sparseIntArray, R.attr.reborn_title_color, sparseIntArray.get(R.attr.text_primary));
            sparseIntArray.put(R.attr.modal_card_background, sparseIntArray.get(R.attr.bg_primary));
        }
        vip(sparseIntArray, android.R.attr.textColorPrimary, sparseIntArray.get(R.attr.text_primary));
        vip(sparseIntArray, android.R.attr.textColorSecondary, sparseIntArray.get(R.attr.text_secondary));
        vip(sparseIntArray, android.R.attr.textColorAlertDialogListItem, sparseIntArray.get(R.attr.text_primary));
        vip(sparseIntArray, R.attr.textColorAlertDialogListItem, sparseIntArray.get(R.attr.text_primary));
        return c17094e;
    }

    public static void vip(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return;
        }
        sparseIntArray.put(i, i2);
    }
}
