package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.widget.Toast;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5575e {
    public static final DecimalFormat ad;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        ad = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }

    public static void ad(String str) {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        ((ClipboardManager) vKXApplication.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("VKXClipboard", str));
        if (Build.VERSION.SDK_INT < 33) {
            VKXApplication vKXApplication2 = VKXApplication.f36528e;
            Toast.makeText(vKXApplication2 != null ? vKXApplication2 : null, "Скопировано!", 0).show();
        }
    }

    public static String vip(int i) {
        StringBuilder sb = new StringBuilder();
        C7947e c7947e = C7947e.ad;
        c7947e.getClass();
        C12309e c12309e = C7947e.billing;
        InterfaceC8614e interfaceC8614e = C7947e.vip[2];
        if (((Boolean) c12309e.tapsense(c7947e)).booleanValue()) {
            return String.valueOf(i);
        }
        DecimalFormat decimalFormat = ad;
        if (i >= 1000000) {
            sb.append(decimalFormat.format(i / 1000000.0f));
            sb.append("M");
            return sb.toString();
        }
        if (i < 1000) {
            return String.valueOf(i);
        }
        sb.append(decimalFormat.format(i / 1000.0f));
        sb.append("K");
        return sb.toString();
    }
}
