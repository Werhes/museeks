package defpackage;

import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C15282e.class)
/* renamed from: eؕۖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3549e extends AbstractC4879e {
    public static final C2397e Companion = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f8005e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f8006e;

    public C3549e(String str, String str2) {
        this.f8006e = str;
        char[] charArray = str2.toCharArray();
        if (charArray.length > 1) {
            Arrays.sort(charArray);
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) BuildConfig.FLAVOR);
        int i = 0;
        for (char c : charArray) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) BuildConfig.FLAVOR);
            }
            sb.append(c);
        }
        sb.append((CharSequence) BuildConfig.FLAVOR);
        this.f8005e = sb.toString();
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        if (!AbstractC7890e.billing(c12232e.vip(C3549e.class), c12232e.vip(obj.getClass()))) {
            return false;
        }
        C3549e c3549e = (C3549e) obj;
        return AbstractC7890e.billing(this.f8006e, c3549e.f8006e) && AbstractC7890e.billing(this.f8005e, c3549e.f8005e);
    }

    public final int hashCode() {
        return this.f8005e.hashCode() + (this.f8006e.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BsonRegularExpression(pattern='");
        sb.append(this.f8006e);
        sb.append("', options='");
        return AbstractC1786e.signatures(sb, this.f8005e, "')");
    }
}
