package defpackage;

import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3098e {
    public final int ad;
    public final Executor vip;

    public /* synthetic */ C3098e(int i, Executor executor) {
        this.ad = i;
        this.vip = executor;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3098e)) {
            return false;
        }
        C3098e c3098e = (C3098e) obj;
        return this.ad == c3098e.ad && AbstractC5729e.vip(this.vip, c3098e.vip) && AbstractC5729e.vip(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.ad), Boolean.FALSE, this.vip, null});
    }
}
