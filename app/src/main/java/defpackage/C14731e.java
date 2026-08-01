package defpackage;

import java.util.List;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14731e implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final List f29143e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final Set f29144e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f29145e;

    static {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        f29144e = AbstractC1660e.m664case(new C14731e[]{new C14731e(i), new C14731e(i2), new C14731e(i3)});
        List startapp = AbstractC6874e.startapp(new C14731e(i3), new C14731e(i2), new C14731e(i));
        f29143e = startapp;
        AbstractC13480e.m3582e(startapp);
    }

    public /* synthetic */ C14731e(int i) {
        this.f29145e = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C15765e.ad(AbstractC4256e.ad(this.f29145e), AbstractC4256e.ad(((C14731e) obj).f29145e));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14731e) {
            return this.f29145e == ((C14731e) obj).f29145e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29145e;
    }

    public final String toString() {
        int i = this.f29145e;
        return "WindowHeightSizeClass.".concat(i == 0 ? "Compact" : i == 1 ? "Medium" : i == 2 ? "Expanded" : BuildConfig.FLAVOR);
    }
}
