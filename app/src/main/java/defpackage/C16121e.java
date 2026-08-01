package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16121e {
    public int ad;
    public final HashMap license = new HashMap(0);
    public C16121e metrica;
    public final int vip;

    public C16121e(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        this.ad = i;
        this.vip = i2;
        this.metrica = null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return AbstractC8647e.isPro(identityHashCode, "Node", new StringBuilder(String.valueOf(identityHashCode).length() + 4));
    }
}
