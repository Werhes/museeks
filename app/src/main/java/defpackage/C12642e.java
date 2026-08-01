package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٟؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12642e implements InterfaceC10808e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final Pattern f25360e;

    static {
        Pattern compile;
        try {
            compile = Pattern.compile("(?ui)\\W", PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        } catch (IllegalArgumentException unused) {
            compile = Pattern.compile("(?ui)\\W");
        }
        f25360e = compile;
    }

    @Override // defpackage.InterfaceC10808e
    /* renamed from: apply */
    public final String mo4378apply(Object obj) {
        String str = (String) obj;
        Matcher matcher = f25360e.matcher(str);
        if (matcher.find()) {
            str = matcher.replaceAll(" ");
        }
        return str.toLowerCase().trim();
    }
}
