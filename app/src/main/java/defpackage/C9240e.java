package defpackage;

import java.util.List;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9240e implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final List f18441e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final Set f18442e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f18443e;

    static {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        f18442e = AbstractC1660e.m664case(new C9240e[]{new C9240e(i), new C9240e(i2), new C9240e(i3)});
        List startapp = AbstractC6874e.startapp(new C9240e(i3), new C9240e(i2), new C9240e(i));
        f18441e = startapp;
        AbstractC13480e.m3582e(startapp);
    }

    public /* synthetic */ C9240e(int i) {
        this.f18443e = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C15765e.ad(AbstractC6629e.metrica(this.f18443e), AbstractC6629e.metrica(((C9240e) obj).f18443e));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9240e) {
            return this.f18443e == ((C9240e) obj).f18443e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18443e;
    }

    public final String toString() {
        int i = this.f18443e;
        return "WindowWidthSizeClass.".concat(i == 0 ? "Compact" : i == 1 ? "Medium" : i == 2 ? "Expanded" : BuildConfig.FLAVOR);
    }
}
