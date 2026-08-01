package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.List;
import java.util.Map;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12900e {
    public static final C2892e ad = new C2892e(-936257117, false, new C16015e(16));
    public static final C2892e vip = new C2892e(-437700315, false, new C16015e(17));
    public static final C2892e metrica = new C2892e(1693205673, false, new C2916e(5));
    public static final C2892e license = new C2892e(1942484074, false, new C2916e(6));
    public static final C2892e appmetrica = new C2892e(1713254055, false, new C2916e(7));
    public static final C2892e purchase = new C2892e(527729574, false, new C2916e(8));
    public static final C2892e billing = new C2892e(1305086891, false, new C2916e(9));
    public static final C2892e yandex = new C2892e(902075527, false, new C16015e(18));
    public static final C1032e[] startapp = {new C1032e(-1, 1, "usage_and_diagnostics_listener", true), new C1032e(-1, 1, "usage_and_diagnostics_consents", true), new C1032e(-1, 1, "usage_and_diagnostics_check_consents", true), new C1032e(-1, 1, "usage_and_diagnostics_settings_access", true), new C1032e(-1, 1, "el_capitan", false)};

    public static final void ad(InterfaceC2484e interfaceC2484e, InterfaceC2484e interfaceC2484e2) {
        for (Map.Entry entry : interfaceC2484e2.mopub()) {
            interfaceC2484e.mo858e((String) entry.getKey(), (List) entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r3 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double metrica(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12900e.metrica(java.lang.String, java.lang.String):double");
    }

    public static int vip(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i = typedValue.type;
        if (i == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i != 6) {
                return -2;
            }
            int i2 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i2, i2);
        }
        return (int) fraction;
    }
}
