package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1139e {
    public static final Uri ad = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Pattern metrica;
    public static final Pattern vip;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        vip = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        metrica = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
