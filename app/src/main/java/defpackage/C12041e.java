package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۡؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12041e extends LinkedHashMap {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12041e(int i, float f, boolean z, int i2) {
        super(i, f, z);
        this.f24068e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Matcher ad(C12041e c12041e, String str, Pattern pattern) {
        Matcher matcher = (Matcher) c12041e.get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        c12041e.put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f24068e) {
            case 0:
                return size() > 4;
            default:
                return size() > 32;
        }
    }
}
