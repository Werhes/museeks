package defpackage;

import android.graphics.Path;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11972e {
    public static final C17985e ad() {
        return new C17985e(new Path());
    }

    public static final void metrica(String str) {
        throw new IllegalStateException(str);
    }

    public static final Path.Direction vip(int i) {
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return Path.Direction.CCW;
        }
        if (m2467class == 1) {
            return Path.Direction.CW;
        }
        throw new C14803e(10);
    }
}
