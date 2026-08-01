package defpackage;

import android.view.View;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6069e {
    public static final C2892e ad = new C2892e(901218053, false, new C11789e(10));
    public static final C2892e vip = new C2892e(-1883788314, false, new C11789e(11));
    public static final C2892e metrica = new C2892e(-419264916, false, new C11789e(12));

    public static String ad(long j) {
        return j + " (" + license(j) + ")";
    }

    public static final void appmetrica(View view) {
        C4300e license = AbstractC16342e.license(new C4836e(view, null, 4));
        while (license.hasNext()) {
            ArrayList arrayList = billing((View) license.next()).ad;
            for (int billing = AbstractC6874e.billing(arrayList); -1 < billing; billing--) {
                ((C11691e) arrayList.get(billing)).ad.appmetrica();
            }
        }
    }

    public static final C0084e billing(View view) {
        C0084e c0084e = (C0084e) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c0084e != null) {
            return c0084e;
        }
        C0084e c0084e2 = new C0084e();
        view.setTag(R.id.pooling_container_listener_holder_tag, c0084e2);
        return c0084e2;
    }

    public static String license(long j) {
        String hexString = Long.toHexString(j);
        return hexString.length() == 1 ? "0x0".concat(hexString) : "0x".concat(hexString);
    }

    public static String metrica(int i) {
        return "0x" + Integer.toHexString(i);
    }

    public static final InterfaceC5372e purchase(InterfaceC5372e interfaceC5372e) {
        return interfaceC5372e.appmetrica().metrica() ? interfaceC5372e : new C7313e(interfaceC5372e);
    }

    public static String vip(byte b) {
        return "0x" + Integer.toHexString(b);
    }

    public static final void yandex(C10263e c10263e, String str, Object obj) {
        if (obj != null) {
            c10263e.ad.adcel.mo859e(str, obj.toString());
        }
    }
}
