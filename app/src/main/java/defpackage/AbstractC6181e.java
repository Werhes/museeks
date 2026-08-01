package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6181e {
    public static final SharedPreferences ad;
    public static final HashMap vip;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        ad = vKXApplication.getSharedPreferences("toggles_v2_quickfix", 0);
        vip = new HashMap();
        C1630e c1630e = new C1630e(0 == true ? 1 : 0, EnumC7437e.f15210e);
        while (c1630e.hasNext()) {
            EnumC7437e enumC7437e = (EnumC7437e) c1630e.next();
            vip.put(enumC7437e, Boolean.valueOf(ad.getBoolean(enumC7437e.name(), enumC7437e.f15213e)));
        }
        HashMap hashMap = vip;
        C14027e.ad.getClass();
        long metrica = C14027e.metrica();
        C5363e c5363e = C0353e.startapp;
        Object[] objArr = ((C0353e) AbstractC15792e.billing().purchase.f5914e).ad;
        if (objArr.length - 1 < 7) {
            throw new IllegalStateException("idx 7 size mismatch".toString());
        }
        Object obj = objArr[7];
        if (obj == null) {
            throw new IllegalStateException("idx 7 is empty".toString());
        }
        if (!(obj instanceof Integer)) {
            throw new IllegalStateException("idx 7 type mismatch".toString());
        }
        hashMap.put(EnumC7437e.f15207e, Boolean.valueOf(metrica == ((long) ((Integer) obj).intValue())));
    }

    public static boolean ad(EnumC7437e enumC7437e) {
        return ((Boolean) vip.get(enumC7437e)).booleanValue();
    }
}
