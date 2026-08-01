package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10119e {
    public final DisplayCutout ad;

    public C10119e(DisplayCutout displayCutout) {
        this.ad = displayCutout;
    }

    public final C7088e ad() {
        return Build.VERSION.SDK_INT >= 30 ? C7088e.metrica(AbstractC5096e.mopub(this.ad)) : C7088e.appmetrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10119e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.ad, ((C10119e) obj).ad);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.ad;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.ad + "}";
    }
}
