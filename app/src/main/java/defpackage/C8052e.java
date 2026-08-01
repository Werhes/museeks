package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٜٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8052e implements InterfaceC8046e {
    public final long ad;

    public C8052e(long j) {
        this.ad = j;
    }

    @Override // defpackage.InterfaceC8046e
    public final long ad(Context context) {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8052e) && C3618e.metrica(this.ad, ((C8052e) obj).ad);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return C10994e.ad(this.ad);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) C3618e.startapp(this.ad)) + ')';
    }
}
