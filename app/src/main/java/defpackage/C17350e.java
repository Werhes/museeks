package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۢۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17350e {
    public final boolean ad;

    public C17350e(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.ad = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17350e)) {
            return false;
        }
        C17350e c17350e = (C17350e) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.ad == c17350e.ad;
    }

    public final int hashCode() {
        return ((((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.ad ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", osCodeName=");
        sb.append(Build.VERSION.CODENAME);
        sb.append(", isRooted=");
        return AbstractC8703e.signatures(sb, this.ad, "}");
    }
}
