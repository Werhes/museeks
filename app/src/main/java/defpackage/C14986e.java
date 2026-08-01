package defpackage;

import java.io.File;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۜۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14986e extends AbstractC16696e {
    public final C5363e vip = new C5363e(new C14582e(21));
    public final C5363e metrica = new C5363e(new C14582e(22));

    @Override // defpackage.AbstractC16696e
    public final int ad() {
        return 0;
    }

    @Override // defpackage.AbstractC16696e
    public final int license() {
        return R.string.storage_internal;
    }

    @Override // defpackage.AbstractC16696e
    public final File metrica() {
        return (File) this.metrica.getValue();
    }

    @Override // defpackage.AbstractC16696e
    public final File vip() {
        return (File) this.vip.getValue();
    }
}
