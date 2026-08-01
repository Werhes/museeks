package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۘۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3591e {
    public final int ad;
    public final Method vip;

    public C3591e(int i, Method method) {
        this.ad = i;
        this.vip = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3591e)) {
            return false;
        }
        C3591e c3591e = (C3591e) obj;
        return this.ad == c3591e.ad && this.vip.getName().equals(c3591e.vip.getName());
    }

    public final int hashCode() {
        return this.vip.getName().hashCode() + (this.ad * 31);
    }
}
