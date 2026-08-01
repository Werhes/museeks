package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13283e implements InterfaceC8046e {
    public final int ad;

    public C13283e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC8046e
    public final long ad(Context context) {
        return AbstractC6532e.vip(context.getColor(this.ad));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13283e) && this.ad == ((C13283e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("ResourceColorProvider(resId="), this.ad, ')');
    }
}
