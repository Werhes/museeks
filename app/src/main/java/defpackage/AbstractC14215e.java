package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14215e extends C11325e {

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public C11325e[] f28081e = new C11325e[4];

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public int f28080e = 0;

    /* renamed from: default, reason: not valid java name */
    public final void m3785default(int i, C18310e c18310e, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f28080e; i2++) {
            C11325e c11325e = this.f28081e[i2];
            ArrayList arrayList2 = c18310e.ad;
            if (!arrayList2.contains(c11325e)) {
                arrayList2.add(c11325e);
            }
        }
        for (int i3 = 0; i3 < this.f28080e; i3++) {
            AbstractC6537e.metrica(this.f28081e[i3], i, arrayList, c18310e);
        }
    }

    /* renamed from: implements */
    public void mo1696implements() {
    }
}
