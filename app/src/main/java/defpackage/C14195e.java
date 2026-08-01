package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14195e {
    public ArrayList ad;

    public final int ad(int i) {
        return ((int[]) this.ad.get(i / 768))[i % 768];
    }

    public final void metrica(int i, int i2) {
        ((int[]) this.ad.get(i / 768))[i % 768] = i2;
    }

    public final C1356e vip() {
        return new C1356e(new C5428e(this, null));
    }
}
