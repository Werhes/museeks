package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16172e implements InterfaceC12516e {
    public static final C16172e metrica = new C16172e(null);
    public final String vip;

    public /* synthetic */ C16172e(String str) {
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16172e) {
            return AbstractC5729e.vip(this.vip, ((C16172e) obj).vip);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.vip});
    }
}
