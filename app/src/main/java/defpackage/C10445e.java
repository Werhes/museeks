package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10445e implements Serializable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Pattern f20638e;

    public C10445e(String str) {
        this.f20638e = Pattern.compile(str);
    }

    public static C6993e ad(C10445e c10445e, String str) {
        c10445e.getClass();
        if (str.length() >= 0) {
            return new C6993e(new C5565e(c10445e, str, 5), C6789e.f13994e, 0);
        }
        StringBuilder premium = AbstractC4653e.premium("Start index out of bounds: ", 0, ", input length: ");
        premium.append(str.length());
        throw new IndexOutOfBoundsException(premium.toString());
    }

    public final String appmetrica(String str, Function1 function1) {
        Matcher matcher = this.f20638e.matcher(str);
        int i = 0;
        C14031e c14031e = !matcher.find(0) ? null : new C14031e(matcher, str);
        if (c14031e == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, c14031e.vip().f22523e);
            sb.append((CharSequence) function1.invoke(c14031e));
            i = c14031e.vip().f22522e + 1;
            c14031e = c14031e.metrica();
            if (i >= length) {
                break;
            }
        } while (c14031e != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final boolean license(CharSequence charSequence) {
        return this.f20638e.matcher(charSequence).matches();
    }

    public final C14031e metrica(CharSequence charSequence) {
        Matcher matcher = this.f20638e.matcher(charSequence);
        if (matcher.matches()) {
            return new C14031e(matcher, charSequence);
        }
        return null;
    }

    public final String toString() {
        return this.f20638e.toString();
    }

    public final C14031e vip(int i, String str) {
        Matcher region = this.f20638e.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new C14031e(region, str);
        }
        return null;
    }
}
