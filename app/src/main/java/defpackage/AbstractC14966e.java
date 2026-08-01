package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۛۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14966e {
    public static final C2443e ad = new C2443e("RESUME_TOKEN", 2);
    public static C10776e[] vip = new C10776e[0];

    public static final void ad(String str, int i, String str2, Throwable th) {
        String str3;
        for (C10776e c10776e : vip) {
            c10776e.getClass();
            if (th != null) {
                StringBuilder inmobi = AbstractC8703e.inmobi(str2);
                StringWriter stringWriter = new StringWriter(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                th.printStackTrace(printWriter);
                printWriter.flush();
                inmobi.append("\n".concat(stringWriter.toString()));
                str3 = inmobi.toString();
            } else {
                str3 = str2;
            }
            Log.println(i, str, str3);
        }
    }

    public static final void metrica(C9424e c9424e, Function1 function1) {
        c9424e.ad(function1, new C14151e((byte) 0, 8));
    }

    public static String vip() {
        return AbstractC6507e.mopub(new byte[]{(byte) 23411, (byte) 13424, (byte) 2401, (byte) 643186, (byte) 6101099, (byte) 16686, (byte) 22113, (byte) 39285, (byte) 1353844, (byte) 171783784, (byte) 43631, (byte) 114, (byte) 862569, (byte) 10814330, (byte) 472481889, (byte) 487284, (byte) 4713, (byte) 99166575, (byte) 10606});
    }
}
