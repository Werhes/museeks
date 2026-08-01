package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12720e {
    public final C7895e ad;

    public /* synthetic */ C12720e(C0047e c0047e) {
        this.ad = (C7895e) c0047e.f1185e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12720e) {
            return AbstractC5729e.vip(this.ad, ((C12720e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ad});
    }
}
